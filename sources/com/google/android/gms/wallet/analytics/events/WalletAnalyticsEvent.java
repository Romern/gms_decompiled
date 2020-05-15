package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class WalletAnalyticsEvent implements Parcelable {

    /* renamed from: m */
    public String f110015m;

    public WalletAnalyticsEvent() {
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f110015m);
    }

    public WalletAnalyticsEvent(Parcel parcel) {
        this.f110015m = parcel.readString();
    }
}
