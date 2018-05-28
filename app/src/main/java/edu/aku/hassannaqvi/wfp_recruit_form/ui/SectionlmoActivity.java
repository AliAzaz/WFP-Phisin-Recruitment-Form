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

public class SectionlmoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_sectionlmo);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_sectionlmo);
        bi.setCallback(this);
    }

    private boolean formValidation() {

        if (!validatorClass.EmptyRadioButton(this, bi.wro01, bi.wro01a, getString(R.string.wro01))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wro02, bi.wro02a, getString(R.string.wro02))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wro03, bi.wro03a, getString(R.string.wro03))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wro04, bi.wro04a, getString(R.string.wro04))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wro05, bi.wro05a, getString(R.string.wro05))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wrm01, bi.wrm01a, getString(R.string.wrm01))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wrm02, bi.wrm02a, getString(R.string.wrm02))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wrm03, bi.wrm03a, getString(R.string.wrm03))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wro01, bi.wro01a, getString(R.string.wro01))) {
            return false;
        }
        if (bi.wro01a.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.wro01num, getString(R.string.wro01))) {
                return false;
            }
            if (!validatorClass.RangeTextBox(this, bi.wro01num, 1, 10, getString(R.string.wro01), " number")) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.wro01s, getString(R.string.wro01))) {
                return false;
            }
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wro02, bi.wro02a, getString(R.string.wro02))) {
            return false;
        }
        if (bi.wro02a.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.wro02num, getString(R.string.wro02))) {
                return false;
            }
            if (!validatorClass.RangeTextBox(this, bi.wro02num, 1, 10, getString(R.string.wro02), " number")) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.wro02s, getString(R.string.wro02))) {
                return false;
            }
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wro03, bi.wro03a, getString(R.string.wro03))) {
            return false;
        }
        if (bi.wro03a.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.wro03num, getString(R.string.wro03))) {
                return false;
            }
            if (!validatorClass.RangeTextBox(this, bi.wro03num, 1, 10, getString(R.string.wro03), " number")) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.wro03s, getString(R.string.wro03))) {
                return false;
            }
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wro04, bi.wro04a, getString(R.string.wro04))) {
            return false;
        }
        if (bi.wro04a.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.wro04num, getString(R.string.wro04))) {
                return false;
            }
            if (!validatorClass.RangeTextBox(this, bi.wro04num, 1, 10, getString(R.string.wro04), " number")) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.wro04s, getString(R.string.wro04))) {
                return false;
            }
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wro05, bi.wro05a, getString(R.string.wro05))) {
            return false;
        }
        if (bi.wro05a.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.wro05num, getString(R.string.wro05))) {
                return false;
            }
            if (!validatorClass.RangeTextBox(this, bi.wro05num, 1, 10, getString(R.string.wro05), " number")) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.wro05s, getString(R.string.wro05))) {
                return false;
            }
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wro06, bi.wro06a, getString(R.string.wro06))) {
            return false;
        }
        if (bi.wro06a.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.wro06num, getString(R.string.wro06))) {
                return false;
            }
            if (!validatorClass.RangeTextBox(this, bi.wro06num, 1, 10, getString(R.string.wro06), " number")) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.wro06s, getString(R.string.wro06))) {
                return false;
            }
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wro07, bi.wro07a, getString(R.string.wro07))) {
            return false;
        }
        if (bi.wro07a.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.wro07num, getString(R.string.wro07))) {
                return false;
            }
            if (!validatorClass.RangeTextBox(this, bi.wro07num, 1, 10, getString(R.string.wro07), " number")) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.wro07s, getString(R.string.wro07))) {
                return false;
            }
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wro08, bi.wro08a, getString(R.string.wro08))) {
            return false;
        }
        if (bi.wro08a.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.wro08num, getString(R.string.wro08))) {
                return false;
            }
            if (!validatorClass.RangeTextBox(this, bi.wro08num, 1, 10, getString(R.string.wro08), " number")) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.wro08s, getString(R.string.wro08))) {
                return false;
            }
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wro09, bi.wro09a, getString(R.string.wro09))) {
            return false;
        }
        if (bi.wro09a.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.wro09num, getString(R.string.wro09))) {
                return false;
            }
            if (!validatorClass.RangeTextBox(this, bi.wro09num, 1, 10, getString(R.string.wro09), " number")) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.wro09s, getString(R.string.wro09))) {
                return false;
            }
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wro10, bi.wro10a, getString(R.string.wro10))) {
            return false;
        }
        if (bi.wro10a.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.wro10num, getString(R.string.wro10))) {
                return false;
            }
            if (!validatorClass.RangeTextBox(this, bi.wro10num, 1, 10, getString(R.string.wro10), " number")) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.wro10s, getString(R.string.wro10))) {
                return false;
            }
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wro11, bi.wro11a, getString(R.string.wro11))) {
            return false;
        }
        if (bi.wro11a.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.wro11num, getString(R.string.wro11))) {
                return false;
            }
            if (!validatorClass.RangeTextBox(this, bi.wro11num, 1, 10, getString(R.string.wro11), " number")) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.wro11s, getString(R.string.wro11))) {
                return false;
            }
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wro12, bi.wro12a, getString(R.string.wro12))) {
            return false;
        }
        if (bi.wro12a.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.wro1288, getString(R.string.wro12))) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.wro12num, getString(R.string.wro12))) {
                return false;
            }
            if (!validatorClass.RangeTextBox(this, bi.wro12num, 1, 10, getString(R.string.wro12), " number")) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.wro12s, getString(R.string.wro12))) {
                return false;
            }
        }
        return true;
    }

    private void SaveDraft() throws JSONException {
        JSONObject wrlmo = new JSONObject();
        wrlmo.put("wrl01", bi.wrl01b.isChecked() ? "1"
                : bi.wrl01c.isChecked() ? "2"
                : bi.wrl01d.isChecked() ? "3"
                : bi.wrl01e.isChecked() ? "4"
                : bi.wrl01f.isChecked() ? "5"
                : bi.wrl01g.isChecked() ? "6"
                : bi.wrl01h.isChecked() ? "7"
                : "0");
        wrlmo.put("wrl02", bi.wrl02b.isChecked() ? "1"
                : bi.wrl02c.isChecked() ? "2"
                : bi.wrl02d.isChecked() ? "3"
                : bi.wrl02e.isChecked() ? "4"
                : bi.wrl02f.isChecked() ? "5"
                : bi.wrl02g.isChecked() ? "6"
                : bi.wrl02h.isChecked() ? "7"
                : "0");
        wrlmo.put("wrl03", bi.wrl03b.isChecked() ? "1"
                : bi.wrl03c.isChecked() ? "2"
                : bi.wrl03d.isChecked() ? "3"
                : bi.wrl03e.isChecked() ? "4"
                : bi.wrl03f.isChecked() ? "5"
                : bi.wrl03g.isChecked() ? "6"
                : bi.wrl03h.isChecked() ? "7"
                : "0");
        wrlmo.put("wrl04", bi.wrl04b.isChecked() ? "1"
                : bi.wrl04c.isChecked() ? "2"
                : bi.wrl04d.isChecked() ? "3"
                : bi.wrl04e.isChecked() ? "4"
                : bi.wrl04f.isChecked() ? "5"
                : bi.wrl04g.isChecked() ? "6"
                : bi.wrl04h.isChecked() ? "7"
                : "0");
        wrlmo.put("wrl05", bi.wrl05b.isChecked() ? "1"
                : bi.wrl05c.isChecked() ? "2"
                : bi.wrl05d.isChecked() ? "3"
                : bi.wrl05e.isChecked() ? "4"
                : bi.wrl05f.isChecked() ? "5"
                : bi.wrl05g.isChecked() ? "6"
                : bi.wrl05h.isChecked() ? "7"
                : "0");



        wrlmo.put("wrm01", bi.wrm01b.isChecked() ? "1"
                : bi.wrm01c.isChecked() ? "2"
                : bi.wrm01d.isChecked() ? "3"
                : "0");
        wrlmo.put("wrm02", bi.wrm02b.isChecked() ? "1"
                : bi.wrm02c.isChecked() ? "2"
                : bi.wrm02d.isChecked() ? "3"
                : "0");
        wrlmo.put("wrm03", bi.wrm03b.isChecked() ? "1"
                : bi.wrm03c.isChecked() ? "2"
                : bi.wrm03d.isChecked() ? "3"
                : "0");





//        1
        wrlmo.put("wro01", bi.wro01a.isChecked() ? "1"
                : bi.wro01b.isChecked() ? "2"
                : "0");

        wrlmo.put("wro01num", bi.wro01num.getText().toString());
        wrlmo.put("wro01s", bi.wro01s.getText().toString());

//        2
        wrlmo.put("wro02", bi.wro02a.isChecked() ? "1"
                : bi.wro01b.isChecked() ? "2"
                : "0");

        wrlmo.put("wro02num", bi.wro02num.getText().toString());
        wrlmo.put("wro02s", bi.wro02s.getText().toString());

//        3
        wrlmo.put("wro03", bi.wro03a.isChecked() ? "1"
                : bi.wro03b.isChecked() ? "2"
                : "0");

        wrlmo.put("wro03num", bi.wro03num.getText().toString());
        wrlmo.put("wro03s", bi.wro03s.getText().toString());

//        4
        wrlmo.put("wro04", bi.wro04a.isChecked() ? "1"
                : bi.wro04b.isChecked() ? "2"
                : "0");

        wrlmo.put("wro04num", bi.wro04num.getText().toString());
        wrlmo.put("wro04s", bi.wro04s.getText().toString());

//        5
        wrlmo.put("wro05", bi.wro05a.isChecked() ? "1"
                : bi.wro05b.isChecked() ? "2"
                : "0");

        wrlmo.put("wro05num", bi.wro05num.getText().toString());
        wrlmo.put("wro05s", bi.wro05s.getText().toString());

//        6
        wrlmo.put("wro06", bi.wro06a.isChecked() ? "1"
                : bi.wro06b.isChecked() ? "2"
                : "0");

        wrlmo.put("wro06num", bi.wro06num.getText().toString());
        wrlmo.put("wro06s", bi.wro06s.getText().toString());

//        7
        wrlmo.put("wro07", bi.wro07a.isChecked() ? "1"
                : bi.wro07b.isChecked() ? "2"
                : "0");

        wrlmo.put("wro07num", bi.wro07num.getText().toString());
        wrlmo.put("wro07s", bi.wro07s.getText().toString());

//        8
        wrlmo.put("wro08", bi.wro08a.isChecked() ? "1"
                : bi.wro08b.isChecked() ? "2"
                : "0");

        wrlmo.put("wro08num", bi.wro08num.getText().toString());
        wrlmo.put("wro08s", bi.wro08s.getText().toString());

//        9
        wrlmo.put("wro09", bi.wro09a.isChecked() ? "1"
                : bi.wro09b.isChecked() ? "2"
                : "0");

        wrlmo.put("wro01num", bi.wro09num.getText().toString());
        wrlmo.put("wro09s", bi.wro09s.getText().toString());

//        10
        wrlmo.put("wro10", bi.wro10a.isChecked() ? "1"
                : bi.wro10b.isChecked() ? "2"
                : "0");

        wrlmo.put("wro01num", bi.wro10num.getText().toString());
        wrlmo.put("wro10s", bi.wro10s.getText().toString());

//        11
        wrlmo.put("wro11", bi.wro11a.isChecked() ? "1"
                : bi.wro11b.isChecked() ? "2"
                : "0");

        wrlmo.put("wro11num", bi.wro11num.getText().toString());
        wrlmo.put("wro11s", bi.wro11s.getText().toString());

//        12
        wrlmo.put("wro12", bi.wro12a.isChecked() ? "1"
                : bi.wro12b.isChecked() ? "2"
                : "0");

        wrlmo.put("wro1288", bi.wro1288x.getText().toString());
        wrlmo.put("wro12num", bi.wro12num.getText().toString());
        wrlmo.put("wro12s", bi.wro12s.getText().toString());


        MainApp.fc.setsLMO(String.valueOf(wrlmo));

    }

    public void BtnEnd() {
        MainApp.endActivity(this, this);
    }

    public void BtnContinue() {
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
        }
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSLMO();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

}
