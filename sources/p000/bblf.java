package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bblf */
final /* synthetic */ class bblf implements bmxj {

    /* renamed from: a */
    private final AtomicReference f102845a;

    public bblf(AtomicReference atomicReference) {
        this.f102845a = atomicReference;
    }

    public final Object apply(Object obj) {
        bblo bblo = (bblo) obj;
        this.f102845a.set((btew) bblo.mo56182a());
        return (bbjt) bblo.mo56183b();
    }
}
