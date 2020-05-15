package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GplusInfoResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ixo();

    /* renamed from: a */
    final int f10657a;

    /* renamed from: b */
    boolean f10658b;

    /* renamed from: c */
    String f10659c;

    /* renamed from: d */
    String f10660d;

    /* renamed from: e */
    String f10661e;

    /* renamed from: f */
    boolean f10662f;

    /* renamed from: g */
    boolean f10663g;

    /* renamed from: h */
    String f10664h;

    /* renamed from: i */
    String f10665i;

    /* renamed from: j */
    String f10666j;

    public GplusInfoResponse(int i, boolean z, String str, String str2, String str3, boolean z2, boolean z3, String str4, String str5, String str6) {
        this.f10657a = i;
        this.f10658b = z;
        this.f10659c = str;
        this.f10660d = str2;
        this.f10661e = str3;
        this.f10662f = z2;
        this.f10663g = z3;
        this.f10664h = str4;
        this.f10665i = str5;
        this.f10666j = str6;
    }

    public GplusInfoResponse(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f10657a = 1;
        this.f10658b = false;
        this.f10659c = str;
        this.f10660d = str2;
        this.f10661e = str3;
        this.f10664h = str4;
        this.f10665i = str5;
        this.f10662f = false;
        this.f10663g = false;
        this.f10666j = str6;
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
        see.m35063b(parcel, 1, this.f10657a);
        see.m35051a(parcel, 2, this.f10658b);
        see.m35046a(parcel, 3, this.f10659c, false);
        see.m35046a(parcel, 4, this.f10660d, false);
        see.m35046a(parcel, 5, this.f10661e, false);
        see.m35051a(parcel, 6, this.f10662f);
        see.m35051a(parcel, 7, this.f10663g);
        see.m35046a(parcel, 8, this.f10664h, false);
        see.m35046a(parcel, 9, this.f10665i, false);
        see.m35046a(parcel, 10, this.f10666j, false);
        see.m35062b(parcel, a);
    }
}
