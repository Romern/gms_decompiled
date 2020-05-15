package p000;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: adzk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adzk implements adzj {
    /* renamed from: a */
    public final ExecutorService mo25874a() {
        return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
    }

    /* renamed from: b */
    public final ExecutorService mo25879b(int i) {
        return mo25880c(1);
    }

    /* renamed from: c */
    public final ExecutorService mo25880c(int i) {
        return mo25875a(i, Executors.defaultThreadFactory());
    }

    /* renamed from: a */
    public final ExecutorService mo25875a(int i, ThreadFactory threadFactory) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* renamed from: a */
    public final ExecutorService mo25876a(ThreadFactory threadFactory) {
        return mo25875a(1, threadFactory);
    }

    /* renamed from: a */
    public final ScheduledExecutorService mo25877a(int i, int i2) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(i));
    }

    /* renamed from: a */
    public final ScheduledExecutorService mo25878a(ThreadFactory threadFactory, int i) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadFactory));
    }
}
