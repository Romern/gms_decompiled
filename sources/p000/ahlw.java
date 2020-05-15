package p000;

import java.util.concurrent.CountDownLatch;

/* renamed from: ahlw */
final /* synthetic */ class ahlw implements Runnable {

    /* renamed from: a */
    private final ahmn f67485a;

    /* renamed from: b */
    private final ahkv f67486b;

    /* renamed from: c */
    private final CountDownLatch f67487c;

    public ahlw(ahmn ahmn, ahkv ahkv, CountDownLatch countDownLatch) {
        this.f67485a = ahmn;
        this.f67486b = ahkv;
        this.f67487c = countDownLatch;
    }

    public final void run() {
        ahmn ahmn = this.f67485a;
        ahkv ahkv = this.f67486b;
        CountDownLatch countDownLatch = this.f67487c;
        ahmn.mo36841a(ahkv);
        ahkv.mo36746v();
        countDownLatch.countDown();
    }
}
