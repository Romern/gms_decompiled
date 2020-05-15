package com.felicanetworks.mfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.util.LogMgr;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PushStartAppSegment extends PushSegment {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.PushStartAppSegment.C01221 */

        public PushStartAppSegment createFromParcel(Parcel parcel) {
            LogMgr.log(6, "%s", "000");
            LogMgr.log(6, "%s", "999");
            return new PushStartAppSegment(parcel);
        }

        public PushStartAppSegment[] newArray(int i) {
            LogMgr.log(6, "%s", "000");
            LogMgr.log(6, "%s", "999");
            return new PushStartAppSegment[i];
        }
    };
    private String appIdentificationCode;
    private String[] appStartupParam;
    private String appURL;

    private PushStartAppSegment(Parcel parcel) {
        LogMgr.log(6, "%s", "000");
        readFromParcel(parcel);
        LogMgr.log(6, "%s", "999");
    }

    private void readFromParcel(Parcel parcel) {
        LogMgr.log(6, "%s", "000");
        this.activateType = 1;
        if (parcel != null) {
            this.appURL = parcel.readString();
            this.appIdentificationCode = parcel.readString();
            this.appStartupParam = parcel.createStringArray();
            checkFormat();
            LogMgr.log(6, "%s", "999");
            return;
        }
        LogMgr.log(1, "%s", "700");
        throw new IllegalArgumentException();
    }

    public void checkFormat() {
        LogMgr.log(6, "%s", "000");
        if (getType() != 1 || this.appIdentificationCode == null) {
            LogMgr.log(1, "%s", "700");
            throw new IllegalArgumentException();
        } else {
            LogMgr.log(6, "%s", "000");
        }
    }

    public int describeContents() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s", "999");
        return 0;
    }

    public String getAppIdentificationCode() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s return=%s", "999", this.appIdentificationCode);
        return this.appIdentificationCode;
    }

    public String[] getAppStartupParam() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s", "999");
        return this.appStartupParam;
    }

    public String getAppURL() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s return=%s", "999", this.appURL);
        return this.appURL;
    }

    public void setAppIdentificationCode(String str) {
        LogMgr.log(6, "%s appIdentificationCode=%s", "000", str);
        if (str != null) {
            this.appIdentificationCode = str;
            LogMgr.log(6, "%s", "999");
            return;
        }
        LogMgr.log(1, "%s", "700");
        throw new IllegalArgumentException();
    }

    public void setAppStartupParam(String[] strArr) {
        LogMgr.log(6, "%s", "000");
        this.appStartupParam = strArr;
        LogMgr.log(6, "%s", "999");
    }

    public void setAppURL(String str) {
        LogMgr.log(6, "%s appURL=%s", "000", str);
        LogMgr.log(6, "%s", "999");
        this.appURL = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        LogMgr.log(6, "%s", "000");
        parcel.writeString(this.appURL);
        parcel.writeString(this.appIdentificationCode);
        parcel.writeStringArray(this.appStartupParam);
        LogMgr.log(6, "%s", "999");
    }

    public PushStartAppSegment(String str, String str2, String[] strArr) {
        LogMgr.log(6, "%s", "000");
        this.activateType = 1;
        this.appURL = str;
        this.appIdentificationCode = str2;
        this.appStartupParam = strArr;
        LogMgr.log(4, "%s appURL=%s", "001", str);
        LogMgr.log(4, "%s appIdentificationCode=%s", "001", this.appIdentificationCode);
        String[] strArr2 = this.appStartupParam;
        if (strArr2 != null) {
            for (String str3 : strArr2) {
                LogMgr.log(4, "%s appStartupParam=%s", "001", str3);
            }
        }
        checkFormat();
        LogMgr.log(6, "%s", "999");
    }
}
