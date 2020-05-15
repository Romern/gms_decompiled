package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Route extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adgu();

    /* renamed from: a */
    public final String f79189a;

    /* renamed from: b */
    public final int f79190b;

    /* renamed from: c */
    public final String f79191c;

    /* renamed from: d */
    public final String f79192d;

    /* renamed from: e */
    public final String f79193e;

    /* renamed from: f */
    public final String f79194f;

    /* renamed from: g */
    public final String f79195g;

    public Route(String str, int i, String str2, String str3, String str4, String str5, String str6) {
        sdo.m34977c(str);
        this.f79189a = str;
        this.f79190b = i;
        this.f79191c = str2;
        this.f79192d = str3;
        this.f79193e = str4;
        this.f79194f = str5;
        this.f79195g = str6;
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
        see.m35046a(parcel, 2, this.f79189a, false);
        see.m35063b(parcel, 3, this.f79190b);
        see.m35046a(parcel, 4, this.f79191c, false);
        see.m35046a(parcel, 5, this.f79192d, false);
        see.m35046a(parcel, 6, this.f79193e, false);
        see.m35046a(parcel, 7, this.f79194f, false);
        see.m35046a(parcel, 8, this.f79195g, false);
        see.m35046a(parcel, 9, this.f79193e, false);
        see.m35062b(parcel, a);
    }
}
