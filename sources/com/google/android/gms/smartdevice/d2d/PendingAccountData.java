package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PendingAccountData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new arab();

    /* renamed from: a */
    public final String f107901a;

    /* renamed from: b */
    public final String f107902b;

    /* renamed from: c */
    public final String f107903c;

    /* renamed from: d */
    public final String f107904d;

    /* renamed from: e */
    public final String f107905e;

    public PendingAccountData(String str, String str2, String str3, String str4, String str5) {
        this.f107901a = str;
        this.f107902b = str2;
        this.f107903c = str3;
        this.f107904d = str4;
        this.f107905e = str5;
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
        see.m35046a(parcel, 2, this.f107901a, false);
        see.m35046a(parcel, 3, this.f107902b, false);
        see.m35046a(parcel, 4, this.f107903c, false);
        see.m35046a(parcel, 5, this.f107904d, false);
        see.m35046a(parcel, 6, this.f107905e, false);
        see.m35062b(parcel, a);
    }
}
