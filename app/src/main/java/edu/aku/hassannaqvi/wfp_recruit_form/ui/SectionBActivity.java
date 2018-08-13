package edu.aku.hassannaqvi.wfp_recruit_form.ui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import edu.aku.hassannaqvi.wfp_recruit_form.R;
import edu.aku.hassannaqvi.wfp_recruit_form.contracts.FamilyMembersContract;
import edu.aku.hassannaqvi.wfp_recruit_form.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfp_recruit_form.core.MainApp;
import edu.aku.hassannaqvi.wfp_recruit_form.databinding.ActivitySectionBBinding;
import edu.aku.hassannaqvi.wfp_recruit_form.other.DateUtils;
import edu.aku.hassannaqvi.wfp_recruit_form.validation.validatorClass;

public class SectionBActivity extends AppCompatActivity {

    ActivitySectionBBinding binding;
    static int serial_no = 0;
    String age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_section_b);
        binding.setCallback(this);

        this.setTitle("Section B");
        setupViews();
        skipPatterns();
    }

    public void skipPatterns() {

        binding.wrb04.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (binding.wrb04.getText().toString().isEmpty()) {
                    binding.wrb03.setEnabled(false);
                    binding.wrb033.setEnabled(false);
                    binding.wrb033.setText(null);
                    binding.wrb03.setText(null);

                    // binding.wrb06.clearCheck();
                    for (int i = 0; i < binding.wrb06.getChildCount(); i++) {
                        View v = binding.wrb06.getChildAt(i);
                        if (v instanceof RadioButton) {
                            v.setEnabled(false);
                        }
                    }

                    //binding.wrb07.clearCheck();
                    for (int i = 0; i < binding.wrb07.getChildCount(); i++) {
                        View v = binding.wrb07.getChildAt(i);
                        if (v instanceof RadioButton) {
                            v.setEnabled(false);
                        }
                    }

                } else {
                    if(Integer.valueOf(binding.wrb04.getText().toString()) < 3){

                        binding.wrb03.setEnabled(true);
                        binding.wrb03.setText(null);
                        binding.wrb033.setEnabled(true);
                        // binding.wrb033.setText(null);
                        switch (Integer.valueOf(binding.wrb04.getText().toString())) {
                            case 1:
                                binding.wrb03.setMinDate(DateUtils.getYearsBack("dd/MM/yyyy", -1));
                                break;
                            case 2:
                                binding.wrb03.setMinDate(DateUtils.getYearsBack("dd/MM/yyyy", -2));
                                break;
                            case 3:
                                binding.wrb03.setMinDate(DateUtils.getYearsBack("dd/MM/yyyy", -3));
                                break;
                            case 4:
                                binding.wrb03.setMinDate(DateUtils.getYearsBack("dd/MM/yyyy", -4));
                                break;
                        }


                        binding.fldGrpwrb01.setVisibility(View.GONE);
                        binding.wrb05.clearCheck();
                        binding.wrb06.clearCheck();
                        View v = binding.fldGrpwrb02.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(false);
                        }
                        binding.wrb06a.setEnabled(true);
                        //binding.wrb06b.setEnabled(true);
                        binding.wrb07.clearCheck();
                        v = binding.fldGrpwrb03.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(false);
                        }
                        binding.wrb07a.setChecked(true);


                    } else if (Integer.valueOf(binding.wrb04.getText().toString()) < 5) {
                        binding.wrb03.setEnabled(true);
                        binding.wrb03.setText(null);
                        binding.wrb033.setEnabled(true);
                        // binding.wrb033.setText(null);
                        switch (Integer.valueOf(binding.wrb04.getText().toString())) {
                            case 1:
                                binding.wrb03.setMinDate(DateUtils.getYearsBack("dd/MM/yyyy", -1));
                                break;
                            case 2:
                                binding.wrb03.setMinDate(DateUtils.getYearsBack("dd/MM/yyyy", -2));
                                break;
                            case 3:
                                binding.wrb03.setMinDate(DateUtils.getYearsBack("dd/MM/yyyy", -3));
                                break;
                            case 4:
                                binding.wrb03.setMinDate(DateUtils.getYearsBack("dd/MM/yyyy", -4));
                                break;
                        }


                        binding.fldGrpwrb01.setVisibility(View.GONE);
                        binding.wrb05.clearCheck();
                        binding.wrb06.clearCheck();
                        View v = binding.fldGrpwrb02.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(false);
                        }
                        binding.wrb06a.setEnabled(true);
                        binding.wrb06b.setEnabled(true);
                        binding.wrb07.clearCheck();
                        v = binding.fldGrpwrb03.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(true);
                        }

                        if (binding.wrb02a.isChecked()) {
                            binding.wrb07b.setEnabled(false);
                        } else if (binding.wrb02b.isChecked()) {
                            binding.wrb07b.setEnabled(true);
                        }


                    } else if (Integer.valueOf(binding.wrb04.getText().toString()) < 11) {

                        binding.wrb03.setEnabled(false);
                        binding.wrb033.setEnabled(false);
                        binding.wrb03.setText(null);
                        binding.wrb033.setText(null);
                        binding.fldGrpwrb01.setVisibility(View.GONE);
                        binding.wrb05.clearCheck();
                        binding.wrb05e.setChecked(true);

                        binding.wrb06.clearCheck();
                        View v = binding.fldGrpwrb02.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(false);
                        }
                        binding.wrb06a.setEnabled(true);
                        binding.wrb06b.setEnabled(true);
                        binding.wrb06c.setEnabled(true);
                        binding.wrb07.clearCheck();
                        //binding.wrb07a.setChecked(true);
                        v = binding.fldGrpwrb03.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(true);
                        }

                        if (binding.wrb02a.isChecked()) {
                            binding.wrb07b.setEnabled(false);
                        } else if (binding.wrb02b.isChecked()) {
                            binding.wrb07b.setEnabled(true);
                        }

                    } else if (Integer.valueOf(binding.wrb04.getText().toString()) < 14) {

                        binding.wrb03.setEnabled(false);
                        binding.wrb033.setEnabled(false);
                        binding.wrb03.setText(null);
                        binding.wrb033.setText(null);
                        binding.fldGrpwrb01.setVisibility(View.GONE);
                        binding.wrb05.clearCheck();
                        binding.wrb05e.setChecked(true);

                        binding.wrb06.clearCheck();
                        View v = binding.fldGrpwrb02.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(false);
                        }
                        binding.wrb06a.setEnabled(true);
                        binding.wrb06b.setEnabled(true);
                        binding.wrb06c.setEnabled(true);
                        binding.wrb06d.setEnabled(true);
                        binding.wrb07.clearCheck();
                        v = binding.fldGrpwrb03.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(true);
                        }

                        if (binding.wrb02a.isChecked()) {
                            binding.wrb07b.setEnabled(false);
                        } else if (binding.wrb02b.isChecked()) {
                            binding.wrb07b.setEnabled(true);
                        }

                    } else if (Integer.valueOf(binding.wrb04.getText().toString()) < 16) {

                        binding.wrb03.setEnabled(false);
                        binding.wrb033.setEnabled(false);
                        binding.wrb03.setText(null);
                        binding.wrb033.setText(null);
                        binding.fldGrpwrb01.setVisibility(View.GONE);
                        binding.wrb05.clearCheck();
                        binding.wrb05e.setChecked(true);

                        binding.wrb06.clearCheck();
                        View v = binding.fldGrpwrb02.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(false);
                        }
                        binding.wrb06a.setEnabled(true);
                        binding.wrb06b.setEnabled(true);
                        binding.wrb06c.setEnabled(true);
                        binding.wrb06d.setEnabled(true);
                        binding.wrb06e.setEnabled(true);
                        binding.wrb07.clearCheck();

                        v = binding.fldGrpwrb03.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(true);
                        }

                        if (binding.wrb02a.isChecked()) {
                            binding.wrb07b.setEnabled(false);
                        } else if (binding.wrb02b.isChecked()) {
                            binding.wrb07b.setEnabled(true);
                        }
                    } else if (Integer.valueOf(binding.wrb04.getText().toString()) < 18) {
                        binding.wrb03.setEnabled(false);
                        binding.wrb033.setEnabled(false);
                        binding.wrb03.setText(null);
                        binding.wrb033.setText(null);
                        binding.fldGrpwrb01.setVisibility(View.GONE);
                        binding.wrb05.clearCheck();
                        binding.wrb05e.setChecked(true);

                        binding.wrb06.clearCheck();
//                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
//                            ((RadioGroup) v).getChildAt(j).setEnabled(false);
//                        }
                        binding.wrb06a.setEnabled(true);
                        binding.wrb06b.setEnabled(true);
                        binding.wrb06c.setEnabled(true);
                        binding.wrb06d.setEnabled(true);
                        binding.wrb06e.setEnabled(true);
                        binding.wrb06f.setEnabled(true);
                        binding.wrb07.clearCheck();

                        View v = binding.fldGrpwrb02.getChildAt(0);
                        v = binding.fldGrpwrb03.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(true);
                        }

                        if (binding.wrb02a.isChecked()) {
                            binding.wrb07b.setEnabled(false);
                        } else if (binding.wrb02b.isChecked()) {
                            binding.wrb07b.setEnabled(true);
                        }
                    } else if (Integer.valueOf(binding.wrb04.getText().toString()) < 20) {
                        binding.wrb03.setEnabled(false);
                        binding.wrb033.setEnabled(false);
                        binding.wrb03.setText(null);
                        binding.wrb033.setText(null);
                        binding.fldGrpwrb01.setVisibility(View.GONE);
                        binding.wrb05.clearCheck();
                        binding.wrb05e.setChecked(true);

                        binding.wrb06.clearCheck();
                        View v = binding.fldGrpwrb02.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(false);
                        }
                        binding.wrb06a.setEnabled(true);
                        binding.wrb06b.setEnabled(true);
                        binding.wrb06c.setEnabled(true);
                        binding.wrb06d.setEnabled(true);
                        binding.wrb06e.setEnabled(true);
                        binding.wrb06f.setEnabled(true);
                        binding.wrb06g.setEnabled(true);
                        binding.wrb07.clearCheck();

                        v = binding.fldGrpwrb03.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(true);
                        }

                        if (binding.wrb02a.isChecked()) {
                            binding.wrb07b.setEnabled(false);
                        } else if (binding.wrb02b.isChecked()) {
                            binding.wrb07b.setEnabled(true);
                        }
                    } else {
                        binding.wrb03.setEnabled(false);
                        binding.wrb033.setEnabled(false);
                        binding.wrb03.setText(null);
                        binding.wrb033.setText(null);
                        binding.fldGrpwrb01.setVisibility(View.GONE);
                        binding.wrb05.clearCheck();
                        binding.wrb05e.setChecked(true);

                        binding.wrb06.clearCheck();
                        View v = binding.fldGrpwrb02.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(false);
                        }
                        binding.wrb06a.setEnabled(true);
                        binding.wrb06b.setEnabled(true);
                        binding.wrb06c.setEnabled(true);
                        binding.wrb06d.setEnabled(true);
                        binding.wrb06e.setEnabled(true);
                        binding.wrb06f.setEnabled(true);
                        binding.wrb06g.setEnabled(true);
                        binding.wrb06h.setEnabled(true);
                        binding.wrb07.clearCheck();

                        v = binding.fldGrpwrb03.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(true);
                        }

                        if (binding.wrb02a.isChecked()) {
                            binding.wrb07b.setEnabled(false);
                        } else if (binding.wrb02b.isChecked()) {
                            binding.wrb07b.setEnabled(true);
                        }
                    }

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.wrb033.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if (!binding.wrb033.getText().toString().equalsIgnoreCase("")) {
                    if (Integer.valueOf(binding.wrb04.getText().toString()) == 1) {
                        switch (Integer.valueOf(binding.wrb033.getText().toString())) {
                            case 0:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -12, 0));
                                break;
                            case 1:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -13, 0));
                                break;
                            case 2:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -14, 0));
                                break;
                            case 3:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -15, 0));
                                break;
                            case 4:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -16, 0));
                                break;
                            case 5:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -17, 0));
                                break;
                            case 6:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -18, 0));
                                break;
                            case 7:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -19, 0));
                                break;
                            case 8:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -20, 0));
                                break;
                            case 9:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -21, 0));
                                break;
                            case 10:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -22, 0));
                                break;
                            case 11:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -23, 0));
                                break;
                            case 12:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -24, 0));
                                break;

                        }

                    } else if (Integer.valueOf(binding.wrb04.getText().toString()) == 2) {
                        switch (Integer.valueOf(binding.wrb033.getText().toString())) {
                            case 0:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -12, 0));
                                break;
                            case 1:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -13, -1));
                                break;
                            case 2:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -14, -1));
                                break;
                            case 3:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -15, -1));
                                break;
                            case 4:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -16, -1));
                                break;
                            case 5:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -17, -1));
                                break;
                            case 6:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -18, -1));
                                break;
                            case 7:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -19, -1));
                                break;
                            case 8:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -20, -1));
                                break;
                            case 9:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -21, -1));
                                break;
                            case 10:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -22, -1));
                                break;
                            case 11:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -23, -1));
                                break;
                            case 12:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -24, -1));
                                break;

                        }

                    } else if (Integer.valueOf(binding.wrb04.getText().toString()) == 3) {
                        switch (Integer.valueOf(binding.wrb033.getText().toString())) {
                            case 0:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -12, 0));
                                break;
                            case 1:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -13, -3));
                                break;
                            case 2:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -14, -2));
                                break;
                            case 3:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -15, -2));
                                break;
                            case 4:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -16, -2));
                                break;
                            case 5:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -17, -2));
                                break;
                            case 6:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -18, -2));
                                break;
                            case 7:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -19, -2));
                                break;
                            case 8:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -20, -2));
                                break;
                            case 9:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -21, -2));
                                break;
                            case 10:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -22, -2));
                                break;
                            case 11:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -23, -2));
                                break;
                            case 12:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -24, -2));
                                break;

                        }

                    } else if (Integer.valueOf(binding.wrb04.getText().toString()) == 4) {
                        switch (Integer.valueOf(binding.wrb033.getText().toString())) {
                            case 0:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -12, 0));
                                break;
                            case 1:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -13, -3));
                                break;
                            case 2:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -14, -3));
                                break;
                            case 3:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -15, -3));
                                break;
                            case 4:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -16, -3));
                                break;
                            case 5:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -17, -3));
                                break;
                            case 6:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -18, -3));
                                break;
                            case 7:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -19, -3));
                                break;
                            case 8:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -20, -3));
                                break;
                            case 9:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -21, -3));
                                break;
                            case 10:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -22, -3));
                                break;
                            case 11:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -23, -3));
                                break;
                            case 12:
                                binding.wrb03.setMinDate(DateUtils.getYearsAndMonthsBack("dd/MM/yyyy", -24, -3));
                                break;

                        }

                    }


                }


            }

            @Override
            public void afterTextChanged(Editable editable) {


            }
        });

        binding.wrb06.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
