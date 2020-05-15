package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OnSyncMoreResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uul();

    /* renamed from: a */
    final boolean f30899a;

    public OnSyncMoreResponse(boolean z) {
        this.f30899a = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 2, this.f30899a);
        see.m35062b(parcel, a);
    }
}
