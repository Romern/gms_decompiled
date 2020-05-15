package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new saa();

    /* renamed from: a */
    final int f30204a;
    @Deprecated

    /* renamed from: b */
    public final IBinder f30205b;

    /* renamed from: c */
    public final Scope[] f30206c;

    /* renamed from: d */
    public Integer f30207d;

    /* renamed from: e */
    public Integer f30208e;

    /* renamed from: f */
    public Account f30209f;

    public AuthAccountRequest(int i, IBinder iBinder, Scope[] scopeArr, Integer num, Integer num2, Account account) {
        this.f30204a = i;
        this.f30205b = iBinder;
        this.f30206c = scopeArr;
        this.f30207d = num;
        this.f30208e = num2;
        this.f30209f = account;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AuthAccountRequest(Account account, Set set) {
        this(3, null, (Scope[]) set.toArray(new Scope[set.size()]), null, null, account);
        sdo.m34959a(account);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f30204a);
        see.m35038a(parcel, 2, this.f30205b);
        see.m35057a(parcel, 3, this.f30206c, i);
        see.m35044a(parcel, 4, this.f30207d);
        see.m35044a(parcel, 5, this.f30208e);
        see.m35040a(parcel, 6, this.f30209f, i, false);
        see.m35062b(parcel, a);
    }
}
