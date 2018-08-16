package edu.aku.hassannaqvi.wfp_recruit_form.ui;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.wfp_recruit_form.R;
import edu.aku.hassannaqvi.wfp_recruit_form.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfp_recruit_form.core.MainApp;
import edu.aku.hassannaqvi.wfp_recruit_form.validation.ClearClass;
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

        this.setTitle("Section H");

        db = new DatabaseHelper(this);
        bi.setCallback(this);
        setupView();
    }

    private void setupView() {
        bi.wrh01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != R.id.wrh01a) {
                    bi.fldGrpwrh01.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.wrh02,false);
                    ClearClass.ClearAllFields(bi.wrh03,false);

//                    bi.wrh02.clearCheck();
                    bi.wrh0288x.setText(null);
                    bi.wrh0388x.setText(null);
                } else {
                    bi.fldGrpwrh01.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.wrh02,true);
                    ClearClass.ClearAllFields(bi.wrh03,true);

                }
            }
        });
        bi.wrh0299.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    bi.wrh02a.setChecked(false);
                    bi.wrh02b.setChecked(false);
                    bi.wrh02c.setChecked(false);
                    bi.wrh02d.setChecked(false);
                    bi.wrh02e.setChecked(false);
                    bi.wrh02f.setChecked(false);
                    bi.wrh02g.setChecked(false);
                    bi.wrh0288.setChecked(false);
                    bi.wrh02a.setEnabled(false);
                    bi.wrh02b.setEnabled(false);
                    bi.wrh02c.setEnabled(false);
                    bi.wrh02d.setEnabled(false);
                    bi.wrh02e.setEnabled(false);
                    bi.wrh02f.setEnabled(false);
                    bi.wrh02g.setEnabled(false);
                    bi.wrh0288.setEnabled(false);
                }else{
                    bi.wrh02a.setEnabled(true);
                    bi.wrh02b.setEnabled(true);
                    bi.wrh02c.setEnabled(true);
                    bi.wrh02d.setEnabled(true);
                    bi.wrh02e.setEnabled(true);
                    bi.wrh02f.setEnabled(true);
                    bi.wrh02g.setEnabled(true);
                    bi.wrh0288.setEnabled(true);
                }
            }
        });
        bi.wrh0399.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    bi.wrh03a.setChecked(false);
                    bi.wrh03b.setChecked(false);
                    bi.wrh0388.setChecked(false);
                    bi.wrh03a.setEnabled(false);
                    bi.wrh03b.setEnabled(false);
                    bi.wrh0388.setEnabled(false);
                }else{
                    bi.wrh03a.setEnabled(true);
                    bi.wrh03b.setEnabled(true);
                    bi.wrh0388.setEnabled(true);
                }
            }
        });

        bi.wrh04.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != R.id.wrh04a) {
                    bi.fldGrpwrh04.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.wrh05,false);
                    ClearClass.ClearAllFields(bi.wrh06,false);
//                    bi.wrh05.clearCheck();
                    bi.wrh0588x.setText(null);
                    bi.wrh0688x.setText(null);
                } else {
                    bi.fldGrpwrh04.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.wrh05,true);
                    ClearClass.ClearAllFields(bi.wrh06,true);
                }
            }
        });
        bi.wrh0599.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    bi.wrh05a.setChecked(false);
                    bi.wrh05b.setChecked(false);
                    bi.wrh05c.setChecked(false);
                    bi.wrh05d.setChecked(false);
                    bi.wrh05e.setChecked(false);
                    bi.wrh05f.setChecked(false);
                    bi.wrh05g.setChecked(false);
                    bi.wrh05h.setChecked(false);
                    bi.wrh0588.setChecked(false);
                    bi.wrh05a.setEnabled(false);
                    bi.wrh05b.setEnabled(false);
                    bi.wrh05c.setEnabled(false);
                    bi.wrh05d.setEnabled(false);
                    bi.wrh05e.setEnabled(false);
                    bi.wrh05f.setEnabled(false);
                    bi.wrh05g.setEnabled(false);
                    bi.wrh05h.setEnabled(false);
                    bi.wrh0588.setEnabled(false);
                }else{
                    bi.wrh05a.setEnabled(true);
                    bi.wrh05b.setEnabled(true);
                    bi.wrh05c.setEnabled(true);
                    bi.wrh05d.setEnabled(true);
                    bi.wrh05e.setEnabled(true);
                    bi.wrh05f.setEnabled(true);
                    bi.wrh05g.setEnabled(true);
                    bi.wrh05h.setEnabled(true);
                    bi.wrh0588.setEnabled(true);
                }
            }
        });
        bi.wrh0699.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    bi.wrh06a.setChecked(false);
                    bi.wrh06b.setChecked(false);
                    bi.wrh06c.setChecked(false);
                    bi.wrh06d.setChecked(false);
                    bi.wrh06e.setChecked(false);
                    bi.wrh06f.setChecked(false);
                    bi.wrh06g.setChecked(false);
                    bi.wrh06h.setChecked(false);
                    bi.wrh0688.setChecked(false);
                    bi.wrh06a.setEnabled(false);
                    bi.wrh06b.setEnabled(false);
                    bi.wrh06c.setEnabled(false);
                    bi.wrh06d.setEnabled(false);
                    bi.wrh06e.setEnabled(false);
                    bi.wrh06f.setEnabled(false);
                    bi.wrh06g.setEnabled(false);
                    bi.wrh06h.setEnabled(false);
                    bi.wrh0688.setEnabled(false);
                }else{
                    bi.wrh06a.setEnabled(true);
                    bi.wrh06b.setEnabled(true);
                    bi.wrh06c.setEnabled(true);
                    bi.wrh06d.setEnabled(true);
                    bi.wrh06e.setEnabled(true);
                    bi.wrh06f.setEnabled(true);
                    bi.wrh06g.setEnabled(true);
                    bi.wrh06h.setEnabled(true);
                    bi.wrh0688.setEnabled(true);
                }
            }
        });
        bi.wrh07.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != R.id.wrh07a) {
                    bi.fldGrpwrh07.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.wrh08,false);
                    ClearClass.ClearAllFields(bi.wrh09,false);
