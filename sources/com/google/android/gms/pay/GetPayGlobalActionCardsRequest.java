package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetPayGlobalActionCardsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alea();

    /* renamed from: a */
    public Account f81495a;

    /* renamed from: b */
    public int f81496b;

    /* renamed from: c */
    public int f81497c;

    /* renamed from: d */
    public int f81498d;

    public GetPayGlobalActionCardsRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetPayGlobalActionCardsRequest) {
            GetPayGlobalActionCardsRequest getPayGlobalActionCardsRequest = (GetPayGlobalActionCardsRequest) obj;
            return sdg.m34949a(this.f81495a, getPayGlobalActionCardsRequest.f81495a) && sdg.m34949a(Integer.valueOf(this.f81496b), Integer.valueOf(getPayGlobalActionCardsRequest.f81496b)) && sdg.m34949a(Integer.valueOf(this.f81497c), Integer.valueOf(getPayGlobalActionCardsRequest.f81497c)) && sdg.m34949a(Integer.valueOf(this.f81498d), Integer.valueOf(getPayGlobalActionCardsRequest.f81498d));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81495a, Integer.valueOf(this.f81496b), Integer.valueOf(this.f81497c), Integer.valueOf(this.f81498d)});
    }

    public GetPayGlobalActionCardsRequest(Account account, int i, int i2, int i3) {
        this.f81495a = account;
        this.f81496b = i;
        this.f81497c = i2;
        this.f81498d = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81495a, i, false);
        see.m35063b(parcel, 2, this.f81496b);
        see.m35063b(parcel, 3, this.f81497c);
        see.m35063b(parcel, 4, this.f81498d);
        see.m35062b(parcel, a);
    }
}
