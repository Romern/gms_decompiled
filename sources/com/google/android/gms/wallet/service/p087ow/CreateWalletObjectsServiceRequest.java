package com.google.android.gms.wallet.service.p087ow;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.wallet.service.ow.CreateWalletObjectsServiceRequest */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CreateWalletObjectsServiceRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new awwu();

    /* renamed from: a */
    public final Account f110390a;

    /* renamed from: b */
    public btro f110391b;

    /* renamed from: c */
    public byte[] f110392c;

    public CreateWalletObjectsServiceRequest(Account account, btro btro) {
        this.f110390a = account;
        this.f110391b = btro;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.f110390a.writeToParcel(parcel, i);
        if (this.f110392c == null) {
            this.f110392c = this.f110391b.mo73642k();
        }
        parcel.writeByteArray(this.f110392c);
    }

    public CreateWalletObjectsServiceRequest(Account account, byte[] bArr) {
        this.f110390a = account;
        this.f110392c = bArr;
    }
}
