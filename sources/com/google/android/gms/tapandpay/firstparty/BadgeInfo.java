package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class BadgeInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asmf();

    /* renamed from: a */
    public String f108327a;

    /* renamed from: b */
    public byte[] f108328b;

    /* renamed from: c */
    public int f108329c;

    /* renamed from: d */
    public TokenStatus f108330d;

    /* renamed from: e */
    public String f108331e;

    /* renamed from: f */
    public TransactionInfo f108332f;

    public BadgeInfo(String str, byte[] bArr, int i, TokenStatus tokenStatus, String str2, TransactionInfo transactionInfo) {
        this.f108327a = str;
        this.f108328b = bArr;
        this.f108329c = i;
        this.f108330d = tokenStatus;
        this.f108331e = str2;
        this.f108332f = transactionInfo;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BadgeInfo) {
            BadgeInfo badgeInfo = (BadgeInfo) obj;
            return this.f108329c == badgeInfo.f108329c && sdg.m34949a(this.f108327a, badgeInfo.f108327a) && Arrays.equals(this.f108328b, badgeInfo.f108328b) && sdg.m34949a(this.f108330d, badgeInfo.f108330d) && sdg.m34949a(this.f108331e, badgeInfo.f108331e) && sdg.m34949a(this.f108332f, badgeInfo.f108332f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f108327a, this.f108328b, Integer.valueOf(this.f108329c), this.f108330d, this.f108331e, this.f108332f});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("clientTokenId", this.f108327a);
        byte[] bArr = this.f108328b;
        a.mo25396a("serverToken", bArr != null ? Arrays.toString(bArr) : null);
        a.mo25396a("cardNetwork", Integer.valueOf(this.f108329c));
        a.mo25396a("tokenStatus", this.f108330d);
        a.mo25396a("tokenLastDigits", this.f108331e);
        a.mo25396a("transactionInfo", this.f108332f);
        return a.toString();
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
        see.m35046a(parcel, 1, this.f108327a, false);
        see.m35052a(parcel, 2, this.f108328b, false);
        see.m35063b(parcel, 3, this.f108329c);
        see.m35040a(parcel, 4, this.f108330d, i, false);
        see.m35046a(parcel, 5, this.f108331e, false);
        see.m35040a(parcel, 6, this.f108332f, i, false);
        see.m35062b(parcel, a);
    }
}
