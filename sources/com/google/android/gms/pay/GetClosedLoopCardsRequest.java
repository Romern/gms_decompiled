package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetClosedLoopCardsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aldq();

    /* renamed from: a */
    public Account f81484a;

    private GetClosedLoopCardsRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetClosedLoopCardsRequest) {
            return sdg.m34949a(this.f81484a, ((GetClosedLoopCardsRequest) obj).f81484a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81484a});
    }

    public GetClosedLoopCardsRequest(Account account) {
        this.f81484a = account;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81484a, i, false);
        see.m35062b(parcel, a);
    }
}
