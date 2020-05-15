package com.google.android.apps.nbu.paisa.inapp.aidl;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class IsReadyToPayRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ddk();

    /* renamed from: a */
    private final String f7600a;

    public IsReadyToPayRequest(Parcel parcel) {
        String readString = parcel.readString();
        bmxy.m108581a(readString);
        this.f7600a = readString;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7600a);
    }

    public IsReadyToPayRequest(String str) {
        this.f7600a = str;
    }
}
