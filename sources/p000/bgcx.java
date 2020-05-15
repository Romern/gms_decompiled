package p000;

import java.util.concurrent.CountDownLatch;

/* renamed from: bgcx */
final /* synthetic */ class bgcx implements Runnable {

    /* renamed from: a */
    private final bgcy f116077a;

    /* renamed from: b */
    private final int f116078b;

    /* renamed from: c */
    private final CountDownLatch f116079c;

    public bgcx(bgcy bgcy, int i, CountDownLatch countDownLatch) {
        this.f116077a = bgcy;
        this.f116078b = i;
        this.f116079c = countDownLatch;
    }

    public final void run() {
        bgcy bgcy = this.f116077a;
        int i = this.f116078b;
        CountDownLatch countDownLatch = this.f116079c;
        bgcy.f116081b.mo61884b(i);
        countDownLatch.countDown();
    }
}
