package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class HeadphoneStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lrs();

    /* renamed from: a */
    public final int f11712a;

    public HeadphoneStateImpl(int i) {
        this.f11712a = i;
    }

    public final String toString() {
        return Integer.toString(this.f11712a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f11712a);
        see.m35062b(parcel, a);
    }
}
