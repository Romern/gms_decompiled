package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CreditCardEntryActivityClosedEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new awcp();

    /* renamed from: c */
    public final int f109925c;

    public CreditCardEntryActivityClosedEvent(int i, String str) {
        this.f110015m = str;
        this.f109925c = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int i2 = this.f109925c;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            return;
        }
        throw null;
    }

    public CreditCardEntryActivityClosedEvent(Parcel parcel) {
        super(parcel);
        this.f109925c = awfu.m79872a(parcel.readInt());
    }
}
