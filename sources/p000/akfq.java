package p000;

/* renamed from: akfq */
final /* synthetic */ class akfq implements Runnable {

    /* renamed from: a */
    private final akgy f71825a;

    public akfq(akgy akgy) {
        this.f71825a = akgy;
    }

    public final void run() {
        akgy akgy = this.f71825a;
        if (akgy.mo39412i()) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akgy", "k", 1206, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Ignoring start background caching timeout because we're still scanning");
            return;
        }
        akgy.f71950q.mo39246c();
    }
}
