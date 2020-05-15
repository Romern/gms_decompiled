package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aedd */
final /* synthetic */ class aedd implements bmxj {

    /* renamed from: a */
    private final AtomicReference f63195a;

    public aedd(AtomicReference atomicReference) {
        this.f63195a = atomicReference;
    }

    public final Object apply(Object obj) {
        this.f63195a.set((bbnm) obj);
        return null;
    }
}
