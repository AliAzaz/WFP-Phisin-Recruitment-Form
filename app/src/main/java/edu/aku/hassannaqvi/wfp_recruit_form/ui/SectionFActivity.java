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
import edu.aku.hassannaqvi.wfp_recruit_form.databinding.ActivitySectionFBinding;


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
        if (!validatorClass.RangeTextBox(this, bi.wrf0902, 1, 90, getString(R.string.wrf0902), " sachets")) {
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
                : bi.wrf0288.isChecked() ? "88"
                : "0");

        sF.put("wrf03", bi.wrf03.getText().toString());
        sF.put("wrf04", bi.wrf04.getText().toString());
        sF.put("wrf05d", bi.wrf05d.getText().toString());
        sF.put("wrf05s", bi.wrf05s.getText().toString());
        sF.put("wrf06a", bi.wrf06a.getText().toString());
        sF.put("wrf06b", bi.wrf06b.getText().toString());

        sF.put("wrf07", bi.wrf07a.isChecked() ? "1"
                : bi.wrf07b.isChecked() ? "2"
                : "0");

        sF.put("wrf08a", bi.wrf08a.isChecked() ? "1" : "0");
        sF.put("wrf08b", bi.wrf08b.isChecked() ? "2" : "0");
        sF.put("wrf08c", bi.wrf08c.isChecked() ? "3" : "0");
        sF.put("wrf08d", bi.wrf08d.isChecked() ? "4" : "0");
        sF.put("wrf0888", bi.wrf0888.isChecked() ? "88" : "0");

        sF.put("wrf0888x", bi.wrf0888x.getText().toString());


        sF.put("wrf09", bi.wrf09a.isChecked() ? "1"
                : bi.wrf09b.isChecked() ? "2"
                : "0");


        sF.put("wrf0901a", bi.wrf0901a.isChecked() ? "1" : "0");
        sF.put("wrf0901b", bi.wrf0901b.isChecked() ? "2" : "0");
        sF.put("wrf0901c", bi.wrf0901c.isChecked() ? "3" : "0");
        sF.put("wrf090188", bi.wrf090188.isChecked() ? "88" : "0");

        sF.put("wrf090188x", bi.wrf090188x.getText().toString());

        sF.put("wrf0902", bi.wrf0902.getText().toString());

        sF.put("wrf0903a", bi.wrf0903a.isChecked() ? "1" : "0");
        sF.put("wrf0903b", bi.wrf0903b.isChecked() ? "2" : "0");
        sF.put("wrf0903c", bi.wrf0903c.isChecked() ? "3" : "0");
        sF.put("wrf090399", bi.wrf090399.isChecked() ? "99" : "0");
        sF.put("wrf090388", bi.wrf090388.isChecked() ? "88" : "0");


        MainApp.fc.setsF(String.valueOf(sF));
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
                startActivity(new Intent(this, SectionGActivity.class));

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDB() {

        //Long rowId;
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSF();

        if (updcount == 1) {
            //Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

}