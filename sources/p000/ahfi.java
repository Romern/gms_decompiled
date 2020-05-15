package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: ahfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahfi {

    /* renamed from: a */
    private final Runnable f67109a;

    /* renamed from: b */
    private final long f67110b;

    /* renamed from: c */
    private final ScheduledExecutorService f67111c;

    /* renamed from: d */
    private final boolean f67112d;

    /* renamed from: e */
    private volatile ScheduledFuture f67113e;

    /* renamed from: f */
    private final ahfk f67114f = new ahfk();

    private ahfi(Runnable runnable, long j, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this.f67109a = runnable;
        this.f67110b = j;
        this.f67111c = scheduledExecutorService;
        this.f67112d = z;
        this.f67113e = scheduledExecutorService.schedule(new ahff(this), j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public static ahfi m55634a(Runnable runnable, long j, ScheduledExecutorService scheduledExecutorService) {
        return new ahfi(runnable, j, scheduledExecutorService, true);
    }

    /* renamed from: b */
    public static ahfi m55635b(Runnable runnable, long j, ScheduledExecutorService scheduledExecutorService) {
        return new ahfi(runnable, j, scheduledExecutorService, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo36395a() {
        if (!cfos.m141990d()) {
            synchronized (this) {
                if (this.f67113e != null) {
                    this.f67109a.run();
                    if (this.f67112d) {
                        this.f67113e = this.f67111c.schedule(new ahfh(this), this.f67110b, TimeUnit.MILLISECONDS);
                    }
                }
            }
        } else if (!this.f67114f.mo36401b()) {
            this.f67109a.run();
            if (this.f67112d) {
                this.f67113e = this.f67111c.schedule(new ahfg(this), this.f67110b, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: b */
    public final void mo36396b() {
        if (cfos.m141990d()) {
            this.f67114f.mo36398a();
            this.f67113e.cancel(true);
            return;
        }
        synchronized (this) {
            if (this.f67113e != null) {
                try {
                    this.f67113e.cancel(true);
                } finally {
                    this.f67113e = null;
                }
            }
        }
    }
}
