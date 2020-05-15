package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhoneMultiFactorInfo extends MultiFactorInfo {
    public static final Parcelable.Creator CREATOR = new brjn();

    /* renamed from: a */
    public final String f152408a;

    /* renamed from: b */
    public final String f152409b;

    /* renamed from: c */
    public final long f152410c;

    /* renamed from: d */
    public final String f152411d;

    public PhoneMultiFactorInfo(String str, String str2, long j, String str3) {
        sdo.m34977c(str);
        this.f152408a = str;
        this.f152409b = str2;
        this.f152410c = j;
        sdo.m34977c(str3);
        this.f152411d = str3;
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
        see.m35046a(parcel, 1, this.f152408a, false);
        see.m35046a(parcel, 2, this.f152409b, false);
        see.m35036a(parcel, 3, this.f152410c);
        see.m35046a(parcel, 4, this.f152411d, false);
        see.m35062b(parcel, a);
    }
}
