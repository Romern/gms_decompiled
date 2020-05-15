package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DefaultOAuthCredential extends OAuthCredential {
    public static final Parcelable.Creator CREATOR = new brjj();

    /* renamed from: a */
    public final String f152389a;

    /* renamed from: b */
    public final String f152390b;

    /* renamed from: c */
    public final String f152391c;

    /* renamed from: d */
    public final VerifyAssertionRequest f152392d;

    /* renamed from: e */
    public final String f152393e;

    /* renamed from: f */
    public final String f152394f;

    /* renamed from: g */
    public final String f152395g;

    public DefaultOAuthCredential(String str, String str2, String str3, VerifyAssertionRequest verifyAssertionRequest, String str4, String str5, String str6) {
        this.f152389a = str;
        this.f152390b = str2;
        this.f152391c = str3;
        this.f152392d = verifyAssertionRequest;
        this.f152393e = str4;
        this.f152394f = str5;
        this.f152395g = str6;
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
        see.m35046a(parcel, 1, this.f152389a, false);
        see.m35046a(parcel, 2, this.f152390b, false);
        see.m35046a(parcel, 3, this.f152391c, false);
        see.m35040a(parcel, 4, this.f152392d, i, false);
        see.m35046a(parcel, 5, this.f152393e, false);
        see.m35046a(parcel, 6, this.f152394f, false);
        see.m35046a(parcel, 7, this.f152395g, false);
        see.m35062b(parcel, a);
    }
}
