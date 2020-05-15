package com.felicanetworks.mfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.util.LogMgr;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PushStartMailerSegment extends PushSegment {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.PushStartMailerSegment.C01251 */

        public PushStartMailerSegment createFromParcel(Parcel parcel) {
            LogMgr.log(6, "%s", "000");
            LogMgr.log(6, "%s", "999");
            return new PushStartMailerSegment(parcel);
        }

        public PushStartMailerSegment[] newArray(int i) {
            LogMgr.log(6, "%s size=%d", "000", Integer.valueOf(i));
            LogMgr.log(6, "%s", "999");
            return new PushStartMailerSegment[i];
        }
    };
    private String body;
    private String[] ccAddress;
    private String mailerStartupParam;
    private String subject;
    private String[] toAddress;

    private PushStartMailerSegment(Parcel parcel) {
        LogMgr.log(6, "%s", "000");
        readFromParcel(parcel);
        LogMgr.log(6, "%s", "999");
    }

    private void readFromParcel(Parcel parcel) {
        LogMgr.log(6, "%s", "000");
        if (parcel != null) {
            this.activateType = 3;
            this.toAddress = parcel.createStringArray();
            this.ccAddress = parcel.createStringArray();
            this.subject = parcel.readString();
            this.body = parcel.readString();
            this.mailerStartupParam = parcel.readString();
            checkFormat();
            LogMgr.log(6, "%s", "999");
            return;
        }
        LogMgr.log(1, "%s", "700");
        throw new IllegalArgumentException();
    }

    public void checkFormat() {
        LogMgr.log(6, "%s", "000");
        if (getType() == 3) {
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

    public String getBody() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s return=%s", "999", this.body);
        return this.body;
    }

    public String[] getCcAddress() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s", "999");
        return this.ccAddress;
    }

    public String getMailerStartupParam() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s return=%s", "999", this.mailerStartupParam);
        return this.mailerStartupParam;
    }

    public String getSubject() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s return=%s", "999", this.subject);
        return this.subject;
    }

    public String[] getToAddress() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s", "999");
        return this.toAddress;
    }

    public void setBody(String str) {
        LogMgr.log(6, "%s body=%s", "000", str);
        LogMgr.log(6, "%s", "999");
        this.body = str;
    }

    public void setCcAddress(String[] strArr) {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s", "999");
        this.ccAddress = strArr;
    }

    public void setMailerStartupParam(String str) {
        LogMgr.log(6, "%s mailerStartupParam=%s", "000", str);
        LogMgr.log(6, "%s", "999");
        this.mailerStartupParam = str;
    }

    public void setSubject(String str) {
        LogMgr.log(6, "%s subject=%s", "000", str);
        LogMgr.log(6, "%s", "999");
        this.subject = str;
    }

    public void setToAddress(String[] strArr) {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s", "999");
        this.toAddress = strArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        LogMgr.log(6, "%s", "000");
        parcel.writeStringArray(this.toAddress);
        parcel.writeStringArray(this.ccAddress);
        parcel.writeString(this.subject);
        parcel.writeString(this.body);
        parcel.writeString(this.mailerStartupParam);
        LogMgr.log(6, "%s", "999");
    }

    public PushStartMailerSegment(String[] strArr, String[] strArr2, String str, String str2, String str3) {
        LogMgr.log(6, "%s", "000");
        this.activateType = 3;
        this.toAddress = strArr;
        this.ccAddress = strArr2;
        this.subject = str;
        this.body = str2;
        this.mailerStartupParam = str3;
        checkFormat();
        LogMgr.log(6, "%s", "999");
    }
}
