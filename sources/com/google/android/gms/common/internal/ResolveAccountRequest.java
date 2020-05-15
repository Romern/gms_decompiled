package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ResolveAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new sdq();

    /* renamed from: a */
    final int f30239a;

    /* renamed from: b */
    public final Account f30240b;

    /* renamed from: c */
    public final int f30241c;

    /* renamed from: d */
    public final GoogleSignInAccount f30242d;

    public ResolveAccountRequest(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f30239a = i;
        this.f30240b = account;
        this.f30241c = i2;
        this.f30242d = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f30239a);
        see.m35040a(parcel, 2, this.f30240b, i, false);
        see.m35063b(parcel, 3, this.f30241c);
        see.m35040a(parcel, 4, this.f30242d, i, false);
        see.m35062b(parcel, a);
    }
}
