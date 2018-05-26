package edu.aku.hassannaqvi.wfp_recruit_form.ui;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import edu.aku.hassannaqvi.wfp_recruit_form.R;
import edu.aku.hassannaqvi.wfp_recruit_form.databinding.ActivitySectionCBinding;
import edu.aku.hassannaqvi.wfp_recruit_form.validation.validatorClass;

public class SectionCActivity extends AppCompatActivity {
ActivitySectionCBinding bi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_section_c);
        bi = DataBindingUtil.setContentView(this,R.layout.activity_section_c);
        bi.setCallback(this);
        setDateManager();

    }

    private void setDateManager() {
        bi.wrc06.setManager(getSupportFragmentManager());
        bi.wrc07.setManager(getSupportFragmentManager());
        bi.wrc08.setManager(getSupportFragmentManager());
    }

    private boolean formValidation(){

        if (!validatorClass.EmptyTextBox(this, bi.wrc01, getString(R.string.wrc01))) {
            return false;
        }
        if (!validatorClass.EmptyTextBox(this, bi.wrc02, getString(R.string.wrc02))) {
            return false;
        }
        if (!validatorClass.EmptyTextBox(this, bi.wrc03, getString(R.string.wrc03))) {
            return false;
        }
        if (!validatorClass.EmptyTextBox(this, bi.wrc04, getString(R.string.wrc04))) {
            return false;
        }
        if (!validatorClass.RangeTextBox(this, bi.wrc04,14,49, getString(R.string.wrc04)," years")) {
            return false;
        }

        if (!validatorClass.EmptyTextBox(this, bi.wrc05m, getString(R.string.wrc05)+" "+getString(android.R.string.months))) {
            return false;
        }
        if (!validatorClass.RangeTextBox(this, bi.wrc05m,0,3, getString(R.string.wrc05)," months")) {
            return false;
        }
        if (!validatorClass.EmptyTextBox(this, bi.wrc05d, getString(R.string.wrc05)+" "+getString(android.R.string.days))) {
            return false;
        }

        if (!validatorClass.RangeTextBox(this, bi.wrc05d,0,29, getString(R.string.wrc05)," days")) {
            return false;
        }
        if ((bi.wrc05m.getText().toString().equals("0")||bi.wrc05m.getText().toString().equals("00"))&&(bi.wrc05d.getText().toString().equals("0")||bi.wrc05d.getText().toString().equals("00"))){
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrc05), Toast.LENGTH_SHORT).show();
            bi.wrc05m.setError(" Month and Days cannot be zero at the same time ");    // Set Error on last radio button
            bi.wrc05d.setError(" Month and Days cannot be zero at the same time ");    // Set Error on last radio button
            bi.wrc05m.requestFocus();
            return false;
        }
        else{
            bi.wrc05m.setError(null);
            bi.wrc05d.setError(null);
            bi.wrc05m.clearFocus();
        }

        if (!validatorClass.EmptyTextBox(this, bi.wrc06, getString(R.string.wrc06))) {
            return false;
        }
        if (!validatorClass.EmptyTextBox(this, bi.wrc07, getString(R.string.wrc07))) {
            return false;
        }
        if (!validatorClass.EmptyTextBox(this, bi.wrc08, getString(R.string.wrc08))) {
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
