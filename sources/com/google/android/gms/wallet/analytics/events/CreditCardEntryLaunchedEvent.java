package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CreditCardEntryLaunchedEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new awcq();

    /* renamed from: c */
    public final String f109926c;

    /* renamed from: d */
    public final BuyFlowConfig f109927d;

    /* renamed from: e */
    public final bpis f109928e;

    /* renamed from: f */
    public final int f109929f;

    public CreditCardEntryLaunchedEvent(Parcel parcel) {
        super(parcel);
        this.f109926c = parcel.readString();
        int a = bphv.m111942a(parcel.readInt());
        if (a == 0) {
            this.f109929f = 1;
        } else {
            this.f109929f = a;
        }
        this.f109927d = (BuyFlowConfig) BuyFlowConfig.CREATOR.createFromParcel(parcel);
        bpis a2 = bpis.m111965a(parcel.readInt());
        if (a2 == null) {
            this.f109928e = bpis.FLOW_TYPE_UNKNOWN;
        } else {
            this.f109928e = a2;
        }
    }

    /* renamed from: a */
    public static String m93807a(Context context, String str, BuyFlowConfig buyFlowConfig, String str2, bpis bpis) {
        CreditCardEntryLaunchedEvent creditCardEntryLaunchedEvent = new CreditCardEntryLaunchedEvent(str, buyFlowConfig, str2, bpis);
        awqc.m80662a(context, creditCardEntryLaunchedEvent);
        return creditCardEntryLaunchedEvent.f110015m;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f109926c);
        parcel.writeInt(this.f109929f - 1);
        awyc.m81487a(this.f109927d, parcel, i);
        parcel.writeInt(this.f109928e.f137811u);
    }

    public CreditCardEntryLaunchedEvent(String str, BuyFlowConfig buyFlowConfig, String str2, bpis bpis) {
        this.f110015m = awnm.m80359a();
        this.f109926c = str;
        this.f109927d = buyFlowConfig;
        this.f109929f = 7;
        this.f109928e = bpis;
        this.f109918a = str2;
        mo59779a(buyFlowConfig);
    }
}
