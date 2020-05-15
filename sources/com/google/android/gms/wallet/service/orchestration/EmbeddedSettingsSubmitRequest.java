package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EmbeddedSettingsSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new awtp();

    public EmbeddedSettingsSubmitRequest(Account account, bwji bwji, List list) {
        super(account, (bxxk) bwji.f159782d.mo74142c(7), bwji, list);
    }

    public EmbeddedSettingsSubmitRequest(Account account, byte[] bArr, List list) {
        super(account, (bxxk) bwji.f159782d.mo74142c(7), bArr, list);
    }
}
