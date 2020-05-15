package p000;

import android.location.Location;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bioe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bioe implements aehz {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f121039a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f121040b;

    public bioe(AtomicReference atomicReference, CountDownLatch countDownLatch) {
        this.f121039a = atomicReference;
        this.f121040b = countDownLatch;
    }

    /* renamed from: a */
    public final void mo7032a(Location location) {
        this.f121039a.set(location);
        this.f121040b.countDown();
    }
}
