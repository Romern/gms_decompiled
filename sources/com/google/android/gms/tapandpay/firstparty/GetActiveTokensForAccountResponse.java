package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetActiveTokensForAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asnp();

    /* renamed from: a */
    TokenInfo[] f108368a;

    public GetActiveTokensForAccountResponse(TokenInfo[] tokenInfoArr) {
        this.f108368a = tokenInfoArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35057a(parcel, 1, this.f108368a, i);
        see.m35062b(parcel, a);
    }
}
