package p000;

import java.util.concurrent.Executor;

/* renamed from: ce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0076ce {

    /* renamed from: a */
    public final int f6595a;

    /* renamed from: b */
    final C0085cn f6596b;

    /* renamed from: c */
    public final Object f6597c = new Object();

    /* renamed from: d */
    public Executor f6598d;

    /* renamed from: e */
    private final C0077cf f6599e;

    /* renamed from: f */
    private boolean f6600f = false;

    public C0076ce(C0077cf cfVar, int i, Executor executor, C0085cn cnVar) {
        this.f6599e = cfVar;
        this.f6595a = i;
        this.f6598d = executor;
        this.f6596b = cnVar;
    }

    /* renamed from: a */
    public final void mo3775a(C0086co coVar) {
        Executor executor;
        synchronized (this.f6597c) {
            if (!this.f6600f) {
                this.f6600f = true;
                executor = this.f6598d;
            } else {
                throw new IllegalStateException("callback.onResult already called, cannot call again.");
            }
        }
        if (executor != null) {
            executor.execute(new C0075cd(this, coVar));
        } else {
            this.f6596b.mo3995a(this.f6595a, coVar);
        }
    }

    /* renamed from: a */
    public final boolean mo3776a() {
        if (!this.f6599e.mo3791c()) {
            return false;
        }
        mo3775a(C0086co.f7129b);
        return true;
    }
}
