package p000;

import android.util.Pair;
import java.util.Collections;

/* renamed from: asle */
final /* synthetic */ class asle implements C0038ax {

    /* renamed from: a */
    private final asli f89158a;

    public asle(asli asli) {
        this.f89158a = asli;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        asli asli = this.f89158a;
        Pair pair = (Pair) obj;
        asly asly = (asly) pair.first;
        int a = asli.mo49224a(asly);
        asli.mo158M(a);
        aslx aslx = aslx.LOADING;
        int ordinal = ((aslx) pair.second).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                asli.f89163a.remove(asly);
                if (!asli.f89164d.contains(asly)) {
                    asli.f89164d.add(asly);
                    Collections.sort(asli.f89164d, aslf.f89159a);
                }
            } else if (ordinal == 2) {
                asli.f89164d.remove(asly);
                if (!asli.f89163a.contains(asly)) {
                    asli.f89163a.add(asly);
                    Collections.sort(asli.f89163a, aslg.f89160a);
                }
            }
            int a2 = asli.mo49224a(asly);
            if (a == -1) {
                asli.mo159N(a2);
            } else if (a != a2) {
                asli.mo173b(a, a2);
            }
            asli.mo158M(asli.mo49225c());
        }
    }
}
