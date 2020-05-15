package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bdgw */
final /* synthetic */ class bdgw implements Runnable {

    /* renamed from: a */
    private final AtomicReference f105610a;

    public bdgw(AtomicReference atomicReference) {
        this.f105610a = atomicReference;
    }

    public final void run() {
        AtomicReference atomicReference = this.f105610a;
        bnrt bnrt = bdhc.f105623a;
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }
}
