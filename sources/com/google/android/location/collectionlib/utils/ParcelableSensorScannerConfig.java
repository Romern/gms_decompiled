package com.google.android.location.collectionlib.utils;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ParcelableSensorScannerConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bfin();

    /* renamed from: a */
    public final bfgy f150711a;

    public ParcelableSensorScannerConfig(Parcel parcel) {
        this.f150711a = new bfgy(parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readLong());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f150711a.f113851a);
        parcel.writeLong(this.f150711a.f113852b);
        parcel.writeLong(this.f150711a.f113853c);
        parcel.writeLong(this.f150711a.f113855e);
    }

    public ParcelableSensorScannerConfig(bfgy bfgy) {
        this.f150711a = bfgy;
    }
}
