package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: bqgs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqgs {
    /* renamed from: a */
    public static bqgj m112810a() {
        return new bqgn();
    }

    /* renamed from: a */
    public static bqgj m112811a(ExecutorService executorService) {
        if (executorService instanceof bqgj) {
            return (bqgj) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new bqgr((ScheduledExecutorService) executorService) : new bqgo(executorService);
    }

    /* renamed from: a */
    public static bqgk m112812a(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof bqgk ? (bqgk) scheduledExecutorService : new bqgr(scheduledExecutorService);
    }

    /* renamed from: a */
    public static Executor m112813a(Executor executor) {
        return new bqgx(executor);
    }

    /* renamed from: a */
    static Executor m112814a(Executor executor, bqdt bqdt) {
        bmxy.m108581a(executor);
        bmxy.m108581a(bqdt);
        return executor != bqfb.INSTANCE ? new bqgm(executor, bqdt) : executor;
    }
}
