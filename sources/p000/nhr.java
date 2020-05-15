package p000;

import android.os.SystemClock;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: nhr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nhr implements oiu {

    /* renamed from: a */
    public final birv f35652a;

    /* renamed from: b */
    public final niw f35653b;

    /* renamed from: c */
    public final AtomicInteger f35654c = new AtomicInteger();

    /* renamed from: d */
    public final AtomicInteger f35655d = new AtomicInteger();

    /* renamed from: e */
    public final AtomicInteger f35656e = new AtomicInteger();

    /* renamed from: f */
    public final AtomicLong f35657f = new AtomicLong();

    /* renamed from: g */
    public final AtomicLong f35658g = new AtomicLong();

    /* renamed from: h */
    public final AtomicInteger f35659h = new AtomicInteger();

    /* renamed from: i */
    public final AtomicInteger f35660i = new AtomicInteger(-99999);

    /* renamed from: j */
    public final AtomicInteger f35661j = new AtomicInteger(-99999);

    /* renamed from: k */
    public final AtomicInteger f35662k = new AtomicInteger(-99999);

    /* renamed from: l */
    public final AtomicLong f35663l = new AtomicLong();

    /* renamed from: m */
    public long f35664m;

    /* renamed from: n */
    public final Object f35665n;

    /* renamed from: o */
    public boolean f35666o;

    /* renamed from: p */
    public Future f35667p;

    /* renamed from: q */
    public long f35668q;

    /* renamed from: r */
    public final int f35669r;

    /* renamed from: s */
    private final long f35670s;

    /* renamed from: t */
    private final ScheduledExecutorService f35671t;

    public nhr(birv birv, int i, niw niw, ScheduledExecutorService scheduledExecutorService, long j) {
        Object obj = new Object();
        this.f35665n = obj;
        this.f35652a = birv;
        this.f35669r = i;
        this.f35653b = niw;
        this.f35671t = scheduledExecutorService;
        this.f35670s = j;
        synchronized (obj) {
            this.f35664m = 0;
        }
    }

    /* renamed from: a */
    private static void m26322a(AtomicInteger atomicInteger, nhq nhq) {
        int i;
        do {
            i = atomicInteger.get();
        } while (!atomicInteger.compareAndSet(i, nhq.mo20686a(i)));
    }

    /* renamed from: c */
    private final synchronized void m26323c() {
        this.f35666o = true;
        if (this.f35667p == null && !this.f35671t.isShutdown()) {
            this.f35667p = this.f35671t.scheduleAtFixedRate(new nho(this), this.f35670s, this.f35670s, TimeUnit.MILLISECONDS);
            this.f35668q = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: b */
    public final void mo20691b() {
        this.f35659h.incrementAndGet();
        m26323c();
    }

    /* renamed from: d */
    public final void mo20695d(int i) {
        this.f35658g.addAndGet((long) i);
        m26323c();
    }

    /* renamed from: a */
    public final synchronized void mo20688a() {
        this.f35671t.shutdownNow();
    }

    /* renamed from: b */
    public final void mo20692b(int i) {
        this.f35660i.getAndSet(i);
    }

    /* renamed from: a */
    public final void mo20689a(int i) {
        this.f35654c.incrementAndGet();
        this.f35655d.addAndGet(i);
        m26323c();
    }

    /* renamed from: b */
    public final void mo20693b(long j) {
        if (cctf.m131515b()) {
            this.f35663l.addAndGet(j);
            synchronized (this.f35665n) {
                this.f35664m = Math.max(j, this.f35664m);
            }
            m26323c();
        }
    }

    /* renamed from: c */
    public final void mo20694c(int i) {
        m26322a(this.f35661j, new nhm(i));
        m26322a(this.f35662k, new nhn(i));
        m26323c();
    }

    /* renamed from: a */
    public final void mo20690a(long j) {
        this.f35657f.addAndGet(j);
        this.f35656e.incrementAndGet();
        m26323c();
    }
}
