package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EmailAuthCredential extends AuthCredential {
    public static final Parcelable.Creator CREATOR = new brjk();

    /* renamed from: a */
    public String f152396a;

    /* renamed from: b */
    public String f152397b;

    /* renamed from: c */
    public final String f152398c;

    /* renamed from: d */
    public String f152399d;

    /* renamed from: e */
    public boolean f152400e;

    public EmailAuthCredential(String str, String str2, String str3, String str4, boolean z) {
        sdo.m34977c(str);
        this.f152396a = str;
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f152397b = str2;
        this.f152398c = str3;
        this.f152399d = str4;
        this.f152400e = z;
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
        see.m35046a(parcel, 1, this.f152396a, false);
        see.m35046a(parcel, 2, this.f152397b, false);
        see.m35046a(parcel, 3, this.f152398c, false);
        see.m35046a(parcel, 4, this.f152399d, false);
        see.m35051a(parcel, 5, this.f152400e);
        see.m35062b(parcel, a);
    }
}
