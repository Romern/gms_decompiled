package p000;

import java.util.Collection;
import java.util.concurrent.Future;

/* renamed from: efg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class efg implements dqm {

    /* renamed from: a */
    private final dpt f14822a = new dpt();

    /* renamed from: a */
    public final Future mo9446a() {
        dwq.m9667k().f13906c.mo9509b();
        long a = dwq.m9665i().mo20505a();
        for (doh doh : dwq.m9681y().mo9331a()) {
            if (!doh.mo9338b()) {
                new Object[1][0] = Long.valueOf(a);
                if (dwq.m9681y().mo9334b(doh)) {
                    if (!cdgp.f180782a.mo6606a().mo77578aw() || !sqw.m36041a((Collection) dwq.m9675s().mo9776a(doh, 2))) {
                        dwt w = dwq.m9679w();
                        bxqt bxqt = bxqt.f164428a;
                        dpt dpt = this.f14822a;
                        eff eff = new eff(doh);
                        dpt.mo9413a(eff);
                        w.mo9814a(doh, bxqt, eff, dwq.m9667k(), dqy.m9123a("DailyCheckinOperation"));
                    }
                    if (cdgp.f180782a.mo6606a().mo77530V()) {
                        dwt w2 = dwq.m9679w();
                        Collection f = dwq.m9648E().mo9566f();
                        dpt dpt2 = this.f14822a;
                        efo efo = new efo(doh);
                        dpt2.mo9413a(efo);
                        w2.mo9818b(doh, f, efo, dwq.m9667k(), dqy.m9123a("DailyCheckinOperation"));
                    }
                } else {
                    new Object[1][0] = doh;
                }
            }
        }
        dwq.m9682z().mo10073d(cdgp.m133195d());
        return this.f14822a;
    }
}
