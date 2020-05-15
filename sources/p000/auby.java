package p000;

import java.util.concurrent.Executor;

/* renamed from: auby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auby implements aucc, aubw, aubt, aubn {

    /* renamed from: a */
    public final auca f91381a;

    /* renamed from: b */
    private final Executor f91382b;

    /* renamed from: c */
    private final auck f91383c;

    public auby(Executor executor, auca auca, auck auck) {
        this.f91382b = executor;
        this.f91381a = auca;
        this.f91383c = auck;
    }

    /* renamed from: a */
    public final void mo50355a() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final void mo13386b() {
        this.f91383c.mo50400f();
    }

    /* renamed from: a */
    public final void mo50356a(aucb aucb) {
        this.f91382b.execute(new aubx(this, aucb));
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        this.f91383c.mo50397a(exc);
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        this.f91383c.mo50398a(obj);
    }
}
