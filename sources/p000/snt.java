package p000;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: snt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class snt implements bqgi {

    /* renamed from: a */
    private final ScheduledFuture f44813a;

    /* renamed from: b */
    private final bqgg f44814b;

    public snt(ScheduledFuture scheduledFuture, bqgg bqgg) {
        this.f44813a = scheduledFuture;
        this.f44814b = bqgg;
    }

    /* renamed from: a */
    public final void mo741a(Runnable runnable, Executor executor) {
        this.f44814b.mo741a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return this.f44813a.cancel(z) || this.f44814b.cancel(z);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f44813a.compareTo((Delayed) obj);
    }

    public final Object get() {
        return this.f44814b.get();
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.f44813a.getDelay(timeUnit);
    }

    public final boolean isCancelled() {
        return this.f44814b.isCancelled();
    }

    public final boolean isDone() {
        return this.f44814b.isDone();
    }

    public final String toString() {
        return this.f44814b.toString();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.f44814b.get(j, timeUnit);
    }
}
