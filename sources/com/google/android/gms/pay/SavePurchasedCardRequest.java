package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SavePurchasedCardRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alga();

    /* renamed from: a */
    public Account f81577a;

    /* renamed from: b */
    public byte[] f81578b;

    private SavePurchasedCardRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SavePurchasedCardRequest) {
            SavePurchasedCardRequest savePurchasedCardRequest = (SavePurchasedCardRequest) obj;
            return sdg.m34949a(this.f81577a, savePurchasedCardRequest.f81577a) && Arrays.equals(this.f81578b, savePurchasedCardRequest.f81578b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81577a, Integer.valueOf(Arrays.hashCode(this.f81578b))});
    }

    public SavePurchasedCardRequest(Account account, byte[] bArr) {
        this.f81577a = account;
        this.f81578b = bArr;
    }

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
        see.m35040a(parcel, 1, this.f81577a, i, false);
        see.m35052a(parcel, 2, this.f81578b, false);
        see.m35062b(parcel, a);
    }
}
