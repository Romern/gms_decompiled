package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AdSizeParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C0340g();

    /* renamed from: a */
    public final String f8140a;

    /* renamed from: b */
    public final int f8141b;

    /* renamed from: c */
    public final int f8142c;

    /* renamed from: d */
    public final boolean f8143d;

    /* renamed from: e */
    public final int f8144e;

    /* renamed from: f */
    public final int f8145f;

    /* renamed from: g */
    public final AdSizeParcel[] f8146g;

    /* renamed from: h */
    public final boolean f8147h;

    /* renamed from: i */
    public final boolean f8148i;

    /* renamed from: j */
    public boolean f8149j;

    /* renamed from: k */
    public boolean f8150k;

    /* renamed from: l */
    public boolean f8151l;

    /* renamed from: m */
    public boolean f8152m;

    /* renamed from: n */
    public boolean f8153n;

    public AdSizeParcel() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false);
    }

    public AdSizeParcel(String str, int i, int i2, boolean z, int i3, int i4, AdSizeParcel[] adSizeParcelArr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.f8140a = str;
        this.f8141b = i;
        this.f8142c = i2;
        this.f8143d = z;
        this.f8144e = i3;
        this.f8145f = i4;
        this.f8146g = adSizeParcelArr;
        this.f8147h = z2;
        this.f8148i = z3;
        this.f8149j = z4;
        this.f8150k = z5;
        this.f8151l = z6;
        this.f8152m = z7;
        this.f8153n = z8;
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
        see.m35046a(parcel, 2, this.f8140a, false);
        see.m35063b(parcel, 3, this.f8141b);
        see.m35063b(parcel, 4, this.f8142c);
        see.m35051a(parcel, 5, this.f8143d);
        see.m35063b(parcel, 6, this.f8144e);
        see.m35063b(parcel, 7, this.f8145f);
        see.m35057a(parcel, 8, this.f8146g, i);
        see.m35051a(parcel, 9, this.f8147h);
        see.m35051a(parcel, 10, this.f8148i);
        see.m35051a(parcel, 11, this.f8149j);
        see.m35051a(parcel, 12, this.f8150k);
        see.m35051a(parcel, 13, this.f8151l);
        see.m35051a(parcel, 14, this.f8152m);
        see.m35051a(parcel, 15, this.f8153n);
        see.m35062b(parcel, a);
    }
}
