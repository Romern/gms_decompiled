package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbmb */
final /* synthetic */ class bbmb implements bmxj {

    /* renamed from: a */
    private final bbmm f102892a;

    /* renamed from: b */
    private final AtomicReference f102893b;

    public bbmb(bbmm bbmm, AtomicReference atomicReference) {
        this.f102892a = bbmm;
        this.f102893b = atomicReference;
    }

    public final Object apply(Object obj) {
        bbmm bbmm = this.f102892a;
        AtomicReference atomicReference = this.f102893b;
        bbjt bbjt = (bbjt) obj;
        btdb btdb = bbjt.f102787b;
        if (btdb == null) {
            btdb = btdb.f148370b;
        }
        bbjp b = bbjq.m88104b(btdb);
        b.f102772c = bbmm.mo56211a((bbjt) atomicReference.get(), bbjt);
        return b.mo56173a();
    }
}
