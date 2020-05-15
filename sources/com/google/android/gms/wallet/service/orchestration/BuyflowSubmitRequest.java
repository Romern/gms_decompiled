package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BuyflowSubmitRequest extends BaseBuyflowLiteRequest {
    public static final Parcelable.Creator CREATOR = new awtk();

    /* renamed from: d */
    public final byte[] f110383d;

    /* renamed from: e */
    public final blzf f110384e;

    public BuyflowSubmitRequest(Account account, blyq blyq, byte[] bArr, blzf blzf, byaa byaa, List list) {
        super(account, (bxxk) blyq.f128291f.mo74142c(7), blyq, byaa, list);
        this.f110383d = bArr;
        this.f110384e = blzf;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f110383d);
        bjvp.m104738a(this.f110384e, parcel);
        super.writeToParcel(parcel, i);
    }

    public BuyflowSubmitRequest(Account account, byte[] bArr, byte[] bArr2, blzf blzf, byaa byaa, List list) {
        super(account, (bxxk) blyq.f128291f.mo74142c(7), bArr, byaa, list);
        this.f110383d = bArr2;
        this.f110384e = blzf;
    }
}
