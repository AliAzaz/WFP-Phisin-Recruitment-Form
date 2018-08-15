package edu.aku.hassannaqvi.wfp_recruit_form.ui;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import edu.aku.hassannaqvi.wfp_recruit_form.R;
import edu.aku.hassannaqvi.wfp_recruit_form.contracts.FamilyMembersContract;
import edu.aku.hassannaqvi.wfp_recruit_form.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfp_recruit_form.core.MainApp;
import edu.aku.hassannaqvi.wfp_recruit_form.databinding.ActivitySectionCBinding;
import edu.aku.hassannaqvi.wfp_recruit_form.other.DateUtils;
import edu.aku.hassannaqvi.wfp_recruit_form.validation.validatorClass;

public class SectionCActivity extends AppCompatActivity {
    ActivitySectionCBinding bi;
    String currentDate;
    String dtToday;

    ArrayList<String> pwList;
    Map<String, FamilyMembersContract> pwMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_section_c);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_c);

        bi.setCallback(this);
        setDateManager();
        dtToday = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(new Date().getTime());

        currentDate = new SimpleDateFormat("dd/MM/yyyy").format(new Date().getTime());


//        Filling Spinner
        pwList = new ArrayList<>();
        pwList.add("....");
        pwMap = new HashMap<>();

        for (FamilyMembersContract fmc : SectionAActivity.pwList) {
            pwList.add(fmc.getName());
            pwMap.put(fmc.getName(), fmc);
        }

        bi.wrc01.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, pwList));

        Listeners();

    }

    private void Listeners() {
        bi.wrc01.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position != 0) {
                    bi.wrc02.setText(pwMap.get(bi.wrc01.getSelectedItem()).getSerialNo());
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void setDateManager() {
        bi.wrc06.setManager(getSupportFragmentManager());
        bi.wrc07.setManager(getSupportFragmentManager());
        bi.wrc06.setMaxDate(new SimpleDateFormat("dd/MM/yyyy").format(new Date().getTime()));
        bi.wrc06.setMinDate(DateUtils.getMonthsBack("dd/MM/yyyy", -4));
        if (!TextUtils.isEmpty(bi.wrc06.getText().toString())) {
            bi.wrc07.setEnabled(true);
            String exactDate = DateUtils.addDays("dd/MM/yyyy", bi.wrc06.getText().toString(), 280);
            bi.wrc07.setMinDate(DateUtils.addSubtractMonths("dd/MM/yyyy", exactDate, -1));
            bi.wrc07.setMaxDate(DateUtils.addSubtractMonths("dd/MM/yyyy", exactDate, 1));

        } else {
            bi.wrc07.setEnabled(false);
           /* bi.wrc07.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "Please Fill question 6 first ", Toast.LENGTH_SHORT).show();
                }
            });*/
        }
        bi.wrc06.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!TextUtils.isEmpty(bi.wrc06.getText().toString())) {
                    bi.wrc07.setEnabled(true);
                    String exactDate = DateUtils.addDays("dd/MM/yyyy", bi.wrc06.getText().toString(), 280);
                    bi.wrc07.setMinDate(DateUtils.addSubtractMonths("dd/MM/yyyy", exactDate, -1));
//                    bi.wrc07.setMinDate(DateUtils.addDays("dd/MM/yyyy", exactDate, -30));
                    String exactDate1 = DateUtils.addDays("dd/MM/yyyy", bi.wrc06.getText().toString(), 280);
                    bi.wrc07.setMaxDate(DateUtils.addSubtractMonths("dd/MM/yyyy", exactDate1, 1));
//                    bi.wrc07.setMaxDate(DateUtils.addDays("dd/MM/yyyy", exactDate1, 30));

                } else {
                    bi.wrc07.setEnabled(false);
                    Toast.makeText(getApplicationContext(), "Please Fill question 6 first ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean ValidateForm() {

        if (!validatorClass.EmptySpinner(this, bi.wrc01, getString(R.string.wrc01))) {
            return false;
        }
        if (!validatorClass.EmptyTextBox(this, bi.wrcstudyid, getString(R.string.wrc01))) {
            return false;
        }
        if (!validatorClass.RangeTextBox(this, bi.wrcstudyid, 1, 4000, getString(R.string.wrc01), " ID's")) {
            return false;
        }

        if (!validatorClass.EmptyTextBox(this, bi.wrc03, getString(R.string.wrc03))) {
            return false;
        }
        if (!validatorClass.EmptyTextBox(this, bi.wrc04, getString(R.string.wrc04))) {
            return false;
        }
        if (!validatorClass.RangeTextBox(this, bi.wrc04, 14, 49, getString(R.string.wrc04), " years")) {
            return false;
        }

        if (!validatorClass.EmptyTextBox(this, bi.wrc05m, getString(R.string.wrc05) + " " + getString(R.string.months))) {
            return false;
        }
        if (!validatorClass.RangeTextBox(this, bi.wrc05m, 0, 3, getString(R.string.wrc05), " months")) {
            return false;
        }
        if (!validatorClass.EmptyTextBox(this, bi.wrc05d, getString(R.string.wrc05) + " " + getString(R.string.days))) {
            return false;
        }

        if (!validatorClass.RangeTextBox(this, bi.wrc05d, 0, 29, getString(R.string.wrc05), " days")) {
            return false;
        }
        if ((bi.wrc05m.getText().toString().equals("0") || bi.wrc05m.getText().toString().equals("00")) && (bi.wrc05d.getText().toString().equals("0") || bi.wrc05d.getText().toString().equals("00"))) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrc05), Toast.LENGTH_SHORT).show();
            bi.wrc05m.setError(" Month and Days cannot be zero at the same time ");    // Set Error on last radio button
            bi.wrc05d.setError(" Month and Days cannot be zero at the same time ");    // Set Error on last radio button
            bi.wrc05m.requestFocus();
            return false;
        } else {
            bi.wrc05m.setError(null);
            bi.wrc05d.setError(null);
            bi.wrc05m.clearFocus();
        }

        if (!validatorClass.EmptyTextBox(this, bi.wrc06, getString(R.string.wrc06))) {
            return false;
        }
        return validatorClass.EmptyTextBox(this, bi.wrc07, getString(R.string.wrc07));
    }

    public void BtnEnd() {
        MainApp.endActivity(this, this);
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
                startActivity(new Intent(this, SectionDActivity.class).putExtra("womanAge",bi.wrc04.getText().toString()));

            } else {
                Toast.makeText(this, "Failed to update Database", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void SaveDrafts() throws JSONException {

        JSONObject sC = new JSONObject();
        sC.put("wrc01", bi.wrc01.getSelectedItem().toString().toUpperCase());
        sC.put("wrc02", bi.wrc02.getText().toString());
        sC.put("wrcstudyid", bi.wrcstudyid.getText().toString());
        sC.put("wrc03", bi.wrc03.getText().toString());
        sC.put("wrc04", bi.wrc04.getText().toString());
        sC.put("wrc05m", bi.wrc05m.getText().toString());
        sC.put("wrc05d", bi.wrc05d.getText().toString());
        sC.put("wrc06", bi.wrc06.getText().toString());
        sC.put("wrc07", bi.wrc07.getText().toString());
        sC.put("wrc08", dtToday);

        MainApp.fc.setsC(String.valueOf(sC));

    }

    private boolean UpdateDb() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSC();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

}
