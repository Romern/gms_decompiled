package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PerformPaymentMethodServerActionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alft();

    /* renamed from: a */
    public Account f81564a;

    /* renamed from: b */
    public ProtoSafeParcelable f81565b;

    /* renamed from: c */
    public String f81566c;

    private PerformPaymentMethodServerActionRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PerformPaymentMethodServerActionRequest) {
            PerformPaymentMethodServerActionRequest performPaymentMethodServerActionRequest = (PerformPaymentMethodServerActionRequest) obj;
            return sdg.m34949a(this.f81564a, performPaymentMethodServerActionRequest.f81564a) && sdg.m34949a(this.f81565b, performPaymentMethodServerActionRequest.f81565b) && sdg.m34949a(this.f81566c, performPaymentMethodServerActionRequest.f81566c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81564a, this.f81565b, this.f81566c});
    }

    public PerformPaymentMethodServerActionRequest(Account account, ProtoSafeParcelable protoSafeParcelable, String str) {
        this.f81564a = account;
        this.f81565b = protoSafeParcelable;
        this.f81566c = str;
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
        see.m35040a(parcel, 1, this.f81564a, i, false);
        see.m35040a(parcel, 2, this.f81565b, i, false);
        see.m35046a(parcel, 3, this.f81566c, false);
        see.m35062b(parcel, a);
    }
}
