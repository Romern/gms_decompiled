package p000;

import java.util.concurrent.CountDownLatch;

/* renamed from: cijz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cijz implements brep {

    /* renamed from: a */
    final /* synthetic */ CountDownLatch f190493a;

    /* renamed from: b */
    final /* synthetic */ cikh f190494b;

    public cijz(cikh cikh, CountDownLatch countDownLatch) {
        this.f190494b = cikh;
        this.f190493a = countDownLatch;
    }

    /* renamed from: a */
    public final void mo49930a() {
        int i = cikh.f190511g;
    }

    /* renamed from: a */
    public final void mo49931a(bres bres) {
        int i = cikh.f190511g;
        this.f190494b.f190512a.f190484a = bres;
        this.f190493a.countDown();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo49932a(Object obj) {
        int i = cikh.f190511g;
        this.f190494b.f190512a.f190485b = (cijt) obj;
        this.f190493a.countDown();
    }
}
