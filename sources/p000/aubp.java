package p000;

import java.util.concurrent.Executor;

/* renamed from: aubp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aubp implements aucc {

    /* renamed from: a */
    public final Object f91366a = new Object();

    /* renamed from: b */
    public aubq f91367b;

    /* renamed from: c */
    private final Executor f91368c;

    public aubp(Executor executor, aubq aubq) {
        this.f91368c = executor;
        this.f91367b = aubq;
    }

    /* renamed from: a */
    public final void mo50355a() {
        synchronized (this.f91366a) {
            this.f91367b = null;
        }
    }

    /* renamed from: a */
    public final void mo50356a(aucb aucb) {
        synchronized (this.f91366a) {
            if (this.f91367b != null) {
                this.f91368c.execute(new aubo(this, aucb));
            }
        }
    }
}
