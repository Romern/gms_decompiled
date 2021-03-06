package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CaptchaSolution extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new iza();

    /* renamed from: a */
    final int f10852a;

    /* renamed from: b */
    public String f10853b;

    /* renamed from: c */
    public String f10854c;

    public CaptchaSolution(int i, String str, String str2) {
        this.f10852a = i;
        this.f10853b = str;
        this.f10854c = str2;
    }

    public CaptchaSolution(String str, String str2) {
        this.f10852a = 1;
        this.f10853b = str;
        this.f10854c = str2;
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
        see.m35063b(parcel, 1, this.f10852a);
        see.m35046a(parcel, 2, this.f10853b, false);
        see.m35046a(parcel, 3, this.f10854c, false);
        see.m35062b(parcel, a);
    }
}
