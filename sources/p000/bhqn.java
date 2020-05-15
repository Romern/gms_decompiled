package p000;

import com.google.android.gms.location.LocationResult;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bhqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhqn extends aehy {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f119332a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f119333b;

    public bhqn(AtomicReference atomicReference, CountDownLatch countDownLatch) {
        this.f119332a = atomicReference;
        this.f119333b = countDownLatch;
    }

    /* renamed from: a */
    public final void mo9910a(LocationResult locationResult) {
        this.f119332a.set(locationResult.mo43561a());
        this.f119333b.countDown();
    }
}