//                    bi.wrh08.clearCheck();
                    bi.wrh0888x.setText(null);
                    bi.wrh0988x.setText(null);
                } else {
                    bi.fldGrpwrh07.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.wrh08,true);
                    ClearClass.ClearAllFields(bi.wrh09,true);
                }
            }
        });
        bi.wrh0899.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    bi.wrh08a.setChecked(false);
                    bi.wrh08b.setChecked(false);
                    bi.wrh08c.setChecked(false);
                    bi.wrh08d.setChecked(false);
                    bi.wrh08e.setChecked(false);
                    bi.wrh0888.setChecked(false);
                    bi.wrh08a.setEnabled(false);
                    bi.wrh08b.setEnabled(false);
                    bi.wrh08c.setEnabled(false);
                    bi.wrh08d.setEnabled(false);
                    bi.wrh08e.setEnabled(false);
                    bi.wrh0888.setEnabled(false);
                }else{
                    bi.wrh08a.setEnabled(true);
                    bi.wrh08b.setEnabled(true);
                    bi.wrh08c.setEnabled(true);
                    bi.wrh08d.setEnabled(true);
                    bi.wrh08e.setEnabled(true);
                    bi.wrh0888.setEnabled(true);
                }
            }
        });
        bi.wrh0999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    bi.wrh09a.setChecked(false);
                    bi.wrh09b.setChecked(false);
                    bi.wrh09c.setChecked(false);
                    bi.wrh09d.setChecked(false);
                    bi.wrh0988.setChecked(false);
                    bi.wrh09a.setEnabled(false);
                    bi.wrh09b.setEnabled(false);
                    bi.wrh09c.setEnabled(false);
                    bi.wrh09d.setEnabled(false);
                    bi.wrh0988.setEnabled(false);
                }else{
                    bi.wrh09a.setEnabled(true);
                    bi.wrh09b.setEnabled(true);
                    bi.wrh09c.setEnabled(true);
                    bi.wrh09d.setEnabled(true);
                    bi.wrh0988.setEnabled(true);
                }
            }
        });
        bi.wrh10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != R.id.wrh10a) {
                    bi.fldGrpwrh10.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.wrh11,false);
                    ClearClass.ClearAllFields(bi.wrh12,false);
//                    bi.wrh11.clearCheck();
                    bi.wrh1188x.setText(null);
                    bi.wrh1288x.setText(null);
                } else {
                    bi.fldGrpwrh10.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.wrh11,true);
                    ClearClass.ClearAllFields(bi.wrh12,true);
                }
            }
        });
        bi.wrh1199.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.wrh11a.setChecked(false);
                    bi.wrh11b.setChecked(false);
                    bi.wrh11c.setChecked(false);
                    bi.wrh11d.setChecked(false);
                    bi.wrh11e.setChecked(false);
                    bi.wrh11f.setChecked(false);
                    bi.wrh1188.setChecked(false);
                    bi.wrh11a.setEnabled(false);
                    bi.wrh11b.setEnabled(false);
                    bi.wrh11c.setEnabled(false);
                    bi.wrh11d.setEnabled(false);
                    bi.wrh11e.setEnabled(false);
                    bi.wrh11f.setEnabled(false);
                    bi.wrh1188.setEnabled(false);
                }else {
                    bi.wrh11a.setEnabled(true);
                    bi.wrh11b.setEnabled(true);
                    bi.wrh11c.setEnabled(true);
                    bi.wrh11d.setEnabled(true);
                    bi.wrh11e.setEnabled(true);
                    bi.wrh11f.setEnabled(true);
                    bi.wrh1188.setEnabled(true);
                }
            }
        });
        bi.wrh1299.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    bi.wrh12a.setChecked(false);
                    bi.wrh12b.setChecked(false);
                    bi.wrh12c.setChecked(false);
                    bi.wrh1288.setChecked(false);
                    bi.wrh12a.setEnabled(false);
                    bi.wrh12b.setEnabled(false);
                    bi.wrh12c.setEnabled(false);
                    bi.wrh1288.setEnabled(false);
                }else{
                    bi.wrh12a.setEnabled(true);
                    bi.wrh12b.setEnabled(true);
                    bi.wrh12c.setEnabled(true);
                    bi.wrh1288.setEnabled(true);
                }
            }
        });
        bi.wrh13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != R.id.wrh13a) {
                    bi.fldGrpwrh13.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.wrh14,false);
                    ClearClass.ClearAllFields(bi.wrh15,false);
