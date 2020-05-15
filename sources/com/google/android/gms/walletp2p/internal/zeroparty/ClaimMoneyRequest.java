package com.google.android.gms.walletp2p.internal.zeroparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ClaimMoneyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axne();

    /* renamed from: a */
    public String f110791a;

    /* renamed from: b */
    public String f110792b;

    /* renamed from: c */
    public long f110793c;

    /* renamed from: d */
    public long f110794d;

    /* renamed from: e */
    public byte[] f110795e;

    /* renamed from: f */
    public byte[] f110796f;

    /* renamed from: g */
    public boolean f110797g;

    /* renamed from: h */
    public String f110798h;

    public ClaimMoneyRequest(String str, String str2, long j, long j2, byte[] bArr, byte[] bArr2, boolean z, String str3) {
        this.f110791a = str;
        this.f110792b = str2;
        this.f110793c = j;
        this.f110794d = j2;
        this.f110795e = bArr;
        this.f110796f = bArr2;
        this.f110797g = z;
        this.f110798h = str3;
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 2, this.f110791a, false);
        see.m35046a(parcel, 3, this.f110792b, false);
        see.m35036a(parcel, 4, this.f110793c);
        see.m35036a(parcel, 5, this.f110794d);
        see.m35052a(parcel, 6, this.f110795e, false);
        see.m35052a(parcel, 7, this.f110796f, false);
        see.m35051a(parcel, 8, this.f110797g);
        see.m35046a(parcel, 9, this.f110798h, false);
        see.m35062b(parcel, a);
    }
}
