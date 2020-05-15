package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PasswordCheckRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ixu();

    /* renamed from: a */
    final int f10674a;

    /* renamed from: b */
    public String f10675b;

    /* renamed from: c */
    public String f10676c;

    /* renamed from: d */
    public String f10677d;

    /* renamed from: e */
    public String f10678e;

    /* renamed from: f */
    public AppDescription f10679f;

    public PasswordCheckRequest(int i, String str, String str2, String str3, String str4, AppDescription appDescription) {
        this.f10674a = i;
        this.f10675b = str;
        this.f10676c = str2;
        this.f10677d = str3;
        this.f10678e = str4;
        this.f10679f = appDescription;
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
        see.m35063b(parcel, 1, this.f10674a);
        see.m35046a(parcel, 2, this.f10675b, false);
        see.m35046a(parcel, 3, this.f10676c, false);
        see.m35046a(parcel, 4, this.f10677d, false);
        see.m35046a(parcel, 5, this.f10678e, false);
        see.m35040a(parcel, 6, this.f10679f, i, false);
        see.m35062b(parcel, a);
    }
}
