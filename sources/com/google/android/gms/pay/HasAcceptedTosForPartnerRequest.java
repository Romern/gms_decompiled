package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class HasAcceptedTosForPartnerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aleo();

    /* renamed from: a */
    public Account f81522a;

    /* renamed from: b */
    public long f81523b;

    private HasAcceptedTosForPartnerRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HasAcceptedTosForPartnerRequest) {
            HasAcceptedTosForPartnerRequest hasAcceptedTosForPartnerRequest = (HasAcceptedTosForPartnerRequest) obj;
            return sdg.m34949a(this.f81522a, hasAcceptedTosForPartnerRequest.f81522a) && sdg.m34949a(Long.valueOf(this.f81523b), Long.valueOf(hasAcceptedTosForPartnerRequest.f81523b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81522a, Long.valueOf(this.f81523b)});
    }

    public HasAcceptedTosForPartnerRequest(Account account, long j) {
        this.f81522a = account;
        this.f81523b = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81522a, i, false);
        see.m35036a(parcel, 2, this.f81523b);
        see.m35062b(parcel, a);
    }
}
