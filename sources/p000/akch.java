package p000;

import android.accounts.Account;

/* renamed from: akch */
final /* synthetic */ class akch implements Runnable {

    /* renamed from: a */
    private final akcl f71585a;

    /* renamed from: b */
    private final Account f71586b;

    public akch(akcl akcl, Account account) {
        this.f71585a = akcl;
        this.f71586b = account;
    }

    public final void run() {
        akcl akcl = this.f71585a;
        akcl.f71594b.mo39450a(this.f71586b);
    }
}
