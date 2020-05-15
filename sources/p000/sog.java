package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* renamed from: sog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sog extends FutureTask implements bqgg, snb {

    /* renamed from: a */
    Object f44857a;

    /* renamed from: b */
    private final bqfe f44858b = new bqfe();

    public sog(Callable callable, Object obj) {
        super(callable);
        this.f44857a = obj;
    }

    /* renamed from: a */
    public final Object mo25764a() {
        return this.f44857a;
    }

    /* renamed from: b */
    public final Runnable mo25765b() {
        return this;
    }

    /* access modifiers changed from: protected */
    public final void done() {
        this.f44857a = null;
        this.f44858b.mo69200a();
    }

    /* renamed from: a */
    public final void mo741a(Runnable runnable, Executor executor) {
        this.f44858b.mo69201a(runnable, executor);
    }
}
