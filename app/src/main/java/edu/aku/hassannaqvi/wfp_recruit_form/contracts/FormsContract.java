package edu.aku.hassannaqvi.wfp_recruit_form.contracts;

import android.database.Cursor;
import android.net.Uri;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class FormsContract {

    private String projectName = "KMC";
    private String surveyType = "BL";
    private String _ID = "";
    private String _UID = "";
    private String formDate = ""; // Date
    private String user = ""; // Interviewer
    private String istatus = ""; // Interview Status
    private String istatus88x = ""; // Interview Status
    private String sInfo = "";    // Info Section
    private String sA1 = "";
    private String sB1 = "";
    private String sB2 = "";

    private String sC2 = "";
    private String sC3 = "";
    private String sC1 = "";
    private String sC4 = "";
    private String sC5 = "";
    private String sC6 = "";
    private String sD1 = "";
    private String sD2 = "";
    private String sD3 = "";
    private String sE = "";
    private String sF = "";
    private String count = "";
    private String endingdatetime = "";
    private String gpsLat = "";
    private String gpsLng = "";
    private String gpsDT = "";
    private String gpsAcc = "";
    private String gpsElev = "";
    private String deviceID = "";
    private String devicetagID = "";
    private String synced = "";
    private String synced_date = "";
    private String appversion;

    public static final String CONTENT_AUTHORITY = "edu.aku.hassannaqvi.kmc.contracts.provider";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    public static final String PATH_FORMS = "forms";

    public static final Uri URI_TABLE = Uri.parse(BASE_CONTENT_URI.toString() + "/" + PATH_FORMS);

    public static final String[] TOP_LEVEL_PATHS = {PATH_FORMS};

    public FormsContract() {
    }


    public FormsContract Sync(JSONObject jsonObject) throws JSONException {
        this.projectName = jsonObject.getString(FormsTable.COLUMN_PROJECTNAME);
        this.surveyType = jsonObject.getString(FormsTable.COLUMN_SURVEYTYPE);
        this._ID = jsonObject.getString(FormsTable.COLUMN__ID);
        this._UID = jsonObject.getString(FormsTable.COLUMN__UID);
        this.formDate = jsonObject.getString(FormsTable.COLUMN_FORMDATE);
        this.user = jsonObject.getString(FormsTable.COLUMN_USER);
        this.istatus = jsonObject.getString(FormsTable.COLUMN_ISTATUS);
        this.istatus88x = jsonObject.getString(FormsTable.COLUMN_ISTATUS88X);
        this.sInfo = jsonObject.getString(FormsTable.COLUMN_SINFO);
        this.sA1 = jsonObject.getString(FormsTable.COLUMN_SA1);
        this.sB1 = jsonObject.getString(FormsTable.COLUMN_SB1);
        this.sB2 = jsonObject.getString(FormsTable.COLUMN_SB2);

        this.sC2 = jsonObject.getString(FormsTable.COLUMN_SC2);
        this.sC3 = jsonObject.getString(FormsTable.COLUMN_SC3);


        this.sC1 = jsonObject.getString(FormsTable.COLUMN_SC1);
        this.sC2 = jsonObject.getString(FormsTable.COLUMN_SC2);
        this.sC3 = jsonObject.getString(FormsTable.COLUMN_SC3);
        this.sC4 = jsonObject.getString(FormsTable.COLUMN_SC4);
        this.sC5 = jsonObject.getString(FormsTable.COLUMN_SC5);
        this.sC6 = jsonObject.getString(FormsTable.COLUMN_SC6);
        this.sD1 = jsonObject.getString(FormsTable.COLUMN_SD1);
        this.sD2 = jsonObject.getString(FormsTable.COLUMN_SD2);
        this.sD3 = jsonObject.getString(FormsTable.COLUMN_SD3);
        this.sE = jsonObject.getString(FormsTable.COLUMN_SE);
        this.sF = jsonObject.getString(FormsTable.COLUMN_SF);
        this.count = jsonObject.getString(FormsTable.COLUMN_COUNT);
        this.endingdatetime= jsonObject.getString(FormsTable.COLUMN_ENDINGDATETIME);
        this.gpsLat = jsonObject.getString(FormsTable.COLUMN_GPSLAT);
        this.gpsLng = jsonObject.getString(FormsTable.COLUMN_GPSLNG);
        this.gpsDT = jsonObject.getString(FormsTable.COLUMN_GPSDT);
        this.gpsAcc = jsonObject.getString(FormsTable.COLUMN_GPSACC);
        this.gpsElev = jsonObject.getString(FormsTable.COLUMN_GPSELEV);
        this.deviceID = jsonObject.getString(FormsTable.COLUMN_DEVICEID);
        this.devicetagID = jsonObject.getString(FormsTable.COLUMN_DEVICETAGID);
        this.synced = jsonObject.getString(FormsTable.COLUMN_SYNCED);
        this.synced_date = jsonObject.getString(FormsTable.COLUMN_SYNCED_DATE);
        this.appversion = jsonObject.getString(FormsTable.COLUMN_APPVERSION);


        return this;

    }

    public FormsContract Hydrate(Cursor cursor) {
        this.projectName = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_PROJECTNAME));
        this.surveyType = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SURVEYTYPE));
        this._ID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN__ID));
        this._UID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN__UID));
        this.formDate = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_FORMDATE));
        this.user = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_USER));
        this.istatus = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ISTATUS));
        this.istatus88x = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ISTATUS88X));
        this.sInfo = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SINFO));
        this.sA1 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SA1));
        this.sB1 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SB1));
        this.sB2 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SB2));

        this.sC2 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SC2));
        this.sC3 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SC3));


        this.sC1 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SC1));
        this.sC2 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SC2));
        this.sC3 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SC3));
        this.sC4 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SC4));
        this.sC5 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SC5));
        this.sC6 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SC6));
        this.sD1 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SD1));
        this.sD2 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SD2));
        this.sD3 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SD3));
        this.sE = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SE));
        this.sF = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SF));
        this.count = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_COUNT));
        this.endingdatetime = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ENDINGDATETIME));
        this.gpsLat = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSLAT));
        this.gpsLng = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSLNG));
        this.gpsDT = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSDT));
        this.gpsAcc = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSACC));
        this.gpsElev = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSELEV));
        this.deviceID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DEVICEID));
        this.devicetagID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DEVICETAGID));
        this.synced = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SYNCED));
        this.synced_date = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SYNCED_DATE));
        this.appversion = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_APPVERSION));


        return this;

    }


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();

        json.put(FormsTable.COLUMN_PROJECTNAME, this.projectName == null ? JSONObject.NULL : this.projectName);
        json.put(FormsTable.COLUMN_SURVEYTYPE, this.surveyType == null ? JSONObject.NULL : this.surveyType);
        json.put(FormsTable.COLUMN__ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(FormsTable.COLUMN__UID, this._UID == null ? JSONObject.NULL : this._UID);
        json.put(FormsTable.COLUMN_FORMDATE, this.formDate == null ? JSONObject.NULL : this.formDate);
        json.put(FormsTable.COLUMN_USER, this.user == null ? JSONObject.NULL : this.user);
        json.put(FormsTable.COLUMN_ISTATUS, this.istatus == null ? JSONObject.NULL : this.istatus);
        json.put(FormsTable.COLUMN_ISTATUS88X, this.istatus88x == null ? JSONObject.NULL : this.istatus88x);
        json.put(FormsTable.COLUMN_SINFO, this.sInfo == null ? JSONObject.NULL : this.sInfo);
        json.put(FormsTable.COLUMN_SA1, this.sA1 == null ? JSONObject.NULL : this.sA1);
        json.put(FormsTable.COLUMN_SB1, this.sB1 == null ? JSONObject.NULL : this.sB1);
        json.put(FormsTable.COLUMN_SB2, this.sB2 == null ? JSONObject.NULL : this.sB2);
        json.put(FormsTable.COLUMN_SC1, this.sC1 == null ? JSONObject.NULL : this.sC1);
        json.put(FormsTable.COLUMN_SC2, this.sC2 == null ? JSONObject.NULL : this.sC2);
        json.put(FormsTable.COLUMN_SC3, this.sC3 == null ? JSONObject.NULL : this.sC3);
        json.put(FormsTable.COLUMN_SC4, this.sC4 == null ? JSONObject.NULL : this.sC4);
        json.put(FormsTable.COLUMN_SC5, this.sC5 == null ? JSONObject.NULL : this.sC5);
        json.put(FormsTable.COLUMN_SC6, this.sC6 == null ? JSONObject.NULL : this.sC6);
        json.put(FormsTable.COLUMN_SD1, this.sD1 == null ? JSONObject.NULL : this.sD1);
        json.put(FormsTable.COLUMN_SD2, this.sD2 == null ? JSONObject.NULL : this.sD2);
        json.put(FormsTable.COLUMN_SD3, this.sD3 == null ? JSONObject.NULL : this.sD3);
        json.put(FormsTable.COLUMN_SE, this.sE == null ? JSONObject.NULL : this.sE);
        json.put(FormsTable.COLUMN_SF, this.sF == null ? JSONObject.NULL : this.sF);
        json.put(FormsTable.COLUMN_COUNT, this.count == null ? JSONObject.NULL : this.count);
        json.put(FormsTable.COLUMN_ENDINGDATETIME, this.endingdatetime == null ? JSONObject.NULL : this.endingdatetime);
        json.put(FormsTable.COLUMN_GPSELEV, this.gpsElev == null ? JSONObject.NULL : this.gpsElev);


        if (!this.sInfo.equals("")) {
            json.put(FormsTable.COLUMN_SINFO, this.sInfo.equals("") ? JSONObject.NULL : new JSONObject(this.sInfo));
        }


        if (!this.sA1.equals("")) {

            json.put(FormsTable.COLUMN_SA1, this.sA1.equals("") ? JSONObject.NULL : new JSONObject(this.sA1));
        }


        if (!this.sB1.equals("")) {

            json.put(FormsTable.COLUMN_SB1, this.sB1.equals("") ? JSONObject.NULL : new JSONObject(this.sB1));
        }


        if (!this.sB2.equals("")) {
            json.put(FormsTable.COLUMN_SB2, this.sB2.equals("") ? JSONObject.NULL : new JSONObject(this.sB2));
        }


        if (!this.sC2.equals("")) {
            json.put(FormsTable.COLUMN_SC2, this.sC2.equals("") ? JSONObject.NULL : new JSONObject(this.sC2));
        }


        if (!this.sC3.equals("")) {
            json.put(FormsTable.COLUMN_SC3, this.sC3.equals("") ? JSONObject.NULL : new JSONObject(this.sC3));
        }


        if (!this.count.equals("")) {

            json.put(FormsTable.COLUMN_COUNT, this.count.equals("") ? JSONObject.NULL : new JSONObject(this.count));
        }


        /*if (!this.sA4.equals("")) {

            json.put(FormsTable.COLUMN_SA3, this.sA4.equals("") ? JSONObject.NULL : new JSONObject(this.sA4));
        }
        if (!this.sA5.equals("")) {

            json.put(FormsTable.COLUMN_SA5, this.sA5.equals("") ? JSONObject.NULL : new JSONObject(this.sA5));
        }
        if (!this.sB4.equals("")) {

            json.put(FormsTable.COLUMN_SB4, this.sB4.equals("") ? JSONObject.NULL : new JSONObject(this.sB4));
        }*/

        if (!this.sD1.equals("")) {

            json.put(FormsTable.COLUMN_SD1, this.sD1 == null ? JSONObject.NULL : new JSONObject(this.sD1));
        }
        if (!this.sD2.equals("")) {

            json.put(FormsTable.COLUMN_SD2, this.sD2 == null ? JSONObject.NULL : new JSONObject(this.sD2));
        }
        if (!this.sD3.equals("")) {

            json.put(FormsTable.COLUMN_SD3, this.sD3 == null ? JSONObject.NULL : new JSONObject(this.sD3));
        }

        if (!this.sE.equals("")) {

            json.put(FormsTable.COLUMN_SE, this.sE.equals("") ? JSONObject.NULL : new JSONObject(this.sE));
        }


        json.put(FormsTable.COLUMN_GPSLAT, this.gpsLat == null ? JSONObject.NULL : this.gpsLat);
        json.put(FormsTable.COLUMN_GPSLNG, this.gpsLng == null ? JSONObject.NULL : this.gpsLng);
        json.put(FormsTable.COLUMN_GPSDT, this.gpsDT == null ? JSONObject.NULL : this.gpsDT);
        json.put(FormsTable.COLUMN_GPSACC, this.gpsAcc == null ? JSONObject.NULL : this.gpsAcc);
        json.put(FormsTable.COLUMN_GPSELEV, this.gpsElev == null ? JSONObject.NULL : this.gpsElev);
        json.put(FormsTable.COLUMN_DEVICEID, this.deviceID == null ? JSONObject.NULL : this.deviceID);
        json.put(FormsTable.COLUMN_DEVICETAGID, this.devicetagID == null ? JSONObject.NULL : this.devicetagID);
        json.put(FormsTable.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
        json.put(FormsTable.COLUMN_SYNCED_DATE, this.synced_date == null ? JSONObject.NULL : this.synced_date);
        json.put(FormsTable.COLUMN_APPVERSION, this.appversion == null ? JSONObject.NULL : this.appversion);


        return json;
    }

    public String getEndingdatetime() {
        return endingdatetime;
    }

    public void setEndingdatetime(String endingdatetime) {
        this.endingdatetime = endingdatetime;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getSurveyType() {
        return surveyType;
    }

    public String get_ID() {
        return _ID;
    }

    public void set_ID(String _ID) {
        this._ID = _ID;
    }

    public String getUID() {
        return _UID;
    }

    public void setUID(String _UID) {
        this._UID = _UID;
    }

    public String getFormDate() {
        return formDate;
    }

    public void setFormDate(String formDate) {
        this.formDate = formDate;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getIstatus() {
        return istatus;
    }

    public void setIstatus(String istatus) {
        this.istatus = istatus;
    }


    public String getIstatus88x() {
        return istatus88x;
    }

    public void setIstatus88x(String istatus88x) {
        this.istatus88x = istatus88x;
    }


    public String getsInfo() {
        return sInfo;
    }

    public void setsInfo(String sInfo) {
        this.sInfo = sInfo;
    }


    public String getsA1() {
        return sA1;
    }

    public void setsA1(String sA1) {
        this.sA1 = sA1;
    }


    public String getsB2() {
        return sB2;
    }

    public void setsB2(String sB2) {
        this.sB2 = sB2;
    }


    public String getsB1() {
        return sB1;
    }

    public void setsB1(String sB1) {
        this.sB1 = sB1;
    }


    public String getsC1() {
        return sC1;
    }

    public void setsC1(String sC1) {
        this.sC1 = sC1;
    }

    public String getsC2() {
        return sC2;
    }

    public void setsC2(String sC2) {
        this.sC2 = sC2;
    }

    public String getsC3() {
        return sC3;
    }

    public void setsC3(String sC3) {
        this.sC3 = sC3;
    }

    public String getsC4() {
        return sC4;
    }

    public void setsC4(String sC4) {
        this.sC4 = sC4;
    }

    public String getsC5() {
        return sC5;
    }

    public void setsC5(String sC5) {
        this.sC5 = sC5;
    }

    public String getsC6() {
        return sC6;
    }

    public void setsC6(String sC6) {
        this.sC6 = sC6;
    }

    public String getsD1() {
        return sD1;
    }

    public void setsD1(String sD1) {
        this.sD1 = sD1;
    }

    public String getsD2() {
        return sD2;
    }

    public void setsD2(String sD2) {
        this.sD2 = sD2;
    }

    public String getsD3() {
        return sD3;
    }

    public void setsD3(String sD3) {
        this.sD3 = sD3;
    }

    public String getsE() {
        return sE;
    }

    public void setsE(String sE) {
        this.sE = sE;
    }

    public String getsF() {
        return sF;
    }

    public void setsF(String sF) {
        this.sF = sF;
    }

    public String getGpsElev() {
        return gpsElev;
    }

    public void setGpsElev(String gpsElev) {
        this.gpsElev = gpsElev;
    }

    public String getGpsLat() {
        return gpsLat;
    }

    public void setGpsLat(String gpsLat) {
        this.gpsLat = gpsLat;
    }

    public String getGpsLng() {
        return gpsLng;
    }

    public void setGpsLng(String gpsLng) {
        this.gpsLng = gpsLng;
    }

    public String getGpsDT() {
        return gpsDT;
    }

    public void setGpsDT(String gpsDT) {
        this.gpsDT = gpsDT;
    }

    public String getGpsAcc() {
        return gpsAcc;
    }

    public void setGpsAcc(String gpsAcc) {
        this.gpsAcc = gpsAcc;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getDevicetagID() {
        return devicetagID;
    }

    public void setDevicetagID(String devicetagID) {
        this.devicetagID = devicetagID;
    }

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSynced_date() {
        return synced_date;
    }

    public void setSynced_date(String synced_date) {
        this.synced_date = synced_date;
    }

    public String getAppversion() {
        return appversion;
    }

    public void setAppversion(String appversion) {
        this.appversion = appversion;
    }

    public static abstract class FormsTable implements BaseColumns {

        public static final String TABLE_NAME = "forms";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECTNAME = "projectname";
        public static final String COLUMN_SURVEYTYPE = "surveytype";
        public static final String COLUMN__ID = "_id";
        public static final String COLUMN__UID = "_uid";
        public static final String COLUMN_FORMDATE = "formdate";
        public static final String COLUMN_USER = "user";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_ISTATUS88X = "istatus88x";
        public static final String COLUMN_SINFO = "sinfo";
        public static final String COLUMN_SA1 = "sa1";
        public static final String COLUMN_SB1 = "sb1";
        public static final String COLUMN_SB2 = "sb2";
        public static final String COLUMN_SC1 = "sc1";
        public static final String COLUMN_SC2 = "sc2";
        public static final String COLUMN_SC3 = "sc3";
        public static final String COLUMN_SC4 = "sc4";
        public static final String COLUMN_SC5 = "sc5";
        public static final String COLUMN_SC6 = "sc6";
        public static final String COLUMN_SD1 = "sd1";
        public static final String COLUMN_SD2 = "sd2";
        public static final String COLUMN_SD3 = "sd3";
        public static final String COLUMN_SE = "se";
        public static final String COLUMN_SF = "sf";
        public static final String COLUMN_COUNT = "count";
        public static final String COLUMN_ENDINGDATETIME = "endingdatetime";
        public static final String COLUMN_GPSLAT = "gpslat";
        public static final String COLUMN_GPSLNG = "gpslng";
        public static final String COLUMN_GPSDT = "gpsdt";
        public static final String COLUMN_GPSACC = "gpsacc";
        public static final String COLUMN_GPSELEV = "gpselev";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";

        public static String _URL = "forms.php";

        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendEncodedPath(PATH_FORMS).build();

        // Accessing content directory and item
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd." + CONTENT_AUTHORITY + ".forms";
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd." + CONTENT_AUTHORITY + ".forms";

        public static Uri buildCountryUri(String uid) {
            return CONTENT_URI.buildUpon().appendEncodedPath(uid).build();
        }

        public static String getCountryId(Uri uri) {
            return uri.getPathSegments().get(1);
        }
    }
}