package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetClosedLoopCardsFromServerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aldp();

    /* renamed from: a */
    public Account f81483a;

    private GetClosedLoopCardsFromServerRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetClosedLoopCardsFromServerRequest) {
            return sdg.m34949a(this.f81483a, ((GetClosedLoopCardsFromServerRequest) obj).f81483a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81483a});
    }

    public GetClosedLoopCardsFromServerRequest(Account account) {
        this.f81483a = account;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81483a, i, false);
        see.m35062b(parcel, a);
    }
}
