package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OrchestrationDcbEvent extends WalletAnalyticsEvent implements awqn {
    public static final Parcelable.Creator CREATOR = new awdg();

    /* renamed from: a */
    private final int f109965a;

    public OrchestrationDcbEvent(Parcel parcel) {
        super(parcel);
        int a = bphp.m111936a(parcel.readInt());
        if (a == 0) {
            this.f109965a = 1;
        } else {
            this.f109965a = a;
        }
    }

    /* renamed from: a */
    public static void m93820a(Context context, String str, int i) {
        awqc.m80662a(context, new OrchestrationDcbEvent(str, i));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f109965a - 1);
    }

    public OrchestrationDcbEvent(String str, int i) {
        this.f110015m = str;
        this.f109965a = i;
    }

    /* renamed from: a */
    public final void mo52465a(Context context, awqo awqo, bxvd bxvd) {
        bxvd da = bphq.f137697c.mo74144da();
        int i = this.f109965a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bphq bphq = (bphq) da.f164949b;
        bphq.f137700b = i - 1;
        bphq.f137699a |= 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bphe bphe = (bphe) bxvd.f164949b;
        bphq bphq2 = (bphq) da.mo74062i();
        bphe bphe2 = bphe.f137630n;
        bphq2.getClass();
        bphe.f137637f = bphq2;
        bphe.f137632a |= 4;
    }
}
