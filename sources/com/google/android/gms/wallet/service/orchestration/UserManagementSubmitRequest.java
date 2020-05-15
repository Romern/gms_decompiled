package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UserManagementSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new awwq();

    public UserManagementSubmitRequest(Account account, bwlh bwlh, List list) {
        super(account, (bxxk) bwlh.f160123d.mo74142c(7), bwlh, list);
    }

    public UserManagementSubmitRequest(Account account, byte[] bArr, List list) {
        super(account, (bxxk) bwlh.f160123d.mo74142c(7), bArr, list);
    }
}
