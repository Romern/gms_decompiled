package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aeik();

    /* renamed from: a */
    public final boolean f79368a;

    /* renamed from: b */
    public final boolean f79369b;

    /* renamed from: c */
    public final boolean f79370c;

    /* renamed from: d */
    public final boolean f79371d;

    /* renamed from: e */
    public final boolean f79372e;

    /* renamed from: f */
    public final boolean f79373f;

    public LocationSettingsStates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f79368a = z;
        this.f79369b = z2;
        this.f79370c = z3;
        this.f79371d = z4;
        this.f79372e = z5;
        this.f79373f = z6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f79368a);
        see.m35051a(parcel, 2, this.f79369b);
        see.m35051a(parcel, 3, this.f79370c);
        see.m35051a(parcel, 4, this.f79371d);
        see.m35051a(parcel, 5, this.f79372e);
        see.m35051a(parcel, 6, this.f79373f);
        see.m35062b(parcel, a);
    }
}
