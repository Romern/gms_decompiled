package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class WalletBalanceInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new agpj();

    /* renamed from: a */
    public long f80243a;

    /* renamed from: b */
    public String f80244b;

    /* renamed from: c */
    public int f80245c;

    /* renamed from: d */
    public Long f80246d;

    /* renamed from: e */
    public String f80247e;

    /* renamed from: f */
    public String f80248f;

    /* renamed from: g */
    public Long f80249g;

    /* renamed from: h */
    public Long f80250h;

    /* renamed from: i */
    public Long f80251i;

    /* renamed from: j */
    public String f80252j;

    public WalletBalanceInfo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WalletBalanceInfo) {
            WalletBalanceInfo walletBalanceInfo = (WalletBalanceInfo) obj;
            return sdg.m34949a(Long.valueOf(this.f80243a), Long.valueOf(walletBalanceInfo.f80243a)) && sdg.m34949a(this.f80244b, walletBalanceInfo.f80244b) && sdg.m34949a(Integer.valueOf(this.f80245c), Integer.valueOf(walletBalanceInfo.f80245c)) && sdg.m34949a(this.f80246d, walletBalanceInfo.f80246d) && sdg.m34949a(this.f80247e, walletBalanceInfo.f80247e) && sdg.m34949a(this.f80248f, walletBalanceInfo.f80248f) && sdg.m34949a(this.f80249g, walletBalanceInfo.f80249g) && sdg.m34949a(this.f80250h, walletBalanceInfo.f80250h) && sdg.m34949a(this.f80251i, walletBalanceInfo.f80251i) && sdg.m34949a(this.f80252j, walletBalanceInfo.f80252j);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f80243a), this.f80244b, Integer.valueOf(this.f80245c), this.f80246d, this.f80247e, this.f80248f, this.f80249g, this.f80250h, this.f80251i, this.f80252j});
    }

    public WalletBalanceInfo(long j, String str, int i, Long l, String str2, String str3, Long l2, Long l3, Long l4, String str4) {
        this.f80243a = j;
        this.f80244b = str;
        this.f80245c = i;
        this.f80246d = l;
        this.f80247e = str2;
        this.f80248f = str3;
        this.f80249g = l2;
        this.f80250h = l3;
        this.f80251i = l4;
        this.f80252j = str4;
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
        see.m35036a(parcel, 1, this.f80243a);
        see.m35046a(parcel, 2, this.f80244b, false);
        see.m35063b(parcel, 3, this.f80245c);
        see.m35045a(parcel, 4, this.f80246d);
        see.m35046a(parcel, 5, this.f80247e, false);
        see.m35046a(parcel, 6, this.f80248f, false);
        see.m35045a(parcel, 7, this.f80249g);
        see.m35045a(parcel, 8, this.f80250h);
        see.m35045a(parcel, 9, this.f80251i);
        see.m35046a(parcel, 10, this.f80252j, false);
        see.m35062b(parcel, a);
    }
}
