package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EmbeddedSettingsInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new awto();

    public EmbeddedSettingsInitializeRequest(Account account, bwje bwje) {
        super(account, (bxxk) bwje.f159748d.mo74142c(7), bwje);
    }

    public EmbeddedSettingsInitializeRequest(Account account, byte[] bArr) {
        super(account, (bxxk) bwje.f159748d.mo74142c(7), bArr);
    }
}
