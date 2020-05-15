package p000;

import java.util.concurrent.Executor;

/* renamed from: aubs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aubs implements aucc {

    /* renamed from: a */
    public final Object f91371a = new Object();

    /* renamed from: b */
    public aubt f91372b;

    /* renamed from: c */
    private final Executor f91373c;

    public aubs(Executor executor, aubt aubt) {
        this.f91373c = executor;
        this.f91372b = aubt;
    }

    /* renamed from: a */
    public final void mo50355a() {
        synchronized (this.f91371a) {
            this.f91372b = null;
        }
    }

    /* renamed from: a */
    public final void mo50356a(aucb aucb) {
        if (!aucb.mo50384b() && !((auck) aucb).f91396d) {
            synchronized (this.f91371a) {
                if (this.f91372b != null) {
                    this.f91373c.execute(new aubr(this, aucb));
                }
            }
        }
    }
}
