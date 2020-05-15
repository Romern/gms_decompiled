package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ProviderUserInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new brqu();

    /* renamed from: a */
    public String f152536a;

    /* renamed from: b */
    public String f152537b;

    /* renamed from: c */
    public String f152538c;

    /* renamed from: d */
    public String f152539d;

    /* renamed from: e */
    public String f152540e;

    /* renamed from: f */
    public String f152541f;

    /* renamed from: g */
    public String f152542g;

    public ProviderUserInfo() {
    }

    public ProviderUserInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f152536a = str;
        this.f152537b = str2;
        this.f152538c = str3;
        this.f152539d = str4;
        this.f152540e = str5;
        this.f152541f = str6;
        this.f152542g = str7;
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
        see.m35046a(parcel, 2, this.f152536a, false);
        see.m35046a(parcel, 3, this.f152537b, false);
        see.m35046a(parcel, 4, this.f152538c, false);
        see.m35046a(parcel, 5, this.f152539d, false);
        see.m35046a(parcel, 6, this.f152540e, false);
        see.m35046a(parcel, 7, this.f152541f, false);
        see.m35046a(parcel, 8, this.f152542g, false);
        see.m35062b(parcel, a);
    }
}
