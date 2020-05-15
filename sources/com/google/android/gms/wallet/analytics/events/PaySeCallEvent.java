package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PaySeCallEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new awdu();

    /* renamed from: c */
    public final bpiw f110002c;

    public PaySeCallEvent(Parcel parcel) {
        super(parcel);
        this.f110002c = (bpiw) bjvp.m104731a(parcel, (bxxk) bpiw.f137819e.mo74142c(7));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        bjvp.m104738a(this.f110002c, parcel);
    }

    public PaySeCallEvent(String str, bpiw bpiw, BuyFlowConfig buyFlowConfig) {
        this.f110015m = awnm.m80359a();
        this.f110002c = bpiw;
        this.f109918a = str;
        mo59779a(buyFlowConfig);
    }
}
