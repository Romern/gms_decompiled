package p000;

import java.util.concurrent.CountDownLatch;

/* renamed from: cika */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cika extends brfe {

    /* renamed from: a */
    final /* synthetic */ CountDownLatch f190495a;

    /* renamed from: b */
    final /* synthetic */ cikh f190496b;

    public cika(cikh cikh, CountDownLatch countDownLatch) {
        this.f190496b = cikh;
        this.f190495a = countDownLatch;
    }

    /* renamed from: a */
    public final void mo69523a(int i) {
        int i2 = cikh.f190511g;
        this.f190496b.f190513b.f190485b = Integer.valueOf(i);
        this.f190495a.countDown();
    }

    /* renamed from: a */
    public final void mo69524a(bret bret) {
        int i = cikh.f190511g;
        this.f190496b.f190513b.f190484a = new bres(bret);
        this.f190495a.countDown();
    }
}
