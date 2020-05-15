package p000;

import java.util.concurrent.CountDownLatch;

/* renamed from: uaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uaz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CountDownLatch f47080a;

    public uaz(CountDownLatch countDownLatch) {
        this.f47080a = countDownLatch;
    }

    public final void run() {
        this.f47080a.countDown();
    }
}
