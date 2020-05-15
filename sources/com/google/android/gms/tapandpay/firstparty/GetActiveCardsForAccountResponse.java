package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetActiveCardsForAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asno();

    /* renamed from: a */
    public CardInfo[] f108367a;

    public GetActiveCardsForAccountResponse(CardInfo[] cardInfoArr) {
        this.f108367a = cardInfoArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35057a(parcel, 2, this.f108367a, i);
        see.m35062b(parcel, a);
    }
}
