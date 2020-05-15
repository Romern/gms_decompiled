package p000;

import java.util.List;

/* renamed from: eru */
final /* synthetic */ class eru implements aubw {

    /* renamed from: a */
    private final esb f15579a;

    public eru(esb esb) {
        this.f15579a = esb;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        esb esb = this.f15579a;
        for (eqb eqb : (List) obj) {
            C0034at a = esb.f15591a.mo10429a(eqb.f15508a);
            Iterable iterable = (bnic) a.mo2448b();
            if (iterable == null) {
                iterable = bnon.f131923a;
            }
            bnia bnia = new bnia();
            bnia.mo67752b(iterable);
            bnia.mo67629b(eqb.f15509b);
            a.mo2450b(bnia.mo67751a());
        }
        for (C0034at atVar : esb.f15591a.f15553b.values()) {
            if (atVar.mo2448b() == null) {
                atVar.mo2450b(bnon.f131923a);
            }
        }
        esb.f15591a.f15556e = true;
    }
}
