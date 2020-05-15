package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetPaymentMethodActionTokensRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alec();

    /* renamed from: a */
    public Account f81501a;

    /* renamed from: b */
    public ProtoSafeParcelable[] f81502b;

    private GetPaymentMethodActionTokensRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetPaymentMethodActionTokensRequest) {
            GetPaymentMethodActionTokensRequest getPaymentMethodActionTokensRequest = (GetPaymentMethodActionTokensRequest) obj;
            return sdg.m34949a(this.f81501a, getPaymentMethodActionTokensRequest.f81501a) && Arrays.equals(this.f81502b, getPaymentMethodActionTokensRequest.f81502b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81501a, Integer.valueOf(Arrays.hashCode(this.f81502b))});
    }

    public GetPaymentMethodActionTokensRequest(Account account, ProtoSafeParcelable[] protoSafeParcelableArr) {
        this.f81501a = account;
        this.f81502b = protoSafeParcelableArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81501a, i, false);
        see.m35057a(parcel, 2, this.f81502b, i);
        see.m35062b(parcel, a);
    }
}
