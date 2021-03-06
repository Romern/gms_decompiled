package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PinSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ixx();

    /* renamed from: a */
    final int f10687a;

    /* renamed from: b */
    public final String f10688b;

    /* renamed from: c */
    public final String f10689c;

    /* renamed from: d */
    public final String f10690d;

    /* renamed from: e */
    public final String f10691e;

    /* renamed from: f */
    public final int f10692f;

    public PinSettings(int i, String str, String str2, String str3, String str4, int i2) {
        this.f10687a = i;
        this.f10688b = str;
        this.f10689c = str2;
        this.f10690d = str3;
        this.f10691e = str4;
        this.f10692f = i2;
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
        see.m35063b(parcel, 1, this.f10687a);
        see.m35046a(parcel, 2, this.f10688b, false);
        see.m35046a(parcel, 3, this.f10689c, false);
        see.m35046a(parcel, 4, this.f10690d, false);
        see.m35063b(parcel, 5, this.f10692f);
        see.m35046a(parcel, 6, this.f10691e, false);
        see.m35062b(parcel, a);
    }
}
