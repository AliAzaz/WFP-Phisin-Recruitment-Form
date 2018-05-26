package edu.aku.hassannaqvi.wfp_recruit_form.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfp_recruit_form.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfp_recruit_form.core.MainApp;

public class SectionJActivity extends AppCompatActivity {

    private static final String TAG = SectionJActivity.class.getSimpleName();

    @BindView(R.id.wrj01)
    RadioGroup wrj01;
    @BindView(R.id.wrj0101)
    RadioButton wrj0101;
    @BindView(R.id.wrj0102)
    RadioButton wrj0102;
    @BindView(R.id.wrj0103)
    RadioButton wrj0103;
    @BindView(R.id.wrj0196)
    RadioButton wrj0196;
    @BindView(R.id.wrj0196x)
    EditText wrj0196x;
    @BindView(R.id.fldGrpwrj02)
    LinearLayout fldGrpwrj02;
    @BindView(R.id.wrj02)
    RadioGroup wrj02;
    @BindView(R.id.wrj0201)
    RadioButton wrj0201;
    @BindView(R.id.wrj0202)
    RadioButton wrj0202;
    @BindView(R.id.wrj03)
    RadioGroup wrj03;
    @BindView(R.id.wrj0301)
    RadioButton wrj0301;
    @BindView(R.id.wrj0302)
    RadioButton wrj0302;
    @BindView(R.id.wrj0303)
    RadioButton wrj0303;
    @BindView(R.id.wrj0304)
    RadioButton wrj0304;
    @BindView(R.id.wrj0305)
    RadioButton wrj0305;
    @BindView(R.id.wrj04)
    RadioGroup wrj04;
    @BindView(R.id.wrj0401)
    RadioButton wrj0401;
    @BindView(R.id.wrj0402)
    RadioButton wrj0402;
    @BindView(R.id.fldGrpwrj05)
    LinearLayout fldGrpwrj05;
    @BindView(R.id.wrj05)
    RadioGroup wrj05;
    @BindView(R.id.wrj0501)
    RadioButton wrj0501;
    @BindView(R.id.wrj0502)
    RadioButton wrj0502;
    @BindView(R.id.wrj0503)
    RadioButton wrj0503;
    @BindView(R.id.wrj0504)
    RadioButton wrj0504;
    @BindView(R.id.wrj0505)
    RadioButton wrj0505;
    @BindView(R.id.wrj0601)
    CheckBox wrj0601;
    @BindView(R.id.wrj0602)
    CheckBox wrj0602;
    @BindView(R.id.wrj0603)
    CheckBox wrj0603;
    @BindView(R.id.wrj0604)
    CheckBox wrj0604;
    @BindView(R.id.wrj0605)
    CheckBox wrj0605;
    @BindView(R.id.wrj0606)
    CheckBox wrj0606;
    @BindView(R.id.wrj0607)
    CheckBox wrj0607;
    @BindView(R.id.wrj0608)
    CheckBox wrj0608;
    @BindView(R.id.wrj0609)
    CheckBox wrj0609;
    @BindView(R.id.wrj0696)
    CheckBox wrj0696;
    @BindView(R.id.wrj0696x)
    EditText wrj0696x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_h);
        ButterKnife.bind(this);

        this.setTitle("Section J");

