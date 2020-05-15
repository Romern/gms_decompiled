package p000;

import android.accounts.Account;
import java.util.List;

/* renamed from: akcg */
final /* synthetic */ class akcg implements Runnable {

    /* renamed from: a */
    private final akcl f71584a;

    public akcg(akcl akcl) {
        this.f71584a = akcl;
    }

    public final void run() {
        akcl akcl = this.f71584a;
        Account b = akcl.f71593a.mo39171b();
        if (b != null) {
            List b2 = akcl.f71594b.mo39454b(b);
            if (!b2.isEmpty()) {
                akcl.mo39192a(b, b2);
            }
        }
    }
}
