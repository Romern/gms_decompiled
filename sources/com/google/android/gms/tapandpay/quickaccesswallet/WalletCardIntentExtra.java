package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class WalletCardIntentExtra extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ateq();

    /* renamed from: a */
    public String f108645a;

    /* renamed from: b */
    public int f108646b;

    /* renamed from: c */
    public String f108647c;

    /* renamed from: d */
    public byte[] f108648d;

    /* renamed from: e */
    public boolean f108649e;

    /* renamed from: f */
    public int f108650f;

    /* renamed from: g */
    public long f108651g;

    private WalletCardIntentExtra() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WalletCardIntentExtra) {
            WalletCardIntentExtra walletCardIntentExtra = (WalletCardIntentExtra) obj;
            return sdg.m34949a(this.f108645a, walletCardIntentExtra.f108645a) && sdg.m34949a(Integer.valueOf(this.f108646b), Integer.valueOf(walletCardIntentExtra.f108646b)) && sdg.m34949a(this.f108647c, walletCardIntentExtra.f108647c) && Arrays.equals(this.f108648d, walletCardIntentExtra.f108648d) && sdg.m34949a(Boolean.valueOf(this.f108649e), Boolean.valueOf(walletCardIntentExtra.f108649e)) && sdg.m34949a(Integer.valueOf(this.f108650f), Integer.valueOf(walletCardIntentExtra.f108650f)) && sdg.m34949a(Long.valueOf(this.f108651g), Long.valueOf(walletCardIntentExtra.f108651g));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f108645a, Integer.valueOf(this.f108646b), this.f108647c, Integer.valueOf(Arrays.hashCode(this.f108648d)), Boolean.valueOf(this.f108649e), Integer.valueOf(this.f108650f), Long.valueOf(this.f108651g)});
    }

    public WalletCardIntentExtra(String str, int i, String str2, byte[] bArr, boolean z, int i2, long j) {
        this.f108645a = str;
        this.f108646b = i;
        this.f108647c = str2;
        this.f108648d = bArr;
        this.f108649e = z;
        this.f108650f = i2;
        this.f108651g = j;
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
        see.m35046a(parcel, 1, this.f108645a, false);
        see.m35063b(parcel, 2, this.f108646b);
        see.m35046a(parcel, 3, this.f108647c, false);
        see.m35052a(parcel, 4, this.f108648d, false);
        see.m35051a(parcel, 5, this.f108649e);
        see.m35063b(parcel, 6, this.f108650f);
        see.m35036a(parcel, 7, this.f108651g);
        see.m35062b(parcel, a);
    }
}
