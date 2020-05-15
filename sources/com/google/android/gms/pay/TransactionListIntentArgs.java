package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TransactionListIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new algx();

    /* renamed from: a */
    public GooglePaymentMethodId[] f81621a;

    /* renamed from: b */
    public int f81622b;

    private TransactionListIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransactionListIntentArgs) {
            TransactionListIntentArgs transactionListIntentArgs = (TransactionListIntentArgs) obj;
            return Arrays.equals(this.f81621a, transactionListIntentArgs.f81621a) && sdg.m34949a(Integer.valueOf(this.f81622b), Integer.valueOf(transactionListIntentArgs.f81622b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f81621a)), Integer.valueOf(this.f81622b)});
    }

    public TransactionListIntentArgs(GooglePaymentMethodId[] googlePaymentMethodIdArr, int i) {
        this.f81621a = googlePaymentMethodIdArr;
        this.f81622b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35057a(parcel, 1, this.f81621a, i);
        see.m35063b(parcel, 2, this.f81622b);
        see.m35062b(parcel, a);
    }
}
