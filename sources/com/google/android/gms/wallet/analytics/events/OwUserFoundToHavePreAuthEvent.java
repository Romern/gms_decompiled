package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OwUserFoundToHavePreAuthEvent extends WalletAnalyticsEvent {
    public static final Parcelable.Creator CREATOR = new awds();

    public OwUserFoundToHavePreAuthEvent(Parcel parcel) {
        super(parcel);
    }

    public final int describeContents() {
        return 0;
    }

    public OwUserFoundToHavePreAuthEvent(String str) {
        this.f110015m = str;
    }
}
