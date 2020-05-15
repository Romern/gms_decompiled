package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetActiveAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asnn();

    /* renamed from: a */
    public AccountInfo f108366a;

    public GetActiveAccountResponse(AccountInfo accountInfo) {
        this.f108366a = accountInfo;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f108366a, i, false);
        see.m35062b(parcel, a);
    }
}
