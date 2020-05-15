package com.felicanetworks.mfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.util.LogMgr;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PurseData extends Data {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.PurseData.C01171 */

        public PurseData createFromParcel(Parcel parcel) {
            LogMgr.log(4, "%s : in = %s", "000", parcel);
            LogMgr.log(4, "%s", "999");
            return new PurseData(parcel);
        }

        public PurseData[] newArray(int i) {
            LogMgr.log(4, "%s : size = %d", "000", Integer.valueOf(i));
            LogMgr.log(4, "%s", "999");
            return new PurseData[i];
        }
    };
    private static final String EXC_DATA = "The value must be from 0 to 0xffffffff.";
    private static final String EXC_EXEC_ID = "The value must be from 0 to 0xffff.";
    private static final String EXC_LENGTH = "The length must be 6.";
    private static final String EXC_NULL = "null is not allowed.";
    private static final long MAX_DATA = 4294967295L;
    private static final int MAX_EXEC_ID = 65535;
    private static final long MIN_DATA = 0;
    private static final int MIN_EXEC_ID = 0;
    public static final int TYPE = 3;
    private static final int USERDATA_LENGTH = 6;
    private long cashBackData;
    private int execID;
    private long purseData;
    private byte[] userData;

    public PurseData(long j, long j2, byte[] bArr, int i) {
        setPurseData(j);
        setCashBackData(j2);
        setUserData(bArr);
        setExecID(i);
    }

    private void readFromParcel(Parcel parcel) {
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        this.userData = new byte[6];
        this.purseData = parcel.readLong();
        this.cashBackData = parcel.readLong();
        parcel.readByteArray(this.userData);
        this.execID = parcel.readInt();
        LogMgr.log(6, "001 purseData=%d cashBackData=%d userData.length=%d execID=%d", Long.valueOf(this.purseData), Long.valueOf(this.cashBackData), Integer.valueOf(this.userData.length), Integer.valueOf(this.execID));
    }

    public void checkFormat() {
        int i = LogMgr.ERR;
        long j = this.purseData;
        if (j < MIN_DATA || j > MAX_DATA) {
            LogMgr.log(1, "%s : purseData = %d", "800", Long.valueOf(j));
            throw new IllegalArgumentException(EXC_DATA);
        }
        long j2 = this.cashBackData;
        if (j2 < MIN_DATA || j2 > MAX_DATA) {
            LogMgr.log(1, "%s : cashBackData = %d", "801", Long.valueOf(j2));
            throw new IllegalArgumentException(EXC_DATA);
        }
        byte[] bArr = this.userData;
        if (bArr == null) {
            LogMgr.log(1, "%s", "802");
            throw new IllegalArgumentException(EXC_NULL);
        } else if (bArr.length == 6) {
            int i2 = this.execID;
            if (i2 < 0 || i2 > MAX_EXEC_ID) {
                LogMgr.log(1, "%s : execID = %d", "804", Integer.valueOf(i2));
                throw new IllegalArgumentException(EXC_EXEC_ID);
            }
        } else {
            LogMgr.log(1, "%s", "803");
            throw new IllegalArgumentException(EXC_LENGTH);
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

    public long getPurseData() {
        return this.purseData;
    }

    public int getType() {
        return 3;
    }

    public byte[] getUserData() {
        return this.userData;
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

    public void setPurseData(long j) {
        if (j < MIN_DATA || j > MAX_DATA) {
            throw new IllegalArgumentException(EXC_DATA);
        }
        this.purseData = j;
    }

    public void setUserData(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException(EXC_NULL);
        } else if (bArr.length == 6) {
            this.userData = bArr;
        } else {
            throw new IllegalArgumentException(EXC_LENGTH);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        LogMgr.log(4, "%s : out = %s, flag = %d", "000", parcel, Integer.valueOf(i));
        LogMgr.log(6, "001 purseData=%d cashBackData=%d userData.length=%d execID=%d", Long.valueOf(this.purseData), Long.valueOf(this.cashBackData), Integer.valueOf(this.userData.length), Integer.valueOf(this.execID));
        parcel.writeLong(this.purseData);
        parcel.writeLong(this.cashBackData);
        parcel.writeByteArray(this.userData);
        parcel.writeInt(this.execID);
    }

    private PurseData(Parcel parcel) {
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        readFromParcel(parcel);
    }
}
