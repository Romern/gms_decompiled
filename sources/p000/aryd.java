package p000;

import android.accounts.Account;

/* renamed from: aryd */
final /* synthetic */ class aryd implements Runnable {

    /* renamed from: a */
    private final aryf f88445a;

    /* renamed from: b */
    private final Account f88446b;

    public aryd(aryf aryf, Account account) {
        this.f88445a = aryf;
        this.f88446b = account;
    }

    public final void run() {
        aryf aryf = this.f88445a;
        aryf.f88450b.mo59169a(this.f88446b);
    }
}
