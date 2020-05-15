package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CreditCardEntrySubmittedEvent extends WalletAnalyticsEvent {
    public static final Parcelable.Creator CREATOR = new awcr();

    /* renamed from: a */
    public final int f109930a;

    /* renamed from: b */
    public final int f109931b;

    public CreditCardEntrySubmittedEvent(int i, int i2, String str) {
        this.f110015m = str;
        this.f109930a = i;
        this.f109931b = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f109930a);
        parcel.writeInt(this.f109931b);
    }

    public CreditCardEntrySubmittedEvent(Parcel parcel) {
        super(parcel);
        this.f109930a = parcel.readInt();
        this.f109931b = parcel.readInt();
    }
}
