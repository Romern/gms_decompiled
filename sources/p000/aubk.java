package p000;

import java.util.concurrent.Executor;

/* renamed from: aubk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aubk implements aucc, aubw, aubt, aubn {

    /* renamed from: a */
    public final aubg f91357a;

    /* renamed from: b */
    public final auck f91358b;

    /* renamed from: c */
    private final Executor f91359c;

    public aubk(Executor executor, aubg aubg, auck auck) {
        this.f91359c = executor;
        this.f91357a = aubg;
        this.f91358b = auck;
    }

    /* renamed from: a */
    public final void mo50355a() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final void mo13386b() {
        this.f91358b.mo50400f();
    }

    /* renamed from: a */
    public final void mo50356a(aucb aucb) {
        this.f91359c.execute(new aubj(this, aucb));
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        this.f91358b.mo50397a(exc);
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        this.f91358b.mo50398a(obj);
    }
}
