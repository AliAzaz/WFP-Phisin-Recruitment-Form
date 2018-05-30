package edu.aku.hassannaqvi.wfp_recruit_form.ui;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;

import edu.aku.hassannaqvi.wfp_recruit_form.R;
import edu.aku.hassannaqvi.wfp_recruit_form.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfp_recruit_form.core.MainApp;
import edu.aku.hassannaqvi.wfp_recruit_form.databinding.ActivitySectionEBinding;
import edu.aku.hassannaqvi.wfp_recruit_form.validation.validatorClass;

public class SectionEActivity extends AppCompatActivity {
    ActivitySectionEBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_section_e);
        binding.setCallback(this);

        this.setTitle("Section E");

//        Spinners Population
        binding.wre0101a.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(MainActivity.usersArray)));
        binding.wre0102a.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(MainActivity.usersArray)));
        binding.wre0201a.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(MainActivity.usersArray)));
        binding.wre0202a.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(MainActivity.usersArray)));

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
        if (!validatorClass.EmptySpinner(this, binding.wre0101a, getString(R.string.wre01))) {
            return false;
        }
        if (!validatorClass.EmptyTextBox(this, binding.wre0101, getString(R.string.wre01))) {
            return false;
        }

        if (!binding.wre0101.getText().toString().matches("^(\\d{1,3}\\.\\d{1,1})$")) {
            binding.wre0101.setError("Wrong presentation");
            return false;
        } else {
            binding.wre0101.setError(null);
        }
        if (!validatorClass.RangeTextBox(this, binding.wre0101, 0.0, 999.0, getString(R.string.wre01), "")) {
            return false;
        }

        if (!validatorClass.EmptySpinner(this, binding.wre0102a, getString(R.string.wre01))) {
            return false;
        }
        if (!validatorClass.EmptyTextBox(this, binding.wre0102, getString(R.string.wre01))) {
            return false;
        }


        if (!binding.wre0102.getText().toString().matches("^(\\d{1,3}\\.\\d{1,1})$")) {
            binding.wre0102.setError("Wrong presentation");
            return false;
        } else {
            binding.wre0102.setError(null);
        }
        if (!validatorClass.RangeTextBox(this, binding.wre0102, 0.0, 999.0, getString(R.string.wre01), "")) {
            return false;
        }

        if (binding.wre0101a.getSelectedItem().equals(binding.wre0102a.getSelectedItem().toString())) {
            Toast.makeText(this, "ERROR: Same Users", Toast.LENGTH_SHORT).show();
            ((TextView) binding.wre0102a.getSelectedView()).setText("This Data is Required");
            ((TextView) binding.wre0102a.getSelectedView()).setTextColor(Color.RED);
            return false;
        } else {
            ((TextView) binding.wre0102a.getSelectedView()).setError(null);
        }

//        02
        if (!validatorClass.EmptySpinner(this, binding.wre0201a, getString(R.string.wre02))) {
            return false;
        }
        if (!validatorClass.EmptyTextBox(this, binding.wre0201, getString(R.string.wre02))) {
            return false;
        }

        if (!binding.wre0201.getText().toString().matches("^(\\d{1,2}\\.\\d{1,2})$")) {
            binding.wre0201.setError("Wrong presentation");
            return false;
        } else {
            binding.wre0201.setError(null);
        }
        if (!validatorClass.RangeTextBox(this, binding.wre0201, 0.0, 999.0, getString(R.string.wre02), "")) {
            return false;
        }

        if (!validatorClass.EmptySpinner(this, binding.wre0202a, getString(R.string.wre02))) {
            return false;
        }
        if (!validatorClass.EmptyTextBox(this, binding.wre0202, getString(R.string.wre02))) {
            return false;
        }

        if (!binding.wre0202.getText().toString().matches("^(\\d{1,2}\\.\\d{1,2})$")) {
            binding.wre0202.setError("Wrong presentation");
            return false;
        } else {
            binding.wre0202.setError(null);
        }
        if (!validatorClass.RangeTextBox(this, binding.wre0202, 0.0, 999.0, getString(R.string.wre02), "")) {
            return false;
        }

        if (binding.wre0201a.getSelectedItem().equals(binding.wre0202a.getSelectedItem().toString())) {
            Toast.makeText(this, "ERROR: Same Users", Toast.LENGTH_SHORT).show();
            ((TextView) binding.wre0202a.getSelectedView()).setText("This Data is Required");
            ((TextView) binding.wre0202a.getSelectedView()).setTextColor(Color.RED);
            return false;
        } else {
            ((TextView) binding.wre0202a.getSelectedView()).setError(null);
        }

//        03
        if (!validatorClass.EmptyTextBox(this, binding.wre03, getString(R.string.wre03))) {
            return false;
        }


        if (!binding.wre03.getText().toString().matches("^(\\d{1,2}\\.\\d{1,1})$")) {
            binding.wre03.setError("Wrong presentation");
            return false;
        } else {
            binding.wre03.setError(null);
        }
        if (!validatorClass.RangeTextBox(this, binding.wre03, 0.0, 999.0, getString(R.string.wre03), "")) {
            return false;
        }

        return true;
    }

    private void SaveDrafts() throws JSONException {

        JSONObject sE = new JSONObject();

        sE.put("wre0101a", binding.wre0101a.getSelectedItem().toString());
        sE.put("wre0101", binding.wre0101.getText().toString());
        sE.put("wre0102a", binding.wre0102a.getSelectedItem().toString());
        sE.put("wre0102", binding.wre0102.getText().toString());
        sE.put("wre0201a", binding.wre0201a.getSelectedItem().toString());
        sE.put("wre0201", binding.wre0201.getText().toString());
        sE.put("wre0202a", binding.wre0202a.getSelectedItem().toString());
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
