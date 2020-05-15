package com.google.android.gms.tapandpay.quickaccesswallet;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class QuickAccessWalletCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ateh();

    /* renamed from: a */
    public String f108628a;

    /* renamed from: b */
    public Bitmap f108629b;

    /* renamed from: c */
    public String f108630c;

    /* renamed from: d */
    public WalletCardIntent[] f108631d;

    /* renamed from: e */
    public CardIconMessage[] f108632e;

    /* renamed from: f */
    public long f108633f;

    /* renamed from: g */
    public long f108634g;

    private QuickAccessWalletCard() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QuickAccessWalletCard) {
            QuickAccessWalletCard quickAccessWalletCard = (QuickAccessWalletCard) obj;
            return sdg.m34949a(this.f108628a, quickAccessWalletCard.f108628a) && sdg.m34949a(this.f108629b, quickAccessWalletCard.f108629b) && sdg.m34949a(this.f108630c, quickAccessWalletCard.f108630c) && Arrays.equals(this.f108631d, quickAccessWalletCard.f108631d) && Arrays.equals(this.f108632e, quickAccessWalletCard.f108632e) && sdg.m34949a(Long.valueOf(this.f108633f), Long.valueOf(quickAccessWalletCard.f108633f)) && sdg.m34949a(Long.valueOf(this.f108634g), Long.valueOf(quickAccessWalletCard.f108634g));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f108628a, this.f108629b, this.f108630c, Integer.valueOf(Arrays.hashCode(this.f108631d)), Integer.valueOf(Arrays.hashCode(this.f108632e)), Long.valueOf(this.f108633f), Long.valueOf(this.f108634g)});
    }

    public QuickAccessWalletCard(String str, Bitmap bitmap, String str2, WalletCardIntent[] walletCardIntentArr, CardIconMessage[] cardIconMessageArr, long j, long j2) {
        this.f108628a = str;
        this.f108629b = bitmap;
        this.f108630c = str2;
        this.f108631d = walletCardIntentArr;
        this.f108632e = cardIconMessageArr;
        this.f108633f = j;
        this.f108634g = j2;
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
        see.m35046a(parcel, 1, this.f108628a, false);
        see.m35040a(parcel, 2, this.f108629b, i, false);
        see.m35046a(parcel, 3, this.f108630c, false);
        see.m35057a(parcel, 4, this.f108631d, i);
        see.m35057a(parcel, 5, this.f108632e, i);
        see.m35036a(parcel, 6, this.f108633f);
        see.m35036a(parcel, 7, this.f108634g);
        see.m35062b(parcel, a);
    }
}
