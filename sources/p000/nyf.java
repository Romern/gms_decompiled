package p000;

/* renamed from: nyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nyf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ nyh f36918a;

    public nyf(nyh nyh) {
        this.f36918a = nyh;
    }

    public final void run() {
        nyh nyh = this.f36918a;
        bnsn bnsn = nyh.f36925a;
        if (nyh.f36940p) {
            bnsi d = nyh.f36925a.mo68390d();
            d.mo68432a("nyf", "run", 1227, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Timeout check after cleanup");
            return;
        }
        nyh.m28165b(nyh.f36935k);
        this.f36918a.mo21836c(2);
    }
}
