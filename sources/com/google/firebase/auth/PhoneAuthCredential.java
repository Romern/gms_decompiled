package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhoneAuthCredential extends AuthCredential implements Cloneable {
    public static final Parcelable.Creator CREATOR = new brjm();

    /* renamed from: a */
    public String f152401a;

    /* renamed from: b */
    public String f152402b;

    /* renamed from: c */
    public boolean f152403c;

    /* renamed from: d */
    public String f152404d;

    /* renamed from: e */
    public boolean f152405e;

    /* renamed from: f */
    public String f152406f;

    /* renamed from: g */
    public String f152407g;

    public PhoneAuthCredential(String str, String str2, boolean z, String str3, boolean z2, String str4, String str5) {
        boolean z3 = false;
        if (z && !TextUtils.isEmpty(str3) && TextUtils.isEmpty(str5)) {
            z3 = true;
        } else if ((z && TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str5)) || ((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) || (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)))) {
            z3 = true;
        }
        sdo.m34975b(z3, "Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, temporary proof, or enrollment ID.");
        this.f152401a = str;
        this.f152402b = str2;
        this.f152403c = z;
        this.f152404d = str3;
        this.f152405e = z2;
        this.f152406f = str4;
        this.f152407g = str5;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new PhoneAuthCredential(this.f152401a, this.f152402b, this.f152403c, this.f152404d, this.f152405e, this.f152406f, this.f152407g);
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
        see.m35046a(parcel, 1, this.f152401a, false);
        see.m35046a(parcel, 2, this.f152402b, false);
        see.m35051a(parcel, 3, this.f152403c);
        see.m35046a(parcel, 4, this.f152404d, false);
        see.m35051a(parcel, 5, this.f152405e);
        see.m35046a(parcel, 6, this.f152406f, false);
        see.m35046a(parcel, 7, this.f152407g, false);
        see.m35062b(parcel, a);
    }
}
