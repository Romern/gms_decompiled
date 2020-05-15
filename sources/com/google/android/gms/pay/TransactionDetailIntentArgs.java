package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TransactionDetailIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new algw();

    /* renamed from: a */
    public String f81617a;

    /* renamed from: b */
    public String f81618b;

    /* renamed from: c */
    public Transaction f81619c;

    /* renamed from: d */
    public int f81620d;

    public TransactionDetailIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransactionDetailIntentArgs) {
            TransactionDetailIntentArgs transactionDetailIntentArgs = (TransactionDetailIntentArgs) obj;
            return sdg.m34949a(this.f81617a, transactionDetailIntentArgs.f81617a) && sdg.m34949a(this.f81618b, transactionDetailIntentArgs.f81618b) && sdg.m34949a(this.f81619c, transactionDetailIntentArgs.f81619c) && sdg.m34949a(Integer.valueOf(this.f81620d), Integer.valueOf(transactionDetailIntentArgs.f81620d));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81617a, this.f81618b, this.f81619c, Integer.valueOf(this.f81620d)});
    }

    public TransactionDetailIntentArgs(String str, String str2, Transaction transaction, int i) {
        this.f81617a = str;
        this.f81618b = str2;
        this.f81619c = transaction;
        this.f81620d = i;
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
        see.m35046a(parcel, 1, this.f81617a, false);
        see.m35046a(parcel, 2, this.f81618b, false);
        see.m35040a(parcel, 3, this.f81619c, i, false);
        see.m35063b(parcel, 4, this.f81620d);
        see.m35062b(parcel, a);
    }
}
