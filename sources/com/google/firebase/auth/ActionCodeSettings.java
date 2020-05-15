package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ActionCodeSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new brjh();

    /* renamed from: a */
    public final String f152379a;

    /* renamed from: b */
    public final String f152380b;

    /* renamed from: c */
    public final String f152381c;

    /* renamed from: d */
    public final String f152382d;

    /* renamed from: e */
    public final boolean f152383e;

    /* renamed from: f */
    public final String f152384f;

    /* renamed from: g */
    public final boolean f152385g;

    /* renamed from: h */
    public String f152386h;

    /* renamed from: i */
    public int f152387i;

    /* renamed from: j */
    public String f152388j;

    public ActionCodeSettings() {
        this.f152379a = null;
        this.f152380b = null;
        this.f152381c = null;
        this.f152382d = null;
        this.f152383e = false;
        this.f152384f = null;
        this.f152385g = false;
        this.f152388j = null;
    }

    public ActionCodeSettings(String str, String str2, String str3, String str4, boolean z, String str5, boolean z2, String str6, int i, String str7) {
        this.f152379a = str;
        this.f152380b = str2;
        this.f152381c = str3;
        this.f152382d = str4;
        this.f152383e = z;
        this.f152384f = str5;
        this.f152385g = z2;
        this.f152386h = str6;
        this.f152387i = i;
        this.f152388j = str7;
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
        see.m35046a(parcel, 1, this.f152379a, false);
        see.m35046a(parcel, 2, this.f152380b, false);
        see.m35046a(parcel, 3, this.f152381c, false);
        see.m35046a(parcel, 4, this.f152382d, false);
        see.m35051a(parcel, 5, this.f152383e);
        see.m35046a(parcel, 6, this.f152384f, false);
        see.m35051a(parcel, 7, this.f152385g);
        see.m35046a(parcel, 8, this.f152386h, false);
        see.m35063b(parcel, 9, this.f152387i);
        see.m35046a(parcel, 10, this.f152388j, false);
        see.m35062b(parcel, a);
    }
}
