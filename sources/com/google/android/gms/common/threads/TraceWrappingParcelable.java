package com.google.android.gms.common.threads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TraceWrappingParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new soe();

    /* renamed from: a */
    public final Bundle f30389a;

    /* renamed from: b */
    public Object f30390b;

    /* renamed from: c */
    public Bundle f30391c;

    public TraceWrappingParcelable() {
        Bundle bundle = new Bundle();
        this.f30389a = bundle;
        bundle.putParcelable("gctthpwp", this);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }
}
