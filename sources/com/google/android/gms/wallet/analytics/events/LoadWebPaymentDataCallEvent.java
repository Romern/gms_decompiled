package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LoadWebPaymentDataCallEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new awcz();

    /* renamed from: c */
    public final BuyFlowConfig f109946c;

    /* renamed from: d */
    public final bpih f109947d;

    public LoadWebPaymentDataCallEvent(Parcel parcel) {
        super(parcel);
        this.f109946c = (BuyFlowConfig) parcel.readParcelable(LoadWebPaymentDataCallEvent.class.getClassLoader());
        this.f109947d = (bpih) bjvp.m104731a(parcel, (bxxk) bpih.f137746i.mo74142c(7));
    }

    /* renamed from: a */
    public static void m93812a(Context context, BuyFlowConfig buyFlowConfig, bpih bpih, String str) {
        awqc.m80662a(context, new LoadWebPaymentDataCallEvent(buyFlowConfig, bpih, str));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f109946c, i);
        bjvp.m104738a(this.f109947d, parcel);
    }

    public LoadWebPaymentDataCallEvent(BuyFlowConfig buyFlowConfig, bpih bpih, String str) {
        this.f110015m = awnm.m80359a();
        this.f109946c = buyFlowConfig;
        this.f109947d = bpih;
        this.f109918a = str;
        mo59779a(buyFlowConfig);
    }
}
