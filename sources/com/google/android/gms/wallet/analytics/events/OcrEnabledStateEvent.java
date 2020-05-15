package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OcrEnabledStateEvent extends WalletAnalyticsEvent {
    public static final Parcelable.Creator CREATOR = new awdc();

    /* renamed from: a */
    public final boolean f109952a;

    /* renamed from: b */
    public final int f109953b;

    public OcrEnabledStateEvent(Parcel parcel) {
        super(parcel);
        this.f109952a = parcel.readByte() != 0;
        this.f109953b = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f109952a ? (byte) 1 : 0);
        parcel.writeInt(this.f109953b);
    }

    public OcrEnabledStateEvent(boolean z, int i, String str) {
        this.f110015m = str;
        this.f109952a = z;
        this.f109953b = i;
    }
}
