package com.felicanetworks.mfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.util.LogMgr;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FelicaResultInfoByteArray extends FelicaResultInfoType implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.FelicaResultInfoByteArray.C01041 */

        public FelicaResultInfoByteArray createFromParcel(Parcel parcel) {
            LogMgr.log(4, "%s : in = %s", "000", parcel);
            LogMgr.log(4, "%s", "999");
            return new FelicaResultInfoByteArray(parcel);
        }

        public FelicaResultInfoByteArray[] newArray(int i) {
            LogMgr.log(4, "%s : size = %d", "000", Integer.valueOf(i));
            LogMgr.log(4, "%s", "999");
            return new FelicaResultInfoByteArray[i];
        }
    };
    private static final int EMPTY_BYTE_ARRAY = -1;

    public FelicaResultInfoByteArray(int i, String str) {
        super(i, str);
        LogMgr.log(4, "%s : exceptionType = %d, message = %s", "001", Integer.valueOf(i), str);
        LogMgr.log(4, "%s", "999");
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void readFromParcel(Parcel parcel) {
        super.readFromParcel(parcel);
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        int readInt = parcel.readInt();
        if (readInt >= 0) {
            LogMgr.log(7, "%s", "001");
            this.value = new byte[readInt];
            parcel.readByteArray((byte[]) this.value);
        }
        LogMgr.log(6, "%s : value = %s", "999", this.value);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        LogMgr.log(4, "%s : out = %s, flag = %d", "000", parcel, Integer.valueOf(i));
        if (this.value == null) {
            LogMgr.log(7, "%s", "001");
            parcel.writeInt(-1);
        } else {
            LogMgr.log(7, "%s", "002");
            parcel.writeInt(((byte[]) this.value).length);
            parcel.writeByteArray((byte[]) this.value);
        }
        LogMgr.log(4, "%s", "999");
    }

    public FelicaResultInfoByteArray(int i, String str, int i2, int i3) {
        super(i, str, i2, i3);
        LogMgr.log(4, "%s : exceptionType = %d, message = %s, id = %d, type = %d", "001", Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3));
        LogMgr.log(4, "%s", "999");
    }

    public FelicaResultInfoByteArray(int i, String str, int i2, int i3, int i4, int i5) {
        super(i, str, i2, i3, i4, i5);
        LogMgr.log(4, "%s : exceptionType = %d, message = %s, id = %d, type = %d, statusFlag1 = %d, statusFlag2 = %d", "001", Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        LogMgr.log(4, "%s", "999");
    }

    private FelicaResultInfoByteArray(Parcel parcel) {
        super(null);
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        readFromParcel(parcel);
        LogMgr.log(6, "%s", "999");
    }

    public FelicaResultInfoByteArray(byte[] bArr) {
        super(bArr);
        LogMgr.log(4, "%s : value = %s", "001", bArr);
        LogMgr.log(4, "%s", "999");
    }
}
