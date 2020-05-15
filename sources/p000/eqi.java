package p000;

import java.util.Iterator;

/* renamed from: eqi */
final /* synthetic */ class eqi implements rkl {

    /* renamed from: a */
    private final eqj f15522a;

    /* renamed from: b */
    private final ffk f15523b;

    /* renamed from: c */
    private final bswb f15524c;

    /* renamed from: d */
    private final eso f15525d;

    public eqi(eqj eqj, ffk ffk, eso eso, bswb bswb) {
        this.f15522a = eqj;
        this.f15523b = ffk;
        this.f15525d = eso;
        this.f15524c = bswb;
    }

    /* renamed from: a */
    public final void mo9454a(rkk rkk) {
        ffk ffk = this.f15523b;
        eso eso = this.f15525d;
        bswb bswb = this.f15524c;
        alky alky = (alky) rkk;
        if (alky.mo12459b() != null) {
            Iterator it = alky.mo12459b().iterator();
            String str = null;
            while (it.hasNext()) {
                alzr alzr = (alzr) it.next();
                if (alzr.mo41071l() && ffk.f16458a.equals(alzr.mo41063c())) {
                    str = alzr.mo41064d();
                }
            }
            eqj.m10987a(eso, bswb, str);
        }
    }
}
