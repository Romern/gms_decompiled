package com.google.android.location.quake;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ShakeVettingHints extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgsc();

    /* renamed from: a */
    public final long f150848a;

    /* renamed from: b */
    public final boolean f150849b;

    /* renamed from: c */
    public final boolean f150850c;

    /* renamed from: d */
    public final double f150851d;

    /* renamed from: e */
    public final double f150852e;

    /* renamed from: f */
    public final double f150853f;

    /* renamed from: g */
    public final double f150854g;

    /* renamed from: h */
    public final double f150855h;

    /* renamed from: i */
    public final double f150856i;

    /* renamed from: j */
    public final int f150857j;

    public ShakeVettingHints(long j, boolean z, boolean z2, double d, double d2, double d3, double d4, double d5, double d6, int i) {
        this.f150848a = j;
        this.f150849b = z;
        this.f150850c = z2;
        this.f150851d = d;
        this.f150852e = d2;
        this.f150853f = d3;
        this.f150854g = d4;
        this.f150855h = d5;
        this.f150856i = d6;
        this.f150857j = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 1, this.f150848a);
        see.m35051a(parcel, 2, this.f150849b);
        see.m35051a(parcel, 3, this.f150850c);
        see.m35033a(parcel, 4, this.f150851d);
        see.m35033a(parcel, 5, this.f150852e);
        see.m35033a(parcel, 6, this.f150853f);
        see.m35033a(parcel, 7, this.f150854g);
        see.m35033a(parcel, 8, this.f150855h);
        see.m35033a(parcel, 9, this.f150856i);
        see.m35063b(parcel, 10, this.f150857j);
        see.m35062b(parcel, a);
    }
}
