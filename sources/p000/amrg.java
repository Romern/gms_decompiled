package p000;

import android.accounts.Account;
import android.os.Bundle;
import java.util.List;

/* renamed from: amrg */
final /* synthetic */ class amrg implements Runnable {

    /* renamed from: a */
    private final amrm f75799a;

    public amrg(amrm amrm) {
        this.f75799a = amrm;
    }

    public final void run() {
        amrm amrm = this.f75799a;
        Bundle c = amrm.m63204c();
        c.putBoolean("periodic_sync", true);
        List a = amrm.mo41277a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            amrm.mo41278a((Account) a.get(i), c);
        }
    }
}
