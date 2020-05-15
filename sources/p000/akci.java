package p000;

import android.accounts.Account;

/* renamed from: akci */
final /* synthetic */ class akci implements Runnable {

    /* renamed from: a */
    private final akcl f71587a;

    /* renamed from: b */
    private final Account f71588b;

    public akci(akcl akcl, Account account) {
        this.f71587a = akcl;
        this.f71588b = account;
    }

    public final void run() {
        akcl akcl = this.f71587a;
        akcl.f71595c = akcl.mo39213f(this.f71588b);
    }
}
