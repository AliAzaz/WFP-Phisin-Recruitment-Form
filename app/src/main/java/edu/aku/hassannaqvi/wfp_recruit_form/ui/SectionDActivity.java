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
import edu.aku.hassannaqvi.wfp_recruit_form.databinding.ActivitySectionDBinding;
import edu.aku.hassannaqvi.wfp_recruit_form.validation.validatorClass;

public class SectionDActivity extends AppCompatActivity {

    ActivitySectionDBinding bi;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_section_d);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_b2);
        db = new DatabaseHelper(this);
        bi.setCallback(this);
    }

    private boolean formValidation() {

        if (!validatorClass.EmptyTextBox(this, bi.wrd001, getString(R.string.wrd001))) {
            return false;
        }



        if (!validatorClass.RangeTextBox(this, bi.wrd001, 1, 15, getString(R.string.kb101), "Number")) {
            return false;
        }


        if (!validatorClass.EmptyTextBox(this, bi.wrd002, getString(R.string.wrd002))) {
            return false;
        }


        if (!validatorClass.RangeTextBox(this, bi.wrd002, 1, 15, getString(R.string.wrd002), "Number")) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrd03, bi.wrd03a, getString(R.string.wrd03))) {
            return false;
        }


        if (!validatorClass.EmptyCheckBox(this, bi.wrd04, bi.wrd04a, getString(R.string.wrd04a))) {
            return false;
        }

        if (!validatorClass.EmptyTextBox(this, bi.wrd0488x, getString(R.string.other))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrd05, bi.wrd05a, getString(R.string.wrd05))) {
            return false;
        }


        if (!validatorClass.EmptyTextBox(this, bi.wrd0588x, getString(R.string.other))) {
            return false;
        }


        if (!bi.wrd0699.isChecked) {
            if (!validatorClass.EmptyTextBox(this, bi.wrd06, getString(R.string.wrd06))) {
                return false;
            }
        }


        if (!bi.wrd0799.isChecked) {
            if (!validatorClass.EmptyTextBox(this, bi.wrd07, getString(R.string.wrd07))) {
                return false;
            }
        }

        if (!validatorClass.EmptyRadioButton(this, bi.wrd08, bi.wrd08, getString(R.string.wrd08))) {
            return false;
        }

        if (bi.wrd0888.isChecked) {
            if (!validatorClass.EmptyTextBox(this, bi.wrd0888x, getString(R.string.other))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrd09, bi.wrd09a, getString(R.string.wrd09))) {
            return false;
        }


        if (!bi.wrd1099.isChecked) {
            if (!validatorClass.EmptyTextBox(this, bi.wrd10, getString(R.string.wrd10))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrd11, bi.wrd11a, getString(R.string.wrd11))) {
            return false;
        }


        if (!bi.wrd1299.isChecked) {
            if (!validatorClass.EmptyTextBox(this, bi.wrd12, getString(R.string.wrd12))) {
                return false;
            }
        }


        if (!validatorClass.EmptyTextBox(this, bi.wrd13, getString(R.string.wrd13))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrd14, bi.wrd14a, getString(R.string.wrd14))) {
            return false;
        }


        if (!bi.wrd15997.isChecked) {
            if (!validatorClass.EmptyTextBox(this, bi.wrd15, getString(R.string.wrd15))) {
                return false;
            }
        }


        if (!bi.wrd15998.isChecked) {
            if (!validatorClass.EmptyTextBox(this, bi.wrd15, getString(R.string.wrd15))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrd16, bi.wrd16a, getString(R.string.wrd16))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrd17a, bi.wrd17a1, getString(R.string.wrd17a))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrd17b, bi.wrd17b1, getString(R.string.wrd17b))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrd17c, bi.wrd17c1, getString(R.string.wrd17c))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrd17d, bi.wrd17d1, getString(R.string.wrd17d))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrd17e, bi.wrd17e1, getString(R.string.wrd17e))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrd17f, bi.wrd17f1, getString(R.string.wrd17f))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrd17g, bi.wrd17g1, getString(R.string.wrd17g))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrd17h, bi.wrd17h1, getString(R.string.wrd17h))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrd17i, bi.wrd17i1, getString(R.string.wrd17i))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrd17j, bi.wrd17j1, getString(R.string.wrd17j))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrd17k, bi.wrd17k1, getString(R.string.wrd17k))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrd17l, bi.wrd17l1, getString(R.string.wrd17l))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrd17m, bi.wrd17m1, getString(R.string.wrd17m))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrd17n, bi.wrd17n1, getString(R.string.wrd17n))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrd17o, bi.wrd17o1, getString(R.string.wrd17o))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrd18, bi.wrd18a, getString(R.string.wrd18))) {
            return false;
        }


        if (!validatorClass.EmptyCheckBox(this, bi.wrd19, bi.wrd19a, getString(R.string.wrd19))) {
            return false;
        }


        if (!bi.wrd1988.isChecked) {
            if (!validatorClass.EmptyTextBox(this, bi.wrd1988x, getString(R.string.other))) {
                return false;
            }
        }

        return true;
    }

    private void SaveDraft() throws JSONException {

        JSONObject sD = new JSONObject();

        sD.put("wrd001", bi.wrd001.getText().toString());
        sD.put("wrd002", bi.wrd002.getText().toString());


        sD.put("wrd03", bi.wrd03a.isChecked() ? "1"
                : bi.wrd03b.isChecked() ? "2"
                : bi.wrd0399.isChecked() ? "99"
                : "0");


        sD.put("wrd04a", bi.wrd04a.isChecked() ? "1" : "0");
        sD.put("wrd04b", bi.wrd04b.isChecked() ? "2" : "0");
        sD.put("wrd04c", bi.wrd04c.isChecked() ? "3" : "0");
        sD.put("wrd04d", bi.wrd04d.isChecked() ? "4" : "0");
        sD.put("wrd04e", bi.wrd04e.isChecked() ? "5" : "0");
        sD.put("wrd04f", bi.wrd04f.isChecked() ? "6" : "0");
        sD.put("wrd04g", bi.wrd04g.isChecked() ? "7" : "0");
        sD.put("wrd04h", bi.wrd04h.isChecked() ? "8" : "0");
        sD.put("wrd04g", bi.wrd0488.isChecked() ? "88" : "0");

        sD.put("wrd0488x", bi.wrd0488x.getText().toString());


        sD.put("wrd05", bi.wrd05a.isChecked() ? "1"
                : bi.wrd05b.isChecked() ? "2"
                : bi.wrd05c.isChecked() ? "3"
                : bi.wrd05d.isChecked() ? "4"
                : bi.wrd0588.isChecked() ? "88"
                : "0");


        sD.put("wrd0588x", bi.wrd0588x.getText().toString());
        sD.put("wrd06", bi.wrd06.getText().toString());
        sD.put("wrd0699", bi.wrd0699.isChecked() ? "99" : "0");

        sD.put("wrd07", bi.wrd07.getText().toString());
        sD.put("wrd0799", bi.wrd0799.isChecked() ? "99" : "0");


        sD.put("wrd08", bi.wrd08a.isChecked() ? "1"
                : bi.wrd08b.isChecked() ? "2"
                : bi.wrd08c.isChecked() ? "3"
                : bi.wrd08d.isChecked() ? "4"
                : bi.wrd08e.isChecked() ? "5"
                : bi.wrd0888.isChecked() ? "88"
                : "0");

        sD.put("wrd0888x", bi.wrd0888x.getText().toString());

        sD.put("wrd09", bi.wrd09a.isChecked() ? "1"
                : bi.wrd09b.isChecked() ? "2"
                : bi.wrd0999.isChecked() ? "99"
                : "0");

        sD.put("wrd10", bi.wrd10.getText().toString());
        sD.put("wrd1099", bi.wrd1099.isChecked() ? "99" : "0");

        sD.put("wrd11", bi.wrd11a.isChecked() ? "1"
                : bi.wrd11b.isChecked() ? "2"
                : bi.wrd1199.isChecked() ? "99"
                : "0");

        sD.put("wrd12", bi.wrd12.getText().toString());
        sD.put("wrd1299", bi.wrd1299.isChecked() ? "99" : "0");


        sD.put("wrd13", bi.wrd13.getText().toString());

        sD.put("wrd14", bi.wrd14a.isChecked() ? "1"
                : bi.wrd14b.isChecked() ? "2"
                : bi.wrd1499.isChecked() ? "99"
                : "0");

        sD.put("wrd15", bi.wrd15.getText().toString());
        sD.put("wrd15997", bi.wrd15997.isChecked() ? "9997" : "0");
        sD.put("wrd15998", bi.wrd15998.isChecked() ? "9998" : "0");

        sD.put("wrd16", bi.wrd16a.isChecked() ? "1"
                : bi.wrd16b.isChecked() ? "2"
                : bi.wrd1699.isChecked() ? "99"
                : "0");

        sD.put("wrd17a", bi.wrd17a1.isChecked() ? "1"
                : bi.wrd17a2.isChecked() ? "2"
                : "0");


        sD.put("wrd17b", bi.wrd17b1.isChecked() ? "1"
                : bi.wrd17b2.isChecked() ? "2"
                : "0");


        sD.put("wrd17c", bi.wrd17c1.isChecked() ? "1"
                : bi.wrd17c2.isChecked() ? "2"
                : "0");


        sD.put("wrd17d", bi.wrd17d1.isChecked() ? "1"
                : bi.wrd17d2.isChecked() ? "2"
                : "0");


        sD.put("wrd17e", bi.wrd17e1.isChecked() ? "1"
                : bi.wrd17e2.isChecked() ? "2"
                : "0");


        sD.put("wrd17f", bi.wrd17f1.isChecked() ? "1"
                : bi.wrd17f2.isChecked() ? "2"
                : "0");

        sD.put("wrd17g", bi.wrd17g1.isChecked() ? "1"
                : bi.wrd17g2.isChecked() ? "2"
                : "0");


        sD.put("wrd17h", bi.wrd17h1.isChecked() ? "1"
                : bi.wrd17h2.isChecked() ? "2"
                : "0");


        sD.put("wrd17i", bi.wrd17i1.isChecked() ? "1"
                : bi.wrd17i2.isChecked() ? "2"
                : "0");

        sD.put("wrd17j", bi.wrd17j1.isChecked() ? "1"
                : bi.wrd17j2.isChecked() ? "2"
                : "0");


        sD.put("wrd17k", bi.wrd17k1.isChecked() ? "1"
                : bi.wrd17k2.isChecked() ? "2"
                : "0");


        sD.put("wrd17l", bi.wrd17l1.isChecked() ? "1"
                : bi.wrd17l2.isChecked() ? "2"
                : "0");


        sD.put("wrd17m", bi.wrd17m1.isChecked() ? "1"
                : bi.wrd17m2.isChecked() ? "2"
                : "0");


        sD.put("wrd17n", bi.wrd17n1.isChecked() ? "1"
                : bi.wrd17n2.isChecked() ? "2"
                : "0");


        sD.put("wrd17o", bi.wrd17o1.isChecked() ? "1"
                : bi.wrd17o2.isChecked() ? "2"
                : "0");

        sD.put("wrd1700", bi.wrd1700.isChecked() ? "99" : "0");


        sD.put("wrd18", bi.wrd18a.isChecked() ? "1"
                : bi.wrd18b.isChecked() ? "2"
                : "0");


        sD.put("wrd19a", bi.wrd19b.isChecked() ? "1" : "0");
        sD.put("wrd19b", bi.wrd19b.isChecked() ? "2" : "0");
        sD.put("wrd19c", bi.wrd19c.isChecked() ? "3" : "0");
        sD.put("wrd19d", bi.wrd19d.isChecked() ? "4" : "0");
        sD.put("wrd19e", bi.wrd19e.isChecked() ? "5" : "0");
        sD.put("wrd19f", bi.wrd19f.isChecked() ? "6" : "0");
        sD.put("wrd19g", bi.wrd19g.isChecked() ? "7" : "0");
        sD.put("wrd19h", bi.wrd19h.isChecked() ? "8" : "0");
        sD.put("wrd1988", bi.wrd1988.isChecked() ? "88" : "0");

        sD.put("wrd1988x", bi.wrd1988x.getText().toString());

        MainApp.fc.setsD1(String.valueOf(sD));

    }


    public void BtnEnd() {

        Toast.makeText(this, "Processing End Section", Toast.LENGTH_SHORT).show();
        //if (formValidation()) {
        try {
            SaveDraft();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (UpdateDB()) {
            Toast.makeText(this, "Starting Ending Section", Toast.LENGTH_SHORT).show();

            finish();

            startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));

        } else {
            Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
        }
        //}
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

                startActivity(new Intent(this, SectionEActivity.class));
                //startActivity(new Intent(this, MainActivity.class));

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }


    private boolean UpdateDB() {

        //Long rowId;
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSD1();

        if (updcount == 1) {
            //Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

}