//                if (i == R.id.wrb06c) {
//                    if (binding.wrb02a.isChecked()) {
//
//                        for (int j = 0; j < binding.wrb07.getChildCount(); j++) {
//
//                            binding.wrb07.getChildAt(j).setEnabled(false);
//
//                        }
//
//                    } else {
//
//                        for (int j = 0; j < binding.wrb07.getChildCount(); j++) {
//
//                            binding.wrb07.getChildAt(j).setEnabled(true);
//
//                        }
//
//                    }
//
//
//                }


            }
        });

        binding.wrb02.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.wrb02a) {
                    if (binding.wrb04.getText().toString().equalsIgnoreCase("") || Integer.valueOf(binding.wrb04.getText().toString()) >= 3) {
                        View v = binding.fldGrpwrb03.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(true);
                        }
                        binding.wrb07b.setEnabled(false);
                        binding.wrb07.clearCheck();

                    } else {
                        View v = binding.fldGrpwrb03.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(false);
                        }
                        binding.wrb07a.setChecked(true);
                    }
//

                } else if (i == R.id.wrb02b) {
                    if (binding.wrb04.getText().toString().equalsIgnoreCase("") || Integer.valueOf(binding.wrb04.getText().toString()) >= 3) {
                        View v = binding.fldGrpwrb03.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(true);
                        }
                        binding.wrb07b.setEnabled(true);
                        binding.wrb07.clearCheck();
                    } else {
                        View v = binding.fldGrpwrb03.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(false);
                        }
                        binding.wrb07a.setChecked(true);
                    }


                }


            }
        });


