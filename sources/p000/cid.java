package p000;

import android.os.Build;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: cid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cid implements ExecutorService {

    /* renamed from: a */
    public static final long f6903a = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: b */
    private static volatile int f6904b;

    /* renamed from: c */
    private final ExecutorService f6905c;

    public cid(ExecutorService executorService) {
        this.f6905c = executorService;
    }

    /* renamed from: a */
    public static int m4293a() {
        if (f6904b == 0) {
            int availableProcessors = Runtime.getRuntime().availableProcessors();
            int i = Build.VERSION.SDK_INT;
            f6904b = Math.min(4, availableProcessors);
        }
        return f6904b;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f6905c.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f6905c.execute(runnable);
    }

    public final List invokeAll(Collection collection) {
        return this.f6905c.invokeAll(collection);
    }

    public final Object invokeAny(Collection collection) {
        return this.f6905c.invokeAny(collection);
    }

    public final boolean isShutdown() {
        return this.f6905c.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f6905c.isTerminated();
    }

    public final void shutdown() {
        this.f6905c.shutdown();
    }

    public final List shutdownNow() {
        return this.f6905c.shutdownNow();
    }

    public final Future submit(Runnable runnable) {
        return this.f6905c.submit(runnable);
    }

    public final String toString() {
        return this.f6905c.toString();
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.f6905c.invokeAll(collection, j, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.f6905c.invokeAny(collection, j, timeUnit);
    }

    public final Future submit(Runnable runnable, Object obj) {
        return this.f6905c.submit(runnable, obj);
    }

    public final Future submit(Callable callable) {
        return this.f6905c.submit(callable);
    }
}
