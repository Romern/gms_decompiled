package p000;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: azgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azgc implements ScheduledFuture {

    /* renamed from: a */
    private final ScheduledFuture f99263a;

    /* renamed from: b */
    private final azgb f99264b;

    public azgc(ScheduledFuture scheduledFuture, azgb azgb) {
        this.f99263a = scheduledFuture;
        this.f99264b = azgb;
    }

    public final boolean cancel(boolean z) {
        boolean cancel = this.f99263a.cancel(z);
        if (cancel) {
            this.f99264b.mo54893a();
        }
        return cancel;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f99263a.compareTo((Delayed) obj);
    }

    public final Object get() {
        return this.f99263a.get();
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.f99263a.getDelay(timeUnit);
    }

    public final boolean isCancelled() {
        return this.f99263a.isCancelled();
    }

    public final boolean isDone() {
        return this.f99263a.isDone();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.f99263a.get(j, timeUnit);
    }
}
