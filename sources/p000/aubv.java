package p000;

import java.util.concurrent.Executor;

/* renamed from: aubv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aubv implements aucc {

    /* renamed from: a */
    public final Object f91376a = new Object();

    /* renamed from: b */
    public aubw f91377b;

    /* renamed from: c */
    private final Executor f91378c;

    public aubv(Executor executor, aubw aubw) {
        this.f91378c = executor;
        this.f91377b = aubw;
    }

    /* renamed from: a */
    public final void mo50355a() {
        synchronized (this.f91376a) {
            this.f91377b = null;
        }
    }

    /* renamed from: a */
    public final void mo50356a(aucb aucb) {
        if (aucb.mo50384b()) {
            synchronized (this.f91376a) {
                if (this.f91377b != null) {
                    this.f91378c.execute(new aubu(this, aucb));
                }
            }
        }
    }
}
