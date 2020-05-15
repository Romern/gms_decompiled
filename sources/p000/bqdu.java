package p000;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* renamed from: bqdu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bqdu extends AbstractExecutorService implements bqgj {
    /* renamed from: a */
    public final bqgg submit(Runnable runnable) {
        return (bqgg) super.submit(runnable);
    }

    /* renamed from: b */
    public final bqgg submit(Callable callable) {
        return (bqgg) super.submit(callable);
    }

    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return bqhg.m112834a(runnable, obj);
    }

    /* renamed from: a */
    public final bqgg submit(Runnable runnable, Object obj) {
        return (bqgg) super.submit(runnable, obj);
    }

    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Callable callable) {
        return bqhg.m112835a(callable);
    }
}
