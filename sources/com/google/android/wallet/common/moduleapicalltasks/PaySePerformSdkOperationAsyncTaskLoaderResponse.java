package com.google.android.wallet.common.moduleapicalltasks;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PaySePerformSdkOperationAsyncTaskLoaderResponse extends ModuleApiCallTaskLoaderResponse {
    public static final Parcelable.Creator CREATOR = new bjuo();

    /* renamed from: a */
    public final String f151818a;

    /* renamed from: b */
    public final String f151819b;

    /* renamed from: c */
    public final String f151820c;

    /* renamed from: d */
    public final String f151821d;

    /* renamed from: e */
    public final bmit f151822e;

    /* renamed from: f */
    private final int f151823f;

    /* renamed from: g */
    private final String f151824g;

    public PaySePerformSdkOperationAsyncTaskLoaderResponse(int i, String str, String str2, String str3, String str4, String str5, bmit bmit) {
        this.f151823f = i;
        this.f151818a = str;
        this.f151824g = str2;
        this.f151819b = str3;
        this.f151820c = str4;
        this.f151821d = str5;
        this.f151822e = bmit;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f151823f);
        parcel.writeString(this.f151818a);
        parcel.writeString(this.f151824g);
        parcel.writeString(this.f151819b);
        parcel.writeString(this.f151820c);
        parcel.writeString(this.f151821d);
        bjvp.m104738a(this.f151822e, parcel);
    }
}
