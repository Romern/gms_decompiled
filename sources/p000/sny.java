package p000;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: sny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class sny extends AbstractExecutorService implements snf {

    /* renamed from: e */
    private static final ScheduledThreadPoolExecutor f44825e = new ScheduledThreadPoolExecutor(1, new stz("GlobalScheduler"));

    /* renamed from: a */
    public final soc f44826a;

    /* renamed from: b */
    public final Object f44827b = new Object();

    /* renamed from: c */
    public final C1245ok f44828c = new C1245ok(0);

    /* renamed from: d */
    public volatile boolean f44829d = false;

    /* renamed from: f */
    private final ScheduledExecutorService f44830f = f44825e;

    /* renamed from: g */
    private final C1245ok f44831g = new C1245ok(0);

    static {
        int i = Build.VERSION.SDK_INT;
        f44825e.setRemoveOnCancelPolicy(true);
    }

    public sny(int i, int i2) {
        this.f44826a = new snu(i, i2);
    }

    /* renamed from: a */
    protected static final bqgi m35714a(ScheduledFuture scheduledFuture, bqgg bqgg) {
        return new snt(scheduledFuture, bqgg);
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f44826a.awaitTermination(j, timeUnit);
    }

    /* renamed from: b */
    public final bqgg submit(Callable callable) {
        bqgg b;
        synchronized (this.f44827b) {
            m35715a();
            b = this.f44826a.submit(callable);
        }
        return b;
    }

    public final void execute(Runnable runnable) {
        synchronized (this.f44827b) {
            m35715a();
            this.f44826a.execute(runnable);
        }
    }

    public final boolean isShutdown() {
        return this.f44829d;
    }

    public final boolean isTerminated() {
        return this.f44826a.isTerminated();
    }

    public final void shutdown() {
        synchronized (this.f44827b) {
            this.f44829d = true;
            if (this.f44831g.isEmpty()) {
                this.f44826a.shutdown();
            }
        }
    }

    public final List shutdownNow() {
        ArrayList arrayList;
        int i;
        C1245ok okVar;
        C1245ok okVar2;
        synchronized (this.f44827b) {
            arrayList = new ArrayList(this.f44831g.f26809h + this.f44828c.f26809h);
            this.f44829d = true;
            int i2 = 0;
            while (true) {
                okVar = this.f44831g;
                if (i2 >= okVar.f26809h) {
                    break;
                }
                if (((ScheduledFuture) okVar.mo15621c(i2)).cancel(true)) {
                    arrayList.add((snx) this.f44831g.mo15620b(i2));
                }
                i2++;
            }
            okVar.clear();
            int i3 = 0;
            while (true) {
                okVar2 = this.f44828c;
                if (i3 >= okVar2.f26809h) {
                    break;
                }
                if (((ScheduledFuture) okVar2.mo15621c(i3)).cancel(true)) {
                    arrayList.add((snx) this.f44828c.mo15620b(i3));
                }
                i3++;
            }
            okVar2.clear();
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            arrayList2.add(((snx) arrayList.get(i)).mo25803b());
        }
        arrayList2.addAll(this.f44826a.shutdownNow());
        return arrayList2;
    }

    /* renamed from: a */
    private final void m35715a() {
        if (this.f44829d) {
            throw new RejectedExecutionException();
        }
    }

    /* renamed from: b */
    public final bqgi scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        snx a;
        ScheduledFuture<?> scheduleAtFixedRate;
        synchronized (this.f44827b) {
            m35715a();
            a = mo25816a(Executors.callable(runnable, null));
            ScheduledExecutorService scheduledExecutorService = this.f44830f;
            a.mo25802a(m35716a(j2, timeUnit));
            scheduleAtFixedRate = scheduledExecutorService.scheduleAtFixedRate(a, j, j2, timeUnit);
            this.f44828c.put(a, scheduleAtFixedRate);
        }
        bqgi a2 = m35714a(scheduleAtFixedRate, a);
        snl.m35700a(a2);
        return a2;
    }

    /* renamed from: a */
    private static final boolean m35716a(long j, TimeUnit timeUnit) {
        return TimeUnit.MILLISECONDS.convert(j, timeUnit) >= snd.f44791a.f44792b;
    }

    /* renamed from: a */
    public final bqgg submit(Runnable runnable) {
        bqgg a;
        synchronized (this.f44827b) {
            m35715a();
            a = this.f44826a.submit(runnable, (Object) null);
        }
        return a;
    }

    /* renamed from: a */
    public final bqgg submit(Runnable runnable, Object obj) {
        bqgg a;
        synchronized (this.f44827b) {
            m35715a();
            a = this.f44826a.submit(runnable, obj);
        }
        return a;
    }

    /* renamed from: a */
    public final bqgi scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        snx a;
        ScheduledFuture<?> scheduleWithFixedDelay;
        synchronized (this.f44827b) {
            m35715a();
            a = mo25816a(Executors.callable(runnable, null));
            ScheduledExecutorService scheduledExecutorService = this.f44830f;
            a.mo25802a(m35716a(j2, timeUnit));
            scheduleWithFixedDelay = scheduledExecutorService.scheduleWithFixedDelay(a, j, j2, timeUnit);
            this.f44828c.put(a, scheduleWithFixedDelay);
        }
        bqgi a2 = m35714a(scheduleWithFixedDelay, a);
        snl.m35700a(a2);
        return a2;
    }

    /* renamed from: a */
    public final bqgi schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(Executors.callable(runnable, null), j, timeUnit);
    }

    /* renamed from: a */
    public final bqgi schedule(Callable callable, long j, TimeUnit timeUnit) {
        snx a;
        ScheduledFuture<?> schedule;
        synchronized (this.f44827b) {
            m35715a();
            a = mo25816a(callable);
            ScheduledExecutorService scheduledExecutorService = this.f44830f;
            a.mo25802a(m35716a(j, timeUnit));
            schedule = scheduledExecutorService.schedule(a, j, timeUnit);
            if (!schedule.isDone()) {
                this.f44831g.put(a, schedule);
            }
        }
        return m35714a(schedule, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public snx mo25816a(Callable callable) {
        return new snx(this, callable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25817a(snx snx, boolean z) {
        if (this.f44831g.remove(snx) != null) {
            if (this.f44829d && this.f44831g.isEmpty()) {
                this.f44826a.shutdown();
            }
            snx.mo25801a();
        } else if (z && this.f44828c.remove(snx) != null) {
            snx.mo25801a();
        }
    }
}
