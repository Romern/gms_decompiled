package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ViewTransactionListRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alhl();

    /* renamed from: a */
    public Account f81658a;

    /* renamed from: b */
    public GooglePaymentMethodId[] f81659b;

    /* renamed from: c */
    public int f81660c;

    private ViewTransactionListRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ViewTransactionListRequest) {
            ViewTransactionListRequest viewTransactionListRequest = (ViewTransactionListRequest) obj;
            return sdg.m34949a(this.f81658a, viewTransactionListRequest.f81658a) && Arrays.equals(this.f81659b, viewTransactionListRequest.f81659b) && sdg.m34949a(Integer.valueOf(this.f81660c), Integer.valueOf(viewTransactionListRequest.f81660c));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81658a, Integer.valueOf(Arrays.hashCode(this.f81659b)), Integer.valueOf(this.f81660c)});
    }

    public ViewTransactionListRequest(Account account, GooglePaymentMethodId[] googlePaymentMethodIdArr, int i) {
        this.f81658a = account;
        this.f81659b = googlePaymentMethodIdArr;
        this.f81660c = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81658a, i, false);
        see.m35057a(parcel, 2, this.f81659b, i);
        see.m35063b(parcel, 3, this.f81660c);
        see.m35062b(parcel, a);
    }
}
