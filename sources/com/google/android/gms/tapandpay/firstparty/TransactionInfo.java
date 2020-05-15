package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TransactionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aspe();

    /* renamed from: a */
    public int f108468a;

    /* renamed from: b */
    public int f108469b;

    /* renamed from: c */
    public int f108470c;

    /* renamed from: d */
    public int f108471d;

    public TransactionInfo(int i, int i2, int i3, int i4) {
        this.f108468a = i;
        this.f108469b = i2;
        this.f108470c = i3;
        this.f108471d = i4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TransactionInfo) {
            TransactionInfo transactionInfo = (TransactionInfo) obj;
            return this.f108468a == transactionInfo.f108468a && this.f108469b == transactionInfo.f108469b && this.f108470c == transactionInfo.f108470c && this.f108471d == transactionInfo.f108471d;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f108468a), Integer.valueOf(this.f108469b), Integer.valueOf(this.f108470c), Integer.valueOf(this.f108471d)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("transactionDelivery", Integer.valueOf(this.f108468a));
        a.mo25396a("transactionLimit", Integer.valueOf(this.f108469b));
        a.mo25396a("supportedTransactions", Integer.valueOf(this.f108470c));
        a.mo25396a("deliveryPreference", Integer.valueOf(this.f108471d));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f108468a);
        see.m35063b(parcel, 3, this.f108469b);
        see.m35063b(parcel, 4, this.f108470c);
        see.m35063b(parcel, 5, this.f108471d);
        see.m35062b(parcel, a);
    }
}
