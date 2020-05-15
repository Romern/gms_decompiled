package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountRemovalAllowedWorkflowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new iyj();

    /* renamed from: a */
    public AccountAuthenticatorResponse f10767a;

    /* renamed from: b */
    public Account f10768b;

    /* renamed from: c */
    public boolean f10769c;

    public AccountRemovalAllowedWorkflowRequest(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, boolean z) {
        sdo.checkIfNull(account, "account cannot be null");
        this.f10768b = account;
        sdo.checkIfNull(accountAuthenticatorResponse, "amResponse cannot be null");
        this.f10767a = accountAuthenticatorResponse;
        this.f10769c = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f10767a, i, false);
        see.m35040a(parcel, 2, this.f10768b, i, false);
        see.m35051a(parcel, 3, this.f10769c);
        see.m35062b(parcel, a);
    }
}
