package p000;

import java.util.concurrent.CountDownLatch;

/* renamed from: burq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class burq implements bqfp {

    /* renamed from: a */
    final /* synthetic */ CountDownLatch f154784a;

    public burq(CountDownLatch countDownLatch) {
        this.f154784a = countDownLatch;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Void voidR = (Void) obj;
        busr busr = busr.f154819a;
        this.f154784a.countDown();
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        busr busr = busr.f154819a;
        this.f154784a.countDown();
    }
}
