package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetClosedLoopBundleRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aldn();

    /* renamed from: a */
    public Account f81480a;

    /* renamed from: b */
    public long f81481b;

    private GetClosedLoopBundleRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetClosedLoopBundleRequest) {
            GetClosedLoopBundleRequest getClosedLoopBundleRequest = (GetClosedLoopBundleRequest) obj;
            return sdg.m34949a(this.f81480a, getClosedLoopBundleRequest.f81480a) && sdg.m34949a(Long.valueOf(this.f81481b), Long.valueOf(getClosedLoopBundleRequest.f81481b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81480a, Long.valueOf(this.f81481b)});
    }

    public GetClosedLoopBundleRequest(Account account, long j) {
        this.f81480a = account;
        this.f81481b = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81480a, i, false);
        see.m35036a(parcel, 2, this.f81481b);
        see.m35062b(parcel, a);
    }
}
