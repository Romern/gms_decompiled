package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ReversePurchaseRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alfy();

    /* renamed from: a */
    public Account f81571a;

    /* renamed from: b */
    public int f81572b;

    /* renamed from: c */
    public long f81573c;

    /* renamed from: d */
    public long f81574d;

    private ReversePurchaseRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReversePurchaseRequest) {
            ReversePurchaseRequest reversePurchaseRequest = (ReversePurchaseRequest) obj;
            return sdg.m34949a(this.f81571a, reversePurchaseRequest.f81571a) && sdg.m34949a(Integer.valueOf(this.f81572b), Integer.valueOf(reversePurchaseRequest.f81572b)) && sdg.m34949a(Long.valueOf(this.f81573c), Long.valueOf(reversePurchaseRequest.f81573c)) && sdg.m34949a(Long.valueOf(this.f81574d), Long.valueOf(reversePurchaseRequest.f81574d));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81571a, Integer.valueOf(this.f81572b), Long.valueOf(this.f81573c), Long.valueOf(this.f81574d)});
    }

    public ReversePurchaseRequest(Account account, int i, long j, long j2) {
        this.f81571a = account;
        this.f81572b = i;
        this.f81573c = j;
        this.f81574d = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81571a, i, false);
        see.m35063b(parcel, 2, this.f81572b);
        see.m35036a(parcel, 3, this.f81573c);
        see.m35036a(parcel, 4, this.f81574d);
        see.m35062b(parcel, a);
    }
}
