package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbld */
final /* synthetic */ class bbld implements bmxj {

    /* renamed from: a */
    private final AtomicReference f102842a;

    public bbld(AtomicReference atomicReference) {
        this.f102842a = atomicReference;
    }

    public final Object apply(Object obj) {
        bblo bblo = (bblo) obj;
        this.f102842a.set((bteu) bblo.mo56182a());
        return (bbjt) bblo.mo56183b();
    }
}
