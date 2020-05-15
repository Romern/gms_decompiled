package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CarInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nlr();

    /* renamed from: a */
    public String f29332a;

    /* renamed from: b */
    public String f29333b;

    /* renamed from: c */
    public String f29334c;

    /* renamed from: d */
    public String f29335d;

    /* renamed from: e */
    public int f29336e;

    /* renamed from: f */
    public int f29337f;

    /* renamed from: g */
    public boolean f29338g;

    /* renamed from: h */
    public int f29339h;

    /* renamed from: i */
    public String f29340i;

    /* renamed from: j */
    public String f29341j;

    /* renamed from: k */
    public String f29342k;

    /* renamed from: l */
    public String f29343l;

    /* renamed from: m */
    public boolean f29344m;

    /* renamed from: n */
    public boolean f29345n;

    /* renamed from: o */
    public boolean f29346o;

    /* renamed from: p */
    public String f29347p;

    /* renamed from: q */
    public String f29348q;

    public CarInfo() {
    }

    public final String toString() {
        return this.f29334c + " " + this.f29332a + " " + this.f29333b + " " + this.f29335d;
    }

    public CarInfo(String str, String str2, String str3, String str4, int i, int i2, boolean z, int i3, String str5, String str6, String str7, String str8, boolean z2, boolean z3, boolean z4, String str9, String str10) {
        this.f29332a = str;
        this.f29333b = str2;
        this.f29334c = str3;
        this.f29335d = str4;
        this.f29336e = i;
        this.f29337f = i2;
        this.f29338g = z;
        this.f29339h = i3;
        this.f29340i = str5;
        this.f29341j = str6;
        this.f29342k = str7;
        this.f29343l = str8;
        this.f29344m = z2;
        this.f29345n = z3;
        this.f29346o = z4;
        this.f29347p = str9;
        this.f29348q = str10;
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
        see.m35046a(parcel, 1, this.f29332a, false);
        see.m35046a(parcel, 2, this.f29333b, false);
        see.m35046a(parcel, 3, this.f29334c, false);
        see.m35046a(parcel, 4, this.f29335d, false);
        see.m35063b(parcel, 5, this.f29336e);
        see.m35063b(parcel, 6, this.f29337f);
        see.m35051a(parcel, 7, this.f29338g);
        see.m35063b(parcel, 8, this.f29339h);
        see.m35046a(parcel, 9, this.f29340i, false);
        see.m35046a(parcel, 10, this.f29341j, false);
        see.m35046a(parcel, 11, this.f29342k, false);
        see.m35046a(parcel, 12, this.f29343l, false);
        see.m35051a(parcel, 13, this.f29344m);
        see.m35051a(parcel, 14, this.f29345n);
        see.m35051a(parcel, 15, this.f29346o);
        see.m35046a(parcel, 16, this.f29347p, false);
        see.m35046a(parcel, 17, this.f29348q, false);
        see.m35062b(parcel, a);
    }
}
