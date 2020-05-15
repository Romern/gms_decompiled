package com.felicanetworks.mfc.mfi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CardAdditionalInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.mfi.CardAdditionalInfo.C01331 */

        public CardAdditionalInfo createFromParcel(Parcel parcel) {
            return new CardAdditionalInfo(parcel);
        }

        public CardAdditionalInfo[] newArray(int i) {
            return new CardAdditionalInfo[i];
        }
    };
    protected String mCid;
    protected ArrayList mLinkageInfoList;

    protected CardAdditionalInfo(Parcel parcel) {
        this.mCid = parcel.readString();
        this.mLinkageInfoList = parcel.createTypedArrayList(LinkageInfo.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public String getCid() {
        return this.mCid;
    }

    public ArrayList getLinkageInfoList() {
        return this.mLinkageInfoList;
    }

    public void setCid(String str) {
        this.mCid = str;
    }

    public void setLinkageInfoList(ArrayList arrayList) {
        this.mLinkageInfoList = arrayList;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mCid);
        parcel.writeTypedList(this.mLinkageInfoList);
    }

    public CardAdditionalInfo(String str, ArrayList arrayList) {
        this.mCid = str;
        this.mLinkageInfoList = arrayList;
    }
}
