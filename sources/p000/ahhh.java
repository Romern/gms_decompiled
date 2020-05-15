package p000;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: ahhh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class ahhh implements bqgj {

    /* renamed from: a */
    protected final ahhq f67209a;

    /* renamed from: b */
    private final bqgj f67210b;

    public ahhh(bqgj bqgj) {
        ahhq ahhq;
        this.f67210b = bqgj;
        if (!cfnv.f184625a.mo6606a().mo81773af()) {
            ahhq = new ahhk();
        } else {
            ahhq = new ahhp(snp.m35704b(10));
        }
        this.f67209a = ahhq;
    }

    /* renamed from: a */
    public final bqgg submit(Runnable runnable) {
        try {
            return this.f67210b.mo25812a(this.f67209a.mo36501a(runnable));
        } catch (RejectedExecutionException e) {
            return bqga.m112777a((Throwable) e);
        }
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f67210b.awaitTermination(j, timeUnit);
    }

    /* renamed from: b */
    public final bqgg submit(Callable callable) {
        try {
            return this.f67210b.mo25819b(this.f67209a.mo36502a(callable));
        } catch (RejectedExecutionException e) {
            return bqga.m112777a((Throwable) e);
        }
    }

    public final void execute(Runnable runnable) {
        try {
            this.f67210b.execute(this.f67209a.mo36501a(runnable));
        } catch (RejectedExecutionException e) {
        }
    }

    public final List invokeAll(Collection collection) {
        return this.f67210b.invokeAll(collection);
    }

    public final Object invokeAny(Collection collection) {
        return this.f67210b.invokeAny(collection);
    }

    public final boolean isShutdown() {
        return this.f67210b.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f67210b.isTerminated();
    }

    public final void shutdown() {
        this.f67210b.shutdown();
        this.f67209a.mo36503a();
    }

    public final List shutdownNow() {
        this.f67209a.mo36504b();
        return this.f67210b.shutdownNow();
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.f67210b.invokeAll(collection, j, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.f67210b.invokeAny(collection, j, timeUnit);
    }

    /* renamed from: a */
    public final bqgg submit(Runnable runnable, Object obj) {
        try {
            return this.f67210b.mo25813a(this.f67209a.mo36501a(runnable), obj);
        } catch (RejectedExecutionException e) {
            return bqga.m112777a((Throwable) e);
        }
    }
}
