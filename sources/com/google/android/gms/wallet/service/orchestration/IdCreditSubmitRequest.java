package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IdCreditSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new awud();

    public IdCreditSubmitRequest(Account account, bmrq bmrq, List list) {
        super(account, (bxxk) bmrq.f130560d.mo74142c(7), bmrq, list);
    }

    public IdCreditSubmitRequest(Account account, byte[] bArr, List list) {
        super(account, (bxxk) bmrq.f130560d.mo74142c(7), bArr, list);
    }
}
