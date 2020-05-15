package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UpstreamSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new awwn();

    public UpstreamSubmitRequest(Account account, bwkz bwkz) {
        super(account, (bxxk) bwkz.f160071d.mo74142c(7), bwkz);
    }

    public UpstreamSubmitRequest(Account account, byte[] bArr) {
        super(account, (bxxk) bwkz.f160071d.mo74142c(7), bArr);
    }
}
