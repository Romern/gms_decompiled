package p000;

import android.accounts.Account;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: akes */
final /* synthetic */ class akes implements Callable {

    /* renamed from: a */
    private final akgy f71757a;

    public akes(akgy akgy) {
        this.f71757a = akgy;
    }

    public final Object call() {
        akcm akcm = this.f71757a.f71947n;
        ArrayList arrayList = new ArrayList();
        Account b = akcm.f71604c.mo39171b();
        if (b != null && !akcm.f71602a.mo39437c(b)) {
            akcm.f71602a.mo39432a(b);
            akcv akcv = akcm.f71603b;
            Boolean bool = (Boolean) ahhf.m55773a("updateContactsReachability", aucu.m76780a(akcv.f71620e, new akcr(akcv, b)), cfov.m142058k());
            if (bool == null || !bool.booleanValue()) {
                akcm.f71602a.mo39433a();
            }
        }
        bxwc bxwc = akcm.f71602a.mo39436b(b).f70709a;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(akcm.m59393a((ajif) bxwc.get(i)));
        }
        return arrayList;
    }
}
