package com.felicanetworks.mfc.mfi;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.util.LogMgr;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SeInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.mfi.SeInfo.C01401 */

        public SeInfo createFromParcel(Parcel parcel) {
            return new SeInfo(parcel);
        }

        public SeInfo[] newArray(int i) {
            return new SeInfo[i];
        }
    };
    private String mPlatformType;
    private String mSeId;
    private String mSeType;
    private String mSepId;

    protected SeInfo(Parcel parcel) {
        this.mSeId = parcel.readString();
        this.mSepId = parcel.readString();
        this.mPlatformType = parcel.readString();
        this.mSeType = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public String getPlatformType() {
        return this.mPlatformType;
    }

    public String getSeId() {
        return this.mSeId;
    }

    public String getSeType() {
        return this.mSeType;
    }

    public String getSepId() {
        return this.mSepId;
    }

    public void writeToParcel(Parcel parcel, int i) {
        LogMgr.log(4, "%s : out = %s, flag = %d", "000", parcel, Integer.valueOf(i));
        LogMgr.log(7, "001 seId=%d sepId=%d", this.mSeId, this.mSepId);
        parcel.writeString(this.mSeId);
        parcel.writeString(this.mSepId);
        parcel.writeString(this.mPlatformType);
        parcel.writeString(this.mSeType);
    }

    public SeInfo(String str, String str2, String str3, String str4) {
        this.mSeId = str;
        this.mSepId = str2;
        this.mPlatformType = str3;
        this.mSeType = str4;
    }
}
