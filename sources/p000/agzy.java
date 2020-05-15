package p000;

/* renamed from: agzy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agzy implements AutoCloseable {

    /* renamed from: a */
    private final shl f66920a;

    public agzy(agzz agzz) {
        shl shl = new shl(agzz.f66922b, cfnj.m140615e(), (int) cfnj.m140616f(), agzz.f66922b.getApplicationInfo().uid, 25089);
        this.f66920a = shl;
        shl.mo25556a("X-Goog-Api-Key", agzz.f66923c);
    }

    /* renamed from: a */
    public final agzq mo36223a() {
        return new agzq(this.f66920a);
    }

    public final void close() {
        shl shl = this.f66920a;
        if (shl != null) {
            shl.mo25561g();
        }
    }
}
