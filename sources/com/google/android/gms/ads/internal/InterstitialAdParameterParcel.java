package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class InterstitialAdParameterParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C0318c();

    /* renamed from: a */
    public final boolean f8057a;

    /* renamed from: b */
    public final boolean f8058b;

    /* renamed from: c */
    public final String f8059c;

    /* renamed from: d */
    public final boolean f8060d;

    /* renamed from: e */
    public final float f8061e;

    /* renamed from: f */
    public final int f8062f;

    /* renamed from: g */
    public final boolean f8063g;

    /* renamed from: h */
    public final boolean f8064h;

    /* renamed from: i */
    public final boolean f8065i;

    public InterstitialAdParameterParcel(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this.f8057a = z;
        this.f8058b = z2;
        this.f8059c = str;
        this.f8060d = z3;
        this.f8061e = f;
        this.f8062f = i;
        this.f8063g = z4;
        this.f8064h = z5;
        this.f8065i = z6;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 2, this.f8057a);
        see.m35051a(parcel, 3, this.f8058b);
        see.m35046a(parcel, 4, this.f8059c, false);
        see.m35051a(parcel, 5, this.f8060d);
        see.m35034a(parcel, 6, this.f8061e);
        see.m35063b(parcel, 7, this.f8062f);
        see.m35051a(parcel, 8, this.f8063g);
        see.m35051a(parcel, 9, this.f8064h);
        see.m35051a(parcel, 10, this.f8065i);
        see.m35062b(parcel, a);
    }
}
