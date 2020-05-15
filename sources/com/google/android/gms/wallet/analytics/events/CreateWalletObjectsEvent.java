package com.google.android.gms.wallet.analytics.events;

import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CreateWalletObjectsEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new awcn();

    /* renamed from: c */
    public final BuyFlowConfig f109922c;

    /* renamed from: d */
    public final bphk f109923d;

    public CreateWalletObjectsEvent(Parcel parcel) {
        super(parcel);
        this.f109922c = (BuyFlowConfig) parcel.readParcelable(CreateWalletObjectsEvent.class.getClassLoader());
        this.f109923d = (bphk) bjvp.m104731a(parcel, (bxxk) bphk.f137655g.mo74142c(7));
    }

    /* renamed from: a */
    public static void m93806a(Context context, BuyFlowConfig buyFlowConfig, bphk bphk) {
        awqc.m80662a(context, new CreateWalletObjectsEvent(buyFlowConfig, bphk));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f109922c, i);
        bjvp.m104738a(this.f109923d, parcel);
    }

    public CreateWalletObjectsEvent(BuyFlowConfig buyFlowConfig, bphk bphk) {
        ApplicationParameters applicationParameters;
        String str;
        this.f110015m = awnm.m80359a();
        this.f109922c = buyFlowConfig;
        this.f109923d = bphk;
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
