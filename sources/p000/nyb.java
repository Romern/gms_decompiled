package p000;

/* renamed from: nyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nyb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f36912a;

    /* renamed from: b */
    final /* synthetic */ nyh f36913b;

    public nyb(nyh nyh, int i) {
        this.f36913b = nyh;
        this.f36912a = i;
    }

    public final void run() {
        nyh nyh = this.f36913b;
        if (nyh.f36935k == 11) {
            int i = this.f36912a;
            bnsn bnsn = nyh.f36925a;
            if (i == nyh.f36941q) {
                bnsi d = nyh.f36925a.mo68390d();
                d.mo68432a("nyb", "run", 1096, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68405a("Executing delayed unpair");
                this.f36913b.mo21839f(this.f36912a);
                return;
            }
        }
        bnsi d2 = nyh.f36925a.mo68390d();
        d2.mo68432a("nyb", "run", 1092, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d2.mo68411a("Dropping delayed unpair %d %d", this.f36913b.f36935k, this.f36912a);
    }
}
