package p000;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: azfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azfx {

    /* renamed from: a */
    public final Object f99253a = new Object();

    /* renamed from: b */
    public final ScheduledExecutorService f99254b;

    /* renamed from: c */
    public final ScheduledExecutorService f99255c;

    /* renamed from: d */
    private final azga f99256d;

    public azfx(azga azga) {
        long aP = cfeo.f183719a.mo6606a().mo80956aP();
        this.f99254b = snp.m35703a((int) cfeo.f183719a.mo6606a().mo80945aE(), 9);
        this.f99255c = snp.m35703a((int) aP, 10);
        this.f99256d = azga;
    }

    /* renamed from: a */
    private final void m85605a(ScheduledExecutorService scheduledExecutorService, Runnable runnable, String str) {
        azgb azgb = new azgb(this.f99256d, str, runnable);
        try {
            scheduledExecutorService.execute(azgb);
        } catch (RejectedExecutionException e) {
            azoj.m85931a("TaskManager", e, "Task rejected: %s", str);
            azgb.mo54893a();
        }
    }

    /* renamed from: b */
    public final void mo54886b(String str, Runnable runnable) {
        synchronized (this.f99253a) {
            m85605a(this.f99254b, runnable, str);
        }
    }

    /* renamed from: a */
    public final azgc mo54883a(String str, long j, Runnable runnable) {
        bqgi a;
        azgb azgb = new azgb(this.f99256d, str, runnable);
        synchronized (this.f99253a) {
            try {
                a = ((sny) this.f99255c).schedule(azgb, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                azoj.m85931a("TaskManager", e, "Task rejected: %s", str);
                azgb.mo54893a();
                return null;
            }
        }
        return new azgc(a, azgb);
    }

    /* renamed from: a */
    public final ScheduledFuture mo54884a(long j, Runnable runnable) {
        bqgi a;
        synchronized (this.f99253a) {
            try {
                a = ((sny) this.f99255c).schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                azoj.m85931a("TaskManager", e, "Task rejected", new Object[0]);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a;
    }

    /* renamed from: a */
    public final void mo54885a(String str, Runnable runnable) {
        synchronized (this.f99253a) {
            m85605a(this.f99255c, runnable, str);
        }
    }
}
