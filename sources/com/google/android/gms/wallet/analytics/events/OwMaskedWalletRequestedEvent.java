package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OwMaskedWalletRequestedEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new awdo();

    /* renamed from: c */
    public final BuyFlowConfig f109993c;

    /* renamed from: d */
    public final boolean f109994d;

    public OwMaskedWalletRequestedEvent(Parcel parcel) {
        super(parcel);
        this.f109993c = (BuyFlowConfig) BuyFlowConfig.CREATOR.createFromParcel(parcel);
        this.f109994d = parcel.readByte() != 1 ? false : true;
    }

    /* renamed from: a */
    public static String m93834a(Context context, String str, BuyFlowConfig buyFlowConfig, boolean z) {
        OwMaskedWalletRequestedEvent owMaskedWalletRequestedEvent = new OwMaskedWalletRequestedEvent(buyFlowConfig, str, z);
        awqc.m80662a(context, owMaskedWalletRequestedEvent);
        return owMaskedWalletRequestedEvent.f110015m;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        awyc.m81487a(this.f109993c, parcel, i);
        parcel.writeByte(this.f109994d ? (byte) 1 : 0);
    }

    public OwMaskedWalletRequestedEvent(BuyFlowConfig buyFlowConfig, String str, boolean z) {
        this.f110015m = awnm.m80359a();
        this.f109918a = str;
        this.f109993c = buyFlowConfig;
        this.f109994d = z;
        mo59779a(buyFlowConfig);
    }
}
