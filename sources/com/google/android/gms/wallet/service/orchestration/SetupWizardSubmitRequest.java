package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetupWizardSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new awwh();

    public SetupWizardSubmitRequest(Account account, bwgq bwgq, List list) {
        super(account, (bxxk) bwgq.f159244d.mo74142c(7), bwgq, list);
    }

    public SetupWizardSubmitRequest(Account account, byte[] bArr, List list) {
        super(account, (bxxk) bwgq.f159244d.mo74142c(7), bArr, list);
    }
}
