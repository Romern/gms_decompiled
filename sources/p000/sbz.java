package p000;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: sbz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sbz extends dcj implements scb {
    public sbz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    /* renamed from: a */
    public final Account mo25275a() {
        Parcel a = mo8526a(2, mo8529bj());
        Account account = (Account) dcl.m8163a(a, Account.CREATOR);
        a.recycle();
        return account;
    }
}
