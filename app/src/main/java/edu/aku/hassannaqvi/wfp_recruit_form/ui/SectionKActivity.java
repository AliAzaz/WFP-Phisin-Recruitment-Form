package edu.aku.hassannaqvi.wfp_recruit_form.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfp_recruit_form.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfp_recruit_form.core.MainApp;

public class SectionKActivity extends AppCompatActivity {

    private static final String TAG = SectionKActivity.class.getSimpleName();
    final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    @BindView(R.id.wrk01a)
    EditText wrk01a;
    @BindView(R.id.fldGrpwrk01b)
    LinearLayout fldGrpwrk01b;
    @BindView(R.id.wrk01b)
    RadioGroup wrk01b;
    @BindView(R.id.wrk01b01)
    RadioButton wrk01b01;
    @BindView(R.id.wrk01b02)
    RadioButton wrk01b02;
    @BindView(R.id.wrk01b03)
    RadioButton wrk01b03;
    @BindView(R.id.wrk01b04)
    RadioButton wrk01b04;
    @BindView(R.id.wrk01b05)
    RadioButton wrk01b05;
    @BindView(R.id.wrk01b06)
    RadioButton wrk01b06;
    @BindView(R.id.wrk01b07)
    RadioButton wrk01b07;
    @BindView(R.id.wrk01b08)
    RadioButton wrk01b08;
    @BindView(R.id.wrk01b09)
    RadioButton wrk01b09;
    @BindView(R.id.wrk01b10)
    RadioButton wrk01b10;
    @BindView(R.id.wrk02a)
    EditText wrk02a;
    @BindView(R.id.fldGrpwrk02b)
    LinearLayout fldGrpwrk02b;
    @BindView(R.id.wrk02b)
    RadioGroup wrk02b;
    @BindView(R.id.wrk02b01)
    RadioButton wrk02b01;
    @BindView(R.id.wrk02b02)
    RadioButton wrk02b02;
    @BindView(R.id.wrk02b03)
    RadioButton wrk02b03;
    @BindView(R.id.wrk02b04)
    RadioButton wrk02b04;
    @BindView(R.id.wrk02b05)
    RadioButton wrk02b05;
    @BindView(R.id.wrk02b06)
    RadioButton wrk02b06;
    @BindView(R.id.wrk02b07)
    RadioButton wrk02b07;
    @BindView(R.id.wrk02b08)
    RadioButton wrk02b08;
    @BindView(R.id.wrk02b09)
    RadioButton wrk02b09;
    @BindView(R.id.wrk02b10)
    RadioButton wrk02b10;
    @BindView(R.id.wrk03a)
    EditText wrk03a;
    @BindView(R.id.fldGrpwrk03b)
    LinearLayout fldGrpwrk03b;
    @BindView(R.id.wrk03b)
    RadioGroup wrk03b;
    @BindView(R.id.wrk03b01)
    RadioButton wrk03b01;
    @BindView(R.id.wrk03b02)
    RadioButton wrk03b02;
    @BindView(R.id.wrk03b03)
    RadioButton wrk03b03;
    @BindView(R.id.wrk03b04)
    RadioButton wrk03b04;
    @BindView(R.id.wrk03b05)
    RadioButton wrk03b05;
    @BindView(R.id.wrk03b06)
    RadioButton wrk03b06;
    @BindView(R.id.wrk03b07)
    RadioButton wrk03b07;
    @BindView(R.id.wrk03b08)
    RadioButton wrk03b08;
    @BindView(R.id.wrk03b09)
    RadioButton wrk03b09;
    @BindView(R.id.wrk03b10)
    RadioButton wrk03b10;
    @BindView(R.id.wrk04a)
    EditText wrk04a;
    @BindView(R.id.fldGrpwrk04b)
    LinearLayout fldGrpwrk04b;
    @BindView(R.id.wrk04b)
    RadioGroup wrk04b;
    @BindView(R.id.wrk04b01)
    RadioButton wrk04b01;
    @BindView(R.id.wrk04b02)
    RadioButton wrk04b02;
    @BindView(R.id.wrk04b03)
    RadioButton wrk04b03;
    @BindView(R.id.wrk04b04)
    RadioButton wrk04b04;
    @BindView(R.id.wrk04b05)
    RadioButton wrk04b05;
    @BindView(R.id.wrk04b06)
    RadioButton wrk04b06;
    @BindView(R.id.wrk04b07)
    RadioButton wrk04b07;
    @BindView(R.id.wrk04b08)
    RadioButton wrk04b08;
    @BindView(R.id.wrk04b09)
    RadioButton wrk04b09;
    @BindView(R.id.wrk04b10)
    RadioButton wrk04b10;
    @BindView(R.id.wrk041a)
    EditText wrk041a;
    @BindView(R.id.fldGrpwrk041b)
    LinearLayout fldGrpwrk041b;
    @BindView(R.id.wrk041b)
    RadioGroup wrk041b;
    @BindView(R.id.wrk041b01)
    RadioButton wrk041b01;
    @BindView(R.id.wrk041b02)
    RadioButton wrk041b02;
    @BindView(R.id.wrk041b03)
    RadioButton wrk041b03;
    @BindView(R.id.wrk041b04)
    RadioButton wrk041b04;
    @BindView(R.id.wrk041b05)
    RadioButton wrk041b05;
    @BindView(R.id.wrk041b06)
    RadioButton wrk041b06;
    @BindView(R.id.wrk041b07)
    RadioButton wrk041b07;
    @BindView(R.id.wrk041b08)
    RadioButton wrk041b08;
    @BindView(R.id.wrk041b09)
    RadioButton wrk041b09;
    @BindView(R.id.wrk041b10)
    RadioButton wrk041b10;
    @BindView(R.id.wrk042a)
    EditText wrk042a;
    @BindView(R.id.fldGrpwrk042b)
    LinearLayout fldGrpwrk042b;
    @BindView(R.id.wrk042b)
    RadioGroup wrk042b;
    @BindView(R.id.wrk042b01)
    RadioButton wrk042b01;
    @BindView(R.id.wrk042b02)
    RadioButton wrk042b02;
    @BindView(R.id.wrk042b03)
    RadioButton wrk042b03;
    @BindView(R.id.wrk042b04)
    RadioButton wrk042b04;
    @BindView(R.id.wrk042b05)
    RadioButton wrk042b05;
    @BindView(R.id.wrk042b06)
    RadioButton wrk042b06;
    @BindView(R.id.wrk042b07)
    RadioButton wrk042b07;
    @BindView(R.id.wrk042b08)
    RadioButton wrk042b08;
    @BindView(R.id.wrk042b09)
    RadioButton wrk042b09;
    @BindView(R.id.wrk042b10)
    RadioButton wrk042b10;
    @BindView(R.id.wrk043a)
    EditText wrk043a;
    @BindView(R.id.fldGrpwrk043b)
    LinearLayout fldGrpwrk043b;
    @BindView(R.id.wrk043b)
    RadioGroup wrk043b;
    @BindView(R.id.wrk043b01)
    RadioButton wrk043b01;
    @BindView(R.id.wrk043b02)
    RadioButton wrk043b02;
    @BindView(R.id.wrk043b03)
    RadioButton wrk043b03;
    @BindView(R.id.wrk043b04)
    RadioButton wrk043b04;
    @BindView(R.id.wrk043b05)
    RadioButton wrk043b05;
    @BindView(R.id.wrk043b06)
    RadioButton wrk043b06;
    @BindView(R.id.wrk043b07)
    RadioButton wrk043b07;
    @BindView(R.id.wrk043b08)
    RadioButton wrk043b08;
    @BindView(R.id.wrk043b09)
    RadioButton wrk043b09;
    @BindView(R.id.wrk043b10)
    RadioButton wrk043b10;
    @BindView(R.id.wrk044a)
    EditText wrk044a;
    @BindView(R.id.fldGrpwrk044b)
    LinearLayout fldGrpwrk044b;
    @BindView(R.id.fldGrpwrk04)
    LinearLayout fldGrpwrk04;
    @BindView(R.id.wrk044b)
    RadioGroup wrk044b;
    @BindView(R.id.wrk044b01)
    RadioButton wrk044b01;
    @BindView(R.id.wrk044b02)
    RadioButton wrk044b02;
    @BindView(R.id.wrk044b03)
    RadioButton wrk044b03;
    @BindView(R.id.wrk044b04)
    RadioButton wrk044b04;
    @BindView(R.id.wrk044b05)
    RadioButton wrk044b05;
    @BindView(R.id.wrk044b06)
    RadioButton wrk044b06;
    @BindView(R.id.wrk044b07)
    RadioButton wrk044b07;
    @BindView(R.id.wrk044b08)
    RadioButton wrk044b08;
    @BindView(R.id.wrk044b09)
    RadioButton wrk044b09;
    @BindView(R.id.wrk044b10)
    RadioButton wrk044b10;
    @BindView(R.id.wrk05a)
    EditText wrk05a;
    @BindView(R.id.fldGrpwrk05b)
    LinearLayout fldGrpwrk05b;
    @BindView(R.id.fldGrpwrk05)
    LinearLayout fldGrpwrk05;
    @BindView(R.id.wrk05b)
    RadioGroup wrk05b;
    @BindView(R.id.wrk05b01)
    RadioButton wrk05b01;
    @BindView(R.id.wrk05b02)
    RadioButton wrk05b02;
    @BindView(R.id.wrk05b03)
    RadioButton wrk05b03;
    @BindView(R.id.wrk05b04)
    RadioButton wrk05b04;
    @BindView(R.id.wrk05b05)
    RadioButton wrk05b05;
    @BindView(R.id.wrk05b06)
    RadioButton wrk05b06;
    @BindView(R.id.wrk05b07)
    RadioButton wrk05b07;
    @BindView(R.id.wrk05b08)
    RadioButton wrk05b08;
    @BindView(R.id.wrk05b09)
    RadioButton wrk05b09;
    @BindView(R.id.wrk05b10)
    RadioButton wrk05b10;
    @BindView(R.id.wrk051a)
    EditText wrk051a;
    @BindView(R.id.fldGrpwrk051b)
    LinearLayout fldGrpwrk051b;
    @BindView(R.id.wrk051b)
    RadioGroup wrk051b;
    @BindView(R.id.wrk051b01)
    RadioButton wrk051b01;
    @BindView(R.id.wrk051b02)
    RadioButton wrk051b02;
    @BindView(R.id.wrk051b03)
    RadioButton wrk051b03;
    @BindView(R.id.wrk051b04)
    RadioButton wrk051b04;
    @BindView(R.id.wrk051b05)
    RadioButton wrk051b05;
    @BindView(R.id.wrk051b06)
    RadioButton wrk051b06;
    @BindView(R.id.wrk051b07)
    RadioButton wrk051b07;
    @BindView(R.id.wrk051b08)
    RadioButton wrk051b08;
    @BindView(R.id.wrk051b09)
    RadioButton wrk051b09;
    @BindView(R.id.wrk051b10)
    RadioButton wrk051b10;
    @BindView(R.id.wrk052a)
    EditText wrk052a;
    @BindView(R.id.fldGrpwrk052b)
    LinearLayout fldGrpwrk052b;
    @BindView(R.id.wrk052b)
    RadioGroup wrk052b;
    @BindView(R.id.wrk052b01)
    RadioButton wrk052b01;
    @BindView(R.id.wrk052b02)
    RadioButton wrk052b02;
    @BindView(R.id.wrk052b03)
    RadioButton wrk052b03;
    @BindView(R.id.wrk052b04)
    RadioButton wrk052b04;
    @BindView(R.id.wrk052b05)
    RadioButton wrk052b05;
    @BindView(R.id.wrk052b06)
    RadioButton wrk052b06;
    @BindView(R.id.wrk052b07)
    RadioButton wrk052b07;
    @BindView(R.id.wrk052b08)
    RadioButton wrk052b08;
    @BindView(R.id.wrk052b09)
    RadioButton wrk052b09;
    @BindView(R.id.wrk052b10)
    RadioButton wrk052b10;
    @BindView(R.id.wrk06a)
    EditText wrk06a;
    @BindView(R.id.fldGrpwrk06b)
    LinearLayout fldGrpwrk06b;
    @BindView(R.id.fldGrpwrk06)
    LinearLayout fldGrpwrk06;
    @BindView(R.id.wrk06b)
    RadioGroup wrk06b;
    @BindView(R.id.wrk06b01)
    RadioButton wrk06b01;
    @BindView(R.id.wrk06b02)
    RadioButton wrk06b02;
    @BindView(R.id.wrk06b03)
    RadioButton wrk06b03;
    @BindView(R.id.wrk06b04)
    RadioButton wrk06b04;
    @BindView(R.id.wrk06b05)
    RadioButton wrk06b05;
    @BindView(R.id.wrk06b06)
    RadioButton wrk06b06;
    @BindView(R.id.wrk06b07)
    RadioButton wrk06b07;
    @BindView(R.id.wrk06b08)
    RadioButton wrk06b08;
    @BindView(R.id.wrk06b09)
    RadioButton wrk06b09;
    @BindView(R.id.wrk06b10)
    RadioButton wrk06b10;
    @BindView(R.id.wrk061a)
    EditText wrk061a;
    @BindView(R.id.fldGrpwrk061b)
    LinearLayout fldGrpwrk061b;
    @BindView(R.id.wrk061b)
    RadioGroup wrk061b;
    @BindView(R.id.wrk061b01)
    RadioButton wrk061b01;
    @BindView(R.id.wrk061b02)
    RadioButton wrk061b02;
    @BindView(R.id.wrk061b03)
    RadioButton wrk061b03;
    @BindView(R.id.wrk061b04)
    RadioButton wrk061b04;
    @BindView(R.id.wrk061b05)
    RadioButton wrk061b05;
    @BindView(R.id.wrk061b06)
    RadioButton wrk061b06;
    @BindView(R.id.wrk061b07)
    RadioButton wrk061b07;
    @BindView(R.id.wrk061b08)
    RadioButton wrk061b08;
    @BindView(R.id.wrk061b09)
    RadioButton wrk061b09;
    @BindView(R.id.wrk061b10)
    RadioButton wrk061b10;
    @BindView(R.id.wrk07a)
    EditText wrk07a;
    @BindView(R.id.fldGrpwrk07b)
    LinearLayout fldGrpwrk07b;
    @BindView(R.id.fldGrpwrk07)
    LinearLayout fldGrpwrk07;
    @BindView(R.id.wrk07b)
    RadioGroup wrk07b;
    @BindView(R.id.wrk07b01)
    RadioButton wrk07b01;
    @BindView(R.id.wrk07b02)
    RadioButton wrk07b02;
    @BindView(R.id.wrk07b03)
    RadioButton wrk07b03;
    @BindView(R.id.wrk07b04)
    RadioButton wrk07b04;
    @BindView(R.id.wrk07b05)
    RadioButton wrk07b05;
    @BindView(R.id.wrk07b06)
    RadioButton wrk07b06;
    @BindView(R.id.wrk07b07)
    RadioButton wrk07b07;
    @BindView(R.id.wrk07b08)
    RadioButton wrk07b08;
    @BindView(R.id.wrk07b09)
    RadioButton wrk07b09;
    @BindView(R.id.wrk07b10)
    RadioButton wrk07b10;
    @BindView(R.id.wrk08a)
    EditText wrk08a;
    @BindView(R.id.fldGrpwrk08b)
    LinearLayout fldGrpwrk08b;
    @BindView(R.id.fldGrpwrk08)
    LinearLayout fldGrpwrk08;
    @BindView(R.id.wrk08b)
    RadioGroup wrk08b;
    @BindView(R.id.wrk08b01)
    RadioButton wrk08b01;
    @BindView(R.id.wrk08b02)
    RadioButton wrk08b02;
    @BindView(R.id.wrk08b03)
    RadioButton wrk08b03;
    @BindView(R.id.wrk08b04)
    RadioButton wrk08b04;
    @BindView(R.id.wrk08b05)
    RadioButton wrk08b05;
    @BindView(R.id.wrk08b06)
    RadioButton wrk08b06;
    @BindView(R.id.wrk08b07)
    RadioButton wrk08b07;
    @BindView(R.id.wrk08b08)
    RadioButton wrk08b08;
    @BindView(R.id.wrk08b09)
    RadioButton wrk08b09;
    @BindView(R.id.wrk08b10)
    RadioButton wrk08b10;
    @BindView(R.id.wrk09a)
    EditText wrk09a;
    @BindView(R.id.fldGrpwrk09b)
    LinearLayout fldGrpwrk09b;
    @BindView(R.id.fldGrpwrk09)
    LinearLayout fldGrpwrk09;
    @BindView(R.id.wrk09b)
    RadioGroup wrk09b;
    @BindView(R.id.wrk09b01)
    RadioButton wrk09b01;
    @BindView(R.id.wrk09b02)
    RadioButton wrk09b02;
    @BindView(R.id.wrk09b03)
    RadioButton wrk09b03;
    @BindView(R.id.wrk09b04)
    RadioButton wrk09b04;
    @BindView(R.id.wrk09b05)
    RadioButton wrk09b05;
    @BindView(R.id.wrk09b06)
    RadioButton wrk09b06;
    @BindView(R.id.wrk09b07)
    RadioButton wrk09b07;
    @BindView(R.id.wrk09b08)
    RadioButton wrk09b08;
    @BindView(R.id.wrk09b09)
    RadioButton wrk09b09;
    @BindView(R.id.wrk09b10)
    RadioButton wrk09b10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_m);
        ButterKnife.bind(this);

        this.setTitle("Section K");

        //=============== Q 1B Skip Pattern==============
        wrk01a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(wrk01a.getText().toString().isEmpty() ? "0" : wrk01a.getText().toString()) > 0) {
                    fldGrpwrk01b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpwrk01b.setVisibility(View.GONE);
                    wrk01b.clearCheck();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 2B Skip Pattern==============
        wrk02a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(wrk02a.getText().toString().isEmpty() ? "0" : wrk02a.getText().toString()) > 0) {
                    fldGrpwrk02b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpwrk02b.setVisibility(View.GONE);
                    wrk02b.clearCheck();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 3B Skip Pattern==============
        wrk03a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(wrk03a.getText().toString().isEmpty() ? "0" : wrk03a.getText().toString()) > 0) {
                    fldGrpwrk03b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpwrk03b.setVisibility(View.GONE);
                    wrk03b.clearCheck();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 4B Skip Pattern==============
        wrk04a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(wrk04a.getText().toString().isEmpty() ? "0" : wrk04a.getText().toString()) > 0) {
                    fldGrpwrk04b.setVisibility(View.VISIBLE);
                    fldGrpwrk04.setVisibility(View.VISIBLE);
                } else {
                    fldGrpwrk04.setVisibility(View.GONE);
                    fldGrpwrk04b.setVisibility(View.GONE);
                    wrk04b.clearCheck();
                    wrk041a.setText(null);
                    wrk041b.clearCheck();
                    wrk042a.setText(null);
                    wrk042b.clearCheck();
                    wrk043a.setText(null);
                    wrk043b.clearCheck();
                    wrk044a.setText(null);
                    wrk044b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 4.1 B Skip Pattern==============
        wrk041a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(wrk041a.getText().toString().isEmpty() ? "0" : wrk041a.getText().toString()) > 0) {
                    fldGrpwrk041b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpwrk041b.setVisibility(View.GONE);
                    wrk041b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 4.2 B Skip Pattern==============
        wrk042a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(wrk042a.getText().toString().isEmpty() ? "0" : wrk042a.getText().toString()) > 0) {
                    fldGrpwrk042b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpwrk042b.setVisibility(View.GONE);
                    wrk042b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 4.3 B Skip Pattern==============
        wrk043a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(wrk043a.getText().toString().isEmpty() ? "0" : wrk043a.getText().toString()) > 0) {
                    fldGrpwrk043b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpwrk043b.setVisibility(View.GONE);
                    wrk043b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 4.4 B Skip Pattern==============
        wrk044a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(wrk044a.getText().toString().isEmpty() ? "0" : wrk044a.getText().toString()) > 0) {
                    fldGrpwrk044b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpwrk044b.setVisibility(View.GONE);
                    wrk044b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        //=============== Q 5B Skip Pattern==============
        wrk05a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(wrk05a.getText().toString().isEmpty() ? "0" : wrk05a.getText().toString()) > 0) {
                    fldGrpwrk05b.setVisibility(View.VISIBLE);
                    fldGrpwrk05.setVisibility(View.VISIBLE);
                } else {
                    fldGrpwrk05b.setVisibility(View.GONE);
                    fldGrpwrk05.setVisibility(View.GONE);
                    wrk05b.clearCheck();
                    wrk051a.setText(null);
                    wrk051b.clearCheck();
                    wrk052a.setText(null);
                    wrk052b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 5.1 B Skip Pattern==============
        wrk051a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(wrk051a.getText().toString().isEmpty() ? "0" : wrk051a.getText().toString()) > 0) {
                    fldGrpwrk051b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpwrk051b.setVisibility(View.GONE);
                    wrk051b.clearCheck();


                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 5.2 B Skip Pattern==============
        wrk052a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(wrk052a.getText().toString().isEmpty() ? "0" : wrk052a.getText().toString()) > 0) {
                    fldGrpwrk052b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpwrk052b.setVisibility(View.GONE);
                    wrk052b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        //=============== Q 6B Skip Pattern==============
        wrk06a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(wrk06a.getText().toString().isEmpty() ? "0" : wrk06a.getText().toString()) > 0) {
                    fldGrpwrk06b.setVisibility(View.VISIBLE);
                    fldGrpwrk06.setVisibility(View.VISIBLE);
                } else {
                    fldGrpwrk06b.setVisibility(View.GONE);
                    fldGrpwrk06.setVisibility(View.GONE);
                    wrk06b.clearCheck();
                    wrk061a.setText(null);
                    wrk061b.clearCheck();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 6.1 B Skip Pattern==============
        wrk061a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(wrk061a.getText().toString().isEmpty() ? "0" : wrk061a.getText().toString()) > 0) {
                    fldGrpwrk061b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpwrk061b.setVisibility(View.GONE);
                    wrk061b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 7B Skip Pattern==============
        wrk07a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(wrk07a.getText().toString().isEmpty() ? "0" : wrk07a.getText().toString()) > 0) {
                    fldGrpwrk07b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpwrk07b.setVisibility(View.GONE);
                    wrk07b.clearCheck();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 8B Skip Pattern==============
        wrk08a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(wrk08a.getText().toString().isEmpty() ? "0" : wrk08a.getText().toString()) > 0) {
                    fldGrpwrk08b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpwrk08b.setVisibility(View.GONE);
                    wrk08b.clearCheck();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 9B Skip Pattern==============
        wrk09a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(wrk09a.getText().toString().isEmpty() ? "0" : wrk09a.getText().toString()) > 0) {
                    fldGrpwrk09b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpwrk09b.setVisibility(View.GONE);
                    wrk09b.clearCheck();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

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

                Intent secNext = new Intent(this, SectionlmoActivity.class);
                startActivity(secNext);

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

        JSONObject sk = new JSONObject();

        sk.put("wrk01a", wrk01a.getText().toString());
        sk.put("wrk01b", wrk01b01.isChecked() ? "1" : wrk01b02.isChecked() ? "2" : wrk01b03.isChecked() ? "3"
                : wrk01b04.isChecked() ? "4" : wrk01b05.isChecked() ? "5" : wrk01b06.isChecked() ? "6" : wrk01b07.isChecked() ? "7"
                : wrk01b08.isChecked() ? "8" : wrk01b09.isChecked() ? "9" : wrk01b10.isChecked() ? "10" : "0");

        sk.put("wrk02a", wrk02a.getText().toString());
        sk.put("wrk02b", wrk02b01.isChecked() ? "1" : wrk02b02.isChecked() ? "2" : wrk02b03.isChecked() ? "3"
                : wrk02b04.isChecked() ? "4" : wrk02b05.isChecked() ? "5" : wrk02b06.isChecked() ? "6" : wrk02b07.isChecked() ? "7"
                : wrk02b08.isChecked() ? "8" : wrk02b09.isChecked() ? "9" : wrk02b10.isChecked() ? "10" : "0");

        sk.put("wrk03a", wrk03a.getText().toString());
        sk.put("wrk03b", wrk03b01.isChecked() ? "1" : wrk03b02.isChecked() ? "2" : wrk03b03.isChecked() ? "3"
                : wrk03b04.isChecked() ? "4" : wrk03b05.isChecked() ? "5" : wrk03b06.isChecked() ? "6" : wrk03b07.isChecked() ? "7"
                : wrk03b08.isChecked() ? "8" : wrk03b09.isChecked() ? "9" : wrk03b10.isChecked() ? "10" : "0");

        sk.put("wrk04a", wrk04a.getText().toString());
        sk.put("wrk04b", wrk04b01.isChecked() ? "1" : wrk04b02.isChecked() ? "2" : wrk04b03.isChecked() ? "3"
                : wrk04b04.isChecked() ? "4" : wrk04b05.isChecked() ? "5" : wrk04b06.isChecked() ? "6" : wrk04b07.isChecked() ? "7"
                : wrk04b08.isChecked() ? "8" : wrk04b09.isChecked() ? "9" : wrk04b10.isChecked() ? "10" : "0");

        sk.put("wrk041a", wrk041a.getText().toString());
        sk.put("wrk041b", wrk041b01.isChecked() ? "1" : wrk041b02.isChecked() ? "2" : wrk041b03.isChecked() ? "3"
                : wrk041b04.isChecked() ? "4" : wrk041b05.isChecked() ? "5" : wrk041b06.isChecked() ? "6" : wrk041b07.isChecked() ? "7"
                : wrk041b08.isChecked() ? "8" : wrk041b09.isChecked() ? "9" : wrk041b10.isChecked() ? "10" : "0");

        sk.put("wrk042a", wrk042a.getText().toString());
        sk.put("wrk042b", wrk042b01.isChecked() ? "1" : wrk042b02.isChecked() ? "2" : wrk042b03.isChecked() ? "3"
                : wrk042b04.isChecked() ? "4" : wrk042b05.isChecked() ? "5" : wrk042b06.isChecked() ? "6" : wrk042b07.isChecked() ? "7"
                : wrk042b08.isChecked() ? "8" : wrk042b09.isChecked() ? "9" : wrk042b10.isChecked() ? "10" : "0");

        sk.put("wrk043a", wrk043a.getText().toString());
        sk.put("wrk043b", wrk043b01.isChecked() ? "1" : wrk043b02.isChecked() ? "2" : wrk043b03.isChecked() ? "3"
                : wrk043b04.isChecked() ? "4" : wrk043b05.isChecked() ? "5" : wrk043b06.isChecked() ? "6" : wrk043b07.isChecked() ? "7"
                : wrk043b08.isChecked() ? "8" : wrk043b09.isChecked() ? "9" : wrk043b10.isChecked() ? "10" : "0");

        sk.put("wrk044a", wrk044a.getText().toString());
        sk.put("wrk044b", wrk044b01.isChecked() ? "1" : wrk044b02.isChecked() ? "2" : wrk044b03.isChecked() ? "3"
                : wrk044b04.isChecked() ? "4" : wrk044b05.isChecked() ? "5" : wrk044b06.isChecked() ? "6" : wrk044b07.isChecked() ? "7"
                : wrk044b08.isChecked() ? "8" : wrk044b09.isChecked() ? "9" : wrk044b10.isChecked() ? "10" : "0");

        sk.put("wrk05a", wrk05a.getText().toString());
        sk.put("wrk05b", wrk05b01.isChecked() ? "1" : wrk05b02.isChecked() ? "2" : wrk05b03.isChecked() ? "3"
                : wrk05b04.isChecked() ? "4" : wrk05b05.isChecked() ? "5" : wrk05b06.isChecked() ? "6" : wrk05b07.isChecked() ? "7"
                : wrk05b08.isChecked() ? "8" : wrk05b09.isChecked() ? "9" : wrk05b10.isChecked() ? "10" : "0");

        sk.put("wrk051a", wrk051a.getText().toString());
        sk.put("wrk051b", wrk051b01.isChecked() ? "1" : wrk051b02.isChecked() ? "2" : wrk043b03.isChecked() ? "3"
                : wrk051b04.isChecked() ? "4" : wrk051b05.isChecked() ? "5" : wrk051b06.isChecked() ? "6" : wrk051b07.isChecked() ? "7"
                : wrk051b08.isChecked() ? "8" : wrk051b09.isChecked() ? "9" : wrk051b10.isChecked() ? "10" : "0");

        sk.put("wrk052a", wrk052a.getText().toString());
        sk.put("wrk052b", wrk052b01.isChecked() ? "1" : wrk052b02.isChecked() ? "2" : wrk052b03.isChecked() ? "3"
                : wrk052b04.isChecked() ? "4" : wrk052b05.isChecked() ? "5" : wrk052b06.isChecked() ? "6" : wrk052b07.isChecked() ? "7"
                : wrk052b08.isChecked() ? "8" : wrk052b09.isChecked() ? "9" : wrk052b10.isChecked() ? "10" : "0");

        sk.put("wrk06a", wrk06a.getText().toString());
        sk.put("wrk06b", wrk06b01.isChecked() ? "1" : wrk06b02.isChecked() ? "2" : wrk06b03.isChecked() ? "3"
                : wrk06b04.isChecked() ? "4" : wrk06b05.isChecked() ? "5" : wrk06b06.isChecked() ? "6" : wrk06b07.isChecked() ? "7"
                : wrk06b08.isChecked() ? "8" : wrk06b09.isChecked() ? "9" : wrk06b10.isChecked() ? "10" : "0");

        sk.put("wrk061a", wrk061a.getText().toString());
        sk.put("wrk061b", wrk061b01.isChecked() ? "1" : wrk061b02.isChecked() ? "2" : wrk061b03.isChecked() ? "3"
                : wrk061b04.isChecked() ? "4" : wrk061b05.isChecked() ? "5" : wrk061b06.isChecked() ? "6" : wrk061b07.isChecked() ? "7"
                : wrk061b08.isChecked() ? "8" : wrk061b09.isChecked() ? "9" : wrk061b10.isChecked() ? "10" : "0");

        sk.put("wrk07a", wrk07a.getText().toString());
        sk.put("wrk07b", wrk07b01.isChecked() ? "1" : wrk07b02.isChecked() ? "2" : wrk07b03.isChecked() ? "3"
                : wrk07b04.isChecked() ? "4" : wrk07b05.isChecked() ? "5" : wrk07b06.isChecked() ? "6" : wrk07b07.isChecked() ? "7"
                : wrk07b08.isChecked() ? "8" : wrk07b09.isChecked() ? "9" : wrk07b10.isChecked() ? "10" : "0");

        sk.put("wrk08a", wrk08a.getText().toString());
        sk.put("wrk08b", wrk08b01.isChecked() ? "1" : wrk08b02.isChecked() ? "2" : wrk08b03.isChecked() ? "3"
                : wrk08b04.isChecked() ? "4" : wrk08b05.isChecked() ? "5" : wrk08b06.isChecked() ? "6" : wrk08b07.isChecked() ? "7"
                : wrk08b08.isChecked() ? "8" : wrk08b09.isChecked() ? "9" : wrk08b10.isChecked() ? "10" : "0");

        sk.put("wrk09a", wrk09a.getText().toString());
        sk.put("wrk09b", wrk09b01.isChecked() ? "1" : wrk09b02.isChecked() ? "2" : wrk09b03.isChecked() ? "3"
                : wrk09b04.isChecked() ? "4" : wrk09b05.isChecked() ? "5" : wrk09b06.isChecked() ? "6" : wrk09b07.isChecked() ? "7"
                : wrk09b08.isChecked() ? "8" : wrk09b09.isChecked() ? "9" : wrk09b10.isChecked() ? "10" : "0");

        MainApp.fc.setsK(String.valueOf(sk));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean ValidateForm() {

        Toast.makeText(this, "Validating Section M", Toast.LENGTH_SHORT).show();

        //======================= Q 1 ===============
        if (wrk01a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
            wrk01a.setError("This data is Required!");
            Log.i(TAG, "wrk01a: This data is Required!");
            return false;
        } else {
            wrk01a.setError(null);
        }

        if (Integer.valueOf(wrk01a.getText().toString()) < 0 || Integer.valueOf(wrk01a.getText().toString()) > 7) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
            wrk01a.setError("Range is 0 - 7 days");
            Log.i(TAG, "wrk01a: This data is Required!");
            return false;
        } else {
            wrk01a.setError(null);
        }

        if (Integer.valueOf(wrk01a.getText().toString()) > 0) {
            if (wrk01b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01b), Toast.LENGTH_SHORT).show();
                wrk01b10.setError("This data is Required!");
                Log.i(TAG, "wrk01b: This data is Required!");
                return false;
            } else {
                wrk01b10.setError(null);
            }
        }


        //======================= Q 2 ===============
        if (wrk02a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
            wrk02a.setError("This data is Required!");
            Log.i(TAG, "wrk02a: This data is Required!");
            return false;
        } else {
            wrk02a.setError(null);
        }

        if (Integer.valueOf(wrk02a.getText().toString()) < 0 || Integer.valueOf(wrk02a.getText().toString()) > 7) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
            wrk02a.setError("Range is 0 - 7 days");
            Log.i(TAG, "wrk02a: This data is Required!");
            return false;
        } else {
            wrk02a.setError(null);
        }

        if (Integer.valueOf(wrk02a.getText().toString()) > 0) {
            if (wrk02b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01b), Toast.LENGTH_SHORT).show();
                wrk02b10.setError("This data is Required!");
                Log.i(TAG, "wrk02b: This data is Required!");
                return false;
            } else {
                wrk02b10.setError(null);
            }

        }


        //======================= Q 3 ===============
        if (wrk03a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
            wrk03a.setError("This data is Required!");
            Log.i(TAG, "wrk03a: This data is Required!");
            return false;
        } else {
            wrk03a.setError(null);
        }

        if (Integer.valueOf(wrk03a.getText().toString()) < 0 || Integer.valueOf(wrk03a.getText().toString()) > 7) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
            wrk03a.setError("Range is 0 - 7 days");
            Log.i(TAG, "wrk03a: This data is Required!");
            return false;
        } else {
            wrk03a.setError(null);
        }

        if (Integer.valueOf(wrk03a.getText().toString()) > 0) {
            if (wrk03b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01b), Toast.LENGTH_SHORT).show();
                wrk03b10.setError("This data is Required!");
                Log.i(TAG, "wrk03b: This data is Required!");
                return false;
            } else {
                wrk03b10.setError(null);
            }

        }

        //======================= Q 4 ===============
        if (wrk04a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
            wrk04a.setError("This data is Required!");
            Log.i(TAG, "wrk01a: This data is Required!");
            return false;
        } else {
            wrk04a.setError(null);
        }

        if (Integer.valueOf(wrk04a.getText().toString()) < 0 || Integer.valueOf(wrk04a.getText().toString()) > 7) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
            wrk04a.setError("Range is 0 - 7 days");
            Log.i(TAG, "wrk04a: This data is Required!");
            return false;
        } else {
            wrk04a.setError(null);
        }

        if (Integer.valueOf(wrk04a.getText().toString()) > 0) {
            if (wrk04b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01b), Toast.LENGTH_SHORT).show();
                wrk04b10.setError("This data is Required!");
                Log.i(TAG, "wrk04b: This data is Required!");
                return false;
            } else {
                wrk04b10.setError(null);
            }

            //======================= Q 4.1 ===============
            if (wrk041a.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
                wrk041a.setError("This data is Required!");
                Log.i(TAG, "wrk041a: This data is Required!");
                return false;
            } else {
                wrk041a.setError(null);
            }

            if (Integer.valueOf(wrk041a.getText().toString()) < 0 || Integer.valueOf(wrk041a.getText().toString()) > 7) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
                wrk041a.setError("Range is 0 - 7 days");
                Log.i(TAG, "wrk01a: This data is Required!");
                return false;
            } else {
                wrk041a.setError(null);
            }

            if (Integer.valueOf(wrk041a.getText().toString()) > 0) {
                if (wrk041b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01b), Toast.LENGTH_SHORT).show();
                    wrk041b10.setError("This data is Required!");
                    Log.i(TAG, "wrk041b: This data is Required!");
                    return false;
                } else {
                    wrk041b10.setError(null);
                }

            }

            //======================= Q 4.2 ===============
            if (wrk042a.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
                wrk042a.setError("This data is Required!");
                Log.i(TAG, "wrk042a: This data is Required!");
                return false;
            } else {
                wrk042a.setError(null);
            }

            if (Integer.valueOf(wrk042a.getText().toString()) < 0 || Integer.valueOf(wrk042a.getText().toString()) > 7) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
                wrk042a.setError("Range is 0 - 7 days");
                Log.i(TAG, "wrk042a: This data is Required!");
                return false;
            } else {
                wrk042a.setError(null);
            }

            if (Integer.valueOf(wrk042a.getText().toString()) > 0) {
                if (wrk042b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01b), Toast.LENGTH_SHORT).show();
                    wrk042b10.setError("This data is Required!");
                    Log.i(TAG, "wrk042b: This data is Required!");
                    return false;
                } else {
                    wrk042b10.setError(null);
                }

            }

            //======================= Q 4.3 ===============
            if (wrk043a.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
                wrk043a.setError("This data is Required!");
                Log.i(TAG, "wrk043a: This data is Required!");
                return false;
            } else {
                wrk043a.setError(null);
            }

            if (Integer.valueOf(wrk043a.getText().toString()) < 0 || Integer.valueOf(wrk043a.getText().toString()) > 7) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
                wrk043a.setError("Range is 0 - 7 days");
                Log.i(TAG, "wrk043a: This data is Required!");
                return false;
            } else {
                wrk043a.setError(null);
            }

            if (Integer.valueOf(wrk043a.getText().toString()) > 0) {
                if (wrk043b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01b), Toast.LENGTH_SHORT).show();
                    wrk043b10.setError("This data is Required!");
                    Log.i(TAG, "wrk043b: This data is Required!");
                    return false;
                } else {
                    wrk043b10.setError(null);
                }

            }

            //======================= Q 4.4 ===============
            if (wrk044a.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
                wrk044a.setError("This data is Required!");
                Log.i(TAG, "wrk044a: This data is Required!");
                return false;
            } else {
                wrk044a.setError(null);
            }

            if (Integer.valueOf(wrk044a.getText().toString()) < 0 || Integer.valueOf(wrk044a.getText().toString()) > 7) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
                wrk044a.setError("Range is 0 - 7 days");
                Log.i(TAG, "wrk044a: This data is Required!");
                return false;
            } else {
                wrk044a.setError(null);
            }

            if (Integer.valueOf(wrk044a.getText().toString()) > 0) {
                if (wrk044b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01b), Toast.LENGTH_SHORT).show();
                    wrk044b10.setError("This data is Required!");
                    Log.i(TAG, "wrk044b: This data is Required!");
                    return false;
                } else {
                    wrk044b10.setError(null);
                }

            }

        }

        //======================= Q 5 ===============
        if (wrk05a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
            wrk05a.setError("This data is Required!");
            Log.i(TAG, "wrk05a: This data is Required!");
            return false;
        } else {
            wrk05a.setError(null);
        }

        if (Integer.valueOf(wrk05a.getText().toString()) < 0 || Integer.valueOf(wrk05a.getText().toString()) > 7) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
            wrk05a.setError("Range is 0 - 7 days");
            Log.i(TAG, "wrk05a: This data is Required!");
            return false;
        } else {
            wrk05a.setError(null);
        }

        if (Integer.valueOf(wrk05a.getText().toString()) > 0) {
            if (wrk05b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01b), Toast.LENGTH_SHORT).show();
                wrk05b10.setError("This data is Required!");
                Log.i(TAG, "wrk05b: This data is Required!");
                return false;
            } else {
                wrk05b10.setError(null);
            }

            //======================= Q 5.1 ===============
            if (wrk051a.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
                wrk051a.setError("This data is Required!");
                Log.i(TAG, "wrk051a: This data is Required!");
                return false;
            } else {
                wrk051a.setError(null);
            }

            if (Integer.valueOf(wrk051a.getText().toString()) < 0 || Integer.valueOf(wrk051a.getText().toString()) > 7) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
                wrk051a.setError("Range is 0 - 7 days");
                Log.i(TAG, "wrk051a: This data is Required!");
                return false;
            } else {
                wrk051a.setError(null);
            }

            if (Integer.valueOf(wrk051a.getText().toString()) > 0) {
                if (wrk051b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01b), Toast.LENGTH_SHORT).show();
                    wrk051b10.setError("This data is Required!");
                    Log.i(TAG, "wrk051b: This data is Required!");
                    return false;
                } else {
                    wrk051b10.setError(null);
                }

            }

            //======================= Q 5.2 ===============
            if (wrk052a.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
                wrk052a.setError("This data is Required!");
                Log.i(TAG, "wrk052a: This data is Required!");
                return false;
            } else {
                wrk052a.setError(null);
            }


            if (Integer.valueOf(wrk052a.getText().toString()) < 0 || Integer.valueOf(wrk052a.getText().toString()) > 7) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
                wrk052a.setError("Range is 0 - 7 days");
                Log.i(TAG, "wrk052a: This data is Required!");
                return false;
            } else {
                wrk052a.setError(null);
            }

            if (Integer.valueOf(wrk052a.getText().toString()) > 0) {
                if (wrk052b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01b), Toast.LENGTH_SHORT).show();
                    wrk052b10.setError("This data is Required!");
                    Log.i(TAG, "wrk052b: This data is Required!");
                    return false;
                } else {
                    wrk052b10.setError(null);
                }

            }


        }

        //======================= Q 6 ===============
        if (wrk06a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
            wrk06a.setError("This data is Required!");
            Log.i(TAG, "wrk06a: This data is Required!");
            return false;
        } else {
            wrk06a.setError(null);
        }

        if (Integer.valueOf(wrk06a.getText().toString()) < 0 || Integer.valueOf(wrk06a.getText().toString()) > 7) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
            wrk06a.setError("Range is 0 - 7 days");
            Log.i(TAG, "wrk06a: This data is Required!");
            return false;
        } else {
            wrk06a.setError(null);
        }

        if (Integer.valueOf(wrk06a.getText().toString()) > 0) {
            if (wrk06b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01b), Toast.LENGTH_SHORT).show();
                wrk06b10.setError("This data is Required!");
                Log.i(TAG, "wrk06b: This data is Required!");
                return false;
            } else {
                wrk06b10.setError(null);
            }

            //======================= Q 6.1 ===============
            if (wrk061a.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
                wrk061a.setError("This data is Required!");
                Log.i(TAG, "wrk061a: This data is Required!");
                return false;
            } else {
                wrk061a.setError(null);
            }

            if (Integer.valueOf(wrk061a.getText().toString()) < 0 || Integer.valueOf(wrk061a.getText().toString()) > 7) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
                wrk061a.setError("Range is 0 - 7 days");
                Log.i(TAG, "wrk061a: This data is Required!");
                return false;
            } else {
                wrk061a.setError(null);
            }

            if (Integer.valueOf(wrk061a.getText().toString()) > 0) {
                if (wrk061b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01b), Toast.LENGTH_SHORT).show();
                    wrk061b10.setError("This data is Required!");
                    Log.i(TAG, "wrk061b: This data is Required!");
                    return false;
                } else {
                    wrk061b10.setError(null);
                }

            }


        }

        //======================= Q 7 ===============
        if (wrk07a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
            wrk07a.setError("This data is Required!");
            Log.i(TAG, "wrk07a: This data is Required!");
            return false;
        } else {
            wrk07a.setError(null);
        }

        if (Integer.valueOf(wrk07a.getText().toString()) < 0 || Integer.valueOf(wrk07a.getText().toString()) > 7) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
            wrk07a.setError("Range is 0 - 7 days");
            Log.i(TAG, "wrk07a: This data is Required!");
            return false;
        } else {
            wrk07a.setError(null);
        }

        if (Integer.valueOf(wrk07a.getText().toString()) > 0) {
            if (wrk07b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01b), Toast.LENGTH_SHORT).show();
                wrk07b10.setError("This data is Required!");
                Log.i(TAG, "wrk07b: This data is Required!");
                return false;
            } else {
                wrk07b10.setError(null);
            }

        }

        //======================= Q 8 ===============
        if (wrk08a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
            wrk08a.setError("This data is Required!");
            Log.i(TAG, "wrk08a: This data is Required!");
            return false;
        } else {
            wrk08a.setError(null);
        }

        if (Integer.valueOf(wrk08a.getText().toString()) < 0 || Integer.valueOf(wrk08a.getText().toString()) > 7) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
            wrk08a.setError("Range is 0 - 7 days");
            Log.i(TAG, "wrk08a: This data is Required!");
            return false;
        } else {
            wrk08a.setError(null);
        }

        if (Integer.valueOf(wrk08a.getText().toString()) > 0) {
            if (wrk08b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01b), Toast.LENGTH_SHORT).show();
                wrk08b10.setError("This data is Required!");
                Log.i(TAG, "wrk08b: This data is Required!");
                return false;
            } else {
                wrk08b10.setError(null);
            }

        }

        //======================= Q 9 ===============
        if (wrk09a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
            wrk09a.setError("This data is Required!");
            Log.i(TAG, "wrk09a: This data is Required!");
            return false;
        } else {
            wrk09a.setError(null);
        }

        if (Integer.valueOf(wrk09a.getText().toString()) < 0 || Integer.valueOf(wrk09a.getText().toString()) > 7) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.wrk01a), Toast.LENGTH_SHORT).show();
            wrk09a.setError("Range is 0 - 7 days");
            Log.i(TAG, "wrk09a: This data is Required!");
            return false;
        } else {
            wrk09a.setError(null);
        }

        if (Integer.valueOf(wrk09a.getText().toString()) > 0) {
            if (wrk09b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.wrk01b), Toast.LENGTH_SHORT).show();
                wrk09b10.setError("This data is Required!");
                Log.i(TAG, "wrk09b: This data is Required!");
                return false;
            } else {
                wrk09b10.setError(null);
            }

        }

        return true;

    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSK();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

}
