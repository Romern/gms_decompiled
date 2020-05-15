package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class WalletCardIntent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new atep();

    /* renamed from: a */
    public String f108642a;

    /* renamed from: b */
    public String f108643b;

    /* renamed from: c */
    public WalletCardIntentExtra[] f108644c;

    private WalletCardIntent() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WalletCardIntent) {
            WalletCardIntent walletCardIntent = (WalletCardIntent) obj;
            return sdg.m34949a(this.f108642a, walletCardIntent.f108642a) && sdg.m34949a(this.f108643b, walletCardIntent.f108643b) && Arrays.equals(this.f108644c, walletCardIntent.f108644c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f108642a, this.f108643b, Integer.valueOf(Arrays.hashCode(this.f108644c))});
    }

    public WalletCardIntent(String str, String str2, WalletCardIntentExtra[] walletCardIntentExtraArr) {
        this.f108642a = str;
        this.f108643b = str2;
        this.f108644c = walletCardIntentExtraArr;
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
        see.m35046a(parcel, 1, this.f108642a, false);
        see.m35046a(parcel, 2, this.f108643b, false);
        see.m35057a(parcel, 3, this.f108644c, i);
        see.m35062b(parcel, a);
    }
}
