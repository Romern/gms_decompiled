package com.felicanetworks.mfc.mfi;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CardInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.mfi.CardInfo.C01341 */

        public CardInfo createFromParcel(Parcel parcel) {
            return new CardInfo(parcel);
        }

        public CardInfo[] newArray(int i) {
            return new CardInfo[i];
        }
    };
    public static final int POSITION_BACKGROUND = 1;
    public static final int POSITION_FOREGROUND = 0;
    public static final int POSITION_NOT_APPLICABLE = 3;
    public static final int POSITION_PENDING = 2;
    public static final int STATUS_ACTIVE = 1;
    public static final int STATUS_IN_PROCESS = 0;
    public static final int STATUS_LOST = 2;
    public static final int TASK_DISABLE = 2;
    public static final int TASK_ENABLE = 1;
    public static final int TASK_ISSUE = 0;
    public static final int TASK_PERMANENT_DELETE = 3;
    protected String mCid;
    protected int mPosition;
    protected String mServiceId;
    protected int mState;
    protected int mTask;
    protected String mWalletAppId;

    protected CardInfo(Parcel parcel) {
        this.mCid = parcel.readString();
        this.mServiceId = parcel.readString();
        this.mWalletAppId = parcel.readString();
        this.mState = parcel.readInt();
        this.mPosition = parcel.readInt();
        this.mTask = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public int getCardPosition() {
        return this.mPosition;
    }

    public int getCardStatus() {
        return this.mState;
    }

    public String getCid() {
        return this.mCid;
    }

    public String getServiceId() {
        return this.mServiceId;
    }

    public int getTask() {
        return this.mTask;
    }

    public String getWalletAppId() {
        return this.mWalletAppId;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mCid);
        parcel.writeString(this.mServiceId);
        parcel.writeString(this.mWalletAppId);
        parcel.writeInt(this.mState);
        parcel.writeInt(this.mPosition);
        parcel.writeInt(this.mTask);
    }

    public CardInfo(String str, String str2, String str3, int i, int i2, int i3) {
        this.mCid = str;
        this.mServiceId = str2;
        this.mWalletAppId = str3;
        this.mState = i;
        this.mPosition = i2;
        this.mTask = i3;
    }
}
