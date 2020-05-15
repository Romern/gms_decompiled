package p000;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ahxz */
final /* synthetic */ class ahxz implements Runnable {

    /* renamed from: a */
    private final AtomicBoolean f68319a;

    /* renamed from: b */
    private final bmzi f68320b;

    /* renamed from: c */
    private final CountDownLatch f68321c;

    public ahxz(AtomicBoolean atomicBoolean, bmzi bmzi, CountDownLatch countDownLatch) {
        this.f68319a = atomicBoolean;
        this.f68320b = bmzi;
        this.f68321c = countDownLatch;
    }

    public final void run() {
        AtomicBoolean atomicBoolean = this.f68319a;
        bmzi bmzi = this.f68320b;
        CountDownLatch countDownLatch = this.f68321c;
        atomicBoolean.set(((Boolean) bmzi.mo6606a()).booleanValue());
        countDownLatch.countDown();
    }
}
