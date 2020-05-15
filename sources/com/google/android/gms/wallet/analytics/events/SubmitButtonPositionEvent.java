package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SubmitButtonPositionEvent extends WalletAnalyticsEvent implements awqn {
    public static final Parcelable.Creator CREATOR = new awdy();

    /* renamed from: a */
    public final boolean f110011a;

    /* renamed from: b */
    public final int f110012b;

    public SubmitButtonPositionEvent(int i, boolean z, String str) {
        this.f110012b = i;
        this.f110011a = z;
        this.f110015m = str;
    }

    /* renamed from: a */
    public final void mo52465a(Context context, awqo awqo, bxvd bxvd) {
        int i = this.f110012b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bphe bphe = (bphe) bxvd.f164949b;
        bphe bphe2 = bphe.f137630n;
        bphe.f137639h = i - 1;
        int i2 = bphe.f137632a | 16;
        bphe.f137632a = i2;
        boolean z = this.f110011a;
        bphe.f137632a = i2 | 32;
        bphe.f137640i = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f110012b - 1);
        parcel.writeInt(this.f110011a ? 1 : 0);
    }

    public SubmitButtonPositionEvent(Parcel parcel) {
        super(parcel);
        int a = bphd.m111924a(parcel.readInt());
        boolean z = true;
        this.f110012b = a == 0 ? 1 : a;
        this.f110011a = parcel.readInt() != 1 ? false : z;
    }
}
