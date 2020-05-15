package p000;

import java.util.concurrent.Executor;

/* renamed from: cicg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cicg {

    /* renamed from: a */
    private final cidm f189763a;

    /* renamed from: b */
    private Executor f189764b;

    public cicg(cidm cidm) {
        bmxy.m108582a(cidm, "executorPool");
        this.f189763a = cidm;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized Executor mo85924a() {
        if (this.f189764b == null) {
            Executor executor = (Executor) this.f189763a.mo85846a();
            bmxy.m108587a(executor, "%s.getObject()", this.f189764b);
            this.f189764b = executor;
        }
        return this.f189764b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo85925b() {
        Executor executor = this.f189764b;
        if (executor != null) {
            this.f189764b = (Executor) this.f189763a.mo85847a(executor);
        }
    }
}
