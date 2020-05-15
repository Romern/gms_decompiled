package p000;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aicj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aicj extends buqn {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f68680a;

    /* renamed from: b */
    final /* synthetic */ aics f68681b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aicj(aics aics, String str, AtomicReference atomicReference) {
        super(str);
        this.f68681b = aics;
        this.f68680a = atomicReference;
    }

    public final void run() {
        CountDownLatch countDownLatch;
        AtomicReference atomicReference = this.f68680a;
        aics aics = this.f68681b;
        if (cfoj.m141553c()) {
            srn srn = ahsd.f67925a;
            countDownLatch = aics.f68710g.mo73065c();
        } else {
            countDownLatch = new CountDownLatch(0);
        }
        atomicReference.set(countDownLatch);
    }
}
