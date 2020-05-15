package p000;

/* renamed from: nye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nye implements Runnable {

    /* renamed from: a */
    final /* synthetic */ nyh f36916a;

    /* renamed from: b */
    private final int f36917b;

    public nye(nyh nyh, int i) {
        this.f36916a = nyh;
        this.f36917b = i;
    }

    public final void run() {
        nyh nyh = this.f36916a;
        bnsn bnsn = nyh.f36925a;
        if (nyh.f36940p) {
            bnsi d = nyh.f36925a.mo68390d();
            d.mo68432a("nye", "run", 1212, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68420a("Delayed transition after cleanup. nextState=%s", nyh.m28165b(this.f36917b));
            return;
        }
        nyh.m28165b(nyh.f36935k);
        nyh.m28165b(this.f36917b);
        this.f36916a.mo21838e(this.f36917b);
    }
}
