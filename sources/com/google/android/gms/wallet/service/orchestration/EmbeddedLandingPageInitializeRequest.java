package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EmbeddedLandingPageInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new awtm();

    public EmbeddedLandingPageInitializeRequest(Account account, bwiy bwiy) {
        super(account, (bxxk) bwiy.f159700d.mo74142c(7), bwiy);
    }

    public EmbeddedLandingPageInitializeRequest(Account account, byte[] bArr) {
        super(account, (bxxk) bwiy.f159700d.mo74142c(7), bArr);
    }
}
