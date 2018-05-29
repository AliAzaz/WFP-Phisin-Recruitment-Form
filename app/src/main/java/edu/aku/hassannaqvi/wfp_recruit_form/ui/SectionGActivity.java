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
import edu.aku.hassannaqvi.wfp_recruit_form.databinding.ActivitySectionGBinding;

public class SectionGActivity extends AppCompatActivity {

    ActivitySectionGBinding bi;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_section_g);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_g);

        this.setTitle("Section G");

        db = new DatabaseHelper(this);
        bi.setCallback(this);
    }

    private boolean formValidation() {

        if (!validatorClass.EmptyRadioButton(this, bi.wrg01, bi.wrg01a, getString(R.string.wrg01))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wrg02, bi.wrg02a, getString(R.string.wrg02))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wrg03, bi.wrg03a, getString(R.string.wrg03))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wrg04, bi.wrg04a, getString(R.string.wrg04))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wrg05, bi.wrg05a, getString(R.string.wrg05))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wrg06, bi.wrg06a, getString(R.string.wrg06))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wrg07, bi.wrg07a, getString(R.string.wrg07))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wrg08, bi.wrg08a, getString(R.string.wrg08))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wrg09, bi.wrg09a, getString(R.string.wrg09))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wrg10, bi.wrg10a, getString(R.string.wrg10))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wrg11, bi.wrg11a, getString(R.string.wrg11))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wrg12, bi.wrg12a, getString(R.string.wrg12))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wrg13, bi.wrg13a, getString(R.string.wrg13))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wrg14, bi.wrg14a, getString(R.string.wrg14))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wrg15, bi.wrg15a, getString(R.string.wrg15))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wrg16, bi.wrg16a, getString(R.string.wrg16))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wrg17, bi.wrg17a, getString(R.string.wrg17))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wrg18, bi.wrg18a, getString(R.string.wrg18))) {
            return false;
        }

        return true;
    }

    private void SaveDraft() throws JSONException {

        JSONObject sG = new JSONObject();

        sG.put("wrg01", bi.wrg01a.isChecked() ? "1"
                : bi.wrg01b.isChecked() ? "2"
                : "0");


        sG.put("wrg02", bi.wrg02a.isChecked() ? "1"
                : bi.wrg02b.isChecked() ? "2"
                : "0");


        sG.put("wrg03", bi.wrg03a.isChecked() ? "1"
                : bi.wrg03b.isChecked() ? "2"
                : "0");


        sG.put("wrg04", bi.wrg04a.isChecked() ? "1"
                : bi.wrg04b.isChecked() ? "2"
                : "0");


        sG.put("wrg05", bi.wrg05a.isChecked() ? "1"
                : bi.wrg05b.isChecked() ? "2"
                : "0");


        sG.put("wrg06", bi.wrg06a.isChecked() ? "1"
                : bi.wrg06b.isChecked() ? "2"
                : "0");


        sG.put("wrg07", bi.wrg07a.isChecked() ? "1"
                : bi.wrg07b.isChecked() ? "2"
                : "0");


        sG.put("wrg08", bi.wrg08a.isChecked() ? "1"
                : bi.wrg08b.isChecked() ? "2"
                : "0");


        sG.put("wrg09", bi.wrg09a.isChecked() ? "1"
                : bi.wrg09b.isChecked() ? "2"
                : "0");


        sG.put("wrg10", bi.wrg10a.isChecked() ? "1"
                : bi.wrg10b.isChecked() ? "2"
                : "0");


        sG.put("wrg11", bi.wrg11a.isChecked() ? "1"
                : bi.wrg11b.isChecked() ? "2"
                : "0");


        sG.put("wrg12", bi.wrg12a.isChecked() ? "1"
                : bi.wrg12b.isChecked() ? "2"
                : "0");


        sG.put("wrg13", bi.wrg13a.isChecked() ? "1"
                : bi.wrg13b.isChecked() ? "2"
                : "0");


        sG.put("wrg14", bi.wrg14a.isChecked() ? "1"
                : bi.wrg14b.isChecked() ? "2"
                : "0");


        sG.put("wrg15", bi.wrg15a.isChecked() ? "1"
                : bi.wrg15b.isChecked() ? "2"
                : "0");

        sG.put("wrg16", bi.wrg16a.isChecked() ? "1"
                : bi.wrg16b.isChecked() ? "2"
                : "0");

        sG.put("wrg17", bi.wrg17a.isChecked() ? "1"
                : bi.wrg17b.isChecked() ? "2"
                : "0");

        sG.put("wrg18", bi.wrg18a.isChecked() ? "1"
                : bi.wrg18b.isChecked() ? "2"
                : "0");

        MainApp.fc.setsG(String.valueOf(sG));
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSG();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
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


}