package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GenericSelectorSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new awtw();

    public GenericSelectorSubmitRequest(Account account, bmrh bmrh) {
        super(account, (bxxk) bmrh.f130490d.mo74142c(7), bmrh);
    }

    public GenericSelectorSubmitRequest(Account account, byte[] bArr) {
        super(account, (bxxk) bmrh.f130490d.mo74142c(7), bArr);
    }
}
