package edu.aku.hassannaqvi.wfp_recruit_form.ui;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;
import edu.aku.hassannaqvi.wfp_recruit_form.R;

import edu.aku.hassannaqvi.wfp_recruit_form.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfp_recruit_form.core.MainApp;
import edu.aku.hassannaqvi.wfp_recruit_form.validation.validatorClass;

public class SectionEActivity extends AppCompatActivity {

    ActivitySectionEBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_section_e);
        binding.setCallback(this);

        this.setTitle("Section E");
    }

    public void BtnContinue() {
        if (ValidateForm()) {
            try {
                SaveDrafts();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDb()) {
                Toast.makeText(this, "starting next section", Toast.LENGTH_SHORT).show();

                finish();
                Intent secH = new Intent(this, SectionFActivity.class);
                startActivity(secH);

            } else {
                Toast.makeText(this, "Failed to update Database", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void BtnEnd() {
        MainApp.endActivity(this, this);
    }

    public boolean ValidateForm() {

//        01
        if (!validatorClass.EmptyTextBox(this, binding.wre0101, getString(R.string.wre01))) {
            return false;
        }

        if (!validatorClass.RangeTextBox(this, binding.wre0101, 0, 999, getString(R.string.wre01), "")) {
            return false;
        }

        if (!validatorClass.EmptyTextBox(this, binding.wre0102, getString(R.string.wre01))) {
            return false;
        }

        if (!validatorClass.RangeTextBox(this, binding.wre0102, 0, 999, getString(R.string.wre01), "")) {
            return false;
        }

//        02
        if (!validatorClass.EmptyTextBox(this, binding.wre0201, getString(R.string.wre02))) {
            return false;
        }

        if (!validatorClass.RangeTextBox(this, binding.wre0201, 0, 999, getString(R.string.wre02), "")) {
            return false;
        }

        if (!validatorClass.EmptyTextBox(this, binding.wre0202, getString(R.string.wre02))) {
            return false;
        }

        if (!validatorClass.RangeTextBox(this, binding.wre0202, 0, 999, getString(R.string.wre02), "")) {
            return false;
        }

//        03
        if (!validatorClass.EmptyTextBox(this, binding.wre03, getString(R.string.wre03))) {
            return false;
        }

        if (!validatorClass.RangeTextBox(this, binding.wre03, 0, 999, getString(R.string.wre03), "")) {
            return false;
        }

        return true;
    }

    private void SaveDrafts() throws JSONException {

        JSONObject sE = new JSONObject();

        sE.put("wre0101", binding.wre0101.getText().toString());
        sE.put("wre0102", binding.wre0102.getText().toString());
        sE.put("wre0201", binding.wre0201.getText().toString());
        sE.put("wre0202", binding.wre0202.getText().toString());
        sE.put("wre03", binding.wre03.getText().toString());

        MainApp.fc.setsE(String.valueOf(sE));
    }

    private boolean UpdateDb() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSE();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

}
