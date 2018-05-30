package edu.aku.hassannaqvi.wfp_recruit_form.ui;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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
import edu.aku.hassannaqvi.wfp_recruit_form.validation.validatorClass;

public class SectionBActivity extends AppCompatActivity {

    ActivitySectionBBinding binding;
    static int serial_no = 0;

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
                    binding.wrb03.setText(null);

                    binding.wrb06.clearCheck();
                    for (int i = 0; i < binding.fldGrpwrb02.getChildCount(); i++) {
                        View v = binding.fldGrpwrb02.getChildAt(i);
                        if (v instanceof RadioButton) {
                            v.setEnabled(true);
                        }
                    }

                    binding.wrb07.clearCheck();
                    for (int i = 0; i < binding.fldGrpwrb02.getChildCount(); i++) {
                        View v = binding.fldGrpwrb02.getChildAt(i);
                        if (v instanceof RadioButton) {
                            v.setEnabled(true);
                        }
                    }

                } else {
                    if (Integer.valueOf(binding.wrb04.getText().toString()) < 5) {
                        binding.wrb03.setEnabled(true);

                        binding.fldGrpwrb01.setVisibility(View.GONE);
                        binding.wrb05.clearCheck();

                        binding.wrb06.clearCheck();
                        View v = binding.fldGrpwrb02.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(false);
                        }

                        binding.wrb06a.setChecked(true);

                        binding.wrb07.clearCheck();
                        v = binding.fldGrpwrb03.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(false);
                        }
                        binding.wrb07a.setChecked(true);

                    } else {
                        binding.wrb03.setEnabled(false);
                        binding.wrb03.setText(null);

                        binding.wrb06.clearCheck();
                        View v = binding.fldGrpwrb02.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(true);
                        }

                        binding.wrb07.clearCheck();
                        v = binding.fldGrpwrb03.getChildAt(0);
                        for (int j = 0; j < ((RadioGroup) v).getChildCount(); j++) {
                            ((RadioGroup) v).getChildAt(j).setEnabled(true);
                        }

                        if (Integer.valueOf(binding.wrb04.getText().toString()) > 10) {
                            binding.fldGrpwrb01.setVisibility(View.VISIBLE);

                            binding.wrb06a.setEnabled(false);
                            binding.wrb07a.setEnabled(false);

                            if (binding.wrb02b.isChecked()) {
                                binding.wrb07b.setEnabled(false);
                            } else {
                                binding.wrb07b.setEnabled(true);
                            }
                        }
                    }

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    public void setupViews() {
        binding.wrb03.setManager(getSupportFragmentManager());
        binding.wrb03.setMaxDate(new SimpleDateFormat("dd/MM/yyyy").format(System.currentTimeMillis()));
        binding.wrb03.setMinDate(new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTimeInMillis() + ((MainApp.MILLISECONDS_IN_5Years))));
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
                finish();

                if (SectionAActivity.pwList.size() > 0) {
                    startActivity(new Intent(this, SectionCActivity.class));
                } else {
                    startActivity(new Intent(this, EndingActivity.class).putExtra("complete", true));
                }

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
        if (!validatorClass.RangeTextBox(this, binding.wrb04, 5, 99, getString(R.string.wrb04), " AGE")) {
            return false;
        }
//        03
        if (Integer.valueOf(binding.wrb04.getText().toString()) < 5) {
            if (!validatorClass.EmptyTextBox(this, binding.wrb03, getString(R.string.wrb03))) {
                return false;
            }
        }
//        05
        if (!validatorClass.EmptyRadioButton(this, binding.wrb05, binding.wrb06e, getString(R.string.wrb05))) {
            return false;
        }
//        06
        if (!validatorClass.EmptyRadioButton(this, binding.wrb06, binding.wrb06h, getString(R.string.wrb06))) {
            return false;
        }
//        07
        if (!validatorClass.EmptyRadioButton(this, binding.wrb07, binding.wrb07k, getString(R.string.wrb07))) {
            return false;
        }

        return true;
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
        sB.put("wrb04", binding.wrb04.getText().toString());
        sB.put("wrb05", binding.wrb05a.isChecked() ? "1" : binding.wrb05b.isChecked() ? "2" : binding.wrb05c.isChecked() ? "3" : binding.wrb05d.isChecked() ? "4"
                : binding.wrb05e.isChecked() ? "5" : "0");
        sB.put("wrb06", binding.wrb06a.isChecked() ? "1" : binding.wrb06b.isChecked() ? "2" : binding.wrb06c.isChecked() ? "3" : binding.wrb06d.isChecked() ? "4"
                : binding.wrb06e.isChecked() ? "5" : binding.wrb06f.isChecked() ? "6" : binding.wrb06g.isChecked() ? "7" : binding.wrb06h.isChecked() ? "8"
                : "0");
        sB.put("wrb07", binding.wrb07a.isChecked() ? "1" : binding.wrb07b.isChecked() ? "2" : binding.wrb07c.isChecked() ? "3" : binding.wrb07d.isChecked() ? "4"
                : binding.wrb07e.isChecked() ? "5" : binding.wrb07f.isChecked() ? "6" : binding.wrb07g.isChecked() ? "7" : binding.wrb07h.isChecked() ? "8"
                : binding.wrb07i.isChecked() ? "9" : binding.wrb07j.isChecked() ? "10" : binding.wrb07k.isChecked() ? "11" : "0");

        MainApp.fmc.setsB(String.valueOf(sB));


//        Functionality
        if (binding.wrb02b.isChecked() && binding.wrb05a.isChecked()) {
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
