package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PurchaseManagerSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new awwd();

    public PurchaseManagerSubmitRequest(Account account, bwka bwka, List list) {
        super(account, (bxxk) bwka.f159929d.mo74142c(7), bwka, list);
    }

    public PurchaseManagerSubmitRequest(Account account, byte[] bArr, List list) {
        super(account, (bxxk) bwka.f159929d.mo74142c(7), bArr, list);
    }
}
