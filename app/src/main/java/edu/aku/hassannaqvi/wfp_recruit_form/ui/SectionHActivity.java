package edu.aku.hassannaqvi.wfp_recruit_form.ui;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.wfp_recruit_form.R;
import edu.aku.hassannaqvi.wfp_recruit_form.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfp_recruit_form.core.MainApp;
import edu.aku.hassannaqvi.wfp_recruit_form.validation.validatorClass;
import edu.aku.hassannaqvi.wfp_recruit_form.databinding.ActivitySectionHBinding;

public class SectionHActivity extends AppCompatActivity {

    ActivitySectionHBinding bi;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_section_h);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_h);
        db = new DatabaseHelper(this);
        bi.setCallback(this);
        setupView();
    }

    private void setupView() {
        bi.wrh01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.wrh01a) {
                    bi.fldGrpwrh01.setVisibility(View.GONE);
                    bi.wrh02.clearCheck();
                    bi.wrh0288x.setText(null);
                } else {
                    bi.fldGrpwrh01.setVisibility(View.VISIBLE);

                }
            }
        });
    }


    private boolean formValidation() {

        if (!validatorClass.EmptyRadioButton(this, bi.wrh01, bi.wrh01a, getString(R.string.wrh01))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.wrh02, bi.wrh02a, getString(R.string.wrh02))) {
            return false;
        }


        if (bi.wrh0288.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.wrh0288x, getString(R.string.other))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh03, bi.wrh03a, getString(R.string.wrh03))) {
            return false;
        }


        if (bi.wrh0388.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.wrh0388x, getString(R.string.other))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh03, bi.wrh03a, getString(R.string.wrh03))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh04, bi.wrh04a, getString(R.string.wrh04))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh05, bi.wrh05a, getString(R.string.wrh05))) {
            return false;
        }


        if (bi.wrh0588.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.wrh0588x, getString(R.string.other))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh06, bi.wrh06a, getString(R.string.wrh05))) {
            return false;
        }


        if (bi.wrh0688.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.wrh0688x, getString(R.string.other))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh07, bi.wrh07a, getString(R.string.wrh07))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh08, bi.wrh08a, getString(R.string.wrh08))) {
            return false;
        }


        if (bi.wrh0888.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.wrh0888x, getString(R.string.other))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh09, bi.wrh09a, getString(R.string.wrh09))) {
            return false;
        }

        if (bi.wrh0988.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.wrh0988x, getString(R.string.other))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh10, bi.wrh10a, getString(R.string.wrh10))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh11, bi.wrh11a, getString(R.string.wrh11))) {
            return false;
        }


        if (bi.wrh1188.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.wrh1188x, getString(R.string.other))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh12, bi.wrh12a, getString(R.string.wrh12))) {
            return false;
        }


        if (bi.wrh1288.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.wrh1288x, getString(R.string.other))) {
                return false;
            }
        }

        if (!validatorClass.EmptyRadioButton(this, bi.wrh13, bi.wrh13a, getString(R.string.wrh13))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh14, bi.wrh14a, getString(R.string.wrh14))) {
            return false;
        }


        if (bi.wrh1488.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.wrh1488x, getString(R.string.other))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh15, bi.wrh15a, getString(R.string.wrh15))) {
            return false;
        }


        if (bi.wrh1588.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.wrh1588x, getString(R.string.other))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh16, bi.wrh16a, getString(R.string.wrh16))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh17, bi.wrh17a, getString(R.string.wrh17))) {
            return false;
        }


        if (bi.wrh1788.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.wrh1788x, getString(R.string.other))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh18, bi.wrh18a, getString(R.string.wrh18))) {
            return false;
        }


        if (bi.wrh1888.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.wrh1888x, getString(R.string.other))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh19, bi.wrh19a, getString(R.string.wrh19))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh20, bi.wrh20a, getString(R.string.wrh20))) {
            return false;
        }


        if (bi.wrh2088.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.wrh2088x, getString(R.string.other))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh21, bi.wrh21a, getString(R.string.wrh21))) {
            return false;
        }


        if (bi.wrh2188.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.wrh2188x, getString(R.string.other))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh22, bi.wrh22a, getString(R.string.wrh22))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh23, bi.wrh23a, getString(R.string.wrh23))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh24, bi.wrh24a, getString(R.string.wrh24))) {
            return false;
        }


        if (bi.wrh2488.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.wrh2488x, getString(R.string.other))) {
                return false;
            }
        }

        return true;
    }


    private void SaveDraft() throws JSONException {

        JSONObject sH = new JSONObject();

        sH.put("wrh01", bi.wrh01a.isChecked() ? "1"
                : bi.wrh01b.isChecked() ? "2"
                : bi.wrh0199.isChecked() ? "99"
                : "0");


        sH.put("wrh02", bi.wrh02a.isChecked() ? "1"
                : bi.wrh02b.isChecked() ? "2"
                : bi.wrh02c.isChecked() ? "3"
                : bi.wrh02d.isChecked() ? "4"
                : bi.wrh02e.isChecked() ? "5"
                : bi.wrh02f.isChecked() ? "6"
                : bi.wrh02g.isChecked() ? "7"
                : bi.wrh0288.isChecked() ? "88"
                : bi.wrh0299.isChecked() ? "99"
                : "0");

        sH.put("wrh0288x", bi.wrh0288x.getText().toString());


        sH.put("wrh03", bi.wrh03a.isChecked() ? "1"
                : bi.wrh03b.isChecked() ? "2"
                : bi.wrh0388.isChecked() ? "88"
                : bi.wrh0399.isChecked() ? "99"
                : "0");

        sH.put("wrh0388x", bi.wrh0388x.getText().toString());


        sH.put("wrh04", bi.wrh04a.isChecked() ? "1"
                : bi.wrh04b.isChecked() ? "2"
                : bi.wrh0499.isChecked() ? "99"
                : "0");

        sH.put("wrh05", bi.wrh05a.isChecked() ? "1"
                : bi.wrh05b.isChecked() ? "2"
                : bi.wrh05c.isChecked() ? "3"
                : bi.wrh05d.isChecked() ? "4"
                : bi.wrh05e.isChecked() ? "5"
                : bi.wrh05f.isChecked() ? "6"
                : bi.wrh05g.isChecked() ? "7"
                : bi.wrh05h.isChecked() ? "8"
                : bi.wrh0588.isChecked() ? "88"
                : bi.wrh0599.isChecked() ? "99"
                : "0");

        sH.put("wrh0588x", bi.wrh0588x.getText().toString());

        sH.put("wrh06", bi.wrh06a.isChecked() ? "1"
                : bi.wrh06b.isChecked() ? "2"
                : bi.wrh06c.isChecked() ? "3"
                : bi.wrh06d.isChecked() ? "4"
                : bi.wrh06e.isChecked() ? "5"
                : bi.wrh06f.isChecked() ? "6"
                : bi.wrh06g.isChecked() ? "7"
                : bi.wrh06h.isChecked() ? "8"
                : bi.wrh0688.isChecked() ? "88"
                : bi.wrh0699.isChecked() ? "99"
                : "0");

        sH.put("wrh0688x", bi.wrh0688x.getText().toString());

        sH.put("wrh07", bi.wrh07a.isChecked() ? "1"
                : bi.wrh07b.isChecked() ? "2"
                : bi.wrh0799.isChecked() ? "99"
                : "0");


        sH.put("wrh08", bi.wrh08a.isChecked() ? "1"
                : bi.wrh08b.isChecked() ? "2"
                : bi.wrh08c.isChecked() ? "3"
                : bi.wrh08d.isChecked() ? "4"
                : bi.wrh08e.isChecked() ? "5"
                : bi.wrh0888.isChecked() ? "88"
                : bi.wrh0899.isChecked() ? "99"
                : "0");


        sH.put("wrh09", bi.wrh09a.isChecked() ? "1"
                : bi.wrh09b.isChecked() ? "2"
                : bi.wrh09c.isChecked() ? "3"
                : bi.wrh09d.isChecked() ? "4"
                : bi.wrh0988.isChecked() ? "88"
                : bi.wrh0999.isChecked() ? "99"
                : "0");

        sH.put("wrh0988x", bi.wrh0988x.getText().toString());


        sH.put("wrh10", bi.wrh10a.isChecked() ? "1"
                : bi.wrh10b.isChecked() ? "2"
                : bi.wrh1099.isChecked() ? "99"
                : "0");

        sH.put("wrh11", bi.wrh11a.isChecked() ? "1"
                : bi.wrh11b.isChecked() ? "2"
                : bi.wrh11c.isChecked() ? "3"
                : bi.wrh11d.isChecked() ? "4"
                : bi.wrh11e.isChecked() ? "5"
                : bi.wrh11f.isChecked() ? "6"
                : bi.wrh1188.isChecked() ? "88"
                : bi.wrh1199.isChecked() ? "99"
                : "0");

        sH.put("wrh1188x", bi.wrh1188x.getText().toString());


        sH.put("wrh12", bi.wrh12a.isChecked() ? "1"
                : bi.wrh12b.isChecked() ? "2"
                : bi.wrh12c.isChecked() ? "3"
                : bi.wrh1288.isChecked() ? "88"
                : bi.wrh1299.isChecked() ? "99"
                : "0");

        sH.put("wrh1288x", bi.wrh1288x.getText().toString());


        sH.put("wrh13", bi.wrh13a.isChecked() ? "1"
                : bi.wrh13b.isChecked() ? "2"
                : bi.wrh1399.isChecked() ? "99"
                : "0");

        sH.put("wrh14", bi.wrh14a.isChecked() ? "1"
                : bi.wrh14b.isChecked() ? "2"
                : bi.wrh14c.isChecked() ? "3"
                : bi.wrh14d.isChecked() ? "4"
                : bi.wrh14e.isChecked() ? "5"
                : bi.wrh14f.isChecked() ? "6"
                : bi.wrh14g.isChecked() ? "7"
                : bi.wrh14h.isChecked() ? "8"
                : bi.wrh1488.isChecked() ? "88"
                : bi.wrh1499.isChecked() ? "99"
                : "0");

        sH.put("wrh1488x", bi.wrh1488x.getText().toString());


        sH.put("wrh15", bi.wrh15a.isChecked() ? "1"
                : bi.wrh15b.isChecked() ? "2"
                : bi.wrh15c.isChecked() ? "3"
                : bi.wrh15d.isChecked() ? "4"
                : bi.wrh15e.isChecked() ? "5"
                : bi.wrh15f.isChecked() ? "6"
                : bi.wrh15g.isChecked() ? "7"
                : bi.wrh15h.isChecked() ? "8"
                : bi.wrh15i.isChecked() ? "9"
                : bi.wrh1588.isChecked() ? "88"
                : bi.wrh1599.isChecked() ? "99"
                : "0");

        sH.put("wrh1588x", bi.wrh1588x.getText().toString());


        sH.put("wrh16", bi.wrh16a.isChecked() ? "1"
                : bi.wrh16b.isChecked() ? "2"
                : bi.wrh1699.isChecked() ? "99"
                : "0");


        sH.put("wrh17", bi.wrh17a.isChecked() ? "1"
                : bi.wrh17b.isChecked() ? "2"
                : bi.wrh17c.isChecked() ? "3"
                : bi.wrh17d.isChecked() ? "4"
                : bi.wrh17e.isChecked() ? "5"
                : bi.wrh17f.isChecked() ? "6"
                : bi.wrh17g.isChecked() ? "7"
                : bi.wrh17h.isChecked() ? "8"
                : bi.wrh1788.isChecked() ? "88"
                : bi.wrh1799.isChecked() ? "99"
                : "0");

        sH.put("wrh1788x", bi.wrh1788x.getText().toString());


        sH.put("wrh18", bi.wrh18a.isChecked() ? "1"
                : bi.wrh18b.isChecked() ? "2"
                : bi.wrh18c.isChecked() ? "3"
                : bi.wrh1888.isChecked() ? "88"
                : bi.wrh1899.isChecked() ? "99"
                : "0");

        sH.put("wrh1888x", bi.wrh1888x.getText().toString());

        sH.put("wrh19", bi.wrh19a.isChecked() ? "1"
                : bi.wrh19b.isChecked() ? "2"
                : bi.wrh1999.isChecked() ? "99"
                : "0");

        sH.put("wrh20", bi.wrh20a.isChecked() ? "1"
                : bi.wrh20b.isChecked() ? "2"
                : bi.wrh20c.isChecked() ? "3"
                : bi.wrh20d.isChecked() ? "4"
                : bi.wrh20e.isChecked() ? "5"
                : bi.wrh20f.isChecked() ? "6"
                : bi.wrh2088.isChecked() ? "88"
                : bi.wrh2099.isChecked() ? "99"
                : "0");


        sH.put("wrh2088x", bi.wrh2088x.getText().toString());


        sH.put("wrh21", bi.wrh21a.isChecked() ? "1"
                : bi.wrh21b.isChecked() ? "2"
                : bi.wrh21c.isChecked() ? "3"
                : bi.wrh2188.isChecked() ? "88"
                : bi.wrh2199.isChecked() ? "99"
                : "0");

        sH.put("wrh2188x", bi.wrh2188x.getText().toString());


        sH.put("wrh22", bi.wrh22a.isChecked() ? "1"
                : bi.wrh22b.isChecked() ? "2"
                : bi.wrh2299.isChecked() ? "99"
                : "0");

        sH.put("wrh23", bi.wrh23a.isChecked() ? "1"
                : bi.wrh23b.isChecked() ? "2"
                : bi.wrh2399.isChecked() ? "99"
                : "0");


        sH.put("wrh24", bi.wrh24a.isChecked() ? "1"
                : bi.wrh24b.isChecked() ? "2"
                : bi.wrh24c.isChecked() ? "3"
                : bi.wrh24d.isChecked() ? "4"
                : bi.wrh24e.isChecked() ? "5"
                : bi.wrh24f.isChecked() ? "6"
                : bi.wrh2488.isChecked() ? "88"
                : bi.wrh2499.isChecked() ? "99"
                : "0");


        sH.put("wrh2488x", bi.wrh2488x.getText().toString());

        MainApp.fc.setsH(String.valueOf(sH));
    }

    public void BtnEnd() {
        MainApp.endActivity(this, this);
    }

    public void BtnContinue() {

        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Ending Section", Toast.LENGTH_SHORT).show();

                finish();

                startActivity(new Intent(this, SectionIActivity.class));

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }


    private boolean UpdateDB() {

        //Long rowId;
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSH();

        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }
}