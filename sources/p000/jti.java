package p000;

import android.accounts.Account;

/* renamed from: jti */
final /* synthetic */ class jti implements Runnable {

    /* renamed from: a */
    private final jtj f23177a;

    /* renamed from: b */
    private final Account f23178b;

    public jti(jtj jtj, Account account) {
        this.f23177a = jtj;
        this.f23178b = account;
    }

    public final void run() {
        this.f23177a.f23180b.f11256f.mo26119b(this.f23178b.name);
    }
}
