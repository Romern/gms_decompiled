package com.google.android.gms.wallet.idcredit;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IdCreditResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new awmr();

    /* renamed from: a */
    public byte[] f110242a;

    public IdCreditResult(byte[] bArr) {
        this.f110242a = bArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f110242a);
    }
}
