package edu.aku.hassannaqvi.wfp_recruit_form.ui;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import edu.aku.hassannaqvi.wfp_recruit_form.R;
import edu.aku.hassannaqvi.wfp_recruit_form.databinding.ActivitySectionBBinding;

public class SectionBActivity extends AppCompatActivity {

    ActivitySectionBBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_section_b);
        binding.setCallback(this);

        this.setTitle("Section B");
    }

    public void BtnContinue() {

    }

    public void BtnEnd() {

    }

    public void BtnAddMember() {

    }

}
