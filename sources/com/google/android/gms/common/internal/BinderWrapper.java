package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = new san();

    /* renamed from: a */
    public IBinder f30210a;

    public BinderWrapper() {
        this.f30210a = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f30210a);
    }

    public BinderWrapper(IBinder iBinder) {
        this.f30210a = iBinder;
    }

    public BinderWrapper(Parcel parcel) {
        this.f30210a = null;
        this.f30210a = parcel.readStrongBinder();
    }
}
