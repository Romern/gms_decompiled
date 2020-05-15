package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetBulletinsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aldl();

    /* renamed from: a */
    public Account f81476a;

    /* renamed from: b */
    public boolean f81477b;

    private GetBulletinsRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetBulletinsRequest) {
            GetBulletinsRequest getBulletinsRequest = (GetBulletinsRequest) obj;
            return sdg.m34949a(this.f81476a, getBulletinsRequest.f81476a) && sdg.m34949a(Boolean.valueOf(this.f81477b), Boolean.valueOf(getBulletinsRequest.f81477b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81476a, Boolean.valueOf(this.f81477b)});
    }

    public GetBulletinsRequest(Account account, boolean z) {
        this.f81476a = account;
        this.f81477b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81476a, i, false);
        see.m35051a(parcel, 2, this.f81477b);
        see.m35062b(parcel, a);
    }
}
