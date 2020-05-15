package p000;

import java.util.concurrent.CountDownLatch;

/* renamed from: aire */
final /* synthetic */ class aire implements Runnable {

    /* renamed from: a */
    private final CountDownLatch f69538a;

    public aire(CountDownLatch countDownLatch) {
        this.f69538a = countDownLatch;
    }

    public final void run() {
        this.f69538a.countDown();
    }
}
