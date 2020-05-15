package p000;

import java.util.Iterator;

/* renamed from: tuo */
public final /* synthetic */ class tuo implements rkl {

    /* renamed from: a */
    private final tuq f46686a;

    /* renamed from: b */
    private final String f46687b;

    public tuo(tuq tuq, String str) {
        this.f46686a = tuq;
        this.f46687b = str;
    }

    /* renamed from: a */
    public final void mo9454a(rkk rkk) {
        tuq tuq = this.f46686a;
        String str = this.f46687b;
        alky alky = (alky) rkk;
        try {
            if (alky.mo7183bo().mo17710c()) {
                Iterator it = alky.mo12459b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    alzr alzr = (alzr) it.next();
                    if (alzr.mo41063c().equals(str)) {
                        tuq.f46696e = alzr.mo41064d();
                        tuq.mo26816a(tuq.f46695d, str, tuq.f46696e);
                        break;
                    }
                }
            }
        } finally {
            alky.mo12460c();
        }
    }
}
