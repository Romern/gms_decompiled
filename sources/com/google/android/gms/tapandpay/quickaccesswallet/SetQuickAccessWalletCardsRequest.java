package com.google.android.gms.tapandpay.quickaccesswallet;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SetQuickAccessWalletCardsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ateo();

    /* renamed from: a */
    public int f108639a;

    /* renamed from: b */
    public Account f108640b;

    /* renamed from: c */
    public QuickAccessWalletCard[] f108641c;

    private SetQuickAccessWalletCardsRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetQuickAccessWalletCardsRequest) {
            SetQuickAccessWalletCardsRequest setQuickAccessWalletCardsRequest = (SetQuickAccessWalletCardsRequest) obj;
            return sdg.m34949a(Integer.valueOf(this.f108639a), Integer.valueOf(setQuickAccessWalletCardsRequest.f108639a)) && sdg.m34949a(this.f108640b, setQuickAccessWalletCardsRequest.f108640b) && Arrays.equals(this.f108641c, setQuickAccessWalletCardsRequest.f108641c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f108639a), this.f108640b, Integer.valueOf(Arrays.hashCode(this.f108641c))});
    }

    public SetQuickAccessWalletCardsRequest(int i, Account account, QuickAccessWalletCard[] quickAccessWalletCardArr) {
        this.f108639a = i;
        this.f108640b = account;
        this.f108641c = quickAccessWalletCardArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f108639a);
        see.m35040a(parcel, 2, this.f108640b, i, false);
        see.m35057a(parcel, 3, this.f108641c, i);
        see.m35062b(parcel, a);
    }
}
