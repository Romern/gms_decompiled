package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class BaseBuyflowLiteRequest extends GenericLiteProtoParcelable {

    /* renamed from: d */
    private byaa f110369d;

    public BaseBuyflowLiteRequest(Account account, bxxk bxxk, bxxc bxxc, byaa byaa, List list) {
        super(account, bxxk, bxxc, list);
        this.f110369d = byaa;
    }

    /* renamed from: c */
    public final byaa mo60024c() {
        if (this.f110369d == null) {
            this.f110369d = byaa.f165217d;
        }
        return this.f110369d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        bjvp.m104738a(this.f110369d, parcel);
        super.writeToParcel(parcel, i);
    }

    public BaseBuyflowLiteRequest(Account account, bxxk bxxk, byte[] bArr, byaa byaa, List list) {
        super(account, bxxk, bArr, list);
        this.f110369d = byaa;
    }
}
