package p000;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* renamed from: ahle */
final /* synthetic */ class ahle implements Runnable {

    /* renamed from: a */
    private final ahna f67427a;

    /* renamed from: b */
    private final CountDownLatch f67428b;

    public ahle(ahna ahna, CountDownLatch countDownLatch) {
        this.f67427a = ahna;
        this.f67428b = countDownLatch;
    }

    public final void run() {
        ahna ahna = this.f67427a;
        CountDownLatch countDownLatch = this.f67428b;
        try {
            ahna.mo36803e();
        } catch (IOException e) {
        }
        countDownLatch.countDown();
    }
}
