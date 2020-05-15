package com.felicanetworks.mfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.util.LogMgr;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FelicaResultInfoInt extends FelicaResultInfoType implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.FelicaResultInfoInt.C01061 */

        public FelicaResultInfoInt createFromParcel(Parcel parcel) {
            LogMgr.log(4, "%s : in = %s", "000", parcel);
            LogMgr.log(4, "%s", "999");
            return new FelicaResultInfoInt(parcel);
        }

        public FelicaResultInfoInt[] newArray(int i) {
            LogMgr.log(4, "%s : size = %s", "000", Integer.valueOf(i));
            LogMgr.log(4, "%s", "999");
            return new FelicaResultInfoInt[i];
        }
    };
    private static final int VALUE_IS_EMPTY = 0;
    private static final int VALUE_IS_NOTEMPTY = 1;

    public FelicaResultInfoInt(int i, String str) {
        super(i, str);
        LogMgr.log(4, "%s : exceptionType = %d, message = %s", "000", Integer.valueOf(i), str);
        LogMgr.log(4, "%s", "999");
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void readFromParcel(Parcel parcel) {
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        super.readFromParcel(parcel);
        if (parcel.readInt() == 1) {
            LogMgr.log(7, "%s", "001");
            this.value = Integer.valueOf(parcel.readInt());
        }
        LogMgr.log(6, "%s : value = %s", "999", this.value);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        LogMgr.log(4, "%s : out = %s, flag = %d", "000", parcel, Integer.valueOf(i));
        if (this.value == null) {
            LogMgr.log(7, "%s", "001");
            parcel.writeInt(0);
        } else {
            LogMgr.log(7, "%s", "002");
            parcel.writeInt(1);
            parcel.writeInt(((Integer) this.value).intValue());
        }
        LogMgr.log(4, "%s", "999");
    }

    public FelicaResultInfoInt(int i, String str, int i2, int i3) {
        super(i, str, i2, i3);
        LogMgr.log(4, "%s : exceptionType = %d, message = %s, id = %d, type = %d", "000", Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3));
        LogMgr.log(4, "%s", "999");
    }

    public FelicaResultInfoInt(int i, String str, int i2, int i3, int i4, int i5) {
        super(i, str, i2, i3, i4, i5);
        LogMgr.log(4, "%s : exceptionType = %d, message = %s, id = %d, type = %d, statusFlag1 = %d, statusFlag = %d", "000", Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        LogMgr.log(4, "%s", "999");
    }

    private FelicaResultInfoInt(Parcel parcel) {
        super(null);
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        readFromParcel(parcel);
        LogMgr.log(6, "%s", "999");
    }

    public FelicaResultInfoInt(Integer num) {
        super(num);
        LogMgr.log(4, "%s : value = %s", "000", num);
        LogMgr.log(4, "%s", "999");
    }
}
