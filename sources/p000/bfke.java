package p000;

import android.accounts.Account;

/* renamed from: bfke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bfke {
    /* renamed from: a */
    public final Account mo61824a(String str) {
        Account[] a = mo61822a();
        for (Account account : a) {
            if (account.name.equals(str)) {
                return account;
            }
        }
        return null;
    }

    /* renamed from: a */
    public abstract Account[] mo61822a();

    /* renamed from: a */
    public final boolean mo61825a(Account account) {
        for (Account account2 : mo61822a()) {
            if (account.equals(account2)) {
                return true;
            }
        }
        return false;
    }
}
