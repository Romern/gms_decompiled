package com.google.android.gms.wallet.firstparty.bootstrap;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PaymentMethodsWidgetOptions extends BaseWidgetOptions {
    public static final Parcelable.Creator CREATOR = new awkw();

    /* renamed from: a */
    public boolean f110173a;

    public PaymentMethodsWidgetOptions() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f110173a ? 1 : 0);
    }

    public PaymentMethodsWidgetOptions(Parcel parcel) {
        this.f110173a = parcel.readInt() != 1 ? false : true;
    }
}
