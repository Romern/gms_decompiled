package p000;

/* renamed from: bbtf */
final /* synthetic */ class bbtf implements Runnable {

    /* renamed from: a */
    private final bbub f103336a;

    /* renamed from: b */
    private final bctr f103337b;

    /* renamed from: c */
    private final bcia f103338c;

    public bbtf(bbub bbub, bctr bctr, bcia bcia) {
        this.f103336a = bbub;
        this.f103337b = bctr;
        this.f103338c = bcia;
    }

    public final void run() {
        bbub bbub = this.f103336a;
        bctr bctr = this.f103337b;
        bcia bcia = this.f103338c;
        if (bbub.mo56430h()) {
            bbub.f103386g.mo56348b(bctr.mo57361c(), bctr.mo57360b(), bctr.mo57362d().longValue());
        }
        if (bbqe.m88387a(bbub.f103382c).mo56360d()) {
            bcuu a = bcia.mo56868a();
            if (bctr.mo57365f().mo57180a() == 5) {
                bbub.f103392m.put(a.mo57417b(), a);
                bbub.mo56421a(a);
                bcfx bcfx = bbub.f103390k;
                bcnr q = bcns.m89409q();
                q.mo57011b(10020);
                q.mo57012b(bbub.f103381b.mo57058b().mo57074e());
                q.mo57010a(bbub.f103381b.mo57059c().mo73781l());
                q.mo57013b(a.mo57417b());
                bcfx.mo56753a(q.mo57002a());
            } else {
                bbub.mo56420a(bctr);
                String a2 = bctr.mo57359a();
                if (a != null) {
                    bbub.f103384e.mo56605a(a);
                } else {
                    bcuu bcuu = (bcuu) bbub.f103392m.get(a2);
                    if (bcuu != null) {
                        bbub.mo56421a(bcuu);
                    }
                }
            }
        } else {
            bbub.mo56420a(bctr);
        }
        bbub.f103398s.post(new bbtm(bbub, bctr, bcia));
    }
}
