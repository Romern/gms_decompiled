package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TapAndPayCallEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new awdz();

    /* renamed from: c */
    public final BuyFlowConfig f110013c;

    /* renamed from: d */
    public final bpjw f110014d;

    public TapAndPayCallEvent(Parcel parcel) {
        super(parcel);
        this.f110013c = (BuyFlowConfig) parcel.readParcelable(TapAndPayCallEvent.class.getClassLoader());
        this.f110014d = (bpjw) bjvp.m104731a(parcel, (bxxk) bpjw.f137917j.mo74142c(7));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f110013c, i);
        bjvp.m104738a(this.f110014d, parcel);
    }

    public TapAndPayCallEvent(BuyFlowConfig buyFlowConfig, String str, bpjw bpjw) {
        this.f110015m = awnm.m80359a();
        this.f110013c = buyFlowConfig;
        this.f109918a = str;
        this.f110014d = bpjw;
        mo59779a(buyFlowConfig);
    }
}
