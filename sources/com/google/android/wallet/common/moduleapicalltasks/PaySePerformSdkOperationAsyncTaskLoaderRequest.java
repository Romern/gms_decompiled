package com.google.android.wallet.common.moduleapicalltasks;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PaySePerformSdkOperationAsyncTaskLoaderRequest extends ModuleApiCallTaskLoaderRequest {
    public static final Parcelable.Creator CREATOR = new bjun();

    /* renamed from: a */
    public final int f151812a;

    /* renamed from: b */
    public final int f151813b;

    /* renamed from: c */
    public final String f151814c;

    /* renamed from: d */
    public final String f151815d;

    /* renamed from: e */
    public final Account f151816e;

    /* renamed from: f */
    public final long f151817f;

    public PaySePerformSdkOperationAsyncTaskLoaderRequest(int i, Account account, int i2, String str, String str2, long j) {
        this.f151812a = i;
        this.f151816e = account;
        this.f151813b = i2;
        this.f151814c = str;
        this.f151815d = str2;
        this.f151817f = j;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f151812a);
        this.f151816e.writeToParcel(parcel, i);
        parcel.writeInt(this.f151813b);
        parcel.writeString(this.f151814c);
        parcel.writeString(this.f151815d);
        parcel.writeLong(this.f151817f);
    }
}
