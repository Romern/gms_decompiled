package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PurchaseManagerInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new awwc();

    public PurchaseManagerInitializeRequest(Account account, bwjw bwjw) {
        super(account, (bxxk) bwjw.f159882e.mo74142c(7), bwjw, (List) null);
    }

    public PurchaseManagerInitializeRequest(Account account, byte[] bArr) {
        super(account, (bxxk) bwjw.f159882e.mo74142c(7), bArr, (List) null);
    }
}
