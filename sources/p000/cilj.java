package p000;

import java.util.concurrent.CountDownLatch;

/* renamed from: cilj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cilj extends brfe {

    /* renamed from: a */
    final /* synthetic */ CountDownLatch f190632a;

    /* renamed from: b */
    final /* synthetic */ cilk f190633b;

    public cilj(cilk cilk, CountDownLatch countDownLatch) {
        this.f190633b = cilk;
        this.f190632a = countDownLatch;
    }

    /* renamed from: a */
    public final void mo69523a(int i) {
        String valueOf = String.valueOf(String.valueOf(i));
        if (valueOf.length() == 0) {
            new String("onFinished:");
        } else {
            "onFinished:".concat(valueOf);
        }
        cilk cilk = this.f190633b;
        Runnable runnable = cilk.f190636c;
        if (runnable == null) {
            cilk.f190634a.mo49930a();
            this.f190633b.f190634a.mo49932a((Object) null);
        } else {
            cilk.f190635b.post(runnable);
        }
        this.f190632a.countDown();
    }

    /* renamed from: a */
    public final void mo69524a(bret bret) {
        this.f190632a.countDown();
        this.f190633b.f190634a.mo49931a(new bres(bret));
    }
}
