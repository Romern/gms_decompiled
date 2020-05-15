package p000;

/* renamed from: akex */
final /* synthetic */ class akex implements Runnable {

    /* renamed from: a */
    private final long f71765a;

    /* renamed from: b */
    private final akdd f71766b;

    public akex(long j, akdd akdd) {
        this.f71765a = j;
        this.f71766b = akdd;
    }

    public final void run() {
        long j = this.f71765a;
        akdd akdd = this.f71766b;
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akgy", "a", 4149, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68415a("Timing out reading from NearbyConnection after %d ms. Closing connection.", j);
        akdd.mo39253b();
    }
}
