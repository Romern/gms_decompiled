package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BuyflowRefreshRequest extends BaseBuyflowLiteRequest {
    public static final Parcelable.Creator CREATOR = new awti();

    public BuyflowRefreshRequest(Account account, blyo blyo, byaa byaa, List list) {
        super(account, (bxxk) blyo.f128277e.mo74142c(7), blyo, byaa, list);
    }

    public BuyflowRefreshRequest(Account account, byte[] bArr, byaa byaa, List list) {
        super(account, (bxxk) blyo.f128277e.mo74142c(7), bArr, byaa, list);
    }
}
