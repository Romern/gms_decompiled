package p000;

import java.util.Iterator;

/* renamed from: akzk */
final /* synthetic */ class akzk implements rkl {

    /* renamed from: a */
    private final akzl f73163a;

    /* renamed from: b */
    private final String f73164b;

    /* renamed from: c */
    private final Runnable f73165c;

    public akzk(akzl akzl, String str, Runnable runnable) {
        this.f73163a = akzl;
        this.f73164b = str;
        this.f73165c = runnable;
    }

    /* renamed from: a */
    public final void mo9454a(rkk rkk) {
        akzl akzl = this.f73163a;
        String str = this.f73164b;
        Runnable runnable = this.f73165c;
        alky alky = (alky) rkk;
        try {
            if (alky.mo12459b() != null) {
                Iterator it = alky.mo12459b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    alzr alzr = (alzr) it.next();
                    if (alzr.mo41071l() && str.equals(alzr.mo41063c())) {
                        akzl.f73167b.mo2450b(alzr.mo41064d());
                        break;
                    }
                }
                if (akzl.f73167b.mo2448b() == null) {
                    if (runnable != null && cfri.m142691b()) {
                        runnable.run();
                    }
                }
            }
        } finally {
            alky.mo12460c();
        }
    }
}
