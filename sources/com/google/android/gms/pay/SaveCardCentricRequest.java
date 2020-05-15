package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SaveCardCentricRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alfz();

    /* renamed from: a */
    public Account f81575a;

    /* renamed from: b */
    public byte[] f81576b;

    private SaveCardCentricRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SaveCardCentricRequest) {
            SaveCardCentricRequest saveCardCentricRequest = (SaveCardCentricRequest) obj;
            return sdg.m34949a(this.f81575a, saveCardCentricRequest.f81575a) && Arrays.equals(this.f81576b, saveCardCentricRequest.f81576b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81575a, Integer.valueOf(Arrays.hashCode(this.f81576b))});
    }

    public SaveCardCentricRequest(Account account, byte[] bArr) {
        this.f81575a = account;
        this.f81576b = bArr;
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
        see.m35040a(parcel, 1, this.f81575a, i, false);
        see.m35052a(parcel, 2, this.f81576b, false);
        see.m35062b(parcel, a);
    }
}
