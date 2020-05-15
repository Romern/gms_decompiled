package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: mcj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mcj extends bqdt {

    /* renamed from: a */
    public final lvn f33415a = new lvn("RetryingListenableFuture");

    /* renamed from: b */
    public final int f33416b;

    /* renamed from: c */
    public int f33417c = 0;

    /* renamed from: d */
    public final mal f33418d;

    /* renamed from: e */
    private final bmzi f33419e;

    /* renamed from: f */
    private final ScheduledExecutorService f33420f;

    /* renamed from: g */
    private final mat f33421g;

    /* renamed from: h */
    private bqgg f33422h;

    /* renamed from: i */
    private ScheduledFuture f33423i;

    public mcj(bmzi bmzi, ScheduledExecutorService scheduledExecutorService, int i, mal mal, mat mat) {
        boolean z = true;
        sdo.m34959a(bmzi);
        this.f33419e = bmzi;
        sdo.m34959a(scheduledExecutorService);
        this.f33420f = scheduledExecutorService;
        sdo.m34959a(mat);
        this.f33421g = mat;
        sdo.m34974b(i < 0 ? false : z);
        this.f33416b = i;
        this.f33418d = mal;
        mo19849b();
    }

    /* renamed from: b */
    public final synchronized void mo19849b() {
        if (this.f33423i != null) {
            this.f33415a.mo25418e("Attempting to schedule a future while one was already in flight", new Object[0]);
        }
        this.f33422h = null;
        long j = this.f33421g.f33366a;
        if (this.f33417c == 0 || j == 0) {
            mo19851c();
            return;
        }
        this.f33415a.mo25412b("Scheduling retry after %d ms", Long.valueOf(j));
        this.f33423i = ((sny) this.f33420f).schedule(new mch(this), j, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    /* renamed from: bc */
    public final void mo19850bc() {
        bqgg bqgg;
        if (isCancelled()) {
            synchronized (this) {
                if (this.f33423i != null) {
                    this.f33415a.mo25412b("Cancelling scheduled retry.", new Object[0]);
                    if (!this.f33423i.cancel(mo69140e())) {
                        this.f33415a.mo25412b("Could not cancel scheduled retry.", new Object[0]);
                    }
                }
                bqgg = this.f33422h;
                this.f33422h = null;
            }
            if (bqgg != null && !bqgg.cancel(mo69140e())) {
                this.f33415a.mo25412b("Attempted to cancel underlying future but it had already completed.", new Object[0]);
            }
        }
    }

    /* renamed from: c */
    public final synchronized void mo19851c() {
        this.f33423i = null;
        bqgg bqgg = (bqgg) this.f33419e.mo6606a();
        this.f33422h = bqgg;
        bqga.m112781a(bqgg, new mci(this), this.f33420f);
    }
}
