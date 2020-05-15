package com.google.android.gms.payse.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetSeCardsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alkh();

    /* renamed from: a */
    Account f81692a;

    public GetSeCardsRequest(Account account) {
        this.f81692a = account;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81692a, i, false);
        see.m35062b(parcel, a);
    }
}
