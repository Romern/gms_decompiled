package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetInstrumentAvailabilityServerRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new awtx();

    public GetInstrumentAvailabilityServerRequest(Account account, bwke bwke) {
        super(account, (bxxk) bwke.f159958f.mo74142c(7), bwke);
    }

    public GetInstrumentAvailabilityServerRequest(Account account, byte[] bArr) {
        super(account, (bxxk) bwke.f159958f.mo74142c(7), bArr);
    }
}
