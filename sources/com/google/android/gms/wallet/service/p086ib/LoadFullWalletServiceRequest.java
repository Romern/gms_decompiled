package com.google.android.gms.wallet.service.p086ib;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.FullWalletRequest;

/* renamed from: com.google.android.gms.wallet.service.ib.LoadFullWalletServiceRequest */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LoadFullWalletServiceRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new awse();

    /* renamed from: a */
    public final Bundle f110345a;

    /* renamed from: b */
    public final FullWalletRequest f110346b;

    /* renamed from: c */
    public final boolean f110347c;

    public LoadFullWalletServiceRequest(Bundle bundle, FullWalletRequest fullWalletRequest, boolean z) {
        this.f110345a = bundle;
        this.f110346b = fullWalletRequest;
        this.f110347c = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f110345a, i);
        parcel.writeParcelable(this.f110346b, i);
        parcel.writeByte(this.f110347c ? (byte) 1 : 0);
    }
}
