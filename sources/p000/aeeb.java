package p000;

import android.accounts.Account;

/* renamed from: aeeb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class aeeb {
    /* renamed from: a */
    public static aeeb m51684a(bxvp bxvp) {
        return new aecp(bxvp, null, true);
    }

    /* renamed from: a */
    public abstract bxvp mo34046a();

    /* renamed from: b */
    public abstract Account mo34047b();

    /* renamed from: c */
    public abstract boolean mo34048c();

    /* renamed from: d */
    public abstract String mo34049d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Account mo34072e() {
        bmxy.m108601b(!mo34048c(), "Must not ask for account for allAccounts key.");
        return mo34047b();
    }

    /* renamed from: a */
    public static aeeb m51685a(bxvp bxvp, Account account) {
        return new aecp(bxvp, account, false);
    }
}
