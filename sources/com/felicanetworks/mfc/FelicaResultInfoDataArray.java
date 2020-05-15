package com.felicanetworks.mfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.util.LogMgr;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FelicaResultInfoDataArray extends FelicaResultInfoType implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.FelicaResultInfoDataArray.C01051 */

        public FelicaResultInfoDataArray createFromParcel(Parcel parcel) {
            LogMgr.log(4, "%s : in = %s", "000", parcel);
            LogMgr.log(4, "%s", "999");
            return new FelicaResultInfoDataArray(parcel);
        }

        public FelicaResultInfoDataArray[] newArray(int i) {
            LogMgr.log(4, "%s : size = %d", "000", Integer.valueOf(i));
            LogMgr.log(4, "%s", "999");
            return new FelicaResultInfoDataArray[i];
        }
    };

    public FelicaResultInfoDataArray(int i, String str) {
        super(i, str);
        LogMgr.log(4, "%s exceptionType=%d message=%s", "000", Integer.valueOf(i), str);
        LogMgr.log(4, "%s", "999");
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void readFromParcel(Parcel parcel) {
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        super.readFromParcel(parcel);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(Data.class.getClassLoader());
        if (readParcelableArray != null) {
            int length = readParcelableArray.length;
            LogMgr.log(7, "001 length=%d", Integer.valueOf(length));
            this.value = new Data[length];
            for (int i = 0; i < readParcelableArray.length; i++) {
                ((Data[]) this.value)[i] = (Data) readParcelableArray[i];
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        LogMgr.log(4, "%s : out = %s, flag = %d", "000", parcel, Integer.valueOf(i));
        Object obj = this.value;
        if (obj != null) {
            i2 = ((Data[]) obj).length;
        } else {
            i2 = -1;
        }
        LogMgr.log(7, "001 length=%d", Integer.valueOf(i2));
        super.writeToParcel(parcel, i);
        parcel.writeParcelableArray((Parcelable[]) this.value, i);
    }

    public FelicaResultInfoDataArray(int i, String str, int i2, int i3) {
        super(i, str, i2, i3);
        LogMgr.log(4, "%s exceptionType=%d message=%s id=%d type=%d", "000", Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3));
        LogMgr.log(4, "%s", "999");
    }

    public FelicaResultInfoDataArray(int i, String str, int i2, int i3, int i4, int i5) {
        super(i, str, i2, i3, i4, i5);
        LogMgr.log(4, "%s exceptionType=%d message=%s id=%d type=%d statusFlag1=%d statusFlag2=%d", "000", Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        LogMgr.log(4, "%s", "999");
    }

    private FelicaResultInfoDataArray(Parcel parcel) {
        super(null);
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        readFromParcel(parcel);
    }

    public FelicaResultInfoDataArray(Data[] dataArr) {
        super(dataArr);
        LogMgr.log(4, "%s value=%s", "000", dataArr);
        LogMgr.log(4, "%s", "999");
    }
}
