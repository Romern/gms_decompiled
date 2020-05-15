package p000;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: bqgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bqgo extends bqdu {

    /* renamed from: a */
    private final ExecutorService f140629a;

    public bqgo(ExecutorService executorService) {
        bmxy.m108581a(executorService);
        this.f140629a = executorService;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f140629a.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f140629a.execute(runnable);
    }

    public final boolean isShutdown() {
        return this.f140629a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f140629a.isTerminated();
    }

    public final void shutdown() {
        this.f140629a.shutdown();
    }

    public final List shutdownNow() {
        return this.f140629a.shutdownNow();
    }
}
