package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IsReadyToPayCallEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new awcx();

    /* renamed from: c */
    public final BuyFlowConfig f109942c;

    /* renamed from: d */
    public final bpif f109943d;

    public IsReadyToPayCallEvent(Parcel parcel) {
        super(parcel);
        this.f109942c = (BuyFlowConfig) parcel.readParcelable(IsReadyToPayCallEvent.class.getClassLoader());
        this.f109943d = (bpif) bjvp.m104731a(parcel, (bxxk) bpif.f137729h.mo74142c(7));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f109942c, i);
        bjvp.m104738a(this.f109943d, parcel);
    }

    public IsReadyToPayCallEvent(BuyFlowConfig buyFlowConfig, bpif bpif, String str) {
        this.f110015m = awnm.m80359a();
        this.f109942c = buyFlowConfig;
        this.f109943d = bpif;
        this.f109918a = str;
        mo59779a(buyFlowConfig);
    }
}
