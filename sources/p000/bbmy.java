package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbmy */
final /* synthetic */ class bbmy implements bmxj {

    /* renamed from: a */
    private final AtomicReference f102938a;

    public bbmy(AtomicReference atomicReference) {
        this.f102938a = atomicReference;
    }

    public final Object apply(Object obj) {
        AtomicReference atomicReference = this.f102938a;
        bbnu bbnu = (bbnu) obj;
        bxvd bxvd = (bxvd) bbnu.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bbnu);
        bbnr bbnr = (bbnr) bxvd;
        for (int i = 0; i < ((bbnu) bbnr.f164949b).f102987e.size(); i++) {
            bbnt b = bbnr.mo56248b(i);
            bxvd bxvd2 = (bxvd) b.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) b);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bbnt bbnt = (bbnt) bxvd2.f164949b;
            bbnt bbnt2 = bbnt.f102975e;
            bbnt.f102977a &= -5;
            bbnt.f102980d = 0;
            bbnr.mo56245a(i, (bbnt) bxvd2.mo74062i());
        }
        bbnu bbnu2 = (bbnu) bbnr.mo74062i();
        atomicReference.set(bbnu2);
        return bbnu2;
    }
}
