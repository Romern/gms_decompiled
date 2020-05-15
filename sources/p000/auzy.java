package p000;

import android.accounts.Account;

/* renamed from: auzy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auzy implements rjf {

    /* renamed from: a */
    private final Account f92844a;

    public auzy(Account account) {
        sdo.m34966a(account, "Must provide a valid account!");
        this.f92844a = account;
    }

    /* renamed from: b */
    public final Account mo24205b() {
        return this.f92844a;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof auzy) && this.f92844a.equals(((auzy) obj).f92844a));
    }

    public final int hashCode() {
        return this.f92844a.hashCode();
    }

    public auzy(String str) {
        this(new Account(str, "com.google"));
    }
}
