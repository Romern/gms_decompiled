package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: cibp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cibp {

    /* renamed from: a */
    public final ScheduledExecutorService f189737a;

    /* renamed from: b */
    public final bmza f189738b;

    /* renamed from: c */
    public ScheduledFuture f189739c;

    /* renamed from: d */
    public ScheduledFuture f189740d;

    /* renamed from: e */
    public final Runnable f189741e = new cibq(new cibl(this));

    /* renamed from: f */
    public final Runnable f189742f = new cibq(new cibm(this));

    /* renamed from: g */
    public final long f189743g;

    /* renamed from: h */
    public final long f189744h;

    /* renamed from: i */
    public int f189745i = 1;

    /* renamed from: j */
    public final cibo f189746j;

    static {
        TimeUnit.SECONDS.toNanos(10);
        TimeUnit.MILLISECONDS.toNanos(10);
    }

    public cibp(cibo cibo, ScheduledExecutorService scheduledExecutorService, long j, long j2) {
        bmza a = bmza.m108656a();
        bmxy.m108582a(cibo, "keepAlivePinger");
        this.f189746j = cibo;
        bmxy.m108582a(scheduledExecutorService, "scheduler");
        this.f189737a = scheduledExecutorService;
        bmxy.m108582a(a, "stopwatch");
        this.f189738b = a;
        this.f189743g = j;
        this.f189744h = j2;
        a.mo66929c();
        a.mo66930d();
    }

    /* renamed from: a */
    public final synchronized void mo85906a() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        return;
     */
    /* renamed from: b */
    public final synchronized void mo85907b() {
        bmza bmza = this.f189738b;
        bmza.mo66929c();
        bmza.mo66930d();
        int i = this.f189745i;
        if (i == 2) {
            this.f189745i = 3;
        } else if (i == 4 || i == 5) {
            ScheduledFuture scheduledFuture = this.f189739c;
            boolean z = false;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            if (this.f189745i != 5) {
                this.f189745i = 2;
                if (this.f189740d == null) {
                    z = true;
                }
                bmxy.m108601b(z, "There should be no outstanding pingFuture");
                this.f189740d = this.f189737a.schedule(this.f189742f, this.f189743g, TimeUnit.NANOSECONDS);
            } else {
                this.f189745i = 1;
            }
        }
    }

    /* renamed from: c */
    public final synchronized void mo85908c() {
        int i = this.f189745i;
        if (i == 1) {
            this.f189745i = 2;
            if (this.f189740d == null) {
                this.f189740d = this.f189737a.schedule(this.f189742f, this.f189743g - this.f189738b.mo66928a(TimeUnit.NANOSECONDS), TimeUnit.NANOSECONDS);
            }
        } else if (i == 5) {
            this.f189745i = 4;
        }
    }

    /* renamed from: d */
    public final synchronized void mo85909d() {
        int i = this.f189745i;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    this.f189745i = 5;
                    return;
                }
                return;
            }
        }
        this.f189745i = 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        return;
     */
    /* renamed from: e */
    public final synchronized void mo85910e() {
        if (this.f189745i != 6) {
            this.f189745i = 6;
            ScheduledFuture scheduledFuture = this.f189739c;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ScheduledFuture scheduledFuture2 = this.f189740d;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
                this.f189740d = null;
            }
        }
    }
}
