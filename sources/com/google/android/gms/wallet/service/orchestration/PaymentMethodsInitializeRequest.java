package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PaymentMethodsInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new awwa();

    public PaymentMethodsInitializeRequest(Account account, bmsi bmsi) {
        super(account, (bxxk) bmsi.f130680e.mo74142c(7), bmsi);
    }

    public PaymentMethodsInitializeRequest(Account account, byte[] bArr) {
        super(account, (bxxk) bmsi.f130680e.mo74142c(7), bArr);
    }
}
