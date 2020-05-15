package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetPaymentMethodsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aled();

    /* renamed from: a */
    public Account f81503a;

    /* renamed from: b */
    public FetchMode f81504b;

    private GetPaymentMethodsRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetPaymentMethodsRequest) {
            GetPaymentMethodsRequest getPaymentMethodsRequest = (GetPaymentMethodsRequest) obj;
            return sdg.m34949a(this.f81503a, getPaymentMethodsRequest.f81503a) && sdg.m34949a(this.f81504b, getPaymentMethodsRequest.f81504b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81503a, this.f81504b});
    }

    public GetPaymentMethodsRequest(Account account, FetchMode fetchMode) {
        this.f81503a = account;
        this.f81504b = fetchMode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81503a, i, false);
        see.m35040a(parcel, 2, this.f81504b, i, false);
        see.m35062b(parcel, a);
    }
}
