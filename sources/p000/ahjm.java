package p000;

/* renamed from: ahjm */
final /* synthetic */ class ahjm implements Runnable {

    /* renamed from: a */
    private final ahjo f67276a;

    /* renamed from: b */
    private final long f67277b;

    public ahjm(ahjo ahjo, long j) {
        this.f67276a = ahjo;
        this.f67277b = j;
    }

    public final void run() {
        ahjo ahjo = this.f67276a;
        long j = this.f67277b;
        bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
        bnsl.mo68432a("ahjo", "f", 174, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68417a("Timing out advertising for client %s after %d ms", ahjo.f67281b.mo36706b(), j);
        ahki ahki = ahjo.f67280a;
        ahkv ahkv = ahjo.f67281b;
        new aiio();
        ahki.mo36641c(ahkv, true);
    }
}
