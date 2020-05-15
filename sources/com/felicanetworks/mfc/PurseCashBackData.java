package com.felicanetworks.mfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.util.LogMgr;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PurseCashBackData extends Data {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.PurseCashBackData.C01161 */

        public PurseCashBackData createFromParcel(Parcel parcel) {
            LogMgr.log(4, "%s : in = %s", "000", parcel);
            LogMgr.log(4, "%s", "999");
            return new PurseCashBackData(parcel);
        }

        public PurseCashBackData[] newArray(int i) {
            LogMgr.log(4, "%s : size = %d", "000", Integer.valueOf(i));
            LogMgr.log(4, "%s", "999");
            return new PurseCashBackData[i];
        }
    };
    private static final String EXC_DATA = "The value must be from 0 to 0xffffffff.";
    private static final String EXC_EXEC_ID = "The value must be from 0 to 0xffff.";
    private static final long MAX_DATA = 4294967295L;
    private static final int MAX_EXEC_ID = 65535;
    private static final long MIN_DATA = 0;
    private static final int MIN_EXEC_ID = 0;
    public static final int TYPE = 4;
    private long cashBackData;
    private int execID;

    public PurseCashBackData(long j, int i) {
        setCashBackData(j);
        setExecID(i);
    }

    private void readFromParcel(Parcel parcel) {
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        this.cashBackData = parcel.readLong();
        this.execID = parcel.readInt();
        LogMgr.log(6, "001 cashBackData=%d execID=%d", Long.valueOf(this.cashBackData), Integer.valueOf(this.execID));
    }

    public void checkFormat() {
        int i = LogMgr.ERR;
        long j = this.cashBackData;
        if (j < MIN_DATA || j > MAX_DATA) {
            LogMgr.log(1, "%s : cashBackData = %d", "800", Long.valueOf(j));
            throw new IllegalArgumentException(EXC_DATA);
        }
        int i2 = this.execID;
        if (i2 < 0 || i2 > MAX_EXEC_ID) {
            LogMgr.log(1, "%s : execID = %d", "801", Integer.valueOf(i2));
            throw new IllegalArgumentException(EXC_EXEC_ID);
        }
    }

    public int describeContents() {
        return 0;
    }

    public long getCashBackData() {
        return this.cashBackData;
    }

    public int getExecID() {
        return this.execID;
    }

    public int getType() {
        return 4;
    }

    public void setCashBackData(long j) {
        if (j < MIN_DATA || j > MAX_DATA) {
            throw new IllegalArgumentException(EXC_DATA);
        }
        this.cashBackData = j;
    }

    public void setExecID(int i) {
        if (i < 0 || i > MAX_EXEC_ID) {
            throw new IllegalArgumentException(EXC_EXEC_ID);
        }
        this.execID = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        LogMgr.log(4, "%s : out = %s, flag = %d", "000", parcel, Integer.valueOf(i));
        parcel.writeLong(this.cashBackData);
        parcel.writeInt(this.execID);
        LogMgr.log(6, "001 cashBackData=%d execID=%d", Long.valueOf(this.cashBackData), Integer.valueOf(this.execID));
    }

    private PurseCashBackData(Parcel parcel) {
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        readFromParcel(parcel);
    }
}
