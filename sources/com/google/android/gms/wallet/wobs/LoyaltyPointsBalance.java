package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class LoyaltyPointsBalance extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axdq();

    /* renamed from: a */
    public int f110625a;

    /* renamed from: b */
    public String f110626b;

    /* renamed from: c */
    public double f110627c;

    /* renamed from: d */
    public String f110628d;

    /* renamed from: e */
    public long f110629e;

    /* renamed from: f */
    public int f110630f;

    LoyaltyPointsBalance() {
        this.f110630f = -1;
        this.f110625a = -1;
        this.f110627c = -1.0d;
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
        see.m35063b(parcel, 2, this.f110625a);
        see.m35046a(parcel, 3, this.f110626b, false);
        see.m35033a(parcel, 4, this.f110627c);
        see.m35046a(parcel, 5, this.f110628d, false);
        see.m35036a(parcel, 6, this.f110629e);
        see.m35063b(parcel, 7, this.f110630f);
        see.m35062b(parcel, a);
    }

    public LoyaltyPointsBalance(int i, String str, double d, String str2, long j, int i2) {
        this.f110625a = i;
        this.f110626b = str;
        this.f110627c = d;
        this.f110628d = str2;
        this.f110629e = j;
        this.f110630f = i2;
    }
}
