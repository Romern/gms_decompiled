package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.wallet.analytics.CreditCardEntryAction;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CreditCardEntryActionUpdatedEvent extends WalletAnalyticsEvent {
    public static final Parcelable.Creator CREATOR = new awco();

    /* renamed from: a */
    public CreditCardEntryAction f109924a;

    public CreditCardEntryActionUpdatedEvent(Parcel parcel) {
        super(parcel);
        this.f109924a = new CreditCardEntryAction();
        this.f109924a = (CreditCardEntryAction) parcel.readParcelable(CreditCardEntryActionUpdatedEvent.class.getClassLoader());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f109924a, i);
    }

    public CreditCardEntryActionUpdatedEvent(CreditCardEntryAction creditCardEntryAction, String str) {
        new CreditCardEntryAction();
        this.f110015m = str;
        this.f109924a = creditCardEntryAction;
    }
}
