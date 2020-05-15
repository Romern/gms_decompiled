package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: bqga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqga {
    /* renamed from: a */
    public static bqgg m112770a() {
        return new bqgb();
    }

    /* renamed from: b */
    public static bqfs m112782b(Iterable iterable) {
        return new bqfs(false, bngx.m109355a(iterable));
    }

    /* renamed from: c */
    public static bqfs m112785c(Iterable iterable) {
        return new bqfs(true, bngx.m109355a(iterable));
    }

    /* renamed from: d */
    public static bqgg m112787d(Iterable iterable) {
        return new bqew(bngx.m109355a(iterable), false);
    }

    /* renamed from: a */
    public static bqgg m112771a(bqeg bqeg, Executor executor) {
        bqhg bqhg = new bqhg(bqeg);
        executor.execute(bqhg);
        return bqhg;
    }

    @SafeVarargs
    /* renamed from: b */
    public static bqfs m112783b(bqgg... bqggArr) {
        return new bqfs(false, bngx.m109370a((Object[]) bqggArr));
    }

    @SafeVarargs
    /* renamed from: c */
    public static bqfs m112786c(bqgg... bqggArr) {
        return new bqfs(true, bngx.m109370a((Object[]) bqggArr));
    }

    /* renamed from: a */
    public static bqgg m112772a(bqgg bqgg) {
        if (bqgg.isDone()) {
            return bqgg;
        }
        bqft bqft = new bqft(bqgg);
        bqgg.mo741a(bqft, bqfb.INSTANCE);
        return bqft;
    }

    /* renamed from: b */
    public static Object m112784b(Future future) {
        bmxy.m108581a(future);
        try {
            return bqhi.m112838a(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new bqfc((Error) cause);
            }
            throw new bqhh(cause);
        }
    }

    /* renamed from: a */
    public static bqgg m112773a(bqgg bqgg, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (bqgg.isDone()) {
            return bqgg;
        }
        bqhd bqhd = new bqhd(bqgg);
        bqhb bqhb = new bqhb(bqhd);
        bqhd.f140657b = scheduledExecutorService.schedule(bqhb, j, timeUnit);
        bqgg.mo741a(bqhb, bqfb.INSTANCE);
        return bqhd;
    }

    /* renamed from: a */
    public static bqgg m112774a(Iterable iterable) {
        return new bqew(bngx.m109355a(iterable), true);
    }

    /* renamed from: a */
    public static bqgg m112775a(Object obj) {
        if (obj != null) {
            return new bqgd(obj);
        }
        return bqgd.f140614a;
    }

    /* renamed from: a */
    public static bqgg m112776a(Runnable runnable, Executor executor) {
        bqhg a = bqhg.m112834a(runnable, (Object) null);
        executor.execute(a);
        return a;
    }

    /* renamed from: a */
    public static bqgg m112777a(Throwable th) {
        bmxy.m108581a(th);
        return new bqgc(th);
    }

    /* renamed from: a */
    public static bqgg m112778a(Callable callable, Executor executor) {
        bqhg a = bqhg.m112835a(callable);
        executor.execute(a);
        return a;
    }

    @SafeVarargs
    /* renamed from: a */
    public static bqgg m112779a(bqgg... bqggArr) {
        return new bqew(bngx.m109370a((Object[]) bqggArr), true);
    }

    /* renamed from: a */
    public static Object m112780a(Future future) {
        bmxy.m108605b(future.isDone(), "Future was expected to be done: %s", future);
        return bqhi.m112838a(future);
    }

    /* renamed from: a */
    public static void m112781a(bqgg bqgg, bqfp bqfp, Executor executor) {
        bmxy.m108581a(bqfp);
        bqgg.mo741a(new bqfq(bqgg, bqfp), executor);
    }
}
