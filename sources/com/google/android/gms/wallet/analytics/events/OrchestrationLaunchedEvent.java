package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OrchestrationLaunchedEvent extends AnalyticsSessionStartEndEvent implements awqn {
    public static final Parcelable.Creator CREATOR = new awdi();

    /* renamed from: c */
    private final BuyFlowConfig f109968c;

    /* renamed from: d */
    private final bpis f109969d;

    public OrchestrationLaunchedEvent(Parcel parcel) {
        super(parcel);
        this.f109968c = (BuyFlowConfig) BuyFlowConfig.CREATOR.createFromParcel(parcel);
        this.f109969d = bpis.m111965a(parcel.readInt());
    }

    /* renamed from: a */
    public final void mo52465a(Context context, awqo awqo, bxvd bxvd) {
        awqo.mo52467a(this.f109968c, context);
        awqo.f94877l = this.f109919b;
        bpis bpis = this.f109969d;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bphe bphe = (bphe) bxvd.f164949b;
        bphe bphe2 = bphe.f137630n;
        bphe.f137638g = bpis.f137811u;
        bphe.f137632a |= 8;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        awyc.m81487a(this.f109968c, parcel, i);
        parcel.writeInt(this.f109969d.f137811u);
    }

    public OrchestrationLaunchedEvent(BuyFlowConfig buyFlowConfig, String str, bpis bpis) {
        this.f110015m = awnm.m80359a();
        this.f109918a = str;
        this.f109968c = buyFlowConfig;
        this.f109969d = bpis;
        mo59779a(buyFlowConfig);
    }
}
