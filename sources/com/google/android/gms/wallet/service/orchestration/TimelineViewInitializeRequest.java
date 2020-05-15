package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TimelineViewInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new awwk();

    public TimelineViewInitializeRequest(Account account, bwkp bwkp) {
        super(account, (bxxk) bwkp.f159995d.mo74142c(7), bwkp);
    }

    public TimelineViewInitializeRequest(Account account, byte[] bArr) {
        super(account, (bxxk) bwkp.f159995d.mo74142c(7), bArr);
    }
}
