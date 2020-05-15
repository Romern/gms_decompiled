package com.google.android.gms.wallet.analytics.events;

import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SimpleAnalyticsEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new awdx();

    /* renamed from: c */
    public final BuyFlowConfig f110009c;

    /* renamed from: d */
    public final bpik f110010d;

    public SimpleAnalyticsEvent(Parcel parcel) {
        super(parcel);
        this.f110009c = (BuyFlowConfig) parcel.readParcelable(IsReadyToPayCallEvent.class.getClassLoader());
        this.f110010d = (bpik) bjvp.m104731a(parcel, (bxxk) bpik.f137757s.mo74142c(7));
    }

    /* renamed from: a */
    public static void m93844a(Context context, BuyFlowConfig buyFlowConfig, bpik bpik, Account account) {
        awqc.m80662a(context, new SimpleAnalyticsEvent(buyFlowConfig, bpik, account));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f110009c, i);
        bjvp.m104738a(this.f110010d, parcel);
    }

    public SimpleAnalyticsEvent(BuyFlowConfig buyFlowConfig, bpik bpik, Account account) {
        sdo.m34975b(((bpik.f137759a & 1) ^ 1) == 0 ? false : true, "Request info should not be specified!");
        this.f110015m = awnm.m80359a();
        this.f110009c = buyFlowConfig;
        this.f110010d = bpik;
        this.f109918a = account != null ? account.name : null;
        mo59779a(buyFlowConfig);
    }
}
