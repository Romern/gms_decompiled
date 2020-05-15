package p000;

import android.accounts.Account;

/* renamed from: akzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akzl {

    /* renamed from: a */
    public final C0034at f73166a = new C0034at();

    /* renamed from: b */
    public final C0034at f73167b = new C0034at();

    /* renamed from: c */
    public final C0034at f73168c = new C0034at();

    /* renamed from: d */
    private final rjx f73169d;

    public akzl() {
        allp allp = new allp();
        allp.f73626a = 560;
        this.f73169d = allr.m61237d(rpr.m34216b(), allp.mo40491a());
    }

    /* renamed from: a */
    public final String mo40018a() {
        return (String) this.f73166a.mo2448b();
    }

    /* renamed from: b */
    public final String mo40022b() {
        return (String) this.f73167b.mo2448b();
    }

    /* renamed from: c */
    public final Account mo40023c() {
        return (Account) this.f73168c.mo2448b();
    }

    /* renamed from: a */
    public final void mo40019a(Account account) {
        mo40020a(account, (Runnable) null);
    }

    /* renamed from: a */
    public final void mo40020a(Account account, Runnable runnable) {
        if (!account.equals(this.f73168c.mo2448b())) {
            this.f73168c.mo2450b(account);
            this.f73166a.mo2450b(account.name);
            this.f73167b.mo2450b((Object) null);
            mo40021a(account.name, runnable);
        }
    }

    /* renamed from: a */
    public final void mo40021a(String str, Runnable runnable) {
        this.f73169d.mo24710a((alkx) null).mo9458a(new akzk(this, str, runnable));
    }
}
