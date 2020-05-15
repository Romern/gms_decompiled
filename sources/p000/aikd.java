package p000;

import java.util.concurrent.CountDownLatch;

/* renamed from: aikd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aikd extends soa {

    /* renamed from: a */
    final /* synthetic */ CountDownLatch f69019a;

    /* renamed from: b */
    final /* synthetic */ aike f69020b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aikd(aike aike, CountDownLatch countDownLatch) {
        super(9);
        this.f69020b = aike;
        this.f69019a = countDownLatch;
    }

    public final void run() {
        aike aike = this.f69020b;
        ahgb ahgb = aike.f69021a;
        if (ahgb != null) {
            ahgb.mo36417a(aike.f69024d);
            this.f69019a.countDown();
        }
    }
}
