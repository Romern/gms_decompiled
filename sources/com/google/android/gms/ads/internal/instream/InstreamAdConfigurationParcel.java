package com.google.android.gms.ads.internal.instream;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InstreamAdConfigurationParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C0442a();

    /* renamed from: a */
    public final int f8403a;

    /* renamed from: b */
    public final int f8404b;

    /* renamed from: c */
    public final String f8405c;

    /* renamed from: d */
    public final int f8406d;

    public InstreamAdConfigurationParcel(int i, int i2, String str, int i3) {
        this.f8403a = i;
        this.f8404b = i2;
        this.f8405c = str;
        this.f8406d = i3;
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
        see.m35063b(parcel, 1, this.f8404b);
        see.m35046a(parcel, 2, this.f8405c, false);
        see.m35063b(parcel, 3, this.f8406d);
        see.m35063b(parcel, 1000, this.f8403a);
        see.m35062b(parcel, a);
    }
}
