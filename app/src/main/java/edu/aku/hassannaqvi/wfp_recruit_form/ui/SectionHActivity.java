package edu.aku.hassannaqvi.wfp_recruit_form.ui;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import edu.aku.hassannaqvi.wfp_recruit_form.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfp_recruit_form.validation.validatorClass;

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
    }


    private boolean formValidation() {

        if (!validatorClass.EmptyRadioButton(this, bi.wrh01, bi.wrh01a, getString(R.string.wrh01))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.wrh02, bi.wrh02a, getString(R.string.wrh02))) {
            return false;
        }


        if (bi.wrh0288.isChecked) {
            if (!validatorClass.EmptyTextBox(this, bi.wrh0288, getString(R.string.other))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh03, bi.wrh03a, getString(R.string.wrh03))) {
            return false;
        }


        if (bi.wrh0388.isChecked) {
            if (!validatorClass.EmptyTextBox(this, bi.wrh0388, getString(R.string.other))) {
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


        if (bi.wrh0588.isChecked) {
            if (!validatorClass.EmptyTextBox(this, bi.wrh0588x, getString(R.string.other))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh06, bi.wrh06a, getString(R.string.wrh05))) {
            return false;
        }


        if (bi.wrh0688.isChecked) {
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


        if (bi.wrh0888.isChecked) {
            if (!validatorClass.EmptyTextBox(this, bi.wrh0888x, getString(R.string.other))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh09, bi.wrh09a, getString(R.string.wrh09))) {
            return false;
        }

        if (bi.wrh0988.isChecked) {
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


        if (bi.wrh1188.isChecked) {
            if (!validatorClass.EmptyTextBox(this, bi.wrh1188x, getString(R.string.other))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh12, bi.wrh12a, getString(R.string.wrh12))) {
            return false;
        }


        if (bi.wrh1288.isChecked) {
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


        if (bi.wrh1488.isChecked) {
            if (!validatorClass.EmptyTextBox(this, bi.wrh1488x, getString(R.string.other))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh15, bi.wrh15a, getString(R.string.wrh15))) {
            return false;
        }


        if (bi.wrh1588.isChecked) {
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


        if (bi.wrh1788.isChecked) {
            if (!validatorClass.EmptyTextBox(this, bi.wrh1788x, getString(R.string.other))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh18, bi.wrh18a, getString(R.string.wrh18))) {
            return false;
        }


        if (bi.wrh1888.isChecked) {
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


        if (bi.wrh2088.isChecked) {
            if (!validatorClass.EmptyTextBox(this, bi.wrh2088x, getString(R.string.other))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh21, bi.wrh21a, getString(R.string.wrh21))) {
            return false;
        }


        if (bi.wrh2188.isChecked) {
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


        if (bi.wrh2488.isChecked) {
            if (!validatorClass.EmptyTextBox(this, bi.wrh2488x, getString(R.string.other))) {
                return false;
            }
        }

        return true;
    }

}