package p000;

/* renamed from: xte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xte implements Runnable {

    /* renamed from: a */
    final /* synthetic */ xaj f53033a;

    /* renamed from: b */
    final /* synthetic */ xtk f53034b;

    public xte(xtk xtk, xaj xaj) {
        this.f53034b = xtk;
        this.f53033a = xaj;
    }

    public final void run() {
        if (this.f53034b.mo30123c()) {
            xaj xaj = this.f53033a;
            if (xaj != null) {
                xtk xtk = this.f53034b;
                xtk.f53051e.mo30194a(xtk.f53048b, xaj);
            }
            xtk.f53046k.mo25414c("State %s timed out.", this.f53034b.f53052f);
            this.f53034b.mo30122b();
        }
    }
}
