package edu.aku.hassannaqvi.wfp_recruit_form.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.validation.Validator;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfp_recruit_form.R;
import edu.aku.hassannaqvi.wfp_recruit_form.contracts.FamilyMembersContract;
import edu.aku.hassannaqvi.wfp_recruit_form.contracts.FormsContract;
import edu.aku.hassannaqvi.wfp_recruit_form.contracts.LHWsContract;
import edu.aku.hassannaqvi.wfp_recruit_form.contracts.TehsilContract;
import edu.aku.hassannaqvi.wfp_recruit_form.contracts.UCsContract;
import edu.aku.hassannaqvi.wfp_recruit_form.contracts.VillagesContract;
import edu.aku.hassannaqvi.wfp_recruit_form.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfp_recruit_form.core.MainApp;
import edu.aku.hassannaqvi.wfp_recruit_form.validation.validatorClass;

public class SectionAActivity extends Activity {

    private static final String TAG = SectionAActivity.class.getSimpleName();
    @BindView(R.id.spTehsil)
    Spinner spTehsil;
    @BindView(R.id.spUCs)
    Spinner spUCs;
    @BindView(R.id.spbla03)
    Spinner spbla03;
    @BindView(R.id.spbla03b)
    Spinner spbla03b;
    @BindView(R.id.spbla04)
    EditText spbla04;

    @BindView(R.id.spbla08)
    RadioGroup spbla08;
    @BindView(R.id.spbla08a)
    RadioButton spbla08a;
    @BindView(R.id.spbla08b)
    RadioButton spbla08b;
    @BindView(R.id.spblacluster)
    RadioGroup spblacluster;
    @BindView(R.id.spblaclustera)
    RadioButton spblaclustera;
    @BindView(R.id.spblaclusterb)
    RadioButton spblaclusterb;
    /*@BindView(R.id.spbla08c)
    RadioButton spbla08c;

*/
    @BindView(R.id.spbla08bx)
    EditText spbla08bx;


    /*@BindViews({R.id.spbla06a, R.id.spbla06b})
    List<RadioGroup> spbla06;*/
    @BindView(R.id.btn_Continue)
    Button btn_Continue;
    @BindView(R.id.btn_End)
    Button btn_End;

    ArrayList<String> lablesTehsil;
    Collection<TehsilContract> TehsilList;
    Map<String, String> tehsilMap;

    ArrayList<String> lablesUCs;
    Collection<UCsContract> UcsList;
    Map<String, String> ucsMap;

    ArrayList<String> lablesVillages;
    Collection<VillagesContract> VillagesList;
    Map<String, String> VillagesMap;

    ArrayList<String> lablesLHWs;
    Collection<LHWsContract> LHWsList;
    Map<String, String> LHWsMap;

    DatabaseHelper db;

    public static ArrayList<FamilyMembersContract> pwList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_a);
        ButterKnife.bind(this);

        db = new DatabaseHelper(this);

        populateSpinner(this);

//        Skip
       spbla08.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.spbla08a) {
                    btn_Continue.setVisibility(View.VISIBLE);
                    spbla08bx.setVisibility(View.GONE);
                    spbla08bx.setText(null);
                    btn_End.setVisibility(View.GONE);
                } else {
                    btn_Continue.setVisibility(View.GONE);
                    spbla08bx.setVisibility(View.VISIBLE);
                    btn_End.setVisibility(View.VISIBLE);
                }
            }
        });