//        binding.wrb04.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//                if () {
//
//                    if ( && ) {
//
//
//                    }
//
//                }
//
//            }
//
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//            }
//        });


    }

    public void setupViews() {
        binding.wrb03.setManager(getSupportFragmentManager());
        binding.wrb03.setMaxDate(new SimpleDateFormat("dd/MM/yyyy").format(System.currentTimeMillis()));
    }

    public void BtnAddMember() {
        if (ValidateForm()) {
            try {
                SaveDrafts();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDb()) {
                finish();

                startActivity(new Intent(this, SectionBActivity.class));

            } else {
                Toast.makeText(this, "Failed to update Database", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void BtnContinue() {
        if (ValidateForm()) {
            try {
                SaveDrafts();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDb()) {

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
                alertDialogBuilder
                        .setMessage("Are you sure to continue for next section?")
                        .setCancelable(false)
                        .setPositiveButton("Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {

                                        if (SectionAActivity.pwList.size() > 0) {
                                            startActivity(new Intent(SectionBActivity.this, SectionCActivity.class));
                                        } else {
                                            startActivity(new Intent(SectionBActivity.this, EndingActivity.class).putExtra("complete", true));
                                        }
                                        finish();
                                    }
                                });
                alertDialogBuilder.setNegativeButton("Cancel",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = alertDialogBuilder.create();
                alert.show();

            } else {
                Toast.makeText(this, "Failed to update Database", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void BtnEnd() {
        MainApp.endActivity(this, this);
    }

    public boolean ValidateForm() {

//        01
        if (!validatorClass.EmptyTextBox(this, binding.wrb01, getString(R.string.wrb01))) {
            return false;
        }
//        02
        if (!validatorClass.EmptyRadioButton(this, binding.wrb02, binding.wrb02b, getString(R.string.wrb02))) {
            return false;
        }
//        04
        if (!validatorClass.EmptyTextBox(this, binding.wrb04, getString(R.string.wrb04))) {
            return false;
        }
        if (!validatorClass.RangeTextBox(this, binding.wrb04, 0, 99, getString(R.string.wrb04), " AGE")) {
            return false;
        }
//        03
        if (Integer.valueOf(binding.wrb04.getText().toString()) < 5) {

            if (!validatorClass.EmptyTextBox(this, binding.wrb033, getString(R.string.wrb033))) {

                return false;
            }

            if (!validatorClass.RangeTextBox(this, binding.wrb033, 0, 12, "Month can not be greater than 12", "Number")) {
                return false;
            }

            if (!validatorClass.EmptyTextBox(this, binding.wrb03, getString(R.string.wrb03))) {
                return false;
            }
        }
//        05
//        if (Integer.valueOf(binding.wrb04.getText().toString()) > 10) {
//            if (!validatorClass.EmptyRadioButton(this, binding.wrb05, binding.wrb06e, getString(R.string.wrb05))) {
//                return false;
//            }
//        }
//        06
        if (!validatorClass.EmptyRadioButton(this, binding.wrb06, binding.wrb06h, getString(R.string.wrb06))) {
            return false;
        }
//        07
        return validatorClass.EmptyRadioButton(this, binding.wrb07, binding.wrb07k, getString(R.string.wrb07));
    }

    private void SaveDrafts() throws JSONException {

        serial_no++;

        MainApp.fmc = new FamilyMembersContract();
        MainApp.fmc.setDevicetagID(MainApp.fc.getDevicetagID());
        MainApp.fmc.setFormDate(MainApp.fc.getFormDate());
        MainApp.fmc.setInterviewer1(MainApp.fc.getInterviewer01());
        MainApp.fmc.setInterviewer2(MainApp.fc.getInterviewer02());
        MainApp.fmc.setDeviceId(MainApp.fc.getDeviceID());
        MainApp.fmc.setApp_ver(MainApp.fc.getAppversion());
        MainApp.fmc.set_UUID(MainApp.fc.getUID());

        MainApp.fmc.setSerialNo(String.valueOf(serial_no));
        MainApp.fmc.setName(binding.wrb01.getText().toString());

        JSONObject sB = new JSONObject();

        sB.put("wrb01", binding.wrb01.getText().toString());
        sB.put("serial_no", String.valueOf(serial_no));
        sB.put("wrb02", binding.wrb02a.isChecked() ? "1" : binding.wrb02b.isChecked() ? "2" : "0");
        sB.put("wrb03", binding.wrb03.getText().toString());
        sB.put("wrb03", binding.wrb033.getText().toString());
        sB.put("wrb04", binding.wrb04.getText().toString());
        // sB.put("wrb05", binding.wrb05a.isChecked() ? "1" : binding.wrb05b.isChecked() ? "2" : binding.wrb05c.isChecked() ? "3" : binding.wrb05d.isChecked() ? "4"
        //: binding.wrb05e.isChecked() ? "5" : "0");
        sB.put("wrb06", binding.wrb06a.isChecked() ? "1" : binding.wrb06b.isChecked() ? "2" : binding.wrb06c.isChecked() ? "3" : binding.wrb06d.isChecked() ? "4"
                : binding.wrb06e.isChecked() ? "5" : binding.wrb06f.isChecked() ? "6" : binding.wrb06g.isChecked() ? "7" : binding.wrb06h.isChecked() ? "8"
                : "0");
        sB.put("wrb07", binding.wrb07a.isChecked() ? "1" : binding.wrb07b.isChecked() ? "2" : binding.wrb07c.isChecked() ? "3" : binding.wrb07d.isChecked() ? "4"
                : binding.wrb07e.isChecked() ? "5" : binding.wrb07f.isChecked() ? "6" : binding.wrb07g.isChecked() ? "7" : binding.wrb07h.isChecked() ? "8"
                : binding.wrb07i.isChecked() ? "9" : binding.wrb07j.isChecked() ? "10" : binding.wrb07k.isChecked() ? "11" : "0");

        MainApp.fmc.setsB(String.valueOf(sB));


//        Functionality
        if (binding.wrb02b.isChecked() && Integer.valueOf(binding.wrb04.getText().toString()) >= 14 && Integer.valueOf(binding.wrb04.getText().toString()) < 50 ) {
            SectionAActivity.pwList.add(MainApp.fmc);
        }

    }

    private boolean UpdateDb() {
        DatabaseHelper db = new DatabaseHelper(this);

        long updcount = db.addFamilyMembers(MainApp.fmc);
        MainApp.fmc.set_ID(String.valueOf(updcount));

        if (updcount != 0) {
            MainApp.fmc.set_UID(
                    (MainApp.fmc.getDeviceId() + MainApp.fmc.get_ID()));
            db.updateFamilyMemberID();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

}
