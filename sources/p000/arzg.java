package p000;

import java.util.Iterator;

/* renamed from: arzg */
final /* synthetic */ class arzg implements rkl {

    /* renamed from: a */
    private final arzk f88517a;

    /* renamed from: b */
    private final rjx f88518b;

    public arzg(arzk arzk, rjx rjx) {
        this.f88517a = arzk;
        this.f88518b = rjx;
    }

    /* renamed from: a */
    public final void mo9454a(rkk rkk) {
        arzk arzk = this.f88517a;
        rjx rjx = this.f88518b;
        amey b = ((alky) rkk).mo12459b();
        if (b != null) {
            Iterator it = b.iterator();
            while (it.hasNext()) {
                alzr alzr = (alzr) it.next();
                String c = alzr.mo41063c();
                arzk.f88523a.put(c, alzr.mo41064d());
                for (arzj arzj : arzk.f88525c) {
                    arzj.mo48967a();
                }
                rjx.mo24713a(c, 1, 0).mo9458a(new arzi(arzk, c));
            }
            b.mo12460c();
        }
    }
}
