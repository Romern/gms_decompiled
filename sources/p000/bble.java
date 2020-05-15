package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bble */
final /* synthetic */ class bble implements bmxj {

    /* renamed from: a */
    private final bblp f102843a;

    /* renamed from: b */
    private final AtomicReference f102844b;

    public bble(bblp bblp, AtomicReference atomicReference) {
        this.f102843a = bblp;
        this.f102844b = atomicReference;
    }

    public final Object apply(Object obj) {
        bbjt bbjt = (bbjt) obj;
        this.f102843a.mo56202a((bbjt) this.f102844b.get(), bbjt);
        btdb btdb = bbjt.f102787b;
        return btdb == null ? btdb.f148370b : btdb;
    }
}
