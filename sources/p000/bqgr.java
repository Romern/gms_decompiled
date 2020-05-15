package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: bqgr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqgr extends bqgo implements bqgk {

    /* renamed from: a */
    final ScheduledExecutorService f140632a;

    public bqgr(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        bmxy.m108581a(scheduledExecutorService);
        this.f140632a = scheduledExecutorService;
    }

    /* renamed from: a */
    public final bqgi scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        bqgq bqgq = new bqgq(runnable);
        return new bqgp(bqgq, this.f140632a.scheduleWithFixedDelay(bqgq, j, j2, timeUnit));
    }

    /* renamed from: b */
    public final bqgi scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        bqgq bqgq = new bqgq(runnable);
        return new bqgp(bqgq, this.f140632a.scheduleAtFixedRate(bqgq, j, j2, timeUnit));
    }

    /* renamed from: a */
    public final bqgi schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        bqhg a = bqhg.m112834a(runnable, (Object) null);
        return new bqgp(a, this.f140632a.schedule(a, j, timeUnit));
    }

    /* renamed from: a */
    public final bqgi schedule(Callable callable, long j, TimeUnit timeUnit) {
        bqhg a = bqhg.m112835a(callable);
        return new bqgp(a, this.f140632a.schedule(a, j, timeUnit));
    }
}
