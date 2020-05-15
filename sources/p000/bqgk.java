package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: bqgk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface bqgk extends ScheduledExecutorService, bqgj {
    /* renamed from: a */
    bqgi mo25769a(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    /* renamed from: a */
    bqgi mo25814a(Runnable runnable, long j, TimeUnit timeUnit);

    /* renamed from: a */
    bqgi mo25815a(Callable callable, long j, TimeUnit timeUnit);

    /* renamed from: b */
    bqgi mo25820b(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}
