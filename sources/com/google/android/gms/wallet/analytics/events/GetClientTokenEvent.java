package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetClientTokenEvent extends AnalyticsSessionStartEndEvent implements awea {
    public static final Parcelable.Creator CREATOR = new awcw();

    /* renamed from: c */
    public final BuyFlowConfig f109940c;

    /* renamed from: d */
    public final bpic f109941d;

    public GetClientTokenEvent(Parcel parcel) {
        super(parcel);
        this.f109940c = (BuyFlowConfig) parcel.readParcelable(GetClientTokenEvent.class.getClassLoader());
        this.f109941d = (bpic) bjvp.m104731a(parcel, (bxxk) bpic.f137715f.mo74142c(7));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f109940c, i);
        bjvp.m104738a(this.f109941d, parcel);
    }

    public GetClientTokenEvent(BuyFlowConfig buyFlowConfig, bpic bpic) {
        this.f110015m = awnm.m80359a();
        sdo.checkIfNull(buyFlowConfig, "BuyFlowConfig cannot be null!");
        this.f109940c = buyFlowConfig;
        this.f109941d = bpic;
        mo59779a(buyFlowConfig);
    }
}
