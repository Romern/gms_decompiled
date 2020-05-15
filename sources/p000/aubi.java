package p000;

import java.util.concurrent.Executor;

/* renamed from: aubi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aubi implements aucc {

    /* renamed from: a */
    public final aubg f91352a;

    /* renamed from: b */
    public final auck f91353b;

    /* renamed from: c */
    private final Executor f91354c;

    public aubi(Executor executor, aubg aubg, auck auck) {
        this.f91354c = executor;
        this.f91352a = aubg;
        this.f91353b = auck;
    }

    /* renamed from: a */
    public final void mo50355a() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo50356a(aucb aucb) {
        this.f91354c.execute(new aubh(this, aucb));
    }
}
