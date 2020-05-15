package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FixInstrumentSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new awtt();

    public FixInstrumentSubmitRequest(Account account, bwjo bwjo, List list) {
        super(account, (bxxk) bwjo.f159838d.mo74142c(7), bwjo, list);
    }

    public FixInstrumentSubmitRequest(Account account, byte[] bArr, List list) {
        super(account, (bxxk) bwjo.f159838d.mo74142c(7), bArr, list);
    }
}
