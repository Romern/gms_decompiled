package com.felicanetworks.mfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.util.LogMgr;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RandomData extends Data {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.RandomData.C01311 */

        public RandomData createFromParcel(Parcel parcel) {
            LogMgr.log(4, "%s : in = %s", "000", parcel);
            LogMgr.log(4, "%s", "999");
            return new RandomData(parcel);
        }

        public RandomData[] newArray(int i) {
            LogMgr.log(4, "%s : size = %d", "000", Integer.valueOf(i));
            LogMgr.log(4, "%s", "999");
            return new RandomData[i];
        }
    };
    public static final int TYPE = 1;
    private byte[] bytes;

    private RandomData(Parcel parcel) {
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        readFromParcel(parcel);
    }

    private void readFromParcel(Parcel parcel) {
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        byte[] bArr = new byte[getBytesLength()];
        this.bytes = bArr;
        parcel.readByteArray(bArr);
        Integer valueOf = Integer.valueOf(this.bytes.length);
        Byte valueOf2 = Byte.valueOf(this.bytes[0]);
        Byte valueOf3 = Byte.valueOf(this.bytes[1]);
        Byte valueOf4 = Byte.valueOf(this.bytes[2]);
        byte[] bArr2 = this.bytes;
        LogMgr.log(6, "001 bytes.length=%d bytes[]:%d %d %d ... %d", valueOf, valueOf2, valueOf3, valueOf4, Byte.valueOf(bArr2[bArr2.length - 1]));
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
        return 1;
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

    public RandomData(byte[] bArr) {
        setBytes(bArr);
    }
}
