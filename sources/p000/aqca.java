package p000;

import java.util.concurrent.CountDownLatch;

/* renamed from: aqca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqca implements aqbn {

    /* renamed from: a */
    final /* synthetic */ CountDownLatch f85625a;

    public aqca(CountDownLatch countDownLatch) {
        this.f85625a = countDownLatch;
    }

    /* renamed from: a */
    public final void mo47734a() {
        this.f85625a.countDown();
    }
}
