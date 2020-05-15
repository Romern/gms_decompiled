package p000;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: cico */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cico implements ScheduledExecutorService {

    /* renamed from: a */
    final ScheduledExecutorService f189778a;

    public cico(ScheduledExecutorService scheduledExecutorService) {
        bmxy.m108582a(scheduledExecutorService, "delegate");
        this.f189778a = scheduledExecutorService;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f189778a.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f189778a.execute(runnable);
    }

    public final List invokeAll(Collection collection) {
        return this.f189778a.invokeAll(collection);
    }

    public final Object invokeAny(Collection collection) {
        return this.f189778a.invokeAny(collection);
    }

    public final boolean isShutdown() {
        return this.f189778a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f189778a.isTerminated();
    }

    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f189778a.schedule(runnable, j, timeUnit);
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f189778a.scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f189778a.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    public final void shutdown() {
        throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
    }

    public final List shutdownNow() {
        throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
    }

    public final Future submit(Runnable runnable) {
        return this.f189778a.submit(runnable);
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.f189778a.invokeAll(collection, j, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.f189778a.invokeAny(collection, j, timeUnit);
    }

    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return this.f189778a.schedule(callable, j, timeUnit);
    }

    public final Future submit(Runnable runnable, Object obj) {
        return this.f189778a.submit(runnable, obj);
    }

    public final Future submit(Callable callable) {
        return this.f189778a.submit(callable);
    }
}
