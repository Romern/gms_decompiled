package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: bqez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bqez extends bqgf {

    /* renamed from: a */
    private final Executor f140573a;

    /* renamed from: b */
    boolean f140574b = true;

    /* renamed from: c */
    final /* synthetic */ bqfa f140575c;

    public bqez(bqfa bqfa, Executor executor) {
        this.f140575c = bqfa;
        bmxy.m108581a(executor);
        this.f140573a = executor;
    }

    /* renamed from: a */
    public abstract void mo69193a(Object obj);

    /* renamed from: a */
    public final void mo69195a(Object obj, Throwable th) {
        bqfa bqfa = this.f140575c;
        int i = bqfa.f140576d;
        bqfa.f140577c = null;
        if (th == null) {
            mo69193a(obj);
        } else if (th instanceof ExecutionException) {
            bqfa.mo69136a(th.getCause());
        } else if (th instanceof CancellationException) {
            bqfa.cancel(false);
        } else {
            bqfa.mo69136a(th);
        }
    }

    /* renamed from: c */
    public final boolean mo69196c() {
        return this.f140575c.isDone();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo69197d() {
        try {
            this.f140573a.execute(this);
        } catch (RejectedExecutionException e) {
            if (this.f140574b) {
                this.f140575c.mo69136a((Throwable) e);
            }
        }
    }
}