//                    bi.wrh14.clearCheck();
                    bi.wrh1488x.setText(null);
                    bi.wrh1588x.setText(null);
                } else {
                    bi.fldGrpwrh13.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.wrh14,true);
                    ClearClass.ClearAllFields(bi.wrh15,true);
                }
            }
        });
        bi.wrh1499.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.wrh14a.setChecked(false);
                    bi.wrh14b.setChecked(false);
                    bi.wrh14c.setChecked(false);
                    bi.wrh14d.setChecked(false);
                    bi.wrh14e.setChecked(false);
                    bi.wrh14f.setChecked(false);
                    bi.wrh14g.setChecked(false);
                    bi.wrh14h.setChecked(false);
                    bi.wrh1488.setChecked(false);
                    bi.wrh14a.setEnabled(false);
                    bi.wrh14b.setEnabled(false);
                    bi.wrh14c.setEnabled(false);
                    bi.wrh14d.setEnabled(false);
                    bi.wrh14e.setEnabled(false);
                    bi.wrh14f.setEnabled(false);
                    bi.wrh14g.setEnabled(false);
                    bi.wrh14h.setEnabled(false);
                    bi.wrh1488.setEnabled(false);
                }else{
                    bi.wrh14a.setEnabled(true);
                    bi.wrh14b.setEnabled(true);
                    bi.wrh14c.setEnabled(true);
                    bi.wrh14d.setEnabled(true);
                    bi.wrh14e.setEnabled(true);
                    bi.wrh14f.setEnabled(true);
                    bi.wrh14g.setEnabled(true);
                    bi.wrh14h.setEnabled(true);
                    bi.wrh1488.setEnabled(true);
                }
            }
        });
        bi.wrh1599.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.wrh15a.setChecked(false);
                    bi.wrh15b.setChecked(false);
                    bi.wrh15c.setChecked(false);
                    bi.wrh15d.setChecked(false);
                    bi.wrh15e.setChecked(false);
                    bi.wrh15f.setChecked(false);
                    bi.wrh15g.setChecked(false);
                    bi.wrh15h.setChecked(false);
                    bi.wrh15i.setChecked(false);
                    bi.wrh1588.setChecked(false);
                    bi.wrh15a.setEnabled(false);
                    bi.wrh15b.setEnabled(false);
                    bi.wrh15c.setEnabled(false);
                    bi.wrh15d.setEnabled(false);
                    bi.wrh15e.setEnabled(false);
                    bi.wrh15f.setEnabled(false);
                    bi.wrh15g.setEnabled(false);
                    bi.wrh15h.setEnabled(false);
                    bi.wrh15i.setEnabled(false);
                    bi.wrh1588.setEnabled(false);
                }
            }
        });
        bi.wrh16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != R.id.wrh16a) {
                    bi.fldGrpwrh16.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.wrh17,false);
                    ClearClass.ClearAllFields(bi.wrh18,false);
//                    bi.wrh17.clearCheck();
                    bi.wrh1788x.setText(null);
                    bi.wrh1888x.setText(null);
                } else {
                    bi.fldGrpwrh16.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.wrh17,true);
                    ClearClass.ClearAllFields(bi.wrh18,true);
                }
            }
        });
        bi.wrh1799.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.wrh17a.setChecked(false);
                    bi.wrh17b.setChecked(false);
                    bi.wrh17c.setChecked(false);
                    bi.wrh17d.setChecked(false);
                    bi.wrh17e.setChecked(false);
                    bi.wrh17f.setChecked(false);
                    bi.wrh17g.setChecked(false);
                    bi.wrh17h.setChecked(false);
                    bi.wrh1788.setChecked(false);
                    bi.wrh17a.setEnabled(false);
                    bi.wrh17b.setEnabled(false);
                    bi.wrh17c.setEnabled(false);
                    bi.wrh17d.setEnabled(false);
                    bi.wrh17e.setEnabled(false);
                    bi.wrh17f.setEnabled(false);
                    bi.wrh17g.setEnabled(false);
                    bi.wrh17h.setEnabled(false);
                    bi.wrh1788.setEnabled(false);
                } else {
                    bi.wrh17a.setEnabled(true);
                    bi.wrh17b.setEnabled(true);
                    bi.wrh17c.setEnabled(true);
                    bi.wrh17d.setEnabled(true);
                    bi.wrh17e.setEnabled(true);
                    bi.wrh17f.setEnabled(true);
                    bi.wrh17g.setEnabled(true);
                    bi.wrh17h.setEnabled(true);
                    bi.wrh1788.setEnabled(true);
                }
            }
        });
        bi.wrh1899.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    bi.wrh18a.setChecked(false);
                    bi.wrh18b.setChecked(false);
                    bi.wrh18c.setChecked(false);
                    bi.wrh18d.setChecked(false);
                    bi.wrh18e.setChecked(false);
                    bi.wrh1888.setChecked(false);
                    bi.wrh18a.setEnabled(false);
                    bi.wrh18b.setEnabled(false);
                    bi.wrh18c.setEnabled(false);
                    bi.wrh18d.setEnabled(false);
                    bi.wrh18e.setEnabled(false);
                    bi.wrh1888.setEnabled(false);
                }else{
                    bi.wrh18a.setEnabled(true);
                    bi.wrh18b.setEnabled(true);
                    bi.wrh18c.setEnabled(true);
                    bi.wrh18d.setEnabled(true);
                    bi.wrh18e.setEnabled(true);
                    bi.wrh1888.setEnabled(true);
                }
            }
        });
        bi.wrh19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != R.id.wrh19a) {
                    bi.fldGrpwrh19.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.wrh20,false);
                    ClearClass.ClearAllFields(bi.wrh21,false);
