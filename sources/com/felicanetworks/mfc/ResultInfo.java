package com.felicanetworks.mfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.util.LogMgr;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ResultInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.ResultInfo.C01321 */

        public ResultInfo createFromParcel(Parcel parcel) {
            LogMgr.log(4, "%s", "000");
            LogMgr.log(4, "%s : in = %s", "999", parcel);
            return new ResultInfo(parcel);
        }

        public ResultInfo[] newArray(int i) {
            LogMgr.log(4, "%s", "000");
            LogMgr.log(4, "%s : size = %d", "999", Integer.valueOf(i));
            return new ResultInfo[i];
        }
    };
    public static final int EXCEPTION_TYPE_FELICA = 1;
    public static final int EXCEPTION_TYPE_ILLEGAL_ARGUMENT = 32;
    public static final int EXCEPTION_TYPE_NONE = 0;
    public static final int EXCEPTION_TYPE_NUMBER_FORMAT = 34;
    public static final int EXCEPTION_TYPE_SECURITY = 33;
    protected int exceptionType;
    protected String message;

    public ResultInfo() {
        LogMgr.log(5, "%s", "000");
        this.exceptionType = 0;
        LogMgr.log(5, "%s", "999");
    }

    public int describeContents() {
        return 0;
    }

    public int getExceptionType() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s : exceptionType = %d", "999", Integer.valueOf(this.exceptionType));
        return this.exceptionType;
    }

    public String getMessage() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s : message = %s", "999", this.message);
        return this.message;
    }

    /* access modifiers changed from: protected */
    public void readFromParcel(Parcel parcel) {
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        this.exceptionType = parcel.readInt();
        this.message = parcel.readString();
        LogMgr.log(6, "%s : exceptionType = %d, message = %s", "999", Integer.valueOf(this.exceptionType), this.message);
    }

    public void writeToParcel(Parcel parcel, int i) {
        LogMgr.log(4, "%s : out = %s, flag = %d", "000", parcel, Integer.valueOf(i));
        parcel.writeInt(this.exceptionType);
        parcel.writeString(this.message);
        LogMgr.log(4, "%s", "999");
    }

    public ResultInfo(int i, String str) {
        LogMgr.log(5, "%s : exceptionType = %d, message= % s", "000", Integer.valueOf(i), str);
        this.exceptionType = i;
        this.message = str;
        LogMgr.log(5, "%s", "999");
    }

    protected ResultInfo(Parcel parcel) {
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        readFromParcel(parcel);
        LogMgr.log(6, "%s", "999");
    }
}
