package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: bqfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bqfn extends bnfo implements Future, bqgg {
    protected bqfn() {
    }

    /* renamed from: a */
    public void mo741a(Runnable runnable, Executor executor) {
        mo29771bg().mo741a(runnable, executor);
    }

    /* access modifiers changed from: protected */
    /* renamed from: bg */
    public abstract bqgg mo29771bg();

    /* access modifiers changed from: protected */
    /* renamed from: bh */
    public /* bridge */ /* synthetic */ Future mo29772bh() {
        throw null;
    }

    public boolean cancel(boolean z) {
        return mo29772bh().cancel(z);
    }

    public final Object get() {
        return mo29772bh().get();
    }

    public final boolean isCancelled() {
        return mo29772bh().isCancelled();
    }

    public final boolean isDone() {
        return mo29772bh().isDone();
    }

    public Object get(long j, TimeUnit timeUnit) {
        return mo29772bh().get(j, timeUnit);
    }
}
