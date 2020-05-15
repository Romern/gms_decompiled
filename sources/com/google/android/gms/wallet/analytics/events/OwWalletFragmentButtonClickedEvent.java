package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OwWalletFragmentButtonClickedEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new awdt();

    /* renamed from: c */
    public final BuyFlowConfig f110000c;

    /* renamed from: d */
    public final int f110001d;

    public OwWalletFragmentButtonClickedEvent(Parcel parcel) {
        super(parcel);
        this.f110001d = parcel.readInt();
        this.f110000c = (BuyFlowConfig) BuyFlowConfig.CREATOR.createFromParcel(parcel);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f110001d);
        awyc.m81487a(this.f110000c, parcel, i);
    }

    public OwWalletFragmentButtonClickedEvent(BuyFlowConfig buyFlowConfig, String str, int i) {
        this.f110015m = awnm.m80359a();
        this.f109918a = str;
        this.f110001d = i;
        this.f110000c = buyFlowConfig;
        mo59779a(buyFlowConfig);
    }
}
