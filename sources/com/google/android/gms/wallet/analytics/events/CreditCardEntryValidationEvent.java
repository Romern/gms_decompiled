package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CreditCardEntryValidationEvent extends WalletAnalyticsEvent {
    public static final Parcelable.Creator CREATOR = new awcs();

    /* renamed from: a */
    public final boolean f109932a;

    /* renamed from: b */
    public final boolean f109933b;

    public CreditCardEntryValidationEvent(Parcel parcel) {
        super(parcel);
        boolean z = true;
        this.f109932a = parcel.readByte() != 0;
        this.f109933b = parcel.readByte() == 0 ? false : z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f109932a ? (byte) 1 : 0);
        parcel.writeByte(this.f109933b ? (byte) 1 : 0);
    }

    public CreditCardEntryValidationEvent(boolean z, boolean z2, String str) {
        this.f110015m = str;
        this.f109932a = z;
        this.f109933b = z2;
    }
}
