package p000;

import android.accounts.Account;

/* renamed from: akcf */
final /* synthetic */ class akcf implements Runnable {

    /* renamed from: a */
    private final akcl f71583a;

    public akcf(akcl akcl) {
        this.f71583a = akcl;
    }

    public final void run() {
        akcl akcl = this.f71583a;
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akcl", "i", 269, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Running certificates syncing task.");
        akcl.mo39207d();
        Account b = akcl.f71593a.mo39171b();
        if (b != null && !akcl.f71595c) {
            akcl.f71595c = akcl.mo39213f(b);
        }
    }
}
