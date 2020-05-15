package p000;

import java.util.concurrent.CountDownLatch;

/* renamed from: ahly */
final /* synthetic */ class ahly implements Runnable {

    /* renamed from: a */
    private final ahmn f67493a;

    /* renamed from: b */
    private final ahkv f67494b;

    /* renamed from: c */
    private final CountDownLatch f67495c;

    public ahly(ahmn ahmn, ahkv ahkv, CountDownLatch countDownLatch) {
        this.f67493a = ahmn;
        this.f67494b = ahkv;
        this.f67495c = countDownLatch;
    }

    public final void run() {
        ahmn ahmn = this.f67493a;
        ahkv ahkv = this.f67494b;
        CountDownLatch countDownLatch = this.f67495c;
        ahmn.mo36850b(ahkv);
        ahkv.mo36747w();
        countDownLatch.countDown();
    }
}
