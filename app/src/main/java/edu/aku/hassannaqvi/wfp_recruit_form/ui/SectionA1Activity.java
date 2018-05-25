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
import edu.aku.hassannaqvi.wfp_recruit_form.databinding.ActivitySectionA1Binding;
import edu.aku.hassannaqvi.wfp_recruit_form.validation.validatorClass;

public class SectionA1Activity extends AppCompatActivity {

    ActivitySectionA1Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_section_a1);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a1);
        bi.setCallback(this);
        setupViews();
    }


    private void setupViews() {

        bi.ka111.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (bi.ka111b.isChecked()) {
                    bi.ka112.setText(null);
                    bi.ka113.clearCheck();

                    bi.fldGrpka111.setVisibility(View.GONE);
                } else {
                    bi.fldGrpka111.setVisibility(View.VISIBLE);
                }
            }
        });


        bi.ka114.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (bi.ka114b.isChecked()) {

                    bi.ka115a.setChecked(false);
                    bi.ka115b.setChecked(false);
                    bi.ka115c.setChecked(false);
                    bi.ka115d.setChecked(false);
                    bi.ka115e.setChecked(false);
                    bi.ka115f.setChecked(false);
                    bi.ka11596.setChecked(false);

                    bi.ka11596x.setText(null);

                    bi.fldGrpka114.setVisibility(View.GONE);
                } else {
                    bi.fldGrpka114.setVisibility(View.VISIBLE);
                }
            }
        });


        bi.ka117.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (bi.ka117b.isChecked()) {
                    bi.ka118.setText(null);
                    bi.fldGrpka117.setVisibility(View.GONE);
                } else {
                    bi.fldGrpka117.setVisibility(View.VISIBLE);
                }
            }
        });


        bi.ka122.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (bi.ka122b.isChecked()) {
                    bi.ka123a.setText(null);
                    bi.ka123k.setText(null);
                    bi.ka12398.setChecked(false);

                    bi.fldGrpka122.setVisibility(View.GONE);
                } else {
                    bi.fldGrpka122.setVisibility(View.VISIBLE);
                }
            }
        });


        bi.ka12398.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (bi.ka12398.isChecked()) {
                    bi.ka123a.setText(null);
                    bi.ka123k.setText(null);

                    bi.ka123a.setVisibility(View.GONE);
                    bi.ka123k.setVisibility(View.GONE);

                } else {
                    bi.ka123a.setVisibility(View.VISIBLE);
                    bi.ka123k.setVisibility(View.VISIBLE);
                }
            }
        });


    }


    private void SaveDraft() throws JSONException {


        JSONObject sA1 = new JSONObject();

        sA1.put("ka101", bi.ka101a.isChecked() ? "1"
                : bi.ka101b.isChecked() ? "2"
                : bi.ka101c.isChecked() ? "3"
                : bi.ka101d.isChecked() ? "4"
                : bi.ka101e.isChecked() ? "5"
                : bi.ka101f.isChecked() ? "6"
                : bi.ka10196.isChecked() ? "96"
                : "0");

        sA1.put("ka10196x", bi.ka10196x.getText().toString());


        sA1.put("ka102", bi.ka102a.isChecked() ? "1"
                : bi.ka102b.isChecked() ? "2"
                : bi.ka102c.isChecked() ? "3"
                : bi.ka102d.isChecked() ? "4"
                : bi.ka102e.isChecked() ? "5"
                : bi.ka102f.isChecked() ? "6"
                : bi.ka102g.isChecked() ? "7"
                : bi.ka102h.isChecked() ? "8"
                : bi.ka10296.isChecked() ? "96"
                : "0");

        sA1.put("ka10296x", bi.ka10296x.getText().toString());


        sA1.put("ka103", bi.ka103a.isChecked() ? "1"
                : bi.ka103b.isChecked() ? "2"
                : bi.ka103c.isChecked() ? "3"
                : bi.ka103d.isChecked() ? "4"
                : bi.ka103e.isChecked() ? "5"
                : bi.ka103f.isChecked() ? "6"
                : bi.ka103g.isChecked() ? "7"
                : bi.ka103h.isChecked() ? "8"
                : bi.ka103i.isChecked() ? "9"
                : bi.ka103j.isChecked() ? "10"
                : bi.ka103k.isChecked() ? "11"
                : bi.ka10396.isChecked() ? "96"
                : "0");

        sA1.put("ka10396x", bi.ka10396.getText().toString());


        sA1.put("ka104", bi.ka104a.isChecked() ? "1"
                : bi.ka104b.isChecked() ? "2"
                : bi.ka104c.isChecked() ? "3"
                : bi.ka104d.isChecked() ? "4"
                : bi.ka104e.isChecked() ? "5"
                : bi.ka104f.isChecked() ? "6"
                : bi.ka104g.isChecked() ? "7"
                : bi.ka104h.isChecked() ? "8"
                : bi.ka104i.isChecked() ? "9"
                : bi.ka10496.isChecked() ? "96"
                : "0");


        sA1.put("ka10496x", bi.ka10496x.getText().toString());


        sA1.put("ka105", bi.ka105a.isChecked() ? "1"
                : bi.ka105b.isChecked() ? "2"
                : bi.ka105c.isChecked() ? "3"
                : "0");


        sA1.put("ka106", bi.ka106.getText().toString());


        sA1.put("ka107", bi.ka107a.isChecked() ? "1"
                : bi.ka107b.isChecked() ? "2"
                : "0");


        sA1.put("ka108", bi.ka108a.isChecked() ? "1"
                : bi.ka108b.isChecked() ? "2"
                : bi.ka108c.isChecked() ? "3"
                : bi.ka108d.isChecked() ? "4"
                : bi.ka108e.isChecked() ? "5"
                : bi.ka108f.isChecked() ? "6"
                : bi.ka108g.isChecked() ? "7"
                : bi.ka108h.isChecked() ? "8"
                : bi.ka108i.isChecked() ? "9"
                : bi.ka108j.isChecked() ? "10"
                : bi.ka108k.isChecked() ? "11"
                : bi.ka10896.isChecked() ? "96"
                : "0");


        sA1.put("ka10896x", bi.ka10896x.getText().toString());


        sA1.put("ka109", bi.ka109a.isChecked() ? "1"
                : bi.ka109b.isChecked() ? "2"
                : bi.ka109c.isChecked() ? "3"
                : bi.ka109d.isChecked() ? "4"
                : bi.ka109e.isChecked() ? "5"
                : bi.ka109f.isChecked() ? "6"
                : bi.ka109g.isChecked() ? "7"
                : bi.ka109h.isChecked() ? "8"
                : bi.ka109i.isChecked() ? "9"
                : bi.ka109j.isChecked() ? "10"
                : bi.ka109k.isChecked() ? "11"
                : bi.ka109l.isChecked() ? "12"
                : bi.ka109m.isChecked() ? "13"
                : bi.ka109n.isChecked() ? "14"
                : bi.ka109o.isChecked() ? "15"
                : bi.ka10996.isChecked() ? "96"
                : "0");


        sA1.put("ka10996x", bi.ka10996x.getText().toString());


        /*sA1.put("ka110", bi.ka110a.isChecked() ? "1"
                : bi.ka110b.isChecked() ? "2"
                : bi.ka110c.isChecked() ? "3"
                : bi.ka110d.isChecked() ? "4"
                : bi.ka110e.isChecked() ? "5"
                : bi.ka110f.isChecked() ? "6"
                : bi.ka110g.isChecked() ? "7"
                : bi.ka110h.isChecked() ? "8"
                : bi.ka110i.isChecked() ? "9"
                : bi.ka110j.isChecked() ? "10"
                : bi.ka110k.isChecked() ? "11"
                : bi.ka110l.isChecked() ? "12"
                : bi.ka110m.isChecked() ? "13"
                : bi.ka110n.isChecked() ? "14"
                : bi.ka110o.isChecked() ? "15"
                : bi.ka11096.isChecked() ? "96"
                : "0");

        sA1.put("ka11096x", bi.ka11096x.getText().toString());*/


        sA1.put("ka111", bi.ka111a.isChecked() ? "1"
                : bi.ka111b.isChecked() ? "2"
                : "0");

        sA1.put("ka112", bi.ka112.getText().toString());


        sA1.put("ka113", bi.ka113a.isChecked() ? "1"
                : bi.ka113b.isChecked() ? "2"
                : bi.ka113c.isChecked() ? "3"
                : bi.ka113d.isChecked() ? "4"
                : "0");


        sA1.put("ka114", bi.ka114a.isChecked() ? "1"
                : bi.ka114b.isChecked() ? "2"
                : "0");


        sA1.put("ka115a", bi.ka115a.isChecked() ? "1" : "0");
        sA1.put("ka115b", bi.ka115b.isChecked() ? "2" : "0");
        sA1.put("ka115c", bi.ka115c.isChecked() ? "3" : "0");
        sA1.put("ka115d", bi.ka115d.isChecked() ? "4" : "0");
        sA1.put("ka115e", bi.ka115e.isChecked() ? "5" : "0");
        sA1.put("ka115f", bi.ka115f.isChecked() ? "6" : "0");
        sA1.put("ka11596", bi.ka11596.isChecked() ? "96" : "0");


        sA1.put("ka11596x", bi.ka11596x.getText().toString());


        sA1.put("ka116", bi.ka116a.isChecked() ? "1"
                : bi.ka116b.isChecked() ? "2"
                : bi.ka116c.isChecked() ? "3"
                : bi.ka116d.isChecked() ? "4"
                : bi.ka116e.isChecked() ? "5"
                : bi.ka116f.isChecked() ? "6"
                : bi.ka116g.isChecked() ? "7"
                : bi.ka116h.isChecked() ? "8"
                : bi.ka116i.isChecked() ? "9"
                : bi.ka116j.isChecked() ? "10"
                : bi.ka116k.isChecked() ? "11"
                : bi.ka11696.isChecked() ? "96"
                : "0");

        sA1.put("ka11696x", bi.ka11696x.getText().toString());

        sA1.put("ka117", bi.ka117a.isChecked() ? "1"
                : bi.ka117b.isChecked() ? "2"
                : "0");

        sA1.put("ka118", bi.ka118.getText().toString());


        sA1.put("ka119", bi.ka119a.isChecked() ? "1"
                : bi.ka119b.isChecked() ? "2"
                : "0");


        sA1.put("ka120", bi.ka120a.isChecked() ? "1"
                : bi.ka120b.isChecked() ? "2"
                : "0");

        sA1.put("ka121", bi.ka121a.isChecked() ? "1"
                : bi.ka121b.isChecked() ? "2"
                : "0");

        sA1.put("ka122", bi.ka122a.isChecked() ? "1"
                : bi.ka122b.isChecked() ? "2"
                : "0");


        sA1.put("ka123a", bi.ka123a.getText().toString());
        sA1.put("ka123k", bi.ka123k.getText().toString());

        sA1.put("ka12401", bi.ka12401.getText().toString());
        sA1.put("ka12402", bi.ka12402.getText().toString());
        sA1.put("ka12403", bi.ka12403.getText().toString());
        sA1.put("ka12404", bi.ka12404.getText().toString());
        sA1.put("ka12405", bi.ka12405.getText().toString());
        sA1.put("ka12406", bi.ka12406.getText().toString());
        sA1.put("ka12407", bi.ka12407.getText().toString());
        sA1.put("ka12408", bi.ka12408.getText().toString());
        sA1.put("ka12409", bi.ka12409.getText().toString());
        sA1.put("ka12410", bi.ka12410.getText().toString());
        sA1.put("ka12411", bi.ka12411.getText().toString());
        sA1.put("ka12412", bi.ka12412.getText().toString());
        sA1.put("ka12413", bi.ka12413.getText().toString());
        sA1.put("ka12414", bi.ka12414.getText().toString());
        sA1.put("ka12415", bi.ka12415.getText().toString());
        sA1.put("ka12416", bi.ka12416.getText().toString());
        sA1.put("ka12417", bi.ka12417.getText().toString());
        sA1.put("ka12418", bi.ka12418.getText().toString());
        sA1.put("ka12419", bi.ka12419.getText().toString());
        sA1.put("ka12420", bi.ka12420.getText().toString());
        sA1.put("ka12496", bi.ka12496.getText().toString());


        MainApp.fc.setsA1(String.valueOf(sA1));

    }


    private boolean formValidation() {

        if (!validatorClass.EmptyRadioButton(this, bi.ka101, bi.ka101a, getString(R.string.ka101))) {
            return false;
        }


        if (bi.ka10196.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.ka10196x, getString(R.string.other))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.ka102, bi.ka102a, getString(R.string.ka102))) {
            return false;
        }


        if (bi.ka10296.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.ka10296x, getString(R.string.other))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.ka103, bi.ka103a, getString(R.string.ka103sub))) {
            return false;
        }


        if (bi.ka10396.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.ka10396x, getString(R.string.other))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.ka104, bi.ka104a, getString(R.string.ka104sub))) {
            return false;
        }


        if (bi.ka10496.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.ka10496x, getString(R.string.other))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.ka105, bi.ka105a, getString(R.string.ka105))) {
            return false;
        }


        if (!validatorClass.EmptyTextBox(this, bi.ka106, getString(R.string.ka106))) {
            return false;
        }


        if (!validatorClass.RangeTextBox(this, bi.ka106, 1, 15, getString(R.string.ka106), "Rooms")) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.ka107, bi.ka107a, getString(R.string.ka107))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.ka108, bi.ka108a, getString(R.string.ka108))) {
            return false;
        }


        if (bi.ka10896.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.ka10896x, getString(R.string.other))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.ka109, bi.ka109a, getString(R.string.ka109))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.ka110, bi.ka110a, getString(R.string.ka110))) {
            return false;
        }


        if (bi.ka11096.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.ka11096x, getString(R.string.other))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.ka111, bi.ka111a, getString(R.string.ka111))) {
            return false;
        }


        if (bi.ka111a.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.ka112, getString(R.string.ka112))) {
                return false;
            }


            if (!validatorClass.EmptyRadioButton(this, bi.ka113, bi.ka113a, getString(R.string.ka113))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.ka114, bi.ka114a, getString(R.string.ka114))) {
            return false;
        }


        if (bi.ka114a.isChecked()) {

            if (!validatorClass.EmptyCheckBox(this, bi.fldGrpka115, bi.ka115a, getString(R.string.ka115))) {
                return false;
            }


            if (bi.ka11596.isChecked()) {

                if (!validatorClass.EmptyTextBox(this, bi.ka11596x, getString(R.string.other))) {
                    return false;
                }
            }

        }


        if (!validatorClass.EmptyRadioButton(this, bi.ka116, bi.ka116a, getString(R.string.ka116))) {
            return false;
        }


        if (bi.ka11696.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.ka11696x, getString(R.string.other))) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.ka117, bi.ka117a, getString(R.string.ka117))) {
            return false;
        }


        if (bi.ka117a.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.ka118, getString(R.string.ka118))) {
                return false;
            }

            if (!validatorClass.RangeTextBox(this, bi.ka118, 1, 15, getString(R.string.ka118), "Toilet")) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bi.ka119, bi.ka119a, getString(R.string.ka119))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.ka120, bi.ka120a, getString(R.string.ka120))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.ka121, bi.ka121a, getString(R.string.ka121))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.ka122, bi.ka122a, getString(R.string.ka122))) {
            return false;
        }


        if (bi.ka122a.isChecked()) {

            if (!bi.ka12398.isChecked()) {

                if (!validatorClass.EmptyTextBox(this, bi.ka123a, getString(R.string.ka123acr))) {
                    return false;
                }


                if (!validatorClass.EmptyTextBox(this, bi.ka123k, getString(R.string.ka123can))) {
                    return false;
                }
            }
        }


        if (!validatorClass.EmptyTextBox(this, bi.ka12401, getString(R.string.ka12401))) {
            return false;
        }


        if (!validatorClass.RangeTextBox(this, bi.ka12401, 3, 20, getString(R.string.ka12401), "Quantity")) {
            return false;
        }


        if (!validatorClass.EmptyTextBox(this, bi.ka12402, getString(R.string.ka12402))) {
            return false;
        }


        if (!validatorClass.RangeTextBox(this, bi.ka12402, 3, 20, getString(R.string.ka12402), "Quantity")) {
            return false;
        }


        if (!validatorClass.EmptyTextBox(this, bi.ka12403, getString(R.string.ka12403))) {
            return false;
        }


        if (!validatorClass.RangeTextBox(this, bi.ka12403, 3, 20, getString(R.string.ka12403), "Quantity")) {
            return false;
        }


        if (!validatorClass.EmptyTextBox(this, bi.ka12404, getString(R.string.ka12404))) {
            return false;
        }


        if (!validatorClass.RangeTextBox(this, bi.ka12404, 3, 20, getString(R.string.ka12404), "Quantity")) {
            return false;
        }


        if (!validatorClass.EmptyTextBox(this, bi.ka12405, getString(R.string.ka12405))) {
            return false;
        }


        if (!validatorClass.RangeTextBox(this, bi.ka12405, 3, 20, getString(R.string.ka12405), "Quantity")) {
            return false;
        }


        if (!validatorClass.EmptyTextBox(this, bi.ka12406, getString(R.string.ka12406))) {
            return false;
        }


        if (!validatorClass.RangeTextBox(this, bi.ka12406, 3, 20, getString(R.string.ka12406), "Quantity")) {
            return false;
        }


        if (!validatorClass.EmptyTextBox(this, bi.ka12407, getString(R.string.ka12407))) {
            return false;
        }


        if (!validatorClass.RangeTextBox(this, bi.ka12407, 3, 20, getString(R.string.ka12407), "Quantity")) {
            return false;
        }


        if (!validatorClass.EmptyTextBox(this, bi.ka12408, getString(R.string.ka12408))) {
            return false;
        }


        if (!validatorClass.RangeTextBox(this, bi.ka12408, 3, 20, getString(R.string.ka12408), "Quantity")) {
            return false;
        }


        if (!validatorClass.EmptyTextBox(this, bi.ka12409, getString(R.string.ka12409))) {
            return false;
        }


        if (!validatorClass.RangeTextBox(this, bi.ka12409, 3, 20, getString(R.string.ka12409), "Quantity")) {
            return false;
        }


        if (!validatorClass.EmptyTextBox(this, bi.ka12410, getString(R.string.ka12410))) {
            return false;
        }


        if (!validatorClass.RangeTextBox(this, bi.ka12410, 3, 20, getString(R.string.ka12410), "Quantity")) {
            return false;
        }


        if (!validatorClass.EmptyTextBox(this, bi.ka12411, getString(R.string.ka12411))) {
            return false;
        }


        if (!validatorClass.RangeTextBox(this, bi.ka12411, 3, 20, getString(R.string.ka12411), "Quantity")) {
            return false;
        }


        if (!validatorClass.EmptyTextBox(this, bi.ka12412, getString(R.string.ka12412))) {
            return false;
        }


        if (!validatorClass.RangeTextBox(this, bi.ka12412, 3, 20, getString(R.string.ka12412), "Quantity")) {
            return false;
        }


        if (!validatorClass.EmptyTextBox(this, bi.ka12413, getString(R.string.ka12413))) {
            return false;
        }


        if (!validatorClass.RangeTextBox(this, bi.ka12413, 3, 20, getString(R.string.ka12413), "Quantity")) {
            return false;
        }


        if (!validatorClass.EmptyTextBox(this, bi.ka12414, getString(R.string.ka12414))) {
            return false;
        }


        if (!validatorClass.RangeTextBox(this, bi.ka12414, 3, 20, getString(R.string.ka12414), "Quantity")) {
            return false;
        }


        if (!validatorClass.EmptyTextBox(this, bi.ka12415, getString(R.string.ka12415))) {
            return false;
        }


        if (!validatorClass.RangeTextBox(this, bi.ka12415, 3, 20, getString(R.string.ka12415), "Quantity")) {
            return false;
        }


        if (!validatorClass.EmptyTextBox(this, bi.ka12416, getString(R.string.ka12415))) {
            return false;
        }


        if (!validatorClass.RangeTextBox(this, bi.ka12416, 3, 20, getString(R.string.ka12416), "Quantity")) {
            return false;
        }


        if (!validatorClass.EmptyTextBox(this, bi.ka12417, getString(R.string.ka12417))) {
            return false;
        }


        if (!validatorClass.RangeTextBox(this, bi.ka12417, 3, 20, getString(R.string.ka12417), "Quantity")) {
            return false;
        }


        if (!validatorClass.EmptyTextBox(this, bi.ka12418, getString(R.string.ka12418))) {
            return false;
        }


        if (!validatorClass.RangeTextBox(this, bi.ka12418, 3, 20, getString(R.string.ka12418), "Quantity")) {
            return false;
        }


        if (!validatorClass.EmptyTextBox(this, bi.ka12419, getString(R.string.ka12419))) {
            return false;
        }


        if (!validatorClass.RangeTextBox(this, bi.ka12419, 3, 20, getString(R.string.ka12419), "Quantity")) {
            return false;
        }


        if (validatorClass.EmptyTextBox(this, bi.ka12420, getString(R.string.ka12420))) {
            return false;
        }


        if (!validatorClass.RangeTextBox(this, bi.ka12420, 3, 20, getString(R.string.ka12420), "Quantity")) {
            return false;
        }

        return true;

    }

    public void BtnEnd() {

        Toast.makeText(this, "Processing End Section", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Ending Section", Toast.LENGTH_SHORT).show();

                finish();

                startActivity(new Intent(this, EndingActivity.class));

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
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

                startActivity(new Intent(this, EndingActivity.class));

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }


    private boolean UpdateDB() {

        //Long rowId;
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSA1();

        if (updcount > 0) {
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

}