package p000;

import android.accounts.Account;

/* renamed from: alik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alik implements alif {

    /* renamed from: a */
    private final alie f73535a;

    public alik(alie alie) {
        this.f73535a = alie;
    }

    /* renamed from: a */
    public final String mo40363a() {
        String str = this.f73535a.f73532b;
        cazf.m127593a(str, "Cannot return null from a non-@Nullable @Provides method");
        return str;
    }

    /* renamed from: b */
    public final String mo40364b() {
        String str = this.f73535a.f73531a;
        cazf.m127593a(str, "Cannot return null from a non-@Nullable @Provides method");
        return str;
    }

    /* renamed from: c */
    public final Account mo40365c() {
        Account account = new Account(this.f73535a.f73531a, "com.google");
        cazf.m127593a(account, "Cannot return null from a non-@Nullable @Provides method");
        return account;
    }
}
