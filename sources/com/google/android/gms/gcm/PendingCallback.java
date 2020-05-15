package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PendingCallback implements Parcelable, ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aalv();

    /* renamed from: a */
    public final IBinder f32802a;

    public PendingCallback(IBinder iBinder) {
        this.f32802a = iBinder;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f32802a);
    }

    public PendingCallback(Parcel parcel) {
        this.f32802a = parcel.readStrongBinder();
    }
}