//        Initialize PW spinner
        pwList = new ArrayList<>();

    }


    public void populateSpinner(final Context context) {

        final Context mContext = context;

        // Populate Tehsils list
        TehsilList = db.getAllTehsils();

        lablesTehsil = new ArrayList<>();
        tehsilMap = new HashMap<>();

        lablesTehsil.add("Select Tehsil..");

        for (TehsilContract taluka : TehsilList) {
            lablesTehsil.add(taluka.getTehsil_name());

            tehsilMap.put(taluka.getTehsil_name(), taluka.getTehsilcode());
        }

        spTehsil.setAdapter(new ArrayAdapter<>(mContext, android.R.layout.simple_spinner_dropdown_item, lablesTehsil));

        spTehsil.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // Populate UCs list

                if (spTehsil.getSelectedItemPosition() != 0) {
                    MainApp.tehsilCode = Integer.valueOf(tehsilMap.get(spTehsil.getSelectedItem().toString()));
                }

                lablesUCs = new ArrayList<>();
                ucsMap = new HashMap<>();
                lablesUCs.add("Select UC..");

                if (spTehsil.getSelectedItemPosition() != 0) {
                    UcsList = db.getAllUCs(String.valueOf(MainApp.tehsilCode));
                    for (UCsContract ucs : UcsList) {
                        lablesUCs.add(ucs.getUcs());
                        ucsMap.put(ucs.getUcs(), ucs.getUccode());
                    }
                }
                spUCs.setAdapter(new ArrayAdapter<>(mContext, android.R.layout.simple_spinner_dropdown_item, lablesUCs));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spUCs.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // Populate UCs list

                if (spUCs.getSelectedItemPosition() != 0) {
                    MainApp.ucCode = Integer.valueOf(ucsMap.get(spUCs.getSelectedItem().toString()));
                }

                lablesVillages = new ArrayList<>();
                VillagesMap = new HashMap<>();
                lablesVillages.add("Select Village..");

                VillagesList = db.getVillages(String.valueOf(MainApp.ucCode));

                if (VillagesList.size() != 0) {
                    for (VillagesContract vil : VillagesList) {
                        lablesVillages.add(vil.getVillagename());
                        VillagesMap.put(vil.getVillagename(), vil.getVillagecode());
                    }
                }

                spbla03.setAdapter(new ArrayAdapter<>(context, android.R.layout.simple_spinner_dropdown_item, lablesVillages));

                lablesLHWs = new ArrayList<>();
                LHWsMap = new HashMap<>();
                lablesLHWs.add("Select LHWs..");

                LHWsList = db.getLHWs(String.valueOf(MainApp.ucCode));

                if (LHWsList.size() != 0) {
                    for (LHWsContract vil : LHWsList) {
                        lablesLHWs.add(vil.getLhwname());
                        LHWsMap.put(vil.getLhwname(), vil.getLhwcode());
                    }
                }

                spbla03b.setAdapter(new ArrayAdapter<>(context, android.R.layout.simple_spinner_dropdown_item, lablesLHWs));

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        spbla03.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (spbla03.getSelectedItemPosition() != 0) {
                    MainApp.villageCode = Integer.valueOf(VillagesMap.get(spbla03.getSelectedItem().toString()));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spbla03b.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (spbla03b.getSelectedItemPosition() != 0) {
                    MainApp.lhwCode = Integer.valueOf(LHWsMap.get(spbla03b.getSelectedItem().toString()));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }


    @OnClick(R.id.btn_End)
    void onBtnEndClick() {

        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            if (UpdateDB()) {

                MainApp.endActivity(this, this);

            }
        }



    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {

        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            if (UpdateDB()) {

                Intent secNext = new Intent(this, SectionBActivity.class);
                secNext.putExtra("check", false);
                startActivity(secNext);
                finish();

            }
        }


    }

    private void SaveDraft() throws JSONException {
        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);
        MainApp.fc = new FormsContract();

        MainApp.fc.setDevicetagID(sharedPref.getString("tagName", null));
        MainApp.fc.setFormDate(new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime()));
        MainApp.fc.setInterviewer01(MainApp.userName);
        MainApp.fc.setInterviewer02(MainApp.userName2);
        MainApp.fc.setDeviceID(Settings.Secure.getString(getApplicationContext().getContentResolver(),
                Settings.Secure.ANDROID_ID));
        MainApp.fc.setAppversion(MainApp.versionName + "." + MainApp.versionCode);

        JSONObject sInfo = new JSONObject();

        sInfo.put("tehsil_code", String.valueOf(MainApp.tehsilCode));
        sInfo.put("uc_code", String.valueOf(MainApp.ucCode));
        sInfo.put("village_code", String.valueOf(MainApp.villageCode));
        sInfo.put("lhw_code", String.valueOf(MainApp.lhwCode));

        sInfo.put("spbla04", spbla04.getText().toString());
        MainApp.HHno = spbla04.getText().toString();


        sInfo.put("spbla08", spbla08a.isChecked() ? "1" : spbla08b.isChecked() ? "2" : "0");
        sInfo.put("spbla08bx", spbla08bx.getText().toString());
        sInfo.put(" ", spblaclustera.isChecked() ? "1" : spblaclusterb.isChecked() ? "2" : "0");

        MainApp.fc.setsA(String.valueOf(sInfo));

        MainApp.setGPS(this);

    }

    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);

        long updcount = db.addForm(MainApp.fc);

        MainApp.fc.set_ID(String.valueOf(updcount));

        if (updcount != 0) {
            MainApp.fc.setUID(
                    (MainApp.fc.getDeviceID() + MainApp.fc.get_ID()));
            db.updateFormID();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    public boolean formValidation() {

        if (spTehsil.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spbla01), Toast.LENGTH_SHORT).show();
            ((TextView) spTehsil.getSelectedView()).setText("This Data is Required");
            ((TextView) spTehsil.getSelectedView()).setTextColor(Color.RED);
            spTehsil.requestFocus();
            Log.i(TAG, "spTehsil: This Data is Required!");
            return false;
        } else {
            ((TextView) spTehsil.getSelectedView()).setError(null);
        }

        if (spUCs.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spbla02), Toast.LENGTH_SHORT).show();
            ((TextView) spUCs.getSelectedView()).setText("This Data is Required");
            ((TextView) spUCs.getSelectedView()).setTextColor(Color.RED);
            spUCs.requestFocus();
            Log.i(TAG, "spUCs: This Data is Required!");
            return false;
        } else {
            ((TextView) spUCs.getSelectedView()).setError(null);
        }

        if (spbla03.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spbla03), Toast.LENGTH_SHORT).show();
            ((TextView) spbla03.getSelectedView()).setText("This Data is Required");
            ((TextView) spbla03.getSelectedView()).setTextColor(Color.RED);
            spbla03.requestFocus();
            Log.i(TAG, "spbla03: This Data is Required!");
            return false;
        } else {
            ((TextView) spbla03.getSelectedView()).setError(null);
        }

        if (spbla03b.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spbla03b), Toast.LENGTH_SHORT).show();
            ((TextView) spbla03b.getSelectedView()).setText("This Data is Required");
            ((TextView) spbla03b.getSelectedView()).setTextColor(Color.RED);
            spbla03b.requestFocus();
            Log.i(TAG, "spbla03b: This Data is Required!");
            return false;
        } else {
            ((TextView) spbla03b.getSelectedView()).setError(null);
        }
       if (!validatorClass.EmptyRadioButton(this,spblacluster,spblaclustera,getString(R.string.spblacluster))){
            return false;
        }

        if (spbla08.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla08), Toast.LENGTH_SHORT).show();
            spbla08a.setError("This data is Required!");
            Log.i(TAG, "spbla08: This data is Required!");
            spbla08a.setFocusable(true);
            spbla08a.setFocusableInTouchMode(true);
            spbla08a.requestFocus();
            return false;
        } else {
            spbla08a.setError(null);
        }

        if(spbla08b.isChecked()){
           if(spbla08bx.getText().toString().isEmpty()){
               Toast.makeText(this, "ERROR(empty): " + "وضاحت کریں", Toast.LENGTH_SHORT).show();
               spbla08bx.setError("This data is required");
               spbla08bx.requestFocus();
               return false;

           }else {
               spbla08bx.setError(null);
               spbla08bx.clearFocus();
           }
        }

        return true;
    }


}
