package com.google.android.gms.auth.firstparty.shared;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CaptchaChallenge extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new iyz();

    /* renamed from: a */
    final int f10848a;

    /* renamed from: b */
    String f10849b;

    /* renamed from: c */
    public String f10850c;

    /* renamed from: d */
    public Bitmap f10851d;

    public CaptchaChallenge(int i, String str, String str2, Bitmap bitmap) {
        this.f10848a = i;
        this.f10849b = str;
        this.f10850c = str2;
        this.f10851d = bitmap;
    }

    public CaptchaChallenge(izj izj, String str, Bitmap bitmap) {
        this.f10848a = 1;
        sdo.m34959a(izj);
        this.f10849b = izj.f22000ac;
        this.f10850c = str;
        this.f10851d = bitmap;
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
        see.m35063b(parcel, 1, this.f10848a);
        see.m35046a(parcel, 2, this.f10849b, false);
        see.m35046a(parcel, 3, this.f10850c, false);
        see.m35040a(parcel, 4, this.f10851d, i, false);
        see.m35062b(parcel, a);
    }
}
