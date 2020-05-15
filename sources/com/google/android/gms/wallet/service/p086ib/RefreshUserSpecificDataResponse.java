package com.google.android.gms.wallet.service.p086ib;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.wallet.service.ib.RefreshUserSpecificDataResponse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RefreshUserSpecificDataResponse implements Parcelable, awyg {
    public static final Parcelable.Creator CREATOR = new awsw();

    /* renamed from: a */
    public final IbBuyFlowInput f110366a;

    /* renamed from: b */
    public final int f110367b;

    /* renamed from: c */
    public final int f110368c;

    public RefreshUserSpecificDataResponse(IbBuyFlowInput ibBuyFlowInput, int i, int i2) {
        this.f110366a = ibBuyFlowInput;
        this.f110367b = i;
        this.f110368c = i2;
    }

    /* renamed from: a */
    public final boolean mo52756a() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f110366a, i);
        parcel.writeInt(this.f110367b);
        int i2 = this.f110368c;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            return;
        }
        throw null;
    }
}
