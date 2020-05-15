package com.google.android.gms.wallet.analytics.events;

import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LoadPaymentDataCallEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new awcy();

    /* renamed from: c */
    public final BuyFlowConfig f109944c;

    /* renamed from: d */
    public final bpig f109945d;

    public LoadPaymentDataCallEvent(Parcel parcel) {
        super(parcel);
        this.f109944c = (BuyFlowConfig) parcel.readParcelable(LoadPaymentDataCallEvent.class.getClassLoader());
        this.f109945d = (bpig) bjvp.m104731a(parcel, (bxxk) bpig.f137738g.mo74142c(7));
    }

    /* renamed from: a */
    public static void m93811a(Context context, BuyFlowConfig buyFlowConfig, bpig bpig) {
        awqc.m80662a(context, new LoadPaymentDataCallEvent(buyFlowConfig, bpig));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f109944c, i);
        bjvp.m104738a(this.f109945d, parcel);
    }

    public LoadPaymentDataCallEvent(BuyFlowConfig buyFlowConfig, bpig bpig) {
        ApplicationParameters applicationParameters;
        String str;
        this.f110015m = awnm.m80359a();
        this.f109944c = buyFlowConfig;
        this.f109945d = bpig;
        if (!(buyFlowConfig == null || (applicationParameters = buyFlowConfig.f110418b) == null)) {
            Account account = applicationParameters.f110407b;
            if (account != null) {
                str = account.name;
            } else {
                str = null;
            }
            this.f109918a = str;
        }
        mo59779a(buyFlowConfig);
    }
}
