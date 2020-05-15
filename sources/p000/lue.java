package p000;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: lue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lue extends dcj implements lug {
    public lue(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.backup.IBackupAccountManagerService");
    }

    /* renamed from: a */
    public final Account mo19604a() {
        Parcel a = mo8526a(1, mo8529bj());
        Account account = (Account) dcl.m8163a(a, Account.CREATOR);
        a.recycle();
        return account;
    }

    /* renamed from: c */
    public final boolean mo19606c() {
        Parcel a = mo8526a(3, mo8529bj());
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo19605a(Account account) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, account);
        mo8528b(2, bj);
    }
}
