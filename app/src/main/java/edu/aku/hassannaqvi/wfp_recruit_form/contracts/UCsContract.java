package edu.aku.hassannaqvi.wfp_recruit_form.contracts;


import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

public class UCsContract {

    private static final String TAG = "UCs_CONTRACT";
    String uccode;
    String ucs;
    String taluka_code;

    public UCsContract() {
        // Default Constructor
    }

    public UCsContract Sync(JSONObject jsonObject) throws JSONException {
        this.uccode = jsonObject.getString(UCsTable.COLUMN_UCCODE);
        this.ucs = jsonObject.getString(UCsTable.COLUMN_UCS_NAME);
        this.taluka_code = jsonObject.getString(UCsTable.COLUMN_TALUKA_CODE);
        return this;
    }

    public UCsContract hydrate(Cursor cursor) {
        this.uccode = cursor.getString(cursor.getColumnIndex(UCsTable.COLUMN_UCCODE));
        this.ucs = cursor.getString(cursor.getColumnIndex(UCsTable.COLUMN_UCS_NAME));
        this.taluka_code = cursor.getString(cursor.getColumnIndex(UCsTable.COLUMN_TALUKA_CODE));
        return this;
    }

    public String getUccode() {
        return uccode;
    }

    public void setUccode(String uccode) {
        this.uccode = uccode;
    }

    public String getUcsName() {
        return ucs;
    }

    public void setUcs(String ucs) {
        this.ucs = ucs;
    }

    public String getTaluka_code() {
        return taluka_code;
    }

    public void setTaluka_code(String taluka_code) {
        this.taluka_code = taluka_code;
    }

    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();
        json.put(UCsTable.COLUMN_UCCODE, this.uccode == null ? JSONObject.NULL : this.uccode);
        json.put(UCsTable.COLUMN_UCS_NAME, this.ucs == null ? JSONObject.NULL : this.ucs);
        json.put(UCsTable.COLUMN_TALUKA_CODE, this.taluka_code == null ? JSONObject.NULL : this.taluka_code);
        return json;
    }


    public static abstract class UCsTable implements BaseColumns {

        public static final String TABLE_NAME = "ucs";
        public static final String COLUMN_UCCODE = "uc_code";
        public static final String COLUMN_UCS_NAME = "uc_name";
        public static final String COLUMN_TALUKA_CODE = "town_code";

        public static final String _URI = "ucs.php";
    }
}