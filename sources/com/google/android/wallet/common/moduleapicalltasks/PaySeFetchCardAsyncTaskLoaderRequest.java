package com.google.android.wallet.common.moduleapicalltasks;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PaySeFetchCardAsyncTaskLoaderRequest extends ModuleApiCallTaskLoaderRequest {
    public static final Parcelable.Creator CREATOR = new bjuj();

    /* renamed from: a */
    public final Account f151809a;

    /* renamed from: b */
    public final int f151810b;

    public PaySeFetchCardAsyncTaskLoaderRequest(Account account, int i) {
        this.f151809a = account;
        this.f151810b = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.f151809a.writeToParcel(parcel, i);
        parcel.writeInt(this.f151810b);
    }
}
