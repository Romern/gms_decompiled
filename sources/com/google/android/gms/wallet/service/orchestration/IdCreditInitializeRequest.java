package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IdCreditInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new awub();

    public IdCreditInitializeRequest(Account account, bmrj bmrj) {
        super(account, (bxxk) bmrj.f130504d.mo74142c(7), bmrj);
    }

    public IdCreditInitializeRequest(Account account, byte[] bArr) {
        super(account, (bxxk) bmrj.f130504d.mo74142c(7), bArr);
    }
}
