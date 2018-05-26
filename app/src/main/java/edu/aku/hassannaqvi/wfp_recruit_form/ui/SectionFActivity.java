package edu.aku.hassannaqvi.wfp_recruit_form.ui;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.wfp_recruit_form.R;
import edu.aku.hassannaqvi.wfp_recruit_form.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfp_recruit_form.core.MainApp;
import edu.aku.hassannaqvi.wfp_recruit_form.validation.validatorClass;

public class SectionFActivity extends AppCompatActivity {

    ActivitySectionFBinding bi;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_section_f);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_f);
        db = new DatabaseHelper(this);
        bi.setCallback(this);
    }

    private boolean formValidation() {

        if (!validatorClass.EmptyRadioButton(this, bi.wrf01, bi.wrf01a, getString(R.string.wrf01))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wrf02, bi.wrf0288, bi.wrf0288x, getString(R.string.wrf02))) {
            return false;
        }

        if (!validatorClass.EmptyTextBox(this, bi.wrf03, getString(R.string.wrf03))) {
            return false;
        }
        if (!validatorClass.RangeTextBox(this, bi.wrf03, 1, 120, getString(R.string.wrf03), " sachets")) {
            return false;
        }
        if (!validatorClass.EmptyTextBox(this, bi.wrf04, getString(R.string.wrf04))) {
            return false;
        }
        if (!validatorClass.RangeTextBox(this, bi.wrf04, 1, 3, getString(R.string.wrf04), " sachets")) {
            return false;
        }
        if (!validatorClass.EmptyTextBox(this, bi.wrf05d, getString(R.string.wrf05) + "-" + getString(R.string.days))) {
            return false;
        }
        if (!validatorClass.RangeTextBox(this, bi.wrf05d, 1, 120, getString(R.string.wrf05) + "-" + getString(R.string.days), " days")) {
            return false;
        }
        if (!validatorClass.EmptyTextBox(this, bi.wrf05s, getString(R.string.wrf05) + "-" + getString(R.string.sachet))) {
            return false;
        }
        if (!validatorClass.RangeTextBox(this, bi.wrf05s, 1, 120, getString(R.string.wrf05) + "-" + getString(R.string.sachet), " sachet")) {
            return false;
        }
        if (!validatorClass.EmptyTextBox(this, bi.wrf06a, getString(R.string.wrf06a))) {
            return false;
        }
        if (!validatorClass.RangeTextBox(this, bi.wrf06a, 1, 120, getString(R.string.wrf06a), " packets")) {
            return false;
        }
        if (!validatorClass.EmptyTextBox(this, bi.wrf06b, getString(R.string.wrf06b))) {
            return false;
        }
        if (!validatorClass.RangeTextBox(this, bi.wrf06b, 1, 160, getString(R.string.wrf06b), " packets")) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wrf07, bi.wrf07a, getString(R.string.wrf07))) {
            return false;
        }
        if (!validatorClass.EmptyCheckBox(this, bi.wrf08, bi.wrf0888, bi.wrf0888x, getString(R.string.wrf08))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wrf09, bi.wrf09a, getString(R.string.wrf09))) {
            return false;
        }
        if (!validatorClass.EmptyCheckBox(this, bi.wrf0901, bi.wrf090188, bi.wrf090188x, getString(R.string.wrf0901))) {
            return false;
        }
        if (!validatorClass.EmptyTextBox(this, bi.wrf0902, getString(R.string.wrf0902))) {
            return false;
        }
        if (!validatorClass.EmptyTextBox(this, bi.wrf0902, 1, 90, getString(R.string.wrf0902), " sachets")) {
            return false;
        }
        if (!validatorClass.EmptyCheckBox(this, bi.wrf0903, bi.wrf090388, bi.wrf090388x, getString(R.string.wrf0903))) {
            return false;
        }

        return true;
    }


    private void SaveDraft() throws JSONException {

        JSONObject sF = new JSONObject();

        sF.put("wrf01", bi.wrf01a.isChecked() ? "1"
                : bi.wrf01b.isChecked() ? "2"
                : "0");

        sF.put("wrf02", bi.wrf02a.isChecked() ? "1"
                : bi.wrf0299.isChecked() ? "99"
                : bi.wrf0299.isChecked() ? "99"
                : "0");



        sF.put("kb202w", bi.kb202w.getText().toString());


        MainApp.fc.setsF(String.valueOf(sF));
    }


    public void BtnEnd() {

     /*
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                finish();
                startActivity(new Intent(this, EndingActivity.class));
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }*/
    }

    public void BtnContinue() {
       /* if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                finish();
                startActivity(new Intent(this, EndingActivity.class));

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }*/
    }

}
