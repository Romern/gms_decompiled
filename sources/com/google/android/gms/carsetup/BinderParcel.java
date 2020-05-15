package com.google.android.gms.carsetup;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BinderParcel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new oqy();

    /* renamed from: a */
    public final IBinder f29535a;

    public BinderParcel(IBinder iBinder) {
        this.f29535a = iBinder;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f29535a);
    }
}
