package p000;

import java.util.concurrent.CountDownLatch;

/* renamed from: ecz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ecz extends dwu {

    /* renamed from: a */
    final CountDownLatch f14712a;

    /* renamed from: b */
    int f14713b = -1;

    public ecz(CountDownLatch countDownLatch) {
        super("ContextManager3PCredentialsVerifier", "ping response", new Object[0]);
        this.f14712a = countDownLatch;
    }

    /* renamed from: a */
    public final void mo9477a(int i) {
        super.mo9477a(i);
        new Object[1][0] = Integer.toString(i);
        this.f14713b = i;
        this.f14712a.countDown();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9478a(Object obj) {
        Object[] objArr = {(bxis) obj};
        this.f14713b = 0;
        this.f14712a.countDown();
    }
}
