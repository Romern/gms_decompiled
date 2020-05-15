package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PaymentMethodsSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new awwb();

    public PaymentMethodsSubmitRequest(Account account, bmsn bmsn, List list) {
        super(account, (bxxk) bmsn.f130714d.mo74142c(7), bmsn, list);
    }

    public PaymentMethodsSubmitRequest(Account account, byte[] bArr, List list) {
        super(account, (bxxk) bmsn.f130714d.mo74142c(7), bArr, list);
    }
}
