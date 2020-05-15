package com.felicanetworks.mfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.util.LogMgr;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PushNotifyAppSegment extends PushSegment {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.PushNotifyAppSegment.C01201 */

        public PushNotifyAppSegment createFromParcel(Parcel parcel) {
            LogMgr.log(6, "%s", "000");
            LogMgr.log(6, "%s", "999");
            return new PushNotifyAppSegment(parcel);
        }

        public PushNotifyAppSegment[] newArray(int i) {
            LogMgr.log(6, "%s", "000");
            LogMgr.log(6, "%s", "999");
            return new PushNotifyAppSegment[i];
        }
    };
    private String appIdentificationCode;
    private String[] appNotificationParam;

    private PushNotifyAppSegment(Parcel parcel) {
        LogMgr.log(6, "%s", "000");
        readFromParcel(parcel);
        LogMgr.log(6, "%s", "999");
    }

    private void readFromParcel(Parcel parcel) {
        LogMgr.log(6, "%s", "000");
        if (parcel != null) {
            this.activateType = 6;
            this.appIdentificationCode = parcel.readString();
            this.appNotificationParam = parcel.createStringArray();
            checkFormat();
            LogMgr.log(6, "%s", "999");
            return;
        }
        LogMgr.log(1, "%s", "700");
        throw new IllegalArgumentException();
    }

    public void checkFormat() {
        LogMgr.log(6, "%s", "000");
        if (getType() == 6) {
            LogMgr.log(6, "%s", "999");
        } else {
            LogMgr.log(1, "%s", "700");
            throw new IllegalArgumentException();
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

    public String[] getAppNotificationParam() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s", "999");
        return this.appNotificationParam;
    }

    public void setAppIdentificationCode(String str) {
        LogMgr.log(6, "%s appIdentificationCode=%s", "000", str);
        LogMgr.log(6, "%s", "999");
        this.appIdentificationCode = str;
    }

    public void setAppNotificationParam(String[] strArr) {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s", "999");
        this.appNotificationParam = strArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        LogMgr.log(6, "%s", "000");
        parcel.writeString(this.appIdentificationCode);
        parcel.writeStringArray(this.appNotificationParam);
        LogMgr.log(6, "%s", "999");
    }

    public PushNotifyAppSegment(String str, String[] strArr) {
        LogMgr.log(6, "%s", "000");
        this.activateType = 6;
        this.appIdentificationCode = str;
        this.appNotificationParam = strArr;
        LogMgr.log(4, "%s appIdentificationCode=%s", "001", str);
        LogMgr.log(4, "%s appNotificationParam=%s", "001", this.appNotificationParam);
        checkFormat();
        LogMgr.log(6, "%s", "999");
    }
}
