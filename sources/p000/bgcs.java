package p000;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: bgcs */
final /* synthetic */ class bgcs implements Runnable {

    /* renamed from: a */
    private final bgcz f116067a;

    /* renamed from: b */
    private final long f116068b;

    /* renamed from: c */
    private final int f116069c;

    public bgcs(bgcz bgcz, long j, int i) {
        this.f116067a = bgcz;
        this.f116068b = j;
        this.f116069c = i;
    }

    public final void run() {
        bgcz bgcz = this.f116067a;
        long j = this.f116068b;
        int i = this.f116069c;
        List a = bgcz.mo62657a(Long.valueOf(j));
        CountDownLatch countDownLatch = new CountDownLatch(a.size());
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            bgcy bgcy = (bgcy) a.get(i2);
            bgcy.f116082c.post(new bgcx(bgcy, i, countDownLatch));
        }
        try {
            countDownLatch.await(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            new Object[1][0] = "Manager:";
        }
    }
}
