package p000;

import java.util.ArrayList;

/* renamed from: bbud */
final /* synthetic */ class bbud implements Runnable {

    /* renamed from: a */
    private final bbue f103407a;

    /* renamed from: b */
    private final bngx f103408b;

    /* renamed from: c */
    private final bcoh f103409c;

    public bbud(bbue bbue, bngx bngx, bcoh bcoh) {
        this.f103407a = bbue;
        this.f103408b = bngx;
        this.f103409c = bcoh;
    }

    public final void run() {
        bctr bctr;
        bbue bbue = this.f103407a;
        bngx bngx = this.f103408b;
        bcoh bcoh = this.f103409c;
        ArrayList arrayList = new ArrayList(bbpw.m88374a(bbue.f103413d).mo56349a());
        if (((Boolean) bbqt.m88417a(bbue.f103413d).f103151at.mo58455c()).booleanValue()) {
            bngs bngs = new bngs();
            bnre i = bngx.listIterator();
            while (i.hasNext()) {
                bctr bctr2 = (bctr) i.next();
                if (bctr2.mo57370j() != -1 && arrayList.contains(Integer.valueOf(bctr2.mo57370j())) && bctr2.mo57365f().mo57180a() == 1) {
                    bmxv a = bbue.f103411b.mo56501a(bcoh, bctr2.mo57365f().mo57196e().getKey());
                    if (!a.mo66813a() || ((bcia) a.mo66814b()).mo56912e().mo57371k().mo57200a() == bctq.f104882c) {
                        bcte n = bctr2.mo57374n();
                        n.mo57503a(-1);
                        bctr = n.mo57502a();
                    } else {
                        bctr = ((bcia) a.mo66814b()).mo56912e();
                    }
                    bngs.mo67668c(bctr);
                    bcfx a2 = bcfx.m88929a(bbue.f103413d);
                    bcnr q = bcns.m89409q();
                    q.mo57011b(10012);
                    q.mo57012b(bcoh.mo57058b().mo57074e());
                    q.mo57010a(bcoh.mo57059c().mo73781l());
                    q.mo57013b(bctr2.mo57359a());
                    q.mo57016e(bctr2.mo57370j());
                    a2.mo56753a(q.mo57002a());
                }
            }
            bbue.f103410a.mo56561a(bcoh).mo56626a(bngs.mo67664a());
        }
    }
}
