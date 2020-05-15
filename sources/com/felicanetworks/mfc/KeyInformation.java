package com.felicanetworks.mfc;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class KeyInformation implements Parcelable {
    public static final int AES128 = 79;
    public static final int AES128_DES112 = 67;
    public static final int AES128_DES56 = 65;
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.KeyInformation.C01101 */

        public KeyInformation createFromParcel(Parcel parcel) {
            return new KeyInformation(parcel);
        }

        public KeyInformation[] newArray(int i) {
            return new KeyInformation[i];
        }
    };
    public static final int DES112 = 63;
    public static final int DES56 = 47;
    private int mAesVersion;
    private int mDesVersion;
    private int mKeyKind;

    public KeyInformation(int i, int i2, int i3) {
        this.mKeyKind = i;
        this.mAesVersion = i2;
        this.mDesVersion = i3;
    }

    private void readFromParcel(Parcel parcel) {
        this.mKeyKind = parcel.readInt();
        this.mAesVersion = parcel.readInt();
        this.mDesVersion = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public Integer getAesVersion() {
        int i = this.mKeyKind;
        if (i == 65 || i == 67 || i == 79) {
            return Integer.valueOf(this.mAesVersion);
        }
        return null;
    }

    public Integer getDesVersion() {
        int i = this.mKeyKind;
        if (i == 47 || i == 63 || i == 65 || i == 67) {
            return Integer.valueOf(this.mDesVersion);
        }
        return null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mKeyKind);
        parcel.writeInt(this.mAesVersion);
        parcel.writeInt(this.mDesVersion);
    }

    private KeyInformation(Parcel parcel) {
        readFromParcel(parcel);
    }
}
