package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbmc */
final /* synthetic */ class bbmc implements bmxj {

    /* renamed from: a */
    private final AtomicReference f102894a;

    public bbmc(AtomicReference atomicReference) {
        this.f102894a = atomicReference;
    }

    public final Object apply(Object obj) {
        bbml bbml = (bbml) obj;
        this.f102894a.set((btew) bbml.mo56187a());
        return (bbjt) bbml.mo56188b();
    }
}
