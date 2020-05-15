package p000;

import android.accounts.Account;
import android.os.Bundle;
import java.util.List;

/* renamed from: amri */
final /* synthetic */ class amri implements Runnable {

    /* renamed from: a */
    private final amrm f75801a;

    public amri(amrm amrm) {
        this.f75801a = amrm;
    }

    public final void run() {
        amrm amrm = this.f75801a;
        Bundle c = amrm.m63204c();
        c.putString("feed", "plusfeed");
        List a = amrm.mo41277a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            amrm.mo41278a((Account) a.get(i), c);
        }
    }
}
