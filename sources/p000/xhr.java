package p000;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xhr */
public final /* synthetic */ class xhr implements Runnable {

    /* renamed from: a */
    private final AtomicReference f52315a;

    /* renamed from: b */
    private final bqgg f52316b;

    /* renamed from: c */
    private final AtomicInteger f52317c;

    public xhr(AtomicReference atomicReference, bqgg bqgg, AtomicInteger atomicInteger) {
        this.f52315a = atomicReference;
        this.f52316b = bqgg;
        this.f52317c = atomicInteger;
    }

    public final void run() {
        AtomicReference atomicReference = this.f52315a;
        bqgg bqgg = this.f52316b;
        AtomicInteger atomicInteger = this.f52317c;
        xht xht = (xht) atomicReference.get();
        if (xht != null) {
            try {
                Object a = bqga.m112780a((Future) bqgg);
                atomicReference.set(null);
                xht.mo69138b(a);
            } catch (Throwable th) {
                if (atomicInteger.decrementAndGet() == 0) {
                    xht.mo69137b(bqgg);
                }
            }
        }
    }
}
