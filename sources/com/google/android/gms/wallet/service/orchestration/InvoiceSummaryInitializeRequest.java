package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InvoiceSummaryInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new awuh();

    public InvoiceSummaryInitializeRequest(Account account, bwjq bwjq) {
        super(account, (bxxk) bwjq.f159852d.mo74142c(7), bwjq, (List) null);
    }

    public InvoiceSummaryInitializeRequest(Account account, byte[] bArr) {
        super(account, (bxxk) bwjq.f159852d.mo74142c(7), bArr, (List) null);
    }
}
