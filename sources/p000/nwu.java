package p000;

import android.os.SystemClock;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: nwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nwu implements okg {

    /* renamed from: a */
    public final niw f36828a;

    /* renamed from: b */
    public final AtomicInteger f36829b = new AtomicInteger();

    /* renamed from: c */
    public final AtomicInteger f36830c = new AtomicInteger();

    /* renamed from: d */
    public final AtomicLong f36831d = new AtomicLong();

    /* renamed from: e */
    public final AtomicInteger f36832e = new AtomicInteger();

    /* renamed from: f */
    public final AtomicLong f36833f = new AtomicLong();

    /* renamed from: g */
    public final AtomicLong f36834g = new AtomicLong();

    /* renamed from: h */
    public long f36835h;

    /* renamed from: i */
    public final Object f36836i = new Object();

    /* renamed from: j */
    public int f36837j;

    /* renamed from: k */
    public boolean f36838k = false;

    /* renamed from: l */
    public long f36839l = 0;

    /* renamed from: m */
    private final long f36840m = ccwg.m131922b();

    /* renamed from: n */
    private Future f36841n;

    public nwu(niw niw) {
        this.f36828a = niw;
        if (!ccwg.m131923c()) {
            this.f36838k = true;
        }
        synchronized (this.f36836i) {
            this.f36835h = 0;
        }
    }

    /* renamed from: a */
    public final void mo20688a() {
        Future future = this.f36841n;
        if (future != null) {
            future.cancel(false);
            this.f36841n = null;
        }
    }

    /* renamed from: b */
    public final void mo20691b() {
    }

    /* renamed from: b */
    public final void mo20692b(int i) {
    }

    /* renamed from: c */
    public final synchronized void mo21764c() {
        if (ccwg.m131923c() && this.f36838k) {
            this.f36838k = false;
            this.f36839l += SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: c */
    public final void mo20694c(int i) {
    }

    /* renamed from: d */
    public final synchronized void mo21765d() {
        if (!this.f36838k) {
            this.f36838k = true;
            this.f36839l -= SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: e */
    public final void mo21766e(int i) {
        this.f36837j = i;
    }

    /* renamed from: a */
    public final void mo20689a(int i) {
        this.f36829b.incrementAndGet();
        this.f36832e.addAndGet(i);
    }

    /* renamed from: d */
    public final void mo20695d(int i) {
        this.f36833f.addAndGet((long) i);
    }

    /* renamed from: a */
    public final void mo20690a(long j) {
        this.f36831d.addAndGet(j);
        this.f36830c.incrementAndGet();
    }

    /* renamed from: b */
    public final void mo20693b(long j) {
        if (cctf.m131515b()) {
            this.f36834g.addAndGet(j);
            synchronized (this.f36836i) {
                this.f36835h = Math.max(j, this.f36835h);
            }
        }
    }

    /* renamed from: a */
    public final void mo21763a(ScheduledExecutorService scheduledExecutorService) {
        long j;
        synchronized (this) {
            if (this.f36838k) {
                j = -SystemClock.elapsedRealtime();
            } else {
                j = 0;
            }
            this.f36839l = j;
        }
        this.f36829b.set(0);
        this.f36830c.set(0);
        this.f36831d.set(0);
        this.f36832e.set(0);
        this.f36833f.set(0);
        this.f36834g.set(0);
        synchronized (this.f36836i) {
            this.f36835h = 0;
        }
        nwt nwt = new nwt(this);
        long j2 = this.f36840m;
        this.f36841n = scheduledExecutorService.scheduleAtFixedRate(nwt, j2, j2, TimeUnit.MILLISECONDS);
    }
}
