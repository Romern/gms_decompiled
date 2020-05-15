package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PaymentMethodsActionEvent extends WalletAnalyticsEvent implements awqn {
    public static final Parcelable.Creator CREATOR = new awdv();

    /* renamed from: a */
    final int f110003a;

    /* renamed from: b */
    final int f110004b;

    /* renamed from: c */
    final int f110005c;

    public PaymentMethodsActionEvent(Parcel parcel) {
        super(parcel);
        this.f110003a = parcel.readInt();
        int a = bpiy.m111973a(parcel.readInt());
        this.f110005c = a == 0 ? 1 : a;
        this.f110004b = parcel.readInt();
    }

    /* renamed from: a */
    public static void m93837a(Context context, String str, int i, int i2) {
        awqc.m80662a(context, new PaymentMethodsActionEvent(str, i, i2, -1));
    }

    /* renamed from: b */
    public static void m93838b(Context context, String str, int i, int i2) {
        awqc.m80662a(context, new PaymentMethodsActionEvent(str, i, 5, i2));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f110003a);
        parcel.writeInt(this.f110005c - 1);
        parcel.writeInt(this.f110004b);
    }

    public PaymentMethodsActionEvent(String str, int i, int i2, int i3) {
        this.f110015m = str;
        this.f110003a = i;
        this.f110005c = i2;
        this.f110004b = i3;
    }

    /* renamed from: a */
    public final void mo52465a(Context context, awqo awqo, bxvd bxvd) {
        bxvd da = bpiz.f137826e.mo74144da();
        int i = this.f110003a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpiz bpiz = (bpiz) da.f164949b;
        int i2 = bpiz.f137828a | 1;
        bpiz.f137828a = i2;
        bpiz.f137829b = i;
        bpiz.f137830c = this.f110005c - 1;
        int i3 = i2 | 2;
        bpiz.f137828a = i3;
        int i4 = this.f110004b;
        bpiz.f137828a = i3 | 4;
        bpiz.f137831d = i4;
        awqo.f94862d.add((bpiz) da.mo74062i());
    }
}
