package p000;

import com.google.android.chimera.config.ModuleManager;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: huh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class huh extends ModuleManager.FeatureRequestProgressListener {

    /* renamed from: a */
    private final CountDownLatch f20442a = new CountDownLatch(1);

    /* renamed from: a */
    public final boolean mo12729a(long j, TimeUnit timeUnit) {
        return this.f20442a.await(j, timeUnit);
    }

    public final void onRequestComplete() {
        this.f20442a.countDown();
    }
}
