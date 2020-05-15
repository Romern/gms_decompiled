package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetOutstandingPurchaseOrderIdRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aldu();

    /* renamed from: a */
    public Account f81489a;

    /* renamed from: b */
    public long f81490b;

    private GetOutstandingPurchaseOrderIdRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetOutstandingPurchaseOrderIdRequest) {
            GetOutstandingPurchaseOrderIdRequest getOutstandingPurchaseOrderIdRequest = (GetOutstandingPurchaseOrderIdRequest) obj;
            return sdg.m34949a(this.f81489a, getOutstandingPurchaseOrderIdRequest.f81489a) && sdg.m34949a(Long.valueOf(this.f81490b), Long.valueOf(getOutstandingPurchaseOrderIdRequest.f81490b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81489a, Long.valueOf(this.f81490b)});
    }

    public GetOutstandingPurchaseOrderIdRequest(Account account, long j) {
        this.f81489a = account;
        this.f81490b = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81489a, i, false);
        see.m35036a(parcel, 2, this.f81490b);
        see.m35062b(parcel, a);
    }
}
