package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DocumentUploadLaunchedEvent extends AnalyticsSessionStartEndEvent implements awqh {
    public static final Parcelable.Creator CREATOR = new awcu();

    /* renamed from: c */
    public final BuyFlowConfig f109935c;

    /* renamed from: d */
    public final bpis f109936d;

    /* renamed from: e */
    public final int f109937e;

    public DocumentUploadLaunchedEvent(Parcel parcel) {
        super(parcel);
        this.f109935c = (BuyFlowConfig) BuyFlowConfig.CREATOR.createFromParcel(parcel);
        this.f109936d = bpis.m111965a(parcel.readInt());
        int a = bphs.m111939a(parcel.readInt());
        if (a == 0) {
            this.f109937e = 1;
        } else {
            this.f109937e = a;
        }
    }

    /* renamed from: a */
    public final void mo52464a(Context context, awqi awqi, bxvd bxvd) {
        awqi.mo52467a(this.f109935c, context);
        awqi.f94877l = this.f109919b;
        bpis bpis = this.f109936d;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpht bpht = (bpht) bxvd.f164949b;
        bpht bpht2 = bpht.f137702h;
        bpht.f137705b = bpis.f137811u;
        int i = bpht.f137704a | 1;
        bpht.f137704a = i;
        bpht.f137706c = this.f109937e - 1;
        bpht.f137704a = i | 2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        awyc.m81487a(this.f109935c, parcel, i);
        parcel.writeInt(this.f109936d.f137811u);
        parcel.writeInt(this.f109937e - 1);
    }

    public DocumentUploadLaunchedEvent(BuyFlowConfig buyFlowConfig, String str, bpis bpis) {
        this.f110015m = awnm.m80359a();
        this.f109935c = buyFlowConfig;
        this.f109936d = bpis;
        this.f109937e = 2;
        this.f109918a = str;
        mo59779a(buyFlowConfig);
    }
}
