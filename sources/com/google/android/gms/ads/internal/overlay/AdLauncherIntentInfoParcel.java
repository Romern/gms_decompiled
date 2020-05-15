package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AdLauncherIntentInfoParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C0519b();

    /* renamed from: a */
    public final String f8537a;

    /* renamed from: b */
    public final String f8538b;

    /* renamed from: c */
    public final String f8539c;

    /* renamed from: d */
    public final String f8540d;

    /* renamed from: e */
    public final String f8541e;

    /* renamed from: f */
    public final String f8542f;

    /* renamed from: g */
    public final String f8543g;

    /* renamed from: h */
    public final Intent f8544h;

    public AdLauncherIntentInfoParcel(String str, String str2) {
        this(str, str2, null, null, null, null, null, null);
    }

    public AdLauncherIntentInfoParcel(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent) {
        this.f8537a = str;
        this.f8538b = str2;
        this.f8539c = str3;
        this.f8540d = str4;
        this.f8541e = str5;
        this.f8542f = str6;
        this.f8543g = str7;
        this.f8544h = intent;
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
        see.m35046a(parcel, 2, this.f8537a, false);
        see.m35046a(parcel, 3, this.f8538b, false);
        see.m35046a(parcel, 4, this.f8539c, false);
        see.m35046a(parcel, 5, this.f8540d, false);
        see.m35046a(parcel, 6, this.f8541e, false);
        see.m35046a(parcel, 7, this.f8542f, false);
        see.m35046a(parcel, 8, this.f8543g, false);
        see.m35040a(parcel, 9, this.f8544h, i, false);
        see.m35062b(parcel, a);
    }
}
