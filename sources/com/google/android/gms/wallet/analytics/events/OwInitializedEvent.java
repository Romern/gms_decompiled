package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OwInitializedEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new awdm();

    /* renamed from: c */
    public final BuyFlowConfig f109985c;

    /* renamed from: d */
    public final int f109986d;

    /* renamed from: e */
    public final int f109987e;

    /* renamed from: f */
    public final int f109988f;

    public OwInitializedEvent(Parcel parcel) {
        super(parcel);
        this.f109986d = parcel.readInt();
        this.f109987e = parcel.readInt();
        this.f109988f = parcel.readInt();
        this.f109985c = (BuyFlowConfig) BuyFlowConfig.CREATOR.createFromParcel(parcel);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f109986d);
        parcel.writeInt(this.f109987e);
        parcel.writeInt(this.f109988f);
        awyc.m81487a(this.f109985c, parcel, i);
    }

    public OwInitializedEvent(BuyFlowConfig buyFlowConfig, String str) {
        this.f110015m = awnm.m80359a();
        this.f109918a = str;
        this.f109986d = 2;
        this.f109987e = 1;
        this.f109988f = 0;
        this.f109985c = buyFlowConfig;
        mo59779a(buyFlowConfig);
    }
}
