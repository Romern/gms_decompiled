package com.google.android.gms.gcm.nts;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PendingCallback implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aaqb();

    /* renamed from: a */
    final IBinder f32834a;

    public PendingCallback(IBinder iBinder) {
        this.f32834a = iBinder;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f32834a);
    }

    public PendingCallback(Parcel parcel) {
        this.f32834a = parcel.readStrongBinder();
    }
}
