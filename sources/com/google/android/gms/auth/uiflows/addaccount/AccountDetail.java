package com.google.android.gms.auth.uiflows.addaccount;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountDetail extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new juy();

    /* renamed from: a */
    public final String f11290a;

    /* renamed from: b */
    public final String f11291b;

    /* renamed from: c */
    public final boolean f11292c;

    /* renamed from: d */
    public final String f11293d;

    /* renamed from: e */
    public final boolean f11294e;

    /* renamed from: f */
    public final Intent f11295f;

    /* renamed from: g */
    public final String f11296g;

    /* renamed from: h */
    public final boolean f11297h;

    public AccountDetail(String str, String str2, boolean z, String str3, boolean z2, Intent intent, String str4, boolean z3) {
        this.f11290a = str;
        this.f11291b = str2;
        this.f11292c = z;
        this.f11293d = str3;
        this.f11294e = z2;
        this.f11295f = intent;
        this.f11296g = str4;
        this.f11297h = z3;
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
        see.m35046a(parcel, 1, this.f11290a, false);
        see.m35046a(parcel, 2, this.f11291b, false);
        see.m35051a(parcel, 3, this.f11292c);
        see.m35046a(parcel, 4, this.f11293d, false);
        see.m35051a(parcel, 5, this.f11294e);
        see.m35040a(parcel, 6, this.f11295f, i, false);
        see.m35046a(parcel, 7, this.f11296g, false);
        see.m35051a(parcel, 8, this.f11297h);
        see.m35062b(parcel, a);
    }
}
