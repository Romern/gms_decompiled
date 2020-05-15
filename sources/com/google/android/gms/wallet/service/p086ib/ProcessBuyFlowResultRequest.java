package com.google.android.gms.wallet.service.p086ib;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.wallet.service.ib.ProcessBuyFlowResultRequest */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ProcessBuyFlowResultRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new awsr();

    /* renamed from: a */
    public final byte[] f110356a;

    /* renamed from: b */
    public final byte[] f110357b;

    /* renamed from: c */
    public final IbBuyFlowInput f110358c;

    /* renamed from: d */
    public final IbMerchantParameters f110359d;

    /* renamed from: e */
    public final int f110360e;

    public ProcessBuyFlowResultRequest(IbBuyFlowInput ibBuyFlowInput, IbMerchantParameters ibMerchantParameters, byte[] bArr, byte[] bArr2, int i) {
        this.f110358c = ibBuyFlowInput;
        this.f110359d = ibMerchantParameters;
        this.f110356a = bArr;
        this.f110357b = bArr2;
        this.f110360e = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f110358c, i);
        parcel.writeParcelable(this.f110359d, i);
        parcel.writeByteArray(this.f110356a);
        parcel.writeByteArray(this.f110357b);
        parcel.writeInt(this.f110360e);
    }
}
