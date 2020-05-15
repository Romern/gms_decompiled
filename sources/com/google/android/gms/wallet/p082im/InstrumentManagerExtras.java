package com.google.android.gms.wallet.p082im;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.wallet.im.InstrumentManagerExtras */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InstrumentManagerExtras implements Parcelable {
    public static final Parcelable.Creator CREATOR = new awmw();

    /* renamed from: a */
    public final bmrw f110252a;

    public InstrumentManagerExtras(bmrw bmrw) {
        this.f110252a = bmrw;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        bjvp.m104738a(this.f110252a, parcel);
    }
}
