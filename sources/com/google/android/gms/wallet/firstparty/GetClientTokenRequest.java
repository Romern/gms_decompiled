package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetClientTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new awkk();

    /* renamed from: a */
    WalletCustomTheme f110161a;

    /* renamed from: b */
    public boolean f110162b;

    GetClientTokenRequest() {
    }

    public GetClientTokenRequest(WalletCustomTheme walletCustomTheme) {
        this(walletCustomTheme, false);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f110161a, i, false);
        see.m35051a(parcel, 3, this.f110162b);
        see.m35062b(parcel, a);
    }

    public GetClientTokenRequest(WalletCustomTheme walletCustomTheme, boolean z) {
        this.f110161a = walletCustomTheme;
        this.f110162b = z;
        if (walletCustomTheme == null) {
            throw new NullPointerException("WalletCustomTheme is required");
        }
    }
}
