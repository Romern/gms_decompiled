package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GoogleTransactionId extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alen();

    /* renamed from: a */
    public String f81520a;

    /* renamed from: b */
    public String f81521b;

    private GoogleTransactionId() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GoogleTransactionId) {
            GoogleTransactionId googleTransactionId = (GoogleTransactionId) obj;
            return sdg.m34949a(this.f81520a, googleTransactionId.f81520a) && sdg.m34949a(this.f81521b, googleTransactionId.f81521b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81520a, this.f81521b});
    }

    public GoogleTransactionId(String str, String str2) {
        this.f81520a = str;
        this.f81521b = str2;
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
        see.m35046a(parcel, 1, this.f81520a, false);
        see.m35046a(parcel, 2, this.f81521b, false);
        see.m35062b(parcel, a);
    }
}
