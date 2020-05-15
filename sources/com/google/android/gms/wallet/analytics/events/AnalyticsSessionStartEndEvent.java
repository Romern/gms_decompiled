package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class AnalyticsSessionStartEndEvent extends WalletAnalyticsEvent {

    /* renamed from: a */
    public String f109918a;

    /* renamed from: b */
    public String f109919b;

    public AnalyticsSessionStartEndEvent() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59779a(BuyFlowConfig buyFlowConfig) {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = null;
        if (buyFlowConfig != null) {
            str = buyFlowConfig.mo60046b();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(this.f109918a);
        if (buyFlowConfig != null) {
            str2 = buyFlowConfig.f110420d;
        }
        sb.append(str2);
        this.f109919b = sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f109918a);
        parcel.writeString(this.f109919b);
    }

    public AnalyticsSessionStartEndEvent(Parcel parcel) {
        super(parcel);
        this.f109918a = parcel.readString();
        this.f109919b = parcel.readString();
    }
}
