package com.google.android.gms.wallet.service.p086ib;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.MaskedWalletRequest;

/* renamed from: com.google.android.gms.wallet.service.ib.LoadMaskedWalletServiceRequest */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LoadMaskedWalletServiceRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new awsh();

    /* renamed from: a */
    public final Bundle f110351a;

    /* renamed from: b */
    public final MaskedWalletRequest f110352b;

    public LoadMaskedWalletServiceRequest(Bundle bundle, MaskedWalletRequest maskedWalletRequest) {
        this.f110351a = bundle;
        this.f110352b = maskedWalletRequest;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f110351a, i);
        parcel.writeParcelable(this.f110352b, i);
    }
}
