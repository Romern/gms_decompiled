package com.google.android.gms.wallet.service.p086ib;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.FullWallet;

/* renamed from: com.google.android.gms.wallet.service.ib.LoadFullWalletServiceResponse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LoadFullWalletServiceResponse implements Parcelable, awyg {
    public static final Parcelable.Creator CREATOR = new awsf();

    /* renamed from: a */
    public final Bundle f110348a;

    /* renamed from: b */
    public final FullWallet f110349b;

    /* renamed from: c */
    public final int f110350c;

    public LoadFullWalletServiceResponse(Bundle bundle, FullWallet fullWallet, int i) {
        this.f110349b = fullWallet;
        this.f110348a = bundle;
        this.f110350c = i;
    }

    /* renamed from: a */
    public final boolean mo52756a() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f110348a, i);
        parcel.writeParcelable(this.f110349b, i);
        parcel.writeInt(this.f110350c);
    }
}
