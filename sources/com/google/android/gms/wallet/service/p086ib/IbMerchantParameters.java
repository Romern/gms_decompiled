package com.google.android.gms.wallet.service.p086ib;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.wallet.service.ib.IbMerchantParameters */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IbMerchantParameters implements Parcelable {
    public static final Parcelable.Creator CREATOR = new awrp();

    /* renamed from: a */
    public int f110342a;

    /* renamed from: b */
    public String f110343b;

    /* renamed from: c */
    public boolean f110344c;

    public IbMerchantParameters(int i, String str, boolean z) {
        this.f110342a = i;
        this.f110343b = str;
        this.f110344c = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f110342a);
        parcel.writeString(this.f110343b);
        parcel.writeByte(this.f110344c ? (byte) 1 : 0);
    }
}
