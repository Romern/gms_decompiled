package p000;

import java.util.concurrent.CountDownLatch;

/* renamed from: aiqt */
final /* synthetic */ class aiqt implements Runnable {

    /* renamed from: a */
    private final CountDownLatch f69514a;

    public aiqt(CountDownLatch countDownLatch) {
        this.f69514a = countDownLatch;
    }

    public final void run() {
        this.f69514a.countDown();
    }
}
