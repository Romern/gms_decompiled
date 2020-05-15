package com.google.android.gms.tapandpay.quickaccesswallet;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetQuickAccessWalletConfigRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ateg();

    /* renamed from: a */
    public int f108626a;

    /* renamed from: b */
    public Account f108627b;

    private GetQuickAccessWalletConfigRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetQuickAccessWalletConfigRequest) {
            GetQuickAccessWalletConfigRequest getQuickAccessWalletConfigRequest = (GetQuickAccessWalletConfigRequest) obj;
            return sdg.m34949a(Integer.valueOf(this.f108626a), Integer.valueOf(getQuickAccessWalletConfigRequest.f108626a)) && sdg.m34949a(this.f108627b, getQuickAccessWalletConfigRequest.f108627b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f108626a), this.f108627b});
    }

    public GetQuickAccessWalletConfigRequest(int i, Account account) {
        this.f108626a = i;
        this.f108627b = account;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f108626a);
        see.m35040a(parcel, 2, this.f108627b, i, false);
        see.m35062b(parcel, a);
    }
}
