package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GenericSelectorInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new awtv();

    public GenericSelectorInitializeRequest(Account account, bmrb bmrb) {
        super(account, (bxxk) bmrb.f130459e.mo74142c(7), bmrb);
    }

    public GenericSelectorInitializeRequest(Account account, byte[] bArr) {
        super(account, (bxxk) bmrb.f130459e.mo74142c(7), bArr);
    }
}
