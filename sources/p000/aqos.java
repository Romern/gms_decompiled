package p000;

import android.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aqos */
final /* synthetic */ class aqos implements rkl {

    /* renamed from: a */
    private final AtomicReference f86428a;

    /* renamed from: b */
    private final CountDownLatch f86429b;

    public aqos(AtomicReference atomicReference, CountDownLatch countDownLatch) {
        this.f86428a = atomicReference;
        this.f86429b = countDownLatch;
    }

    /* renamed from: a */
    public final void mo9454a(rkk rkk) {
        AtomicReference atomicReference = this.f86428a;
        CountDownLatch countDownLatch = this.f86429b;
        alky alky = (alky) rkk;
        amey b = alky.mo12459b();
        if (b == null) {
            String valueOf = String.valueOf(alky.mo7183bo());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Call to loadOwners failed: ");
            sb.append(valueOf);
            Log.w("GetCurrentAccountOpr", sb.toString());
        } else {
            atomicReference.set(b);
        }
        countDownLatch.countDown();
    }
}