//                    bi.wrh20.clearCheck();
                    bi.wrh2088x.setText(null);
                    bi.wrh2188x.setText(null);
                } else {
                    bi.fldGrpwrh19.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.wrh20,true);
                    ClearClass.ClearAllFields(bi.wrh21,true);
                }
            }
        });
        bi.wrh2099.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.wrh20a.setChecked(false);
                    bi.wrh20b.setChecked(false);
                    bi.wrh20c.setChecked(false);
                    bi.wrh20d.setChecked(false);
                    bi.wrh20e.setChecked(false);
                    bi.wrh20f.setChecked(false);
                    bi.wrh2088.setChecked(false);
                    bi.wrh20a.setEnabled(false);
                    bi.wrh20b.setEnabled(false);
                    bi.wrh20c.setEnabled(false);
                    bi.wrh20d.setEnabled(false);
                    bi.wrh20e.setEnabled(false);
                    bi.wrh20f.setEnabled(false);
                    bi.wrh2088.setEnabled(false);
                }else{
                    bi.wrh20a.setEnabled(true);
                    bi.wrh20b.setEnabled(true);
                    bi.wrh20c.setEnabled(true);
                    bi.wrh20d.setEnabled(true);
                    bi.wrh20e.setEnabled(true);
                    bi.wrh20f.setEnabled(true);
                    bi.wrh2088.setEnabled(true);
                }
            }
        });
        bi.wrh2199.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.wrh21a.setChecked(false);
                    bi.wrh21b.setChecked(false);
                    bi.wrh21c.setChecked(false);
                    bi.wrh2188.setChecked(false);
                    bi.wrh21a.setEnabled(false);
                    bi.wrh21b.setEnabled(false);
                    bi.wrh21c.setEnabled(false);
                    bi.wrh2188.setEnabled(false);
                }else{
                    bi.wrh21a.setEnabled(true);
                    bi.wrh21b.setEnabled(true);
                    bi.wrh21c.setEnabled(true);
                    bi.wrh2188.setEnabled(true);
                }
            }
        });
        bi.wrh22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != R.id.wrh22a) {
                    bi.fldGrpwrh22.setVisibility(View.GONE);
                    bi.wrh23.clearCheck();
//                    bi.wrh24.clearCheck();
                    ClearClass.ClearAllFields(bi.wrh24,false);
                    bi.wrh2488x.setText(null);
                } else {
                    bi.fldGrpwrh22.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.wrh24,true);
                }
            }
        });
        bi.wrh23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId != R.id.wrh23b) {
                    bi.fldGrpwrh23.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.wrh24,false);
