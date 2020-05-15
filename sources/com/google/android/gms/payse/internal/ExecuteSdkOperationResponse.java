package com.google.android.gms.payse.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.payse.SecureElementStoredValue;
import com.google.android.gms.payse.TransactionInfo;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ExecuteSdkOperationResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alkg();

    /* renamed from: a */
    TransactionInfo f81688a;

    /* renamed from: b */
    public SecureElementStoredValue f81689b;

    /* renamed from: c */
    public String f81690c;

    /* renamed from: d */
    public String f81691d;

    public ExecuteSdkOperationResponse(TransactionInfo transactionInfo, SecureElementStoredValue secureElementStoredValue, String str, String str2) {
        this.f81688a = transactionInfo;
        this.f81689b = secureElementStoredValue;
        this.f81690c = str;
        this.f81691d = str2;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("storedValue", this.f81689b);
        a.mo25396a("errorCode", this.f81690c);
        a.mo25396a("errorMessage", this.f81691d);
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
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81688a, i, false);
        see.m35040a(parcel, 2, this.f81689b, i, false);
        see.m35046a(parcel, 3, this.f81690c, false);
        see.m35046a(parcel, 4, this.f81691d, false);
        see.m35062b(parcel, a);
    }
}
