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
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;
import edu.aku.hassannaqvi.wfp_recruit_form.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfp_recruit_form.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfp_recruit_form.core.MainApp;

public class SectionIActivity extends AppCompatActivity {

    private static final String TAG = SectionIActivity.class.getSimpleName();

    @BindView(R.id.wri01)
    RadioGroup wri01;
    @BindView(R.id.wri0101)
    RadioButton wri0101;
    @BindView(R.id.wri0102)
    RadioButton wri0102;
    @BindView(R.id.wri0103)
    RadioButton wri0103;
    @BindView(R.id.wri0104)
    RadioButton wri0104;
    @BindView(R.id.wri0105)
    RadioButton wri0105;
    @BindView(R.id.wri0106)
    RadioButton wri0106;
    @BindView(R.id.wri0196)
    RadioButton wri0196;
    @BindView(R.id.wri0196x)
    EditText wri0196x;
    @BindView(R.id.wri02)
    RadioGroup wri02;
    @BindView(R.id.wri0201)
    RadioButton wri0201;
    @BindView(R.id.wri0202)
    RadioButton wri0202;
    @BindView(R.id.wri0203)
    RadioButton wri0203;
    @BindView(R.id.wri0204)
    RadioButton wri0204;
    @BindView(R.id.wri0205)
    RadioButton wri0205;
    @BindView(R.id.wri0206)
    RadioButton wri0206;
    @BindView(R.id.wri0207)
    RadioButton wri0207;
    @BindView(R.id.wri0208)
    RadioButton wri0208;
    @BindView(R.id.wri0209)
    RadioButton wri0209;
    @BindView(R.id.wri0210)
    RadioButton wri0210;
    @BindView(R.id.wri0211)
    RadioButton wri0211;
    @BindView(R.id.wri0212)
    RadioButton wri0212;
    @BindView(R.id.wri0213)
    RadioButton wri0213;
    @BindView(R.id.wri0214)
    RadioButton wri0214;
    @BindView(R.id.wri0215)
    RadioButton wri0215;
    @BindView(R.id.wri0296)
    RadioButton wri0296;
    @BindView(R.id.wri0296x)
    EditText wri0296x;
    @BindView(R.id.wri03)
    RadioGroup wri03;
    @BindView(R.id.wri0301)
    RadioButton wri0301;
    @BindView(R.id.wri0302)
    RadioButton wri0302;
    @BindView(R.id.wri04)
    RadioGroup wri04;
    @BindView(R.id.wri0401)
    RadioButton wri0401;
    @BindView(R.id.wri0402)
    RadioButton wri0402;
    @BindView(R.id.wri0403)
    RadioButton wri0403;
    @BindView(R.id.wri0404)
    RadioButton wri0404;
    @BindView(R.id.wri0405)
    RadioButton wri0405;
    @BindView(R.id.wri0406)
    RadioButton wri0406;
    @BindView(R.id.wri0496)
    RadioButton wri0496;
    @BindView(R.id.wri0496x)
    EditText wri0496x;
    @BindView(R.id.wri05)
    RadioGroup wri05;
    @BindView(R.id.wri0501)
    RadioButton wri0501;
    @BindView(R.id.wri0502)
    RadioButton wri0502;
    @BindView(R.id.wri0503)
    RadioButton wri0503;
    @BindView(R.id.wri0504)
    RadioButton wri0504;
    @BindView(R.id.wri0505)
    RadioButton wri0505;
    @BindView(R.id.wri0506)
    RadioButton wri0506;
    @BindView(R.id.wri0507)
    RadioButton wri0507;
    @BindView(R.id.wri0508)
    RadioButton wri0508;
    @BindView(R.id.wri0509)
    RadioButton wri0509;
    @BindView(R.id.wri0596)
    RadioButton wri0596;
    @BindView(R.id.wri0596x)
    EditText wri0596x;
    @BindView(R.id.wri06)
    RadioGroup wri06;
    @BindView(R.id.wri0601)
    RadioButton wri0601;
    @BindView(R.id.wri0602)
    RadioButton wri0602;
    @BindView(R.id.textView2)
    TextView textView2;
    @BindView(R.id.wri07)
    EditText wri07;
    @BindView(R.id.wri0801)
    RadioGroup wri0801;
    @BindView(R.id.wri080101)
    RadioButton wri080101;
    @BindView(R.id.wri080102)
    RadioButton wri080102;
    @BindView(R.id.wri0802)
    RadioGroup wri0802;
    @BindView(R.id.wri080201)
    RadioButton wri080201;
    @BindView(R.id.wri080202)
    RadioButton wri080202;
    @BindView(R.id.wri0803)
    RadioGroup wri0803;
    @BindView(R.id.wri080301)
    RadioButton wri080301;
    @BindView(R.id.wri080302)
    RadioButton wri080302;
    @BindView(R.id.wri0804)
    RadioGroup wri0804;
    @BindView(R.id.wri080401)
    RadioButton wri080401;
    @BindView(R.id.wri080402)
    RadioButton wri080402;
    @BindView(R.id.wri0805)
    RadioGroup wri0805;
    @BindView(R.id.wri080501)
    RadioButton wri080501;
    @BindView(R.id.wri080502)
    RadioButton wri080502;
    @BindView(R.id.wri0806)
    RadioGroup wri0806;
    @BindView(R.id.wri080601)
    RadioButton wri080601;
    @BindView(R.id.wri080602)
    RadioButton wri080602;
    @BindView(R.id.wri0807)
    RadioGroup wri0807;
    @BindView(R.id.wri080701)
    RadioButton wri080701;
    @BindView(R.id.wri080702)
    RadioButton wri080702;
    @BindView(R.id.wri0808)
    RadioGroup wri0808;
    @BindView(R.id.wri080801)
    RadioButton wri080801;
    @BindView(R.id.wri080802)
    RadioButton wri080802;
    @BindView(R.id.wri0809)
    RadioGroup wri0809;
    @BindView(R.id.wri080901)
    RadioButton wri080901;
    @BindView(R.id.wri080902)
    RadioButton wri080902;
    @BindView(R.id.wri0810)
    RadioGroup wri0810;
    @BindView(R.id.wri081001)
    RadioButton wri081001;
    @BindView(R.id.wri081002)
    RadioButton wri081002;
    @BindView(R.id.wri0811)
    RadioGroup wri0811;
    @BindView(R.id.wri081101)
    RadioButton wri081101;
    @BindView(R.id.wri081102)
    RadioButton wri081102;
    @BindView(R.id.wri0812)
    RadioGroup wri0812;
    @BindView(R.id.wri081201)
    RadioButton wri081201;
    @BindView(R.id.wri081202)
    RadioButton wri081202;
    @BindView(R.id.wri0813)
    RadioGroup wri0813;
    @BindView(R.id.wri081301)
    RadioButton wri081301;
    @BindView(R.id.wri081302)
    RadioButton wri081302;
    @BindView(R.id.wri0814)
    RadioGroup wri0814;
    @BindView(R.id.wri081401)
    RadioButton wri081401;
    @BindView(R.id.wri081402)
    RadioButton wri081402;
    @BindView(R.id.wri0815)
    RadioGroup wri0815;
    @BindView(R.id.wri081501)
    RadioButton wri081501;
    @BindView(R.id.wri081502)
    RadioButton wri081502;
    @BindView(R.id.wri0816)
    RadioGroup wri0816;
    @BindView(R.id.wri081601)
    RadioButton wri081601;
    @BindView(R.id.wri081602)
    RadioButton wri081602;
    @BindView(R.id.wri0817)
    RadioGroup wri0817;
    @BindView(R.id.wri081701)
    RadioButton wri081701;
    @BindView(R.id.wri081702)
    RadioButton wri081702;
    @BindView(R.id.wri0818)
    RadioGroup wri0818;
    @BindView(R.id.wri081801)
    RadioButton wri081801;
    @BindView(R.id.wri081802)
    RadioButton wri081802;
    @BindView(R.id.wri09)
    RadioGroup wri09;
    @BindView(R.id.wri0901)
    RadioButton wri0901;
    @BindView(R.id.wri0902)
    RadioButton wri0902;
    @BindView(R.id.wri0903)
    RadioButton wri0903;
    @BindView(R.id.wri0904)
    RadioButton wri0904;
    @BindView(R.id.wri0905)
    RadioButton wri0905;
    @BindView(R.id.wri0906)
    RadioButton wri0906;
    @BindView(R.id.wri0907)
    RadioButton wri0907;
    @BindView(R.id.wri0908)
    RadioButton wri0908;
    @BindView(R.id.wri0909)
    RadioButton wri0909;
    @BindView(R.id.wri0910)
    RadioButton wri0910;
    @BindView(R.id.wri0996)
    RadioButton wri0996;
    @BindView(R.id.wri0996x)
    EditText wri0996x;
    @BindView(R.id.wri10)
    RadioGroup wri10;
    @BindView(R.id.wri1001)
    RadioButton wri1001;
    @BindView(R.id.wri1002)
    RadioButton wri1002;
    @BindView(R.id.wri1003)
    RadioButton wri1003;
    @BindView(R.id.wri1096)
    RadioButton wri1096;
    @BindView(R.id.wri1096x)
    EditText wri1096x;
    @BindView(R.id.wriGrp09)
    LinearLayout wriGrp09;
    @BindView(R.id.wri11)
    RadioGroup wri11;
    @BindView(R.id.wri1101)
    RadioButton wri1101;
    @BindView(R.id.wri1102)
    RadioButton wri1102;
    @BindView(R.id.wri12)
    RadioGroup wri12;
    @BindView(R.id.wri1201)
    RadioButton wri1201;
    @BindView(R.id.wri1202)
    RadioButton wri1202;
    @BindView(R.id.wri1203)
    RadioButton wri1203;
    @BindView(R.id.wri1204)
    RadioButton wri1204;
    @BindView(R.id.wri1205)
    RadioButton wri1205;
    @BindView(R.id.wri1206)
    RadioButton wri1206;
    @BindView(R.id.wri1207)
    RadioButton wri1207;
    @BindView(R.id.wri1208)
    RadioButton wri1208;
    @BindView(R.id.wri1209)
    RadioButton wri1209;
    @BindView(R.id.wri1210)
    RadioButton wri1210;
    @BindView(R.id.wri1211)
    RadioButton wri1211;
    @BindView(R.id.wri1296)
    RadioButton wri1296;
    @BindView(R.id.wri1296x)
    EditText wri1296x;
    @BindView(R.id.wri13)
    RadioGroup wri13;
    @BindView(R.id.wri1301)
    RadioButton wri1301;
    @BindView(R.id.wri1302)
    RadioButton wri1302;
    @BindView(R.id.wri1303)
    RadioButton wri1303;
    @BindView(R.id.wri1304)
    RadioButton wri1304;
    @BindView(R.id.wri1305)
    RadioButton wri1305;
    @BindView(R.id.wri1306)
    RadioButton wri1306;
    @BindView(R.id.wri1307)
    RadioButton wri1307;
    @BindView(R.id.wri1308)
    RadioButton wri1308;
    @BindView(R.id.wri1309)
    RadioButton wri1309;
    @BindView(R.id.wri1310)
    RadioButton wri1310;
    @BindView(R.id.wri1311)
    RadioButton wri1311;
    @BindView(R.id.wri1312)
    RadioButton wri1312;
    @BindView(R.id.wri1396)
    RadioButton wri1396;
    @BindView(R.id.wri1396x)
    EditText wri1396x;
    @BindView(R.id.wri14)
    RadioGroup wri14;
    @BindView(R.id.wri1401)
    RadioButton wri1401;
    @BindView(R.id.wri1402)
    RadioButton wri1402;
    @BindView(R.id.wri1403)
    RadioButton wri1403;
    @BindView(R.id.wri1404)
    RadioButton wri1404;
    @BindView(R.id.wri1405)
    RadioButton wri1405;
    @BindView(R.id.wri1406)
    RadioButton wri1406;
    @BindView(R.id.wri1407)
    RadioButton wri1407;
    @BindView(R.id.wri1408)
    RadioButton wri1408;
    @BindView(R.id.wri1409)
    RadioButton wri1409;
    @BindView(R.id.wri1410)
    RadioButton wri1410;
    @BindView(R.id.wri1411)
    RadioButton wri1411;
    @BindView(R.id.wri1496)
    RadioButton wri1496;
    @BindView(R.id.wri1496x)
    EditText wri1496x;
    @BindView(R.id.wri15)
    EditText wri15;
    @BindView(R.id.wri16a)
    RadioGroup wri16a;
    @BindView(R.id.wri16a01)
    RadioButton wri16a01;
    @BindView(R.id.wri16a02)
    RadioButton wri16a02;
    @BindView(R.id.wri16b)
    RadioGroup wri16b;
    @BindView(R.id.wri16b01)
    RadioButton wri16b01;
    @BindView(R.id.wri16b02)
    RadioButton wri16b02;
    @BindView(R.id.wri16c)
    RadioGroup wri16c;
    @BindView(R.id.wri16c01)
    RadioButton wri16c01;
    @BindView(R.id.wri16c02)
    RadioButton wri16c02;
    @BindView(R.id.wri16d)
    RadioGroup wri16d;
    @BindView(R.id.wri16d01)
    RadioButton wri16d01;
    @BindView(R.id.wri16d02)
    RadioButton wri16d02;
    @BindView(R.id.wri16e)
    RadioGroup wri16e;
    @BindView(R.id.wri16e01)
    RadioButton wri16e01;
    @BindView(R.id.wri16e02)
    RadioButton wri16e02;
    @BindView(R.id.wri16f)
    RadioGroup wri16f;
    @BindView(R.id.wri16f01)
    RadioButton wri16f01;
    @BindView(R.id.wri16f02)
    RadioButton wri16f02;
    @BindView(R.id.wri16g)
    RadioGroup wri16g;
    @BindView(R.id.wri16g01)
    RadioButton wri16g01;
    @BindView(R.id.wri16g02)
    RadioButton wri16g02;
    @BindView(R.id.wri17)
    RadioGroup wri17;
    @BindView(R.id.wri1701)
    RadioButton wri1701;
    @BindView(R.id.wri1702)
    RadioButton wri1702;
    @BindView(R.id.wriGrp17)
    LinearLayout wriGrp17;
    @BindView(R.id.wri1801)
    EditText wri1801;
    @BindView(R.id.wri1802)
    EditText wri1802;
    @BindView(R.id.wri1803)
    EditText wri1803;
    @BindView(R.id.wri1899)
    CheckBox wri1899;
    @BindView(R.id.wri19)
    RadioGroup wri19;
    @BindView(R.id.wri1901)
    RadioButton wri1901;
    @BindView(R.id.wri1902)
    RadioButton wri1902;
    @BindView(R.id.wriGrp19)
    LinearLayout wriGrp19;
    @BindView(R.id.wri2001)
    EditText wri2001;
    @BindView(R.id.wri2002)
    EditText wri2002;
    @BindView(R.id.wri2003)
    EditText wri2003;
    @BindView(R.id.wri2004)
    EditText wri2004;
    @BindView(R.id.wri2005)
    EditText wri2005;
    @BindView(R.id.wri2006)
    EditText wri2006;
    @BindView(R.id.wri2007)
    EditText wri2007;
    @BindView(R.id.fldGrpwri04)
    LinearLayout fldGrpwri04;
    @BindView(R.id.fldGrpwri07)
    LinearLayout fldGrpwri07;
    @BindView(R.id.fldGrpwri08)
    LinearLayout fldGrpwri08;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_i);
        ButterKnife.bind(this);

        this.setTitle("Section I");

        wri0509.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpwri08.setVisibility(View.GONE);
                    wri06.clearCheck();
                    wri07.setText(null);
                } else {
                    fldGrpwri08.setVisibility(View.VISIBLE);
                }
            }
        });


        // ====================== Q9 Skip Pattern =========================

        wri0910.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    wriGrp09.setVisibility(View.GONE);
                    wri10.clearCheck();
                    wri1096x.setText(null);
                } else {
                    wriGrp09.setVisibility(View.VISIBLE);
                }
            }
        });

        // ====================== Q17 Skip Pattern =========================
        wri1702.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    wriGrp17.setVisibility(View.GONE);
                    wri1899.setChecked(false);
                    wri1801.setText(null);
                    wri1802.setText(null);
                    wri1803.setText(null);
                } else {
                    wriGrp17.setVisibility(View.VISIBLE);
                }
            }
        });

        // ====================== Q19 Skip Pattern =========================

        wri1902.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    wriGrp19.setVisibility(View.GONE);
                    wri2001.setText(null);
                    wri2002.setText(null);
                    wri2003.setText(null);
                    wri2004.setText(null);
                    wri2005.setText(null);
                    wri2006.setText(null);
                    wri2006.setText(null);
                    wri2007.setText(null);

                } else {
                    wriGrp19.setVisibility(View.VISIBLE);
                }
            }
        });

        // =================== Q1 Others ====================

        wri0196.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    wri0196x.setVisibility(View.VISIBLE);
                } else {
                    wri0196x.setVisibility(View.GONE);
                    wri0196x.setText(null);
                }
            }
        });

        // =================== Q2 Others ====================

        wri0296.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    wri0296x.setVisibility(View.VISIBLE);
                } else {
                    wri0296x.setVisibility(View.GONE);
                    wri0296x.setText(null);
                }
            }
        });

        // =================== Q4 Others ====================

        wri0496.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    wri0496x.setVisibility(View.VISIBLE);
                } else {
                    wri0496x.setVisibility(View.GONE);
                    wri0496x.setText(null);
                }
            }
        });

        // =================== Q5 Others ====================

        wri0596.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    wri0596x.setVisibility(View.VISIBLE);
                } else {
                    wri0596x.setVisibility(View.GONE);
                    wri0596x.setText(null);
                }
            }
        });

        // =================== Q9 Others ====================

        wri0996.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    wri0996x.setVisibility(View.VISIBLE);
                } else {
                    wri0996x.setVisibility(View.GONE);
                    wri0996x.setText(null);
                }
            }
        });

        // =================== Q10 Others ====================

        wri1096.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    wri1096x.setVisibility(View.VISIBLE);
                } else {
                    wri1096x.setVisibility(View.GONE);
                    wri1096x.setText(null);
                }
            }
        });

        // =================== Q12 Others ====================

        wri1296.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    wri1296x.setVisibility(View.VISIBLE);
                } else {
                    wri1296x.setVisibility(View.GONE);
                    wri1296x.setText(null);
                }
            }
        });

        // =================== Q13 Others ====================

        wri1396.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    wri1396x.setVisibility(View.VISIBLE);
                } else {
                    wri1396x.setVisibility(View.GONE);
                    wri1396x.setText(null);
                }
            }
        });

        // =================== Q14 Others ====================

        wri1496.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    wri1496x.setVisibility(View.VISIBLE);
                } else {
                    wri1496x.setVisibility(View.GONE);
                    wri1496x.setText(null);
                }
            }
        });

        // =================== Q21a Others ====================

     /*   wri21a96.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    wri21a96x.setVisibility(View.VISIBLE);
                } else {
                    wri21a96x.setVisibility(View.GONE);
                    wri21a96x.setText(null);
                }
            }
        });
*/
        //================= Q4 Skip pattern ===============
        wri03.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (wri0301.isChecked()) {
                    fldGrpwri04.setVisibility(View.VISIBLE);
                } else {
                    fldGrpwri04.setVisibility(View.GONE);
                    wri04.clearCheck();
                    wri0496x.setText(null);
                }
            }
        });

        //================= Q6 Skip pattern ===============
        wri06.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (wri0601.isChecked()) {
                    fldGrpwri07.setVisibility(View.VISIBLE);
                } else {
                    fldGrpwri07.setVisibility(View.GONE);
                    wri07.setText(null);
                }
            }
        });

        wri1899.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    wri1801.setVisibility(View.GONE);
                    wri1801.setText(null);
                    wri1802.setVisibility(View.GONE);
                    wri1802.setText(null);
                    wri1803.setVisibility(View.GONE);
                    wri1803.setText(null);
                } else {
                    wri1801.setVisibility(View.VISIBLE);
                    wri1802.setVisibility(View.VISIBLE);
                    wri1803.setVisibility(View.VISIBLE);
                }
            }
        });


    }

    @OnClick(R.id.btnNext)
    void onBtnNextClick() {
        Toast.makeText(this, "Processing this section", Toast.LENGTH_SHORT).show();
        if (validateForm()) {
            try {
                saveDrafts();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (updateDb()) {
                Toast.makeText(this, "starting next section", Toast.LENGTH_SHORT).show();

                finish();
                Intent secH = new Intent(this, SectionJActivity.class);
                startActivity(secH);

            } else {
                Toast.makeText(this, "Failed to update Database", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @OnClick(R.id.btnEnd)
    void onBtnEndClick() {
        MainApp.endActivity(this, this);
    }

    private boolean updateDb() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSI();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private void saveDrafts() throws JSONException {
        Toast.makeText(this, "saving Drafts", Toast.LENGTH_SHORT).show();

        JSONObject si = new JSONObject();

        si.put("wri01", wri0101.isChecked() ? "1" : wri0102.isChecked() ? "2" : wri0103.isChecked() ? "3"
                : wri0104.isChecked() ? "4" : wri0105.isChecked() ? "5" : wri0106.isChecked() ? "6"
                : wri0196.isChecked() ? "96" : "0");
        si.put("wri96x", wri0196x.getText().toString());
        si.put("wri02", wri0201.isChecked() ? "1" : wri0202.isChecked() ? "2" : wri0203.isChecked() ? "3"
                : wri0204.isChecked() ? "4" : wri0205.isChecked() ? "5" : wri0206.isChecked() ? "6"
                : wri0207.isChecked() ? "7" : wri0208.isChecked() ? "8" : wri0209.isChecked() ? "9"
                : wri0210.isChecked() ? "10" : wri0211.isChecked() ? "11" : wri0212.isChecked() ? "12"
                : wri0213.isChecked() ? "13" : wri0214.isChecked() ? "14" : wri0215.isChecked() ? "15"
                : wri0296.isChecked() ? "96" : "0");
        si.put("wri0296x", wri0296x.getText().toString());
        si.put("wri03", wri0301.isChecked() ? "1" : wri0302.isChecked() ? "2" : "0");
        si.put("wri04", wri0401.isChecked() ? "1" : wri0402.isChecked() ? "2" : wri0403.isChecked() ? "3"
                : wri0404.isChecked() ? "4" : wri0405.isChecked() ? "5" : wri0406.isChecked() ? "6"
                : wri0496.isChecked() ? "96" : "0");
        si.put("wri04x", wri0496x.getText().toString());
        si.put("wri05", wri0501.isChecked() ? "1" : wri0502.isChecked() ? "2" : wri0503.isChecked() ? "3"
                : wri0504.isChecked() ? "4" : wri0505.isChecked() ? "5" : wri0506.isChecked() ? "6"
                : wri0507.isChecked() ? "7" : wri0508.isChecked() ? "8" : wri0509.isChecked() ? "9"
                : wri0596.isChecked() ? "96" : "0");
        si.put("wri0596x", wri0596x.getText().toString());
        si.put("wri06", wri0601.isChecked() ? "1" : wri0602.isChecked() ? "2" : "0");
        si.put("wri07", wri07.getText().toString());
        si.put("wri0801", wri080101.isChecked() ? "1" : wri080102.isChecked() ? "2" : "0");
        si.put("wri0802", wri080201.isChecked() ? "1" : wri080202.isChecked() ? "2" : "0");
        si.put("wri0803", wri080301.isChecked() ? "1" : wri080302.isChecked() ? "2" : "0");
        si.put("wri0804", wri080401.isChecked() ? "1" : wri080402.isChecked() ? "2" : "0");
        si.put("wri0805", wri080501.isChecked() ? "1" : wri080502.isChecked() ? "2" : "0");
        si.put("wri0806", wri080601.isChecked() ? "1" : wri080602.isChecked() ? "2" : "0");
        si.put("wri0807", wri080701.isChecked() ? "1" : wri080702.isChecked() ? "2" : "0");
        si.put("wri0808", wri080801.isChecked() ? "1" : wri080802.isChecked() ? "2" : "0");
        si.put("wri0809", wri080901.isChecked() ? "1" : wri080902.isChecked() ? "2" : "0");
        si.put("wri0810", wri081001.isChecked() ? "1" : wri081002.isChecked() ? "2" : "0");
        si.put("wri0811", wri081101.isChecked() ? "1" : wri081102.isChecked() ? "2" : "0");
        si.put("wri0812", wri081201.isChecked() ? "1" : wri081202.isChecked() ? "2" : "0");
        si.put("wri0813", wri081301.isChecked() ? "1" : wri081302.isChecked() ? "2" : "0");
        si.put("wri0814", wri081401.isChecked() ? "1" : wri081402.isChecked() ? "2" : "0");
        si.put("wri0815", wri081501.isChecked() ? "1" : wri081502.isChecked() ? "2" : "0");
        si.put("wri0816", wri081601.isChecked() ? "1" : wri081602.isChecked() ? "2" : "0");
        si.put("wri0817", wri081701.isChecked() ? "1" : wri081702.isChecked() ? "2" : "0");
        si.put("wri0818", wri081801.isChecked() ? "1" : wri081802.isChecked() ? "2" : "0");
        si.put("wri09", wri0901.isChecked() ? "1" : wri0902.isChecked() ? "2" : wri0903.isChecked() ? "3"
                : wri0904.isChecked() ? "4" : wri0905.isChecked() ? "5" : wri0906.isChecked() ? "6"
                : wri0907.isChecked() ? "7" : wri0908.isChecked() ? "8" : wri0909.isChecked() ? "9"
                : wri0910.isChecked() ? "10" : wri0996.isChecked() ? "96" : "0");
        si.put("wri0996x", wri0996x.getText().toString());
        si.put("wri10", wri1001.isChecked() ? "1" : wri1002.isChecked() ? "2" : wri1003.isChecked() ? "3" : "0");
        si.put("wri1096x", wri1096x.getText().toString());
        si.put("wri11", wri1101.isChecked() ? "1" : wri1102.isChecked() ? "2" : "0");
        si.put("wri12", wri1201.isChecked() ? "1" : wri1202.isChecked() ? "2" : wri1203.isChecked() ? "3"
                : wri1204.isChecked() ? "4" : wri1205.isChecked() ? "5" : wri1206.isChecked() ? "6"
                : wri1207.isChecked() ? "7" : wri1208.isChecked() ? "8" : wri1209.isChecked() ? "9"
                : wri1210.isChecked() ? "10" : wri1211.isChecked() ? "11" : wri1296.isChecked() ? "96" : "0");
        si.put("wri1296x", wri1296x.getText().toString());
        si.put("wri13", wri1301.isChecked() ? "1" : wri1302.isChecked() ? "2" : wri1303.isChecked() ? "3"
                : wri1304.isChecked() ? "4" : wri1305.isChecked() ? "5" : wri1306.isChecked() ? "6"
                : wri1307.isChecked() ? "7" : wri1308.isChecked() ? "8" : wri1309.isChecked() ? "9"
                : wri1310.isChecked() ? "10" : wri1311.isChecked() ? "11" : wri1312.isChecked() ? "12"
                : wri1396.isChecked() ? "96" : "0");
        si.put("wri1396x", wri1396x.getText().toString());
        si.put("wri14", wri1401.isChecked() ? "1" : wri1402.isChecked() ? "2" : wri1403.isChecked() ? "3"
                : wri1404.isChecked() ? "4" : wri1405.isChecked() ? "5" : wri1406.isChecked() ? "6"
                : wri1407.isChecked() ? "7" : wri1408.isChecked() ? "8" : wri1409.isChecked() ? "9"
                : wri1410.isChecked() ? "10" : wri1411.isChecked() ? "11" : wri1496.isChecked() ? "96" : "0");
        si.put("wri1496x", wri1496x.getText().toString());
        si.put("wri15", wri15.getText().toString());
        si.put("wri16a", wri16a01.isChecked() ? "1" : wri16a02.isChecked() ? "2" : "0");
        si.put("wri16b", wri16b01.isChecked() ? "1" : wri16b02.isChecked() ? "2" : "0");
        si.put("wri16c", wri16c01.isChecked() ? "1" : wri16c02.isChecked() ? "2" : "0");
        si.put("wri16d", wri16d01.isChecked() ? "1" : wri16d02.isChecked() ? "2" : "0");
        si.put("wri16e", wri16e01.isChecked() ? "1" : wri16e02.isChecked() ? "2" : "0");
        si.put("wri16f", wri16f01.isChecked() ? "1" : wri16f02.isChecked() ? "2" : "0");
        si.put("wri16g", wri16g01.isChecked() ? "1" : wri16g02.isChecked() ? "2" : "0");
        si.put("wri17", wri1701.isChecked() ? "1" : wri1702.isChecked() ? "2" : "0");
        si.put("wri1801", wri1801.getText().toString());
        si.put("wri1802", wri1802.getText().toString());
        si.put("wri1803", wri1803.getText().toString());
        si.put("wri1899", wri1899.isChecked() ? "1" : "0");
        si.put("wri19", wri1901.isChecked() ? "1" : wri1902.isChecked() ? "2" : "0");
        si.put("wri2001", wri2001.getText().toString());
        si.put("wri2002", wri2002.getText().toString());
        si.put("wri2003", wri2003.getText().toString());
        si.put("wri2004", wri2004.getText().toString());
        si.put("wri2005", wri2005.getText().toString());
        si.put("wri2006", wri2006.getText().toString());
        si.put("wri2007", wri2007.getText().toString());

        MainApp.fc.setsI(String.valueOf(si));

        Toast.makeText(this, "Validation Succecful", Toast.LENGTH_SHORT).show();
    }

    public boolean validateForm() {

        // =================== Q1 ====================
        if (wri01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri01), Toast.LENGTH_SHORT).show();
            wri0196.setError("This Data is required");
            Log.d(TAG, "wri01 : This Data is required");
            return false;
        } else {
            wri0196.setError(null);
        }

        if (wri01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri01), Toast.LENGTH_SHORT).show();
            wri0196.setError("This Data is required");
            Log.d(TAG, "wri01 :This Data is required ");
            return false;
        } else {
            wri0196.setError(null);
        }


        if (wri0196.isChecked() && wri0196x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.wri01) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            wri0196x.setError("This data is Required!");    // Set Error on last radio button
            Log.d(TAG, "wri0196: This data is Required!");
            return false;
        } else {
            wri0196x.setError(null);
        }

        // =================== Q2 ====================
        if (wri02.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri02), Toast.LENGTH_SHORT).show();
            wri0296.setError("This Data is required");
            Log.d(TAG, "wri02 :This Data is required");
            return false;
        } else {
            wri0296.setError(null);
        }

        if (wri0296.isChecked() && wri0296x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.wri02) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            wri0296x.setError("This data is Required!");    // Set Error on last radio button
            Log.d(TAG, "wri0296: This data is Required!");
            return false;
        } else {
            wri0296x.setError(null);
        }

        // =================== Q3 ====================
        if (wri03.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri03), Toast.LENGTH_SHORT).show();
            wri0302.setError("This Data is required");
            Log.d(TAG, "wri02  :This Data is required ");
            return false;
        } else {
            wri0302.setError(null);
        }


        if (wri0301.isChecked()) {
            // =================== Q4 ====================
            if (wri04.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri04), Toast.LENGTH_SHORT).show();
                wri0496.setError("This Data is required");
                Log.d(TAG, "wri04 : This Data is required ");
                return false;
            } else {
                wri0496.setError(null);
            }

            if (wri0496.isChecked() && wri0496x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.wri04) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                wri0496x.setError("This data is Required!");    // Set Error on last radio button
                Log.d(TAG, "wri0496x: This data is Required!");
                return false;
            } else {
                wri0496x.setError(null);
            }
        }

        // =================== Q5 ====================
        if (wri05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri05), Toast.LENGTH_SHORT).show();
            wri0596.setError("This Data is required");
            Log.d(TAG, "wri05 : This Data is required ");
            return false;
        } else {
            wri0596.setError(null);
        }

        if (wri0596.isChecked() && wri0596x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.wri05) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            wri0596x.setError("This data is Required!");    // Set Error on last radio button
            Log.d(TAG, "wri0596x: This data is Required!");
            return false;
        } else {
            wri0596x.setError(null);
        }

        if (!wri0509.isChecked()) {
            // =================== Q6 ====================
            if (wri06.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri06), Toast.LENGTH_SHORT).show();
                wri0602.setError("This Data is required");
                Log.d(TAG, "wri06 : This Data is required ");
                return false;
            } else {
                wri0602.setError(null);
            }

            if (wri0601.isChecked()) {
                // =================== Q7 ====================
                if (wri07.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri07), Toast.LENGTH_SHORT).show();
                    wri07.setError("This data is required");
                    Log.d(TAG, "wri07  : This Data is required ");
                    return false;
                } else {
                    wri07.setError(null);
                }

                if ((Integer.parseInt(wri07.getText().toString()) == 0)) {
                    Toast.makeText(this, "ERROR: " + getString(R.string.wri07), Toast.LENGTH_LONG).show();
                    wri07.setError("No. of HH cannot be zero");
                    Log.i(TAG, "wri07: No. of HH cannot  not be zero");
                    return false;
                } else {
                    wri07.setError(null);
                }
            }
        }

        // =================== Q801 ====================
        if (wri0801.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri0801), Toast.LENGTH_SHORT).show();
            wri080102.setError("This Data is required");
            Log.d(TAG, " wri0801 :This Data is required");
            return false;
        } else {
            wri080102.setError(null);
        }

        // =================== Q802 ====================
        if (wri0802.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri0802), Toast.LENGTH_SHORT).show();
            wri080202.setError("This Data is required");
            Log.d(TAG, "wri0802 : This Data is required ");
            return false;
        } else {
            wri080202.setError(null);
        }

        // =================== Q803 ====================
        if (wri0803.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri0803), Toast.LENGTH_SHORT).show();
            wri080302.setError("This Data is required");
            Log.d(TAG, "wri0803 : This Data is required ");
            return false;
        } else {
            wri080302.setError(null);
        }

        // =================== Q804 ====================
        if (wri0804.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri0804), Toast.LENGTH_SHORT).show();
            wri080402.setError("This Data is required");
            Log.d(TAG, "wri0804 : This Data is required ");
            return false;
        } else {
            wri080402.setError(null);
        }
        // =================== Q805 ====================
        if (wri0805.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri0805), Toast.LENGTH_SHORT).show();
            wri080502.setError("This Data is required");
            Log.d(TAG, "wri0805 : This Data is required ");
            return false;
        } else {
            wri080502.setError(null);
        }

        // =================== Q806 ====================
        if (wri0806.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri0806), Toast.LENGTH_SHORT).show();
            wri080602.setError("This Data is required");
            Log.d(TAG, "wri0806 : This Data is required ");
            return false;
        } else {
            wri080602.setError(null);
        }

        // =================== Q807 ====================
        if (wri0807.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri0807), Toast.LENGTH_SHORT).show();
            wri080702.setError("This Data is required");
            Log.d(TAG, "wri0807 : This Data is required ");
            return false;
        } else {
            wri080702.setError(null);
        }

        // =================== Q807 ====================
        if (wri0807.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri0807), Toast.LENGTH_SHORT).show();
            wri080702.setError("This Data is required");
            Log.d(TAG, "wri0807 : This Data is required ");
            return false;
        } else {
            wri080702.setError(null);
        }

        // =================== Q808 ====================
        if (wri0808.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri0808), Toast.LENGTH_SHORT).show();
            wri080802.setError("This Data is required");
            Log.d(TAG, "wri0808 :This Data is required ");
            return false;
        } else {
            wri080802.setError(null);
        }

        // =================== Q809 ====================
        if (wri0809.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri0809), Toast.LENGTH_SHORT).show();
            wri080902.setError("This Data is required");
            Log.d(TAG, "wri0809 : This Data is required ");
            return false;
        } else {
            wri080902.setError(null);
        }

        // =================== Q810 ====================
        if (wri0810.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri0810), Toast.LENGTH_SHORT).show();
            wri081002.setError("This Data is required");
            Log.d(TAG, "wri0810 : This Data is required");
            return false;
        } else {
            wri081002.setError(null);
        }

        // =================== Q811 ====================
        if (wri0811.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri0811), Toast.LENGTH_SHORT).show();
            wri081102.setError("This Data is required");
            Log.d(TAG, "wri0811 : This Data is required");
            return false;
        } else {
            wri081102.setError(null);
        }

        // =================== Q812 ====================
        if (wri0812.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri0812), Toast.LENGTH_SHORT).show();
            wri081202.setError("This Data is required");
            Log.d(TAG, "wri0812 : This Data is required ");
            return false;
        } else {
            wri081202.setError(null);
        }

        // =================== Q813 ====================
        if (wri0813.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri0813), Toast.LENGTH_SHORT).show();
            wri081302.setError("This Data is required");
            Log.d(TAG, "wri0813 : This Data is required ");
            return false;
        } else {
            wri081302.setError(null);
        }

        // =================== Q814 ====================
        if (wri0814.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.wri0814), Toast.LENGTH_SHORT).show();
            wri081402.setError("This Data is required");
            Log.d(TAG, "wri0814 :This Data is required ");
            return false;
        } else {
            wri081402.setError(null);
        }
        // =================== Q815 ====================
        if (wri0815.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri0815), Toast.LENGTH_SHORT).show();
            wri081502.setError("This Data is required");
            Log.d(TAG, "wri0815 : This Data is required ");
            return false;
        } else {
            wri081502.setError(null);
        }

        // =================== Q816 ====================
        if (wri0816.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri0816), Toast.LENGTH_SHORT).show();
            wri081602.setError("This Data is required");
            Log.d(TAG, "wri0816 :This Data is required ");
            return false;
        } else {
            wri081602.setError(null);
        }

        // =================== Q817 ====================
        if (wri0817.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri0817), Toast.LENGTH_SHORT).show();
            wri081702.setError("This Data is required");
            Log.d(TAG, "wri0817 :This Data is required ");
            return false;
        } else {
            wri081702.setError(null);
        }

        // =================== Q818 ====================
        if (wri0818.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri0818), Toast.LENGTH_SHORT).show();
            wri081802.setError("This Data is required");
            Log.d(TAG, "wri0818 : This Data is required ");
            return false;
        } else {
            wri081802.setError(null);
        }



        // =================== Q9 ====================
        if (wri09.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri09), Toast.LENGTH_SHORT).show();
            wri0996.setError("This Data is required");
            Log.d(TAG, "wri09 :This Data is required ");
            return false;
        } else {
            wri0996.setError(null);
        }

        if (wri0996.isChecked() && wri0996x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.wri09) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            wri0996x.setError("This data is Required!");    // Set Error on last radio button
            Log.d(TAG, "wri0996x: This data is Required!");
            return false;
        } else {
            wri0996x.setError(null);
        }

        if (!wri0910.isChecked()) {
            // =================== Q10 ====================
            if (wri10.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri10), Toast.LENGTH_SHORT).show();
                wri1096.setError("This Data is required");
                Log.d(TAG, "wri10 : This Data is required ");
                return false;
            } else {
                wri1096.setError(null);
            }

            if (wri1096.isChecked() && wri1096x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.wri10) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                wri1096x.setError("This data is Required!");    // Set Error on last radio button
                Log.d(TAG, "wri1096x: This data is Required!");
                return false;
            } else {
                wri1096x.setError(null);
            }
        }

        // =================== Q11 ====================
        if (wri11.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri11), Toast.LENGTH_SHORT).show();
            wri1102.setError("This Data is required");
            Log.d(TAG, "wri11 : This Data is required ");
            return false;
        } else {
            wri1102.setError(null);
        }

        // =================== Q12 ====================
        if (wri12.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri12), Toast.LENGTH_SHORT).show();
            wri1296.setError("This Data is required");
            Log.d(TAG, "wri12 : This Data is required ");
            return false;
        } else {
            wri1296.setError(null);
        }

        if (wri1296.isChecked() && wri1296x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.wri12) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            wri1296x.setError("This data is Required!");    // Set Error on last radio button
            Log.d(TAG, "wri1296x: This data is Required!");
            return false;
        } else {
            wri1296x.setError(null);
        }

        // =================== Q13 ====================
        if (wri13.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri13), Toast.LENGTH_SHORT).show();
            wri1396.setError("This Data is required");
            Log.d(TAG, "wri13 : This Data is required ");
            return false;
        } else {
            wri1396.setError(null);
        }

        if (wri1396.isChecked() && wri1396x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.wri13) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            wri1396x.setError("This data is Required!");    // Set Error on last radio button
            Log.d(TAG, "wri1396x: This data is Required!");
            return false;
        } else {
            wri1396x.setError(null);
        }

        // =================== Q14 ====================
        if (wri14.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri14), Toast.LENGTH_SHORT).show();
            wri1496.setError("This Data is required");
            Log.d(TAG, "wri14 :This Data is required ");
            return false;
        } else {
            wri1496.setError(null);
        }

        if (wri1496.isChecked() && wri1496x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.wri14) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            wri1496x.setError("This data is Required!");    // Set Error on last radio button
            Log.d(TAG, "wri1496x: This data is Required!");
            return false;
        } else {
            wri1496x.setError(null);
        }

        // =================== Q15 ====================
        if (wri15.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri15), Toast.LENGTH_SHORT).show();
            wri15.setError("This data is required");
            Log.d(TAG, "wri15  : This Data is required ");
            return false;
        } else {
            wri15.setError(null);
        }

        if ((Integer.parseInt(wri15.getText().toString()) == 0)) {
            Toast.makeText(this, "ERROR: " + getString(R.string.wri15), Toast.LENGTH_LONG).show();
            wri15.setError("No. of rooms cannot be zero");
            Log.i(TAG, "wri15: No. of rooms cannot  not be zero");
            return false;
        } else {
            wri15.setError(null);
        }

        // =================== Q16a ====================
        if (wri16a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri16a), Toast.LENGTH_SHORT).show();
            wri16a02.setError("This Data is required");
            Log.d(TAG, "wri16a : This Data is required ");
            return false;
        } else {
            wri16a02.setError(null);
        }

        // =================== Q16b ====================
        if (wri16b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri16b), Toast.LENGTH_SHORT).show();
            wri16b02.setError("This Data is required");
            Log.d(TAG, "wri16b : This Data is required ");
            return false;
        } else {
            wri16b02.setError(null);
        }

        // =================== Q16c ====================
        if (wri16c.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri16c), Toast.LENGTH_SHORT).show();
            wri16c02.setError("This Data is required");
            Log.d(TAG, "wri16c : This Data is required");
            return false;
        } else {
            wri16c02.setError(null);
        }

        // =================== Q16d ====================
        if (wri16d.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri16d), Toast.LENGTH_SHORT).show();
            wri16d02.setError("This Data is required");
            Log.d(TAG, "wri16d : This Data is required ");
            return false;
        } else {
            wri16d02.setError(null);
        }

        // =================== Q16e ====================
        if (wri16e.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri16e), Toast.LENGTH_SHORT).show();
            wri16e02.setError("This Data is required");
            Log.d(TAG, "wri16e : This Data is required");
            return false;
        } else {
            wri16e02.setError(null);
        }

        // =================== Q16f ====================
        if (wri16f.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri16f), Toast.LENGTH_SHORT).show();
            wri16f02.setError("This Data is required");
            Log.d(TAG, "wri16f : This Data is required");
            return false;
        } else {
            wri16f02.setError(null);
        }

        // =================== Q16g ====================
        if (wri16g.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri16g), Toast.LENGTH_SHORT).show();
            wri16g02.setError("This Data is required");
            Log.d(TAG, "wri16g :This Data is required");
            return false;
        } else {
            wri16g02.setError(null);
        }

        // =================== Q17 ====================
        if (wri17.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri17), Toast.LENGTH_SHORT).show();
            wri1702.setError("This Data is required");
            Log.d(TAG, "wri17 : This Data is required");
            return false;
        } else {
            wri1702.setError(null);
        }

        if (wri1701.isChecked()) {
            // =================== Q1801 ====================

            if ((wri1801.getText().toString().isEmpty() && wri1802.getText().toString().isEmpty()
                    && wri1803.getText().toString().isEmpty())
                    && !wri1899.isChecked()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.wri18), Toast.LENGTH_SHORT).show();
                wri1899.setError("This data is required");
                Log.d(TAG, "wri1801: This data is required  ");
                return false;
            } else {
                wri1899.setError(null);
            }

            if (!wri1899.isChecked()) {
                if ((Integer.parseInt(wri1801.getText().toString().isEmpty() ? "0" : wri1801.getText().toString()) < 1)
                        && Integer.parseInt(wri1802.getText().toString().isEmpty() ? "0" : wri1802.getText().toString()) < 1
                        && Integer.parseInt(wri1803.getText().toString().isEmpty() ? "0" : wri1803.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.wri18), Toast.LENGTH_SHORT).show();
                    wri1801.setError("Zero not allowed");
                    Log.i(TAG, "wri18: Zero not allowed");
                    return false;
                } else {
                    wri1801.setError(null);
                }
            }
        }

        // =================== Q19 ====================
        if (wri19.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.wri19), Toast.LENGTH_SHORT).show();
            wri1902.setError("This Data is required");
            Log.d(TAG, "wri19 :This Data is required ");
            return false;
        } else {
            wri1902.setError(null);
        }
        if (wri1901.isChecked()) {

            // =================== Q20.01 ====================
            if (wri2001.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri20) + getString(R.string.wri2001), Toast.LENGTH_SHORT).show();
                wri2001.setError("This data is required");
                Log.d(TAG, "wri2001 :This Data is required");
                return false;
            } else {
                wri2001.setError(null);
            }

            // =================== Q20.02 ====================
            if (wri2002.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri20) + getString(R.string.wri2002), Toast.LENGTH_SHORT).show();
                wri2002.setError("This data is required");
                Log.d(TAG, "wri2002  :This Data is required");
                return false;
            } else {
                wri2002.setError(null);
            }

            // =================== Q20.03 ====================
            if (wri2003.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri20) + getString(R.string.wri2003), Toast.LENGTH_SHORT).show();
                wri2003.setError("This data is required");
                Log.d(TAG, "wri2003  : This Data is required ");
                return false;
            } else {
                wri2003.setError(null);
            }

            // =================== Q20.04 ====================
            if (wri2004.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri20) + getString(R.string.wri2004), Toast.LENGTH_SHORT).show();
                wri2004.setError("This data is required");
                Log.d(TAG, "wri2004 : This Data is required ");
                return false;
            } else {
                wri2004.setError(null);
            }


            // =================== Q20.05 ====================
            if (wri2005.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri20) + getString(R.string.wri2005), Toast.LENGTH_SHORT).show();
                wri2005.setError("This data is required");
                Log.d(TAG, "wri2005  : This Data is required ");
                return false;
            } else {
                wri2005.setError(null);
            }

            // =================== Q20.06 ====================
            if (wri2006.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri20) + getString(R.string.wri2006), Toast.LENGTH_SHORT).show();
                wri2006.setError("This data is required");
                Log.d(TAG, "wri2006 :This Data is required ");
                return false;
            } else {
                wri2006.setError(null);
            }

            // =================== Q20.07 ====================
            if (wri2007.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.wri20) + getString(R.string.wri2007), Toast.LENGTH_SHORT).show();
                wri2007.setError("This data is required");
                Log.d(TAG, "wri2007 :This Data is required ");
                return false;
            } else {
                wri2007.setError(null);
            }

        }

        return true;
    }


}
