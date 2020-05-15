package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: arqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arqm {

    /* renamed from: f */
    private static final asco f88123f = ascp.m73787a("TimeoutHelper");

    /* renamed from: a */
    public final Executor f88124a;

    /* renamed from: b */
    public final long f88125b;

    /* renamed from: c */
    public final arql f88126c;

    /* renamed from: d */
    public long f88127d;

    /* renamed from: e */
    public boolean f88128e = true;

    /* renamed from: g */
    private final ExecutorService f88129g;

    /* renamed from: h */
    private final Runnable f88130h = new arqj(this);

    public arqm(ExecutorService executorService, Executor executor, long j, arql arql) {
        this.f88129g = executorService;
        this.f88124a = executor;
        this.f88125b = j;
        this.f88126c = arql;
    }

    /* renamed from: a */
    public final void mo48750a() {
        f88123f.logVerbose("started", new Object[0]);
        this.f88127d = System.currentTimeMillis();
        this.f88128e = false;
        mo48753d();
    }

    /* renamed from: b */
    public final synchronized void mo48751b() {
        f88123f.logVerbose("stopped", new Object[0]);
        this.f88128e = true;
    }

    /* renamed from: c */
    public final synchronized void mo48752c() {
        f88123f.logVerbose("updated", new Object[0]);
        this.f88127d = System.currentTimeMillis();
    }

    /* renamed from: d */
    public final void mo48753d() {
        this.f88129g.execute(this.f88130h);
    }
}
