package edu.aku.hassannaqvi.wfp_recruit_form.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import edu.aku.hassannaqvi.wfp_recruit_form.validation.validatorClass;

public class SectionlmoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sectionlmo);
    }
    private boolean formValidation() {

        if (!validatorClass.EmptyRadioButton(this, bi.wrl01, bi.wrl01a, getString(R.string.wrl01))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wrl02, bi.wrl02a, getString(R.string.wrl02))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wrl03, bi.wrl03a, getString(R.string.wrl03))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wrl04, bi.wrl04a, getString(R.string.wrl04))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wrl05, bi.wrl05a, getString(R.string.wrl05))) {
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
        if (bi.wro01a.isChecked()){
            if (!validatorClass.EmptyTextBox(this, bi.wro01num, getString(R.string.wro01))) {
                return false;
            }
            if (!validatorClass.RangeTextBox(this, bi.wro01num,1,10, getString(R.string.wro01), " number")) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.wro01s, getString(R.string.wro01))) {
                return false;
            }
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wro02, bi.wro02a, getString(R.string.wro02))) {
            return false;
        }
        if (bi.wro02a.isChecked()){
            if (!validatorClass.EmptyTextBox(this, bi.wro02num, getString(R.string.wro02))) {
                return false;
            }
            if (!validatorClass.RangeTextBox(this, bi.wro02num,1,10, getString(R.string.wro02), " number")) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.wro02s, getString(R.string.wro02))) {
                return false;
            }
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wro03, bi.wro03a, getString(R.string.wro03))) {
            return false;
        }
        if (bi.wro03a.isChecked()){
            if (!validatorClass.EmptyTextBox(this, bi.wro03num, getString(R.string.wro03))) {
                return false;
            }
            if (!validatorClass.RangeTextBox(this, bi.wro03num,1,10, getString(R.string.wro03), " number")) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.wro03s, getString(R.string.wro03))) {
                return false;
            }
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wro04, bi.wro04a, getString(R.string.wro04))) {
            return false;
        }
        if (bi.wro04a.isChecked()){
            if (!validatorClass.EmptyTextBox(this, bi.wro04num, getString(R.string.wro04))) {
                return false;
            }
            if (!validatorClass.RangeTextBox(this, bi.wro04num,1,10, getString(R.string.wro04), " number")) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.wro04s, getString(R.string.wro04))) {
                return false;
            }
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wro05, bi.wro05a, getString(R.string.wro05))) {
            return false;
        }
        if (bi.wro05a.isChecked()){
            if (!validatorClass.EmptyTextBox(this, bi.wro05num, getString(R.string.wro05))) {
                return false;
            }
            if (!validatorClass.RangeTextBox(this, bi.wro05num,1,10, getString(R.string.wro05), " number")) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.wro05s, getString(R.string.wro05))) {
                return false;
            }
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wro06, bi.wro06a, getString(R.string.wro06))) {
            return false;
        }
        if (bi.wro06a.isChecked()){
            if (!validatorClass.EmptyTextBox(this, bi.wro06num, getString(R.string.wro06))) {
                return false;
            }
            if (!validatorClass.RangeTextBox(this, bi.wro06num,1,10, getString(R.string.wro06), " number")) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.wro06s, getString(R.string.wro06))) {
                return false;
            }
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wro07, bi.wro07a, getString(R.string.wro07))) {
            return false;
        }
        if (bi.wro07a.isChecked()){
            if (!validatorClass.EmptyTextBox(this, bi.wro07num, getString(R.string.wro07))) {
                return false;
            }
            if (!validatorClass.RangeTextBox(this, bi.wro07num,1,10, getString(R.string.wro07), " number")) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.wro07s, getString(R.string.wro07))) {
                return false;
            }
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wro08, bi.wro08a, getString(R.string.wro08))) {
            return false;
        }
        if (bi.wro08a.isChecked()){
            if (!validatorClass.EmptyTextBox(this, bi.wro08num, getString(R.string.wro08))) {
                return false;
            }
            if (!validatorClass.RangeTextBox(this, bi.wro08num,1,10, getString(R.string.wro08), " number")) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.wro08s, getString(R.string.wro08))) {
                return false;
            }
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wro09, bi.wro09a, getString(R.string.wro09))) {
            return false;
        }
        if (bi.wro09a.isChecked()){
            if (!validatorClass.EmptyTextBox(this, bi.wro09num, getString(R.string.wro09))) {
                return false;
            }
            if (!validatorClass.RangeTextBox(this, bi.wro09num,1,10, getString(R.string.wro09), " number")) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.wro09s, getString(R.string.wro09))) {
                return false;
            }
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wro10, bi.wro10a, getString(R.string.wro10))) {
            return false;
        }
        if (bi.wro10a.isChecked()){
            if (!validatorClass.EmptyTextBox(this, bi.wro10num, getString(R.string.wro10))) {
                return false;
            }
            if (!validatorClass.RangeTextBox(this, bi.wro10num,1,10, getString(R.string.wro10), " number")) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.wro10s, getString(R.string.wro10))) {
                return false;
            }
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wro11, bi.wro11a, getString(R.string.wro11))) {
            return false;
        }
        if (bi.wro11a.isChecked()){
            if (!validatorClass.EmptyTextBox(this, bi.wro11num, getString(R.string.wro11))) {
                return false;
            }
            if (!validatorClass.RangeTextBox(this, bi.wro11num,1,10, getString(R.string.wro11), " number")) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.wro11s, getString(R.string.wro11))) {
                return false;
            }
        }
        if (!validatorClass.EmptyRadioButton(this, bi.wro12, bi.wro12a, getString(R.string.wro12))) {
            return false;
        }
        if (bi.wro12a.isChecked()){
            if (!validatorClass.EmptyTextBox(this, bi.wro1288, getString(R.string.wro12))) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.wro12num, getString(R.string.wro12))) {
                return false;
            }
            if (!validatorClass.RangeTextBox(this, bi.wro12num,1,10, getString(R.string.wro12), " number")) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.wro12s, getString(R.string.wro12))) {
                return false;
            }
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
