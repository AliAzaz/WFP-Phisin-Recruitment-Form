package edu.aku.hassannaqvi.wfp_recruit_form.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import edu.aku.hassannaqvi.wfp_recruit_form.validation.validatorClass;

public class SectionGActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_g);
    }

    private boolean formValidation(){

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
