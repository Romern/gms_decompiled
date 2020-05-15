package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class FusedLocationProviderResult extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new aejo();

    /* renamed from: a */
    public static final FusedLocationProviderResult f79417a = new FusedLocationProviderResult(Status.f30107a);

    /* renamed from: b */
    public final Status f79418b;

    public FusedLocationProviderResult(Status status) {
        this.f79418b = status;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f79418b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f79418b, i, false);
        see.m35062b(parcel, a);
    }
}
