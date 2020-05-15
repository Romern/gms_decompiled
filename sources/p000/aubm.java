package p000;

import java.util.concurrent.Executor;

/* renamed from: aubm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aubm implements aucc {

    /* renamed from: a */
    public final Object f91361a = new Object();

    /* renamed from: b */
    public aubn f91362b;

    /* renamed from: c */
    private final Executor f91363c;

    public aubm(Executor executor, aubn aubn) {
        this.f91363c = executor;
        this.f91362b = aubn;
    }

    /* renamed from: a */
    public final void mo50355a() {
        synchronized (this.f91361a) {
            this.f91362b = null;
        }
    }

    /* renamed from: a */
    public final void mo50356a(aucb aucb) {
        if (((auck) aucb).f91396d) {
            synchronized (this.f91361a) {
                if (this.f91362b != null) {
                    this.f91363c.execute(new aubl(this));
                }
            }
        }
    }
}
