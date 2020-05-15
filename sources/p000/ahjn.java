package p000;

/* renamed from: ahjn */
final /* synthetic */ class ahjn implements Runnable {

    /* renamed from: a */
    private final ahjo f67278a;

    /* renamed from: b */
    private final long f67279b;

    public ahjn(ahjo ahjo, long j) {
        this.f67278a = ahjo;
        this.f67279b = j;
    }

    public final void run() {
        ahjo ahjo = this.f67278a;
        long j = this.f67279b;
        bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
        bnsl.mo68432a("ahjo", "e", 325, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68417a("Timing out discovery for client %s after %d ms", ahjo.f67281b.mo36706b(), j);
        ahki ahki = ahjo.f67280a;
        ahkv ahkv = ahjo.f67281b;
        new aiis();
        ahki.mo36642d(ahkv, true);
    }
}
