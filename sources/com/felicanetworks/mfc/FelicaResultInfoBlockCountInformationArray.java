package com.felicanetworks.mfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.util.LogMgr;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FelicaResultInfoBlockCountInformationArray extends FelicaResultInfoType implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.FelicaResultInfoBlockCountInformationArray.C01021 */

        public FelicaResultInfoBlockCountInformationArray createFromParcel(Parcel parcel) {
            LogMgr.log(4, "%s : in = %s", "000", parcel);
            LogMgr.log(4, "%s", "999");
            return new FelicaResultInfoBlockCountInformationArray(parcel);
        }

        public FelicaResultInfoBlockCountInformationArray[] newArray(int i) {
            LogMgr.log(4, "%s : size = %d", "000", Integer.valueOf(i));
            LogMgr.log(4, "%s", "999");
            return new FelicaResultInfoBlockCountInformationArray[i];
        }
    };

    public FelicaResultInfoBlockCountInformationArray(int i, String str) {
        super(i, str);
        LogMgr.log(4, "%s : exceptionType = %d, message = %s", "000", Integer.valueOf(i), str);
        LogMgr.log(4, "%s", "999");
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void readFromParcel(Parcel parcel) {
        super.readFromParcel(parcel);
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(BlockCountInformation.class.getClassLoader());
        if (readParcelableArray != null) {
            LogMgr.log(7, "%s", "001");
            this.value = new BlockCountInformation[readParcelableArray.length];
            for (int i = 0; i < readParcelableArray.length; i++) {
                ((BlockCountInformation[]) this.value)[i] = (BlockCountInformation) readParcelableArray[i];
            }
        }
        LogMgr.log(6, "%s", "999");
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        LogMgr.log(4, "%s : out = %s, flag = %d", "000", parcel, Integer.valueOf(i));
        parcel.writeParcelableArray((Parcelable[]) this.value, i);
        LogMgr.log(4, "%s", "999");
    }

    public FelicaResultInfoBlockCountInformationArray(int i, String str, int i2, int i3) {
        super(i, str, i2, i3);
        LogMgr.log(4, "%s : exceptionType = %d, message = %s, id = %d, type = %d", "000", Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3));
        LogMgr.log(4, "%s", "999");
    }

    public FelicaResultInfoBlockCountInformationArray(int i, String str, int i2, int i3, int i4, int i5) {
        super(i, str, i2, i3, i4, i5);
        LogMgr.log(4, "%s : exceptionType = %d, message = %s, id = %d, type = %d, statusFlag1 = %d, statusFlag2 = %d", "000", Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        LogMgr.log(4, "%s", "999");
    }

    private FelicaResultInfoBlockCountInformationArray(Parcel parcel) {
        super(null);
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        readFromParcel(parcel);
        LogMgr.log(6, "%s", "999");
    }

    public FelicaResultInfoBlockCountInformationArray(BlockCountInformation[] blockCountInformationArr) {
        super(blockCountInformationArr);
        LogMgr.log(4, "%s : value = %s", "000", blockCountInformationArr);
        LogMgr.log(4, "%s", "999");
    }
}
