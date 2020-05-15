package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbma */
final /* synthetic */ class bbma implements bmxj {

    /* renamed from: a */
    private final AtomicReference f102891a;

    public bbma(AtomicReference atomicReference) {
        this.f102891a = atomicReference;
    }

    public final Object apply(Object obj) {
        bbml bbml = (bbml) obj;
        this.f102891a.set((bteu) bbml.mo56187a());
        return (bbjt) bbml.mo56188b();
    }
}
