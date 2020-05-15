package com.google.android.libraries.bluetooth.fastpair;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class Event implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ayot();

    /* renamed from: f */
    public static ayou m94486f() {
        return new ayou();
    }

    /* renamed from: a */
    public abstract bvjc mo60332a();

    /* renamed from: b */
    public abstract long mo60333b();

    /* renamed from: c */
    public abstract Short mo60334c();

    /* renamed from: d */
    public abstract BluetoothDevice mo60335d();

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public abstract Exception mo60336e();

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(mo60332a().f156339L);
        parcel.writeLong(mo60333b());
        parcel.writeValue(mo60334c());
        parcel.writeParcelable(mo60335d(), 0);
        parcel.writeSerializable(mo60336e());
    }
}
