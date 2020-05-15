package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: adey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adey implements bqgg {

    /* renamed from: a */
    public static final adfs f61536a = new adfs("ListenableRequest");

    /* renamed from: b */
    private final bqgh f61537b;

    public adey(adex adex) {
        this.f61537b = bqgh.m112796a(new adew(adex));
    }

    /* renamed from: a */
    public final void mo741a(Runnable runnable, Executor executor) {
        this.f61537b.mo741a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return this.f61537b.cancel(z);
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return (bxxc) this.f61537b.get();
    }

    public final boolean isCancelled() {
        return this.f61537b.isCancelled();
    }

    public final boolean isDone() {
        return this.f61537b.isDone();
    }

    /* renamed from: a */
    public final void mo33401a(Executor executor) {
        executor.execute(this.f61537b);
    }

    public final /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) {
        return (bxxc) this.f61537b.get(j, timeUnit);
    }
}
