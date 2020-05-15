package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InstrumentManagerSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new awug();

    public InstrumentManagerSubmitRequest(Account account, bmsb bmsb, List list) {
        super(account, (bxxk) bmsb.f130640e.mo74142c(7), bmsb, list);
    }

    public InstrumentManagerSubmitRequest(Account account, byte[] bArr, List list) {
        super(account, (bxxk) bmsb.f130640e.mo74142c(7), bArr, list);
    }
}
