package p000;

import java.util.concurrent.CountDownLatch;

/* renamed from: buqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buqk extends buqn {

    /* renamed from: a */
    final /* synthetic */ buqn f154708a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f154709b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public buqk(String str, buqn buqn, CountDownLatch countDownLatch) {
        super(str);
        this.f154708a = buqn;
        this.f154709b = countDownLatch;
    }

    public final void run() {
        try {
            this.f154708a.run();
        } finally {
            this.f154709b.countDown();
        }
    }
}
