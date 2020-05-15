package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* renamed from: bqgh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqgh extends FutureTask implements bqgg {

    /* renamed from: a */
    private final bqfe f140620a = new bqfe();

    public bqgh(Runnable runnable, Object obj) {
        super(runnable, obj);
    }

    /* renamed from: a */
    public static bqgh m112795a(Runnable runnable, Object obj) {
        return new bqgh(runnable, obj);
    }

    /* access modifiers changed from: protected */
    public final void done() {
        this.f140620a.mo69200a();
    }

    /* renamed from: a */
    public static bqgh m112796a(Callable callable) {
        return new bqgh(callable);
    }

    public bqgh(Callable callable) {
        super(callable);
    }

    /* renamed from: a */
    public final void mo741a(Runnable runnable, Executor executor) {
        this.f140620a.mo69201a(runnable, executor);
    }
}
