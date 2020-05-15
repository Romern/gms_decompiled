package p000;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bbol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bbol extends ThreadPoolExecutor {

    /* renamed from: c */
    private static final long f103019c = TimeUnit.MINUTES.toMillis(3);

    /* renamed from: a */
    public final Set f103020a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: b */
    public final String f103021b;

    /* renamed from: d */
    private final AtomicInteger f103022d = new AtomicInteger(0);

    /* renamed from: e */
    private final ScheduledExecutorService f103023e;

    public bbol(ScheduledExecutorService scheduledExecutorService, String str, int i, int i2, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, 1, timeUnit, blockingQueue, threadFactory);
        this.f103023e = scheduledExecutorService;
        this.f103021b = str;
    }

    public final void execute(Runnable runnable) {
        int incrementAndGet = this.f103022d.incrementAndGet();
        ScheduledFuture<?> schedule = this.f103023e.schedule(new bbok(this, incrementAndGet, new Throwable()), f103019c, TimeUnit.MILLISECONDS);
        this.f103020a.add(Integer.valueOf(incrementAndGet));
        super.execute(new bboj(this, runnable, incrementAndGet, schedule));
    }
}
