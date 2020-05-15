package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AddInstrumentSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new awtc();

    public AddInstrumentSubmitRequest(Account account, blxq blxq, List list) {
        super(account, (bxxk) blxq.f128116d.mo74142c(7), blxq, list);
    }

    public AddInstrumentSubmitRequest(Account account, byte[] bArr, List list) {
        super(account, (bxxk) blxq.f128116d.mo74142c(7), bArr, list);
    }
}
