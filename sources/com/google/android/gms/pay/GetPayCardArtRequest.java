package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetPayCardArtRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aldx();

    /* renamed from: a */
    public Account f81492a;

    /* renamed from: b */
    public PayCardArtInfo[] f81493b;

    public GetPayCardArtRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetPayCardArtRequest) {
            GetPayCardArtRequest getPayCardArtRequest = (GetPayCardArtRequest) obj;
            return sdg.m34949a(this.f81492a, getPayCardArtRequest.f81492a) && Arrays.equals(this.f81493b, getPayCardArtRequest.f81493b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81492a, Integer.valueOf(Arrays.hashCode(this.f81493b))});
    }

    public GetPayCardArtRequest(Account account, PayCardArtInfo[] payCardArtInfoArr) {
        this.f81492a = account;
        this.f81493b = payCardArtInfoArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81492a, i, false);
        see.m35057a(parcel, 2, this.f81493b, i);
        see.m35062b(parcel, a);
    }
}
