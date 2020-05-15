package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetTransactionsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alej();

    /* renamed from: a */
    public Transaction[] f81515a;

    private GetTransactionsResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetTransactionsResponse) {
            return Arrays.equals(this.f81515a, ((GetTransactionsResponse) obj).f81515a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f81515a))});
    }

    public GetTransactionsResponse(Transaction[] transactionArr) {
        this.f81515a = transactionArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35057a(parcel, 1, this.f81515a, i);
        see.m35062b(parcel, a);
    }
}
