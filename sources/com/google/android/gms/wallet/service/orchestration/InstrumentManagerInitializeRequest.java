package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InstrumentManagerInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new awue();

    public InstrumentManagerInitializeRequest(Account account, bmru bmru) {
        super(account, (bxxk) bmru.f130581d.mo74142c(7), bmru);
    }

    public InstrumentManagerInitializeRequest(Account account, byte[] bArr) {
        super(account, (bxxk) bmru.f130581d.mo74142c(7), bArr);
    }
}
