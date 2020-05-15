package com.felicanetworks.mfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.util.LogMgr;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PushStartBrowserSegment extends PushSegment {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.PushStartBrowserSegment.C01231 */

        public PushStartBrowserSegment createFromParcel(Parcel parcel) {
            LogMgr.log(6, "%s", "000");
            LogMgr.log(6, "%s", "999");
            return new PushStartBrowserSegment(parcel);
        }

        public PushStartBrowserSegment[] newArray(int i) {
            LogMgr.log(6, "%s", "000");
            LogMgr.log(6, "%s", "999");
            return new PushStartBrowserSegment[i];
        }
    };
    private String browserStartupParam;
    private String url;

    private PushStartBrowserSegment(Parcel parcel) {
        LogMgr.log(6, "%s", "000");
        readFromParcel(parcel);
        LogMgr.log(6, "%s", "999");
    }

    private void readFromParcel(Parcel parcel) {
        LogMgr.log(6, "%s", "000");
        if (parcel != null) {
            this.activateType = 2;
            this.url = parcel.readString();
            this.browserStartupParam = parcel.readString();
            checkFormat();
            LogMgr.log(6, "%s", "999");
            return;
        }
        LogMgr.log(1, "%s", "700");
        throw new IllegalArgumentException();
    }

    public void checkFormat() {
        LogMgr.log(6, "%s", "000");
        if (getType() != 2 || this.url == null) {
            LogMgr.log(1, "%s", "700");
            throw new IllegalArgumentException();
        } else {
            LogMgr.log(6, "%s", "999");
        }
    }

    public int describeContents() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s", "999");
        return 0;
    }

    public String getBrowserStartupParam() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s return=%s", "999", this.browserStartupParam);
        return this.browserStartupParam;
    }

    public String getURL() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s return=%s", "999", this.url);
        return this.url;
    }

    public void setBrowserStartupParam(String str) {
        LogMgr.log(6, "%s browserStartupParam=%s", "000", str);
        this.browserStartupParam = str;
        LogMgr.log(6, "%s", "999");
    }

    public void setURL(String str) {
        LogMgr.log(6, "%s url=%s", "000", str);
        if (str != null) {
            this.url = str;
            LogMgr.log(6, "%s", "999");
            return;
        }
        LogMgr.log(1, "%s", "700");
        throw new IllegalArgumentException();
    }

    public void writeToParcel(Parcel parcel, int i) {
        LogMgr.log(6, "%s", "000");
        parcel.writeString(this.url);
        parcel.writeString(this.browserStartupParam);
        LogMgr.log(6, "%s", "999");
    }

    public PushStartBrowserSegment(String str, String str2) {
        LogMgr.log(6, "%s", "000");
        if (str != null) {
            this.activateType = 2;
            this.url = str;
            this.browserStartupParam = str2;
            LogMgr.log(4, "%s url=%s", "001", str);
            LogMgr.log(4, "%s browserStartupParam=%s", "001", this.browserStartupParam);
            LogMgr.log(6, "%s", "999");
            return;
        }
        LogMgr.log(1, "%s", "700");
        throw new IllegalArgumentException();
    }
}