//*********************************Section H***********************

        wrj01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (wrj0101.isChecked()) {
                    fldGrpwrj02.setVisibility(View.VISIBLE);
                } else {
                    fldGrpwrj02.setVisibility(View.GONE);
                    wrj02.clearCheck();
                    wrj03.clearCheck();
                }
            }
        });


        wrj0196.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    wrj0196x.setVisibility(View.VISIBLE);
                } else {
                    wrj0196x.setVisibility(View.GONE);
                    wrj0196x.setText(null);
                }
            }
        });

        wrj04.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (wrj0401.isChecked()) {
                    fldGrpwrj05.setVisibility(View.VISIBLE);
                } else {
                    fldGrpwrj05.setVisibility(View.GONE);
                    wrj05.clearCheck();
                }
            }
        });

        wrj0696.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    wrj0696x.setVisibility(View.VISIBLE);
                } else {
                    wrj0696x.setVisibility(View.GONE);
                    wrj0696x.setText(null);
                }
            }
        });

    }

    @OnClick(R.id.btnNext)
    void onBtnNextClick() {
        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();

                startActivity(new Intent(this, SectionKActivity.class));
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }


    @OnClick(R.id.btnEnd)
    void onBtnEndClick() {
        MainApp.endActivity(this, this);
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sj = new JSONObject();

        sj.put("wrj01", wrj0101.isChecked() ? "1" : wrj0102.isChecked() ? "2" : wrj0103.isChecked() ? "3"
                : wrj0196.isChecked() ? "96" : "0");
        sj.put("wrj0196x", wrj0196x.getText().toString());
        sj.put("wrj02", wrj0201.isChecked() ? "1" : wrj0202.isChecked() ? "2" : "0");
        sj.put("wrj03", wrj0301.isChecked() ? "1" : wrj0302.isChecked() ? "2" : wrj0303.isChecked() ? "3"
                : wrj0304.isChecked() ? "4" : wrj0305.isChecked() ? "5" : "0");
        sj.put("wrj04", wrj0401.isChecked() ? "1" : wrj0402.isChecked() ? "2" : "0");
        sj.put("wrj05", wrj0501.isChecked() ? "1" : wrj0502.isChecked() ? "2" : wrj0503.isChecked() ? "3"
                : wrj0504.isChecked() ? "4" : wrj0505.isChecked() ? "5" : "0");
        sj.put("wrj0601", wrj0601.isChecked() ? "1" : "0");
        sj.put("wrj0602", wrj0602.isChecked() ? "1" : "0");
        sj.put("wrj0603", wrj0603.isChecked() ? "1" : "0");
        sj.put("wrj0604", wrj0604.isChecked() ? "1" : "0");
        sj.put("wrj0605", wrj0605.isChecked() ? "1" : "0");
        sj.put("wrj0606", wrj0606.isChecked() ? "1" : "0");
        sj.put("wrj0607", wrj0607.isChecked() ? "1" : "0");
        sj.put("wrj0607", wrj0607.isChecked() ? "1" : "0");
        sj.put("wrj0608", wrj0608.isChecked() ? "1" : "0");
        sj.put("wrj0609", wrj0609.isChecked() ? "1" : "0");
        sj.put("wrj0696", wrj0696.isChecked() ? "1" : "0");
        sj.put("wrj0696x", wrj0696x.getText().toString());

        MainApp.fc.setsJ(String.valueOf(sj));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean ValidateForm() {

        Toast.makeText(this, "Validating Section H", Toast.LENGTH_SHORT).show();

//*************************************Section H******************
        //======================= Q 1 ===============
        if (wrj01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrj01), Toast.LENGTH_SHORT).show();
            wrj0196.setError("This data is Required!");
            Log.i(TAG, "wrj01: This data is Required!");
            return false;
        } else {
            wrj0196.setError(null);
        }

        //====================== Q1 Others ================
        if (wrj0196.isChecked() && wrj0196x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrj01) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            wrj0196x.setError("This data is Required!");
            Log.i(TAG, "wrj0196x: This data is Required!");
            return false;
        } else {
            wrj0196x.setError(null);
        }

        if (wrj0101.isChecked()) {
            //====================== Q2 ================
            if (wrj02.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrj02), Toast.LENGTH_SHORT).show();
                wrj0202.setError("This data is Required!");
                Log.i(TAG, "wrj02: This data is Required!");
                return false;
            } else {
                wrj0202.setError(null);
            }

            //====================== Q3 ================
            if (wrj03.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrj03), Toast.LENGTH_SHORT).show();
                wrj0305.setError("This data is Required!");
                Log.i(TAG, "wrj03: This data is Required!");
                return false;
            } else {
                wrj0305.setError(null);
            }

        }

        //====================== Q4 ================
        if (wrj04.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrj04), Toast.LENGTH_SHORT).show();
            wrj0402.setError("This data is Required!");
            Log.i(TAG, "wrj04: This data is Required!");
            return false;
        } else {
            wrj0402.setError(null);
        }

        if (wrj0401.isChecked()) {
            //====================== Q5 ================
            if (wrj05.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrj05), Toast.LENGTH_SHORT).show();
                wrj0505.setError("This data is Required!");
                Log.i(TAG, "wrj05: This data is Required!");
                return false;
            } else {
                wrj0505.setError(null);
            }
        }

        //====================== Q6 ================
        if (!(wrj0601.isChecked() || wrj0602.isChecked() || wrj0603.isChecked() || wrj0604.isChecked()
                || wrj0605.isChecked() || wrj0606.isChecked() || wrj0607.isChecked() || wrj0607.isChecked()
                || wrj0608.isChecked() || wrj0609.isChecked() || wrj0696.isChecked())) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrj06), Toast.LENGTH_SHORT).show();
            wrj0696.setError("This data is Required!");
            Log.i(TAG, "wrj06: This data is Required!");
            return false;
        } else {
            wrj0696.setError(null);
        }

        //====================== Q6 Others ================
        if (wrj0696.isChecked() && wrj0696x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrj06) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            wrj0696x.setError("This data is Required!");
            Log.i(TAG, "wrj0696x: This data is Required!");
            return false;
        } else {
            wrj0696x.setError(null);
        }

        return true;
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSJ();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


}
