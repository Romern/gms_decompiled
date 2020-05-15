package p000;

import java.util.concurrent.CountDownLatch;

/* renamed from: nnq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nnq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CountDownLatch f36110a;

    /* renamed from: b */
    final /* synthetic */ noj f36111b;

    public nnq(noj noj, CountDownLatch countDownLatch) {
        this.f36111b = noj;
        this.f36110a = countDownLatch;
    }

    public final void run() {
        if (this.f36110a.getCount() != 0) {
            this.f36111b.mo21354x();
            this.f36110a.countDown();
        }
    }
}
