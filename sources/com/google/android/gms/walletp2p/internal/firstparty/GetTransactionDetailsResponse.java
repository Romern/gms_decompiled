package com.google.android.gms.walletp2p.internal.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetTransactionDetailsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axmy();

    /* renamed from: a */
    public long f110783a;

    /* renamed from: b */
    public String f110784b;

    /* renamed from: c */
    public String f110785c;

    /* renamed from: d */
    public String f110786d;

    /* renamed from: e */
    public String f110787e;

    /* renamed from: f */
    public boolean f110788f;

    public GetTransactionDetailsResponse(long j, String str, String str2, String str3, String str4, boolean z) {
        this.f110783a = j;
        this.f110784b = str;
        this.f110785c = str2;
        this.f110786d = str3;
        this.f110787e = str4;
        this.f110788f = z;
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
        see.m35036a(parcel, 2, this.f110783a);
        see.m35046a(parcel, 3, this.f110784b, false);
        see.m35046a(parcel, 4, this.f110785c, false);
        see.m35046a(parcel, 5, this.f110786d, false);
        see.m35046a(parcel, 6, this.f110787e, false);
        see.m35051a(parcel, 7, this.f110788f);
        see.m35062b(parcel, a);
    }
}
