package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aopq */
final /* synthetic */ class aopq implements bmxj {

    /* renamed from: a */
    private final AtomicReference f78661a;

    public aopq(AtomicReference atomicReference) {
        this.f78661a = atomicReference;
    }

    public final Object apply(Object obj) {
        return (aorx) this.f78661a.get();
    }
}
