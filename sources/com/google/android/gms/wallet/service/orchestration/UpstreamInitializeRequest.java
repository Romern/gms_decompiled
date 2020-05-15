package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UpstreamInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new awwm();

    public UpstreamInitializeRequest(Account account, bwkw bwkw) {
        super(account, (bxxk) bwkw.f160057d.mo74142c(7), bwkw);
    }

    public UpstreamInitializeRequest(Account account, byte[] bArr) {
        super(account, (bxxk) bwkw.f160057d.mo74142c(7), bArr);
    }
}
