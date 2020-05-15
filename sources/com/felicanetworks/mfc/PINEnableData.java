package com.felicanetworks.mfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.util.LogMgr;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PINEnableData extends Data {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.PINEnableData.C01141 */

        public PINEnableData createFromParcel(Parcel parcel) {
            LogMgr.log(4, "%s : in = %s", "000", parcel);
            LogMgr.log(4, "%s", "999");
            return new PINEnableData(parcel);
        }

        public PINEnableData[] newArray(int i) {
            LogMgr.log(4, "%s : size = %d", "000", Integer.valueOf(i));
            LogMgr.log(4, "%s", "999");
            return new PINEnableData[i];
        }
    };
    private static final String EXC_PIN = "The value must be from 0 to 0xffffffff.";
    private static final long MAX_PIN = 4294967295L;
    private static final long MIN_PIN = 0;
    public static final int TYPE = 8;
    private boolean enabling;
    private long pin;

    public PINEnableData(long j, boolean z) {
        LogMgr.log(4, "%s : pin = %d, enabling = %s", "000", Long.valueOf(j), Boolean.valueOf(z));
        setPIN(j);
        setEnabling(z);
        LogMgr.log(4, "%s", "999");
    }

    private void readFromParcel(Parcel parcel) {
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        boolean[] zArr = {false};
        this.pin = parcel.readLong();
        parcel.readBooleanArray(zArr);
        this.enabling = zArr[0];
        LogMgr.log(6, "%s : pin = %d, enabling = %s", "999", Long.valueOf(this.pin), Boolean.valueOf(this.enabling));
    }

    public void checkFormat() {
        LogMgr.log(4, "%s", "000");
        long j = this.pin;
        if (j < MIN_PIN || j > MAX_PIN) {
            LogMgr.log(1, "%s : Throw IllegalArgumentException EXC_PIN", "800");
            throw new IllegalArgumentException(EXC_PIN);
        } else {
            LogMgr.log(4, "%s", "999");
        }
    }

    public int describeContents() {
        return 0;
    }

    public long getPIN() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s : pin = %d", "999", Long.valueOf(this.pin));
        return this.pin;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.felicanetworks.mfc.util.LogMgr.log(int, java.lang.String, java.lang.Object, java.lang.Object):void
     arg types: [int, java.lang.String, java.lang.String, int]
     candidates:
      com.felicanetworks.mfc.util.LogMgr.log(int, java.lang.String, java.lang.Object[], long):void
      com.felicanetworks.mfc.util.LogMgr.log(int, java.lang.String, java.lang.Object, java.lang.Object):void */
    public int getType() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s : TYPE = %d", (Object) "999", (Object) 8);
        return 8;
    }

    public boolean isEnabling() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s : enabling = %s", "999", Boolean.valueOf(this.enabling));
        return this.enabling;
    }

    public void setEnabling(boolean z) {
        LogMgr.log(6, "%s : enabling = %s", "000", Boolean.valueOf(z));
        this.enabling = z;
        LogMgr.log(6, "%s", "999");
    }

    public void setPIN(long j) {
        Long valueOf = Long.valueOf(j);
        LogMgr.log(4, "%s : pin = %d", "000", valueOf);
        if (j < MIN_PIN || j > MAX_PIN) {
            LogMgr.log(1, "%s : Throw IllegalArgumentException EXC_PIN", "800");
            throw new IllegalArgumentException(EXC_PIN);
        }
        this.pin = j;
        LogMgr.log(4, "%s : this.pin = %d", "999", valueOf);
    }

    public void writeToParcel(Parcel parcel, int i) {
        LogMgr.log(4, "%s : out = %s, flag = %d", "000", parcel, Integer.valueOf(i));
        boolean[] zArr = {this.enabling};
        parcel.writeLong(this.pin);
        parcel.writeBooleanArray(zArr);
        LogMgr.log(4, "%s : pin = %d, enabling = %s", "999", Long.valueOf(this.pin), Boolean.valueOf(this.enabling));
    }

    private PINEnableData(Parcel parcel) {
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        readFromParcel(parcel);
        LogMgr.log(6, "%s", "999");
    }
}
