package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ExceptionParcel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new nqj();

    /* renamed from: a */
    public final Throwable f29407a;

    public ExceptionParcel(Throwable th) {
        this.f29407a = th;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f29407a);
    }
}
