package p000;

import com.google.android.gms.fitness.sensors.sample.CollectSensorChimeraService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: zkz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zkz implements Runnable, zgg {

    /* renamed from: a */
    private final zgg f55345a;

    /* renamed from: b */
    private final CountDownLatch f55346b;

    /* renamed from: c */
    private final long f55347c;

    /* renamed from: d */
    private final zlf f55348d;

    /* renamed from: e */
    private final ScheduledFuture f55349e;

    /* renamed from: f */
    private final int f55350f;

    /* renamed from: g */
    private final boolean f55351g;

    /* renamed from: h */
    private final bqgy f55352h;

    public zkz(zgg zgg, int i, int i2, zlf zlf, ScheduledExecutorService scheduledExecutorService, int i3, boolean z, bqgy bqgy) {
        this.f55345a = zgg;
        this.f55348d = zlf;
        this.f55350f = i3;
        this.f55351g = z;
        this.f55352h = bqgy;
        this.f55346b = new CountDownLatch(i);
        long j = (long) i2;
        this.f55347c = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(j);
        System.currentTimeMillis();
        this.f55349e = scheduledExecutorService.schedule(this, j, TimeUnit.SECONDS);
    }

    /* renamed from: a */
    private final synchronized void m45674a() {
        System.currentTimeMillis();
        srn srn = CollectSensorChimeraService.f32383b;
        this.f55349e.cancel(false);
        this.f55348d.f55149a.mo19160a(this);
        this.f55348d.mo31222a(this.f55350f, this.f55351g);
        this.f55352h.mo69138b((Object) true);
    }

    public final void run() {
        m45674a();
    }

    public final String toString() {
        return String.format("WaitForResultListener{clientListener=%s}", this.f55345a);
    }

    /* renamed from: a */
    public final void mo30949a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f55345a.mo30949a(bngx.m109356a((cadn) it.next()));
            this.f55346b.countDown();
            if (this.f55346b.getCount() <= 0) {
                m45674a();
            } else if (System.currentTimeMillis() >= this.f55347c) {
                m45674a();
            }
        }
    }
}
