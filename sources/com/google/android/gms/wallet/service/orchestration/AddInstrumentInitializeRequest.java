package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AddInstrumentInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new awtb();

    public AddInstrumentInitializeRequest(Account account, blxm blxm) {
        super(account, (bxxk) blxm.f128081e.mo74142c(7), blxm, (List) null);
    }

    public AddInstrumentInitializeRequest(Account account, byte[] bArr) {
        super(account, (bxxk) blxm.f128081e.mo74142c(7), bArr, (List) null);
    }
}
