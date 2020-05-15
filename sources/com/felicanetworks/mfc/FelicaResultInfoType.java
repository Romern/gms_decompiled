package com.felicanetworks.mfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.util.LogMgr;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FelicaResultInfoType extends FelicaResultInfo implements Parcelable {
    protected Object value;

    public FelicaResultInfoType(int i, String str) {
        super(i, str);
        LogMgr.log(4, "%s exceptionType=%d message=%s", "000", Integer.valueOf(i), str);
        LogMgr.log(4, "%s", "999");
    }

    public Object getValue() {
        LogMgr.log(4, "%s", "000");
        LogMgr.log(4, "%s value = %s", "999", this.value);
        return this.value;
    }

    /* access modifiers changed from: protected */
    public void readFromParcel(Parcel parcel) {
        LogMgr.log(7, "%s", "000");
        super.readFromParcel(parcel);
        LogMgr.log(7, "%s", "999");
    }

    public void writeToParcel(Parcel parcel, int i) {
        LogMgr.log(7, "%s", "000");
        super.writeToParcel(parcel, i);
        LogMgr.log(7, "%s", "999");
    }

    public FelicaResultInfoType(int i, String str, int i2, int i3) {
        super(i, str, i2, i3);
        LogMgr.log(4, "%s exceptionType=%d message=%s id=%d type=%d", "000", Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3));
        LogMgr.log(4, "%s", "999");
    }

    public FelicaResultInfoType(int i, String str, int i2, int i3, int i4, int i5) {
        super(i, str, i2, i3, i4, i5);
        LogMgr.log(4, "%s exceptionType=%d message=%s id=%d type=%d statusFlag1=%d statusFlag2=%d", "000", Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        LogMgr.log(4, "%s", "999");
    }

    public FelicaResultInfoType(Object obj) {
        LogMgr.log(4, "%s value=%s", "000", obj);
        this.value = obj;
    }
}
