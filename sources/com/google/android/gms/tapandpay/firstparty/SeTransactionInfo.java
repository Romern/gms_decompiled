package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.math.BigDecimal;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SeTransactionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asop();

    /* renamed from: a */
    long f108431a;

    /* renamed from: b */
    BigDecimal f108432b;

    /* renamed from: c */
    String f108433c;

    /* renamed from: d */
    long f108434d;

    /* renamed from: e */
    int f108435e;

    public SeTransactionInfo(long j, BigDecimal bigDecimal, String str, long j2, int i) {
        this.f108431a = j;
        this.f108432b = bigDecimal;
        this.f108433c = str;
        this.f108434d = j2;
        this.f108435e = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SeTransactionInfo) {
            SeTransactionInfo seTransactionInfo = (SeTransactionInfo) obj;
            return this.f108431a == seTransactionInfo.f108431a && sdg.m34949a(this.f108432b, seTransactionInfo.f108432b) && sdg.m34949a(this.f108433c, seTransactionInfo.f108433c) && this.f108434d == seTransactionInfo.f108434d && this.f108435e == seTransactionInfo.f108435e;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f108431a), this.f108432b, this.f108433c, Long.valueOf(this.f108434d), Integer.valueOf(this.f108435e)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("transactionId", Long.valueOf(this.f108431a));
        a.mo25396a("amount", this.f108432b);
        a.mo25396a("currency", this.f108433c);
        a.mo25396a("transactionTimeMillis", Long.valueOf(this.f108434d));
        a.mo25396a("type", Integer.valueOf(this.f108435e));
        return a.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
     arg types: [android.os.Parcel, int, java.math.BigDecimal, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void */
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
        see.m35036a(parcel, 1, this.f108431a);
        see.m35047a(parcel, 2, this.f108432b, false);
        see.m35046a(parcel, 3, this.f108433c, false);
        see.m35036a(parcel, 4, this.f108434d);
        see.m35063b(parcel, 5, this.f108435e);
        see.m35062b(parcel, a);
    }
}
