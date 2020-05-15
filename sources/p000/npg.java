package p000;

import java.util.concurrent.CountDownLatch;

/* renamed from: npg */
final /* synthetic */ class npg implements Runnable {

    /* renamed from: a */
    private final npj f36302a;

    /* renamed from: b */
    private final ojq f36303b;

    /* renamed from: c */
    private final CountDownLatch f36304c;

    public npg(npj npj, ojq ojq, CountDownLatch countDownLatch) {
        this.f36302a = npj;
        this.f36303b = ojq;
        this.f36304c = countDownLatch;
    }

    public final void run() {
        npj npj = this.f36302a;
        ojq ojq = this.f36303b;
        CountDownLatch countDownLatch = this.f36304c;
        ojq.mo22213a((ojl) new nph(npj));
        countDownLatch.countDown();
    }
}
