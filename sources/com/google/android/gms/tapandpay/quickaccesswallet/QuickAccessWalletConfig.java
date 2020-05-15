package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class QuickAccessWalletConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new atem();

    /* renamed from: a */
    public int f108635a;

    /* renamed from: b */
    public int f108636b;

    /* renamed from: c */
    public int f108637c;

    /* renamed from: d */
    public String[] f108638d;

    public QuickAccessWalletConfig() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QuickAccessWalletConfig) {
            QuickAccessWalletConfig quickAccessWalletConfig = (QuickAccessWalletConfig) obj;
            return sdg.m34949a(Integer.valueOf(this.f108635a), Integer.valueOf(quickAccessWalletConfig.f108635a)) && sdg.m34949a(Integer.valueOf(this.f108636b), Integer.valueOf(quickAccessWalletConfig.f108636b)) && sdg.m34949a(Integer.valueOf(this.f108637c), Integer.valueOf(quickAccessWalletConfig.f108637c)) && Arrays.equals(this.f108638d, quickAccessWalletConfig.f108638d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f108635a), Integer.valueOf(this.f108636b), Integer.valueOf(this.f108637c), Integer.valueOf(Arrays.hashCode(this.f108638d))});
    }

    public QuickAccessWalletConfig(int i, int i2, int i3, String[] strArr) {
        this.f108635a = i;
        this.f108636b = i2;
        this.f108637c = i3;
        this.f108638d = strArr;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String[], boolean):void
     arg types: [android.os.Parcel, int, java.lang.String[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f108635a);
        see.m35063b(parcel, 2, this.f108636b);
        see.m35063b(parcel, 3, this.f108637c);
        see.m35058a(parcel, 5, this.f108638d, false);
        see.m35062b(parcel, a);
    }
}
