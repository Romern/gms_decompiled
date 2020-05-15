package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OwMwAccountChangedEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new awdp();

    public OwMwAccountChangedEvent(Parcel parcel) {
        super(parcel);
    }

    public final int describeContents() {
        return 0;
    }

    public OwMwAccountChangedEvent(String str, String str2) {
        this.f110015m = str;
        this.f109918a = str2;
    }
}
