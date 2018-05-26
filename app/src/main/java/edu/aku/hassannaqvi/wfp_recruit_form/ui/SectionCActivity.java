package edu.aku.hassannaqvi.wfp_recruit_form.ui;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import edu.aku.hassannaqvi.wfp_recruit_form.R;
import edu.aku.hassannaqvi.wfp_recruit_form.databinding.ActivitySectionCBinding;

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
        bi.wfpc06.setManager(getSupportFragmentManager());
        bi.wfpc07.setManager(getSupportFragmentManager());
        bi.wfpc08.setManager(getSupportFragmentManager());
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
