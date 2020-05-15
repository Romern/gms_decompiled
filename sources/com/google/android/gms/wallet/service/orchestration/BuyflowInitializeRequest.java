package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BuyflowInitializeRequest extends BaseBuyflowLiteRequest {
    public static final Parcelable.Creator CREATOR = new awth();

    public BuyflowInitializeRequest(Account account, blxw blxw, byaa byaa) {
        super(account, (bxxk) blxw.f128152f.mo74142c(7), blxw, byaa, (List) null);
    }

    public BuyflowInitializeRequest(Account account, byte[] bArr, byaa byaa) {
        super(account, (bxxk) blxw.f128152f.mo74142c(7), bArr, byaa, (List) null);
    }
}
