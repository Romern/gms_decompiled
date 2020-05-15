package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: bqfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqfm extends bqfl {

    /* renamed from: a */
    private final bqgg f140600a;

    public bqfm(bqgg bqgg) {
        bmxy.m108581a(bqgg);
        this.f140600a = bqgg;
    }

    /* renamed from: a */
    public final void mo741a(Runnable runnable, Executor executor) {
        this.f140600a.mo741a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return this.f140600a.cancel(z);
    }

    public final Object get() {
        return this.f140600a.get();
    }

    public final boolean isCancelled() {
        return this.f140600a.isCancelled();
    }

    public final boolean isDone() {
        return this.f140600a.isDone();
    }

    public final String toString() {
        return this.f140600a.toString();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.f140600a.get(j, timeUnit);
    }
}
