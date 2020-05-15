package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UserManagementInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new awwp();

    public UserManagementInitializeRequest(Account account, bwld bwld) {
        super(account, (bxxk) bwld.f160092d.mo74142c(7), bwld);
    }

    public UserManagementInitializeRequest(Account account, byte[] bArr) {
        super(account, (bxxk) bwld.f160092d.mo74142c(7), bArr);
    }
}
