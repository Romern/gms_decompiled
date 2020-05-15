package com.google.android.gms.tapandpay.internal.firstparty;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetAllCardsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asyc();

    /* renamed from: a */
    public boolean f108539a;

    /* renamed from: b */
    public Account f108540b;

    public GetAllCardsRequest(boolean z, Account account) {
        this.f108539a = z;
        this.f108540b = account;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 2, this.f108539a);
        see.m35040a(parcel, 3, this.f108540b, i, false);
        see.m35062b(parcel, a);
    }
}
