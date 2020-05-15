package p000;

import java.util.concurrent.CountDownLatch;

/* renamed from: burr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class burr implements bqfp {

    /* renamed from: a */
    final /* synthetic */ CountDownLatch f154785a;

    public burr(CountDownLatch countDownLatch) {
        this.f154785a = countDownLatch;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Boolean bool = (Boolean) obj;
        busr busr = busr.f154819a;
        this.f154785a.countDown();
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        busr busr = busr.f154819a;
        this.f154785a.countDown();
    }
}
