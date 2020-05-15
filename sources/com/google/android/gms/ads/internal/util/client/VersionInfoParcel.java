package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class VersionInfoParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C0638m();

    /* renamed from: a */
    public String f8949a;

    /* renamed from: b */
    public int f8950b;

    /* renamed from: c */
    public int f8951c;

    /* renamed from: d */
    public boolean f8952d;

    /* renamed from: e */
    public boolean f8953e;

    /* JADX WARNING: Illegal instructions before constructor call */
    public VersionInfoParcel(int i, int i2) {
        this(r0.toString(), i, i2, true, false);
        StringBuilder sb = new StringBuilder(37);
        sb.append("afma-sdk-a-v");
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".0");
    }

    /* renamed from: a */
    public static VersionInfoParcel m5635a() {
        return new VersionInfoParcel(201515033, 201515033);
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
        see.m35046a(parcel, 2, this.f8949a, false);
        see.m35063b(parcel, 3, this.f8950b);
        see.m35063b(parcel, 4, this.f8951c);
        see.m35051a(parcel, 5, this.f8952d);
        see.m35051a(parcel, 6, this.f8953e);
        see.m35062b(parcel, a);
    }

    public VersionInfoParcel(String str, int i, int i2, boolean z, boolean z2) {
        this.f8949a = str;
        this.f8950b = i;
        this.f8951c = i2;
        this.f8952d = z;
        this.f8953e = z2;
    }
}
