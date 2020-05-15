package com.google.android.gms.wallet.service.orchestration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BuyflowResponse implements Parcelable, awyg {
    public static final Parcelable.Creator CREATOR = new awtj();

    /* renamed from: a */
    public final ServerResponse f110380a;

    /* renamed from: b */
    public final byaa f110381b;

    /* renamed from: c */
    public int f110382c = 1;

    public BuyflowResponse(ServerResponse serverResponse, byaa byaa) {
        this.f110380a = serverResponse;
        this.f110381b = byaa;
    }

    /* renamed from: a */
    public final boolean mo52756a() {
        return this.f110380a.mo52756a();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        bjvp.m104738a(this.f110381b, parcel);
        this.f110380a.writeToParcel(parcel, i);
        int i2 = this.f110382c;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            return;
        }
        throw null;
    }
}
