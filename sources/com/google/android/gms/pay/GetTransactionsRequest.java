package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetTransactionsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alei();

    /* renamed from: a */
    public Account f81511a;

    /* renamed from: b */
    public GoogleTransactionId f81512b;

    /* renamed from: c */
    public GooglePaymentMethodId[] f81513c;

    /* renamed from: d */
    public int f81514d;

    private GetTransactionsRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetTransactionsRequest) {
            GetTransactionsRequest getTransactionsRequest = (GetTransactionsRequest) obj;
            return sdg.m34949a(this.f81511a, getTransactionsRequest.f81511a) && sdg.m34949a(this.f81512b, getTransactionsRequest.f81512b) && Arrays.equals(this.f81513c, getTransactionsRequest.f81513c) && sdg.m34949a(Integer.valueOf(this.f81514d), Integer.valueOf(getTransactionsRequest.f81514d));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81511a, this.f81512b, Integer.valueOf(Arrays.hashCode(this.f81513c)), Integer.valueOf(this.f81514d)});
    }

    public GetTransactionsRequest(Account account, GoogleTransactionId googleTransactionId, GooglePaymentMethodId[] googlePaymentMethodIdArr, int i) {
        this.f81511a = account;
        this.f81512b = googleTransactionId;
        this.f81513c = googlePaymentMethodIdArr;
        this.f81514d = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81511a, i, false);
        see.m35040a(parcel, 2, this.f81512b, i, false);
        see.m35057a(parcel, 3, this.f81513c, i);
        see.m35063b(parcel, 4, this.f81514d);
        see.m35062b(parcel, a);
    }
}
