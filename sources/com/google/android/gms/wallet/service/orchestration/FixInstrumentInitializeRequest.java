package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FixInstrumentInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new awts();

    public FixInstrumentInitializeRequest(Account account, bwjk bwjk) {
        super(account, (bxxk) bwjk.f159796e.mo74142c(7), bwjk, (List) null);
    }

    public FixInstrumentInitializeRequest(Account account, byte[] bArr) {
        super(account, (bxxk) bwjk.f159796e.mo74142c(7), bArr, (List) null);
    }
}
