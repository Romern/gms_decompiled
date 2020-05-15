package com.felicanetworks.mfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.util.LogMgr;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CyclicData extends Data {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.CyclicData.C00961 */

        public CyclicData createFromParcel(Parcel parcel) {
            LogMgr.log(4, "%s : in = %s", "000", parcel);
            LogMgr.log(4, "%s", "999");
            return new CyclicData(parcel);
        }

        public CyclicData[] newArray(int i) {
            LogMgr.log(4, "%s : size = %d", "000", Integer.valueOf(i));
            LogMgr.log(4, "%s", "999");
            return new CyclicData[i];
        }
    };
    public static final int TYPE = 2;
    private byte[] bytes;

    private CyclicData(Parcel parcel) {
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        readFromParcel(parcel);
    }

    private void readFromParcel(Parcel parcel) {
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        int bytesLength = getBytesLength();
        byte[] bArr = new byte[bytesLength];
        parcel.readByteArray(bArr);
        setBytes(bArr);
        LogMgr.log(6, "001 bytes.length=%d bytes[]:%d %d %d ... %d", Integer.valueOf(bytesLength), Byte.valueOf(bArr[0]), Byte.valueOf(bArr[1]), Byte.valueOf(bArr[2]), Byte.valueOf(bArr[bytesLength - 1]));
    }

    public void checkFormat() {
        int i = LogMgr.ERR;
        checkBytes(this.bytes);
    }

    public int describeContents() {
        return 0;
    }

    public byte[] getBytes() {
        return this.bytes;
    }

    public int getType() {
        return 2;
    }

    public void setBytes(byte[] bArr) {
        checkBytes(bArr);
        this.bytes = bArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        LogMgr.log(4, "%s : out = %s, flag = %d", "000", parcel, Integer.valueOf(i));
        Integer valueOf = Integer.valueOf(this.bytes.length);
        Byte valueOf2 = Byte.valueOf(this.bytes[0]);
        Byte valueOf3 = Byte.valueOf(this.bytes[1]);
        Byte valueOf4 = Byte.valueOf(this.bytes[2]);
        byte[] bArr = this.bytes;
        LogMgr.log(6, "001 bytes.length=%d bytes[]:%d %d %d ... %d", valueOf, valueOf2, valueOf3, valueOf4, Byte.valueOf(bArr[bArr.length - 1]));
        parcel.writeByteArray(this.bytes);
    }

    public CyclicData(byte[] bArr) {
        setBytes(bArr);
    }
}
