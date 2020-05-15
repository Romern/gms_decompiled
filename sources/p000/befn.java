package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: befn */
final /* synthetic */ class befn implements bmxj {

    /* renamed from: a */
    private final AtomicInteger f111509a;

    public befn(AtomicInteger atomicInteger) {
        this.f111509a = atomicInteger;
    }

    public final Object apply(Object obj) {
        Void voidR = (Void) obj;
        return Integer.valueOf(this.f111509a.get());
    }
}
