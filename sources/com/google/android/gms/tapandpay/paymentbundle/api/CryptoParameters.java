package com.google.android.gms.tapandpay.paymentbundle.api;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CryptoParameters implements Parcelable {
    public static final Parcelable.Creator CREATOR = new atck();

    /* renamed from: c */
    public static final CryptoParameters f108620c = new CryptoParameters(btli.f149372c, new byte[0]);

    /* renamed from: a */
    public final btli f108621a;

    /* renamed from: b */
    public final byte[] f108622b;

    public CryptoParameters(btli btli, byte[] bArr) {
        this.f108621a = btli;
        this.f108622b = bArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte[] k = this.f108621a.mo73642k();
        parcel.writeInt(k.length);
        parcel.writeByteArray(k);
        parcel.writeInt(this.f108622b.length);
        parcel.writeByteArray(this.f108622b);
    }
}