//                    bi.wrh24.clearCheck();
                    bi.wrh2488x.setText(null);
                } else {
                    bi.fldGrpwrh23.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.wrh24,true);

                }
            }
        });
        bi.wrh2499.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.wrh24a.setChecked(false);
                    bi.wrh24b.setChecked(false);
                    bi.wrh24c.setChecked(false);
                    bi.wrh24d.setChecked(false);
                    bi.wrh24e.setChecked(false);
                    bi.wrh24f.setChecked(false);
                    bi.wrh2488.setChecked(false);
                    bi.wrh24a.setEnabled(false);
                    bi.wrh24b.setEnabled(false);
                    bi.wrh24c.setEnabled(false);
                    bi.wrh24d.setEnabled(false);
                    bi.wrh24e.setEnabled(false);
                    bi.wrh24f.setEnabled(false);
                    bi.wrh2488.setEnabled(false);
                }else{
                    bi.wrh24a.setEnabled(true);
                    bi.wrh24b.setEnabled(true);
                    bi.wrh24c.setEnabled(true);
                    bi.wrh24d.setEnabled(true);
                    bi.wrh24e.setEnabled(true);
                    bi.wrh24f.setEnabled(true);
                    bi.wrh2488.setEnabled(true);
                }
            }
        });
    }


    private boolean formValidation() {

        if (!validatorClass.EmptyRadioButton(this, bi.wrh01, bi.wrh01a, getString(R.string.wrh01))) {
            return false;
        }
        if (bi.wrh01a.isChecked()) {


            if (!validatorClass.EmptyCheckBox(this, bi.wrh02, bi.wrh02a, getString(R.string.wrh02))) {
                return false;
            }


            if (bi.wrh0288.isChecked()) {
                if (!validatorClass.EmptyTextBox(this, bi.wrh0288x, getString(R.string.other))) {
                    return false;
                }
            }


            if (!validatorClass.EmptyCheckBox(this, bi.wrh03, bi.wrh03a, getString(R.string.wrh03))) {
                return false;
            }


            if (bi.wrh0388.isChecked()) {
                if (!validatorClass.EmptyTextBox(this, bi.wrh0388x, getString(R.string.other))) {
                    return false;
                }
            }
        }

        if (!validatorClass.EmptyRadioButton(this, bi.wrh04, bi.wrh04a, getString(R.string.wrh04))) {
            return false;
        }
        if (bi.wrh04a.isChecked()) {


            if (!validatorClass.EmptyCheckBox(this, bi.wrh05, bi.wrh05a, getString(R.string.wrh05))) {
                return false;
            }


            if (bi.wrh0588.isChecked()) {
                if (!validatorClass.EmptyTextBox(this, bi.wrh0588x, getString(R.string.other))) {
                    return false;
                }
            }


            if (!validatorClass.EmptyCheckBox(this, bi.wrh06, bi.wrh06a, getString(R.string.wrh06))) {
                return false;
            }


            if (bi.wrh0688.isChecked()) {
                if (!validatorClass.EmptyTextBox(this, bi.wrh0688x, getString(R.string.other))) {
                    return false;
                }
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh07, bi.wrh07a, getString(R.string.wrh07))) {
            return false;
        }

        if (bi.wrh07a.isChecked()) {

            if (!validatorClass.EmptyCheckBox(this, bi.wrh08, bi.wrh08a, getString(R.string.wrh08))) {
                return false;
            }


            if (bi.wrh0888.isChecked()) {
                if (!validatorClass.EmptyTextBox(this, bi.wrh0888x, getString(R.string.other))) {
                    return false;
                }
            }


            if (!validatorClass.EmptyCheckBox(this, bi.wrh09, bi.wrh09a, getString(R.string.wrh09))) {
                return false;
            }

            if (bi.wrh0988.isChecked()) {
                if (!validatorClass.EmptyTextBox(this, bi.wrh0988x, getString(R.string.other))) {
                    return false;
                }
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh10, bi.wrh10a, getString(R.string.wrh10))) {
            return false;
        }
        if (bi.wrh10a.isChecked()) {


            if (!validatorClass.EmptyCheckBox(this, bi.wrh11, bi.wrh11a, getString(R.string.wrh11))) {
                return false;
            }


            if (bi.wrh1188.isChecked()) {
                if (!validatorClass.EmptyTextBox(this, bi.wrh1188x, getString(R.string.other))) {
                    return false;
                }
            }


            if (!validatorClass.EmptyCheckBox(this, bi.wrh12, bi.wrh12a, getString(R.string.wrh12))) {
                return false;
            }


            if (bi.wrh1288.isChecked()) {
                if (!validatorClass.EmptyTextBox(this, bi.wrh1288x, getString(R.string.other))) {
                    return false;
                }
            }
        }

        if (!validatorClass.EmptyRadioButton(this, bi.wrh13, bi.wrh13a, getString(R.string.wrh13))) {
            return false;
        }
        if (bi.wrh13a.isChecked()) {


            if (!validatorClass.EmptyCheckBox(this, bi.wrh14, bi.wrh14a, getString(R.string.wrh14))) {
                return false;
            }


            if (bi.wrh1488.isChecked()) {
                if (!validatorClass.EmptyTextBox(this, bi.wrh1488x, getString(R.string.other))) {
                    return false;
                }
            }

            if (!validatorClass.EmptyCheckBox(this, bi.wrh15, bi.wrh15a, getString(R.string.wrh15))) {
                return false;
            }


            if (bi.wrh1588.isChecked()) {
                if (!validatorClass.EmptyTextBox(this, bi.wrh1588x, getString(R.string.other))) {
                    return false;
                }
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh16, bi.wrh16a, getString(R.string.wrh16))) {
            return false;
        }
        if (bi.wrh16a.isChecked()) {


            if (!validatorClass.EmptyCheckBox(this, bi.wrh17, bi.wrh17a, getString(R.string.wrh17))) {
                return false;
            }


            if (bi.wrh1788.isChecked()) {
                if (!validatorClass.EmptyTextBox(this, bi.wrh1788x, getString(R.string.other))) {
                    return false;
                }
            }


            if (!validatorClass.EmptyCheckBox(this, bi.wrh18, bi.wrh18a, getString(R.string.wrh18))) {
                return false;
            }


            if (bi.wrh1888.isChecked()) {
                if (!validatorClass.EmptyTextBox(this, bi.wrh1888x, getString(R.string.other))) {
                    return false;
                }
            }

        }

        if (!validatorClass.EmptyRadioButton(this, bi.wrh19, bi.wrh19a, getString(R.string.wrh19))) {
            return false;
        }

        if (bi.wrh19a.isChecked()) {

            if (!validatorClass.EmptyCheckBox(this, bi.wrh20, bi.wrh20a, getString(R.string.wrh20))) {
                return false;
            }


            if (bi.wrh2088.isChecked()) {
                if (!validatorClass.EmptyTextBox(this, bi.wrh2088x, getString(R.string.other))) {
                    return false;
                }
            }


            if (!validatorClass.EmptyCheckBox(this, bi.wrh21, bi.wrh21a, getString(R.string.wrh21))) {
                return false;
            }


            if (bi.wrh2188.isChecked()) {
                if (!validatorClass.EmptyTextBox(this, bi.wrh2188x, getString(R.string.other))) {
                    return false;
                }
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.wrh22, bi.wrh22a, getString(R.string.wrh22))) {
            return false;
        }
        if (bi.wrh22a.isChecked()) {


            if (!validatorClass.EmptyRadioButton(this, bi.wrh23, bi.wrh23a, getString(R.string.wrh23))) {
                return false;
            }
            if (bi.wrh23b.isChecked()) {


                if (!validatorClass.EmptyCheckBox(this, bi.wrh24, bi.wrh24a, getString(R.string.wrh24))) {
                    return false;
                }


                if (bi.wrh2488.isChecked()) {
                    return validatorClass.EmptyTextBox(this, bi.wrh2488x, getString(R.string.other));
                }
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


        sH.put("wrh02a", bi.wrh02a.isChecked() ? "1" : "0");
        sH.put("wrh02b", bi.wrh02b.isChecked() ? "2" : "0");
        sH.put("wrh02c", bi.wrh02c.isChecked() ? "3" : "0");
        sH.put("wrh02d", bi.wrh02d.isChecked() ? "4" : "0");
        sH.put("wrh02e", bi.wrh02e.isChecked() ? "5" : "0");
        sH.put("wrh02f", bi.wrh02f.isChecked() ? "6" : "0");
        sH.put("wrh02g", bi.wrh02g.isChecked() ? "7" : "0");
        sH.put("wrh0288", bi.wrh0288.isChecked() ? "88" : "0");
        sH.put("wrh0299", bi.wrh0299.isChecked() ? "99" : "0");

        sH.put("wrh0288x", bi.wrh0288x.getText().toString());


        sH.put("wrh03a", bi.wrh03a.isChecked() ? "1" : "0");
        sH.put("wrh03b", bi.wrh03b.isChecked() ? "2" : "0");
        sH.put("wrh0388", bi.wrh0388.isChecked() ? "88" : "0");
        sH.put("wrh0399", bi.wrh0399.isChecked() ? "99" : "0");

        sH.put("wrh0388x", bi.wrh0388x.getText().toString());


        sH.put("wrh04", bi.wrh04a.isChecked() ? "1"
                : bi.wrh04b.isChecked() ? "2"
                : bi.wrh0499.isChecked() ? "99"
                : "0");

        sH.put("wrh05a", bi.wrh05a.isChecked() ? "1" : "0");
        sH.put("wrh05b", bi.wrh05b.isChecked() ? "2" : "0");
        sH.put("wrh05c", bi.wrh05c.isChecked() ? "3" : "0");
        sH.put("wrh05d", bi.wrh05d.isChecked() ? "4" : "0");
        sH.put("wrh05e", bi.wrh05e.isChecked() ? "5" : "0");
        sH.put("wrh05f", bi.wrh05f.isChecked() ? "6" : "0");
        sH.put("wrh05g", bi.wrh05g.isChecked() ? "7" : "0");
        sH.put("wrh05h", bi.wrh05h.isChecked() ? "8" : "0");
        sH.put("wrh0588", bi.wrh0588.isChecked() ? "88" : "0");
        sH.put("wrh0599", bi.wrh0599.isChecked() ? "99" : "0");

        sH.put("wrh0588x", bi.wrh0588x.getText().toString());

        sH.put("wrh06a", bi.wrh06a.isChecked() ? "1" : "0");
        sH.put("wrh06b", bi.wrh06b.isChecked() ? "2" : "0");
        sH.put("wrh06c", bi.wrh06c.isChecked() ? "3" : "0");
        sH.put("wrh06d", bi.wrh06d.isChecked() ? "4" : "0");
        sH.put("wrh06e", bi.wrh06e.isChecked() ? "5" : "0");
        sH.put("wrh06f", bi.wrh06f.isChecked() ? "6" : "0");
        sH.put("wrh06g", bi.wrh06g.isChecked() ? "7" : "0");
        sH.put("wrh06h", bi.wrh06h.isChecked() ? "8" : "0");
        sH.put("wrh0688", bi.wrh0688.isChecked() ? "88" : "0");
        sH.put("wrh0699", bi.wrh0699.isChecked() ? "99" : "0");

        sH.put("wrh0688x", bi.wrh0688x.getText().toString());

        sH.put("wrh07", bi.wrh07a.isChecked() ? "1"
                : bi.wrh07b.isChecked() ? "2"
                : bi.wrh0799.isChecked() ? "99"
                : "0");


        sH.put("wrh08a", bi.wrh08a.isChecked() ? "1" : "0");
        sH.put("wrh08b", bi.wrh08b.isChecked() ? "2" : "0");
        sH.put("wrh08c", bi.wrh08c.isChecked() ? "3" : "0");
        sH.put("wrh08d", bi.wrh08d.isChecked() ? "4" : "0");
        sH.put("wrh08e", bi.wrh08e.isChecked() ? "5" : "0");
        sH.put("wrh0888", bi.wrh0888.isChecked() ? "88" : "0");
        sH.put("wrh0888x", bi.wrh0888x.getText().toString());
        sH.put("wrh0899", bi.wrh0899.isChecked() ? "99" : "0");


        sH.put("wrh09a", bi.wrh09a.isChecked() ? "1" : "0");
        sH.put("wrh09b", bi.wrh09b.isChecked() ? "2" : "0");
        sH.put("wrh09c", bi.wrh09c.isChecked() ? "3" : "0");
        sH.put("wrh09d", bi.wrh09d.isChecked() ? "4" : "0");
        sH.put("wrh0988", bi.wrh0988.isChecked() ? "88" : "0");
        sH.put("wrh0999", bi.wrh0999.isChecked() ? "99" : "0");

        sH.put("wrh0988x", bi.wrh0988x.getText().toString());


        sH.put("wrh10", bi.wrh10a.isChecked() ? "1"
                : bi.wrh10b.isChecked() ? "2"
                : bi.wrh1099.isChecked() ? "99"
                : "0");

        sH.put("wrh11a", bi.wrh11a.isChecked() ? "1" : "0");
        sH.put("wrh11b", bi.wrh11b.isChecked() ? "2" : "0");
        sH.put("wrh11c", bi.wrh11c.isChecked() ? "3" : "0");
        sH.put("wrh11d", bi.wrh11d.isChecked() ? "4" : "0");
        sH.put("wrh11e", bi.wrh11e.isChecked() ? "5" : "0");
        sH.put("wrh11f", bi.wrh11f.isChecked() ? "6" : "0");
        sH.put("wrh1188", bi.wrh1188.isChecked() ? "88" : "0");
        sH.put("wrh1199", bi.wrh1199.isChecked() ? "99" : "0");

        sH.put("wrh1188x", bi.wrh1188x.getText().toString());


        sH.put("wrh12a", bi.wrh12a.isChecked() ? "1" : "0");
        sH.put("wrh12b", bi.wrh12b.isChecked() ? "2" : "0");
        sH.put("wrh12c", bi.wrh12c.isChecked() ? "3" : "0");
        sH.put("wrh1288", bi.wrh1288.isChecked() ? "88" : "0");
        sH.put("wrh1299", bi.wrh1299.isChecked() ? "99" : "0");

        sH.put("wrh1288x", bi.wrh1288x.getText().toString());


        sH.put("wrh13", bi.wrh13a.isChecked() ? "1"
                : bi.wrh13b.isChecked() ? "2"
                : bi.wrh1399.isChecked() ? "99"
                : "0");

        sH.put("wrh14a", bi.wrh14a.isChecked() ? "1" : "0");
        sH.put("wrh14b", bi.wrh14b.isChecked() ? "2" : "0");
        sH.put("wrh14c", bi.wrh14c.isChecked() ? "3" : "0");
        sH.put("wrh14d", bi.wrh14d.isChecked() ? "4" : "0");
        sH.put("wrh14e", bi.wrh14e.isChecked() ? "5" : "0");
        sH.put("wrh14f", bi.wrh14f.isChecked() ? "6" : "0");
        sH.put("wrh14g", bi.wrh14g.isChecked() ? "7" : "0");
        sH.put("wrh14h", bi.wrh14h.isChecked() ? "8" : "0");
        sH.put("wrh1488", bi.wrh1488.isChecked() ? "88" : "0");
        sH.put("wrh1499", bi.wrh1499.isChecked() ? "99" : "0");

        sH.put("wrh1488x", bi.wrh1488x.getText().toString());


        sH.put("wrh15a", bi.wrh15a.isChecked() ? "1" : "0");
        sH.put("wrh15b", bi.wrh15b.isChecked() ? "2" : "0");
        sH.put("wrh15c", bi.wrh15c.isChecked() ? "3" : "0");
        sH.put("wrh15d", bi.wrh15d.isChecked() ? "4" : "0");
        sH.put("wrh15e", bi.wrh15e.isChecked() ? "5" : "0");
        sH.put("wrh15f", bi.wrh15f.isChecked() ? "6" : "0");
        sH.put("wrh15g", bi.wrh15g.isChecked() ? "7" : "0");
        sH.put("wrh15h", bi.wrh15h.isChecked() ? "8" : "0");
        sH.put("wrh15i", bi.wrh15i.isChecked() ? "9" : "0");
        sH.put("wrh1588", bi.wrh1588.isChecked() ? "88" : "0");
        sH.put("wrh1599", bi.wrh1599.isChecked() ? "99" : "0");

        sH.put("wrh1588x", bi.wrh1588x.getText().toString());


        sH.put("wrh16", bi.wrh16a.isChecked() ? "1"
                : bi.wrh16b.isChecked() ? "2"
                : bi.wrh1699.isChecked() ? "99"
                : "0");


        sH.put("wrh17a", bi.wrh17a.isChecked() ? "1" : "0");
        sH.put("wrh17b", bi.wrh17b.isChecked() ? "2" : "0");
        sH.put("wrh17c", bi.wrh17c.isChecked() ? "3" : "0");
        sH.put("wrh17d", bi.wrh17d.isChecked() ? "4" : "0");
        sH.put("wrh17e", bi.wrh17e.isChecked() ? "5" : "0");
        sH.put("wrh17f", bi.wrh17f.isChecked() ? "6" : "0");
        sH.put("wrh17g", bi.wrh17g.isChecked() ? "7" : "0");
        sH.put("wrh17h", bi.wrh17h.isChecked() ? "8" : "0");
        sH.put("wrh1788", bi.wrh1788.isChecked() ? "88" : "0");
        sH.put("wrh1799", bi.wrh1799.isChecked() ? "99" : "0");

        sH.put("wrh1788x", bi.wrh1788x.getText().toString());


        sH.put("wrh18a", bi.wrh18a.isChecked() ? "1" : "0");
        sH.put("wrh18b", bi.wrh18b.isChecked() ? "2" : "0");
        sH.put("wrh18c", bi.wrh18c.isChecked() ? "3" : "0");
        sH.put("wrh18d", bi.wrh18d.isChecked() ? "4" : "0");
        sH.put("wrh18e", bi.wrh18e.isChecked() ? "5" : "0");
        sH.put("wrh1888", bi.wrh1888.isChecked() ? "88" : "0");
        sH.put("wrh1899", bi.wrh1899.isChecked() ? "99" : "0");

        sH.put("wrh1888x", bi.wrh1888x.getText().toString());

        sH.put("wrh19", bi.wrh19a.isChecked() ? "1"
                : bi.wrh19b.isChecked() ? "2"
                : bi.wrh1999.isChecked() ? "99"
                : "0");

        sH.put("wrh20a", bi.wrh20a.isChecked() ? "1" : "0");
        sH.put("wrh20b", bi.wrh20b.isChecked() ? "2" : "0");
        sH.put("wrh20c", bi.wrh20c.isChecked() ? "3" : "0");
        sH.put("wrh20d", bi.wrh20d.isChecked() ? "4" : "0");
        sH.put("wrh20e", bi.wrh20e.isChecked() ? "5" : "0");
        sH.put("wrh20f", bi.wrh20f.isChecked() ? "6" : "0");
        sH.put("wrh2088", bi.wrh2088.isChecked() ? "88" : "0");
        sH.put("wrh2099", bi.wrh2099.isChecked() ? "99" : "0");


        sH.put("wrh2088x", bi.wrh2088x.getText().toString());


        sH.put("wrh21a", bi.wrh21a.isChecked() ? "1" : "0");
        sH.put("wrh21b", bi.wrh21b.isChecked() ? "2" : "0");
        sH.put("wrh21c", bi.wrh21c.isChecked() ? "3" : "0");
        sH.put("wrh2188", bi.wrh2188.isChecked() ? "88" : "0");
        sH.put("wrh2199", bi.wrh2199.isChecked() ? "99" : "0");

        sH.put("wrh2188x", bi.wrh2188x.getText().toString());


        sH.put("wrh22", bi.wrh22a.isChecked() ? "1"
                : bi.wrh22b.isChecked() ? "2"
                : bi.wrh2299.isChecked() ? "99"
                : "0");

        sH.put("wrh23", bi.wrh23a.isChecked() ? "1"
                : bi.wrh23b.isChecked() ? "2"
                : bi.wrh2399.isChecked() ? "99"
                : "0");


        sH.put("wrh24a", bi.wrh24a.isChecked() ? "1" : "0");
        sH.put("wrh24b", bi.wrh24b.isChecked() ? "2" : "0");
        sH.put("wrh24c", bi.wrh24c.isChecked() ? "3" : "0");
        sH.put("wrh24d", bi.wrh24d.isChecked() ? "4" : "0");
        sH.put("wrh24e", bi.wrh24e.isChecked() ? "5" : "0");
        sH.put("wrh24f", bi.wrh24f.isChecked() ? "6" : "0");
        sH.put("wrh2488", bi.wrh2488.isChecked() ? "88" : "0");
        sH.put("wrh2499", bi.wrh2499.isChecked() ? "99" : "0");


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