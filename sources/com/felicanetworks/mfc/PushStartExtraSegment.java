package com.felicanetworks.mfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.util.LogMgr;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PushStartExtraSegment extends PushSegment {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.PushStartExtraSegment.C01241 */

        public PushStartExtraSegment createFromParcel(Parcel parcel) {
            LogMgr.log(6, "%s", "000");
            LogMgr.log(6, "%s", "999");
            return new PushStartExtraSegment(parcel);
        }

        public PushStartExtraSegment[] newArray(int i) {
            LogMgr.log(6, "%s", "000");
            LogMgr.log(6, "%s", "999");
            return new PushStartExtraSegment[i];
        }
    };

    private PushStartExtraSegment() {
    }

    private void readFromParcel(Parcel parcel) {
        LogMgr.log(6, "%s", "000");
        if (parcel != null) {
            this.activateType = parcel.readInt();
            this.pushData = new byte[parcel.readInt()];
            parcel.readByteArray(this.pushData);
            checkFormat();
            LogMgr.log(6, "%s", "999");
            return;
        }
        LogMgr.log(1, "%s", "700");
        throw new IllegalArgumentException();
    }

    public void checkFormat() {
    }

    public int describeContents() {
        return 0;
    }

    public byte getControlInfo() {
        return (byte) this.activateType;
    }

    public byte[] getSegmentParameter() {
        return this.pushData;
    }

    public void writeToParcel(Parcel parcel, int i) {
        LogMgr.log(6, "%s", "000");
        parcel.writeInt(this.activateType);
        parcel.writeInt(this.pushData.length);
        parcel.writeByteArray(this.pushData);
        LogMgr.log(6, "%s", "999");
    }

    public PushStartExtraSegment(byte b, byte[] bArr) {
        this.activateType = b;
        this.pushData = bArr;
    }

    private PushStartExtraSegment(Parcel parcel) {
        LogMgr.log(6, "%s", "000");
        readFromParcel(parcel);
        LogMgr.log(6, "%s", "999");
    }
}
