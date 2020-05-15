package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SetAcceptedTosForPartnerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new algf();

    /* renamed from: a */
    public Account f81592a;

    /* renamed from: b */
    public long f81593b;

    private SetAcceptedTosForPartnerRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetAcceptedTosForPartnerRequest) {
            SetAcceptedTosForPartnerRequest setAcceptedTosForPartnerRequest = (SetAcceptedTosForPartnerRequest) obj;
            return sdg.m34949a(this.f81592a, setAcceptedTosForPartnerRequest.f81592a) && sdg.m34949a(Long.valueOf(this.f81593b), Long.valueOf(setAcceptedTosForPartnerRequest.f81593b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81592a, Long.valueOf(this.f81593b)});
    }

    public SetAcceptedTosForPartnerRequest(Account account, long j) {
        this.f81592a = account;
        this.f81593b = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81592a, i, false);
        see.m35036a(parcel, 2, this.f81593b);
        see.m35062b(parcel, a);
    }
}
