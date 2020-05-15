package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetRecentContextCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fre();

    /* renamed from: a */
    public final Account f9549a;

    /* renamed from: b */
    public final boolean f9550b;

    /* renamed from: c */
    public final boolean f9551c;

    /* renamed from: d */
    public final boolean f9552d;

    /* renamed from: e */
    public final String f9553e;

    public GetRecentContextCall$Request() {
        this(null, false, false, false, null);
    }

    public GetRecentContextCall$Request(Account account, boolean z, boolean z2, boolean z3, String str) {
        this.f9549a = account;
        this.f9550b = z;
        this.f9551c = z2;
        this.f9552d = z3;
        this.f9553e = str;
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
        see.m35040a(parcel, 1, this.f9549a, i, false);
        see.m35051a(parcel, 2, this.f9550b);
        see.m35051a(parcel, 3, this.f9551c);
        see.m35051a(parcel, 4, this.f9552d);
        see.m35046a(parcel, 5, this.f9553e, false);
        see.m35062b(parcel, a);
    }
}
