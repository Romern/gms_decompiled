package p000;

import java.util.concurrent.CountDownLatch;

/* renamed from: qlv */
final /* synthetic */ class qlv implements Runnable {

    /* renamed from: a */
    private final CountDownLatch f41677a;

    public qlv(CountDownLatch countDownLatch) {
        this.f41677a = countDownLatch;
    }

    public final void run() {
        this.f41677a.countDown();
    }
}
