package p000;

import java.util.concurrent.CountDownLatch;

/* renamed from: aikq */
final /* synthetic */ class aikq implements aubq {

    /* renamed from: a */
    private final CountDownLatch f69054a;

    public aikq(CountDownLatch countDownLatch) {
        this.f69054a = countDownLatch;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        this.f69054a.countDown();
    }
}
