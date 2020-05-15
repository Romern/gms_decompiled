package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class UpdateBalanceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alhb();

    /* renamed from: a */
    public Account f81635a;

    /* renamed from: b */
    public String f81636b;

    private UpdateBalanceRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateBalanceRequest) {
            UpdateBalanceRequest updateBalanceRequest = (UpdateBalanceRequest) obj;
            return sdg.m34949a(this.f81635a, updateBalanceRequest.f81635a) && sdg.m34949a(this.f81636b, updateBalanceRequest.f81636b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81635a, this.f81636b});
    }

    public UpdateBalanceRequest(Account account, String str) {
        this.f81635a = account;
        this.f81636b = str;
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
        see.m35040a(parcel, 1, this.f81635a, i, false);
        see.m35046a(parcel, 2, this.f81636b, false);
        see.m35062b(parcel, a);
    }
}
