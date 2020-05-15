package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: bqfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqfs {

    /* renamed from: a */
    private final boolean f140605a;

    /* renamed from: b */
    private final bngx f140606b;

    public bqfs(boolean z, bngx bngx) {
        this.f140605a = z;
        this.f140606b = bngx;
    }

    /* renamed from: a */
    public final bqgg mo69214a(bqeg bqeg, Executor executor) {
        return new bqfa(this.f140606b, this.f140605a, executor, bqeg);
    }

    /* renamed from: a */
    public final bqgg mo69215a(Runnable runnable, Executor executor) {
        return mo69216a(new bqfr(runnable), executor);
    }

    /* renamed from: a */
    public final bqgg mo69216a(Callable callable, Executor executor) {
        return new bqfa(this.f140606b, this.f140605a, executor, callable);
    }
}
