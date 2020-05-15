package p000;

/* renamed from: bvce */
final /* synthetic */ class bvce implements Runnable {

    /* renamed from: a */
    private final bvcg f155577a;

    public bvce(bvcg bvcg) {
        this.f155577a = bvcg;
    }

    public final void run() {
        bvcg bvcg = this.f155577a;
        if (!bvcg.mo73302a(1)) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
            bnsl.mo68404a(bnsk.MEDIUM);
            bnsl.mo68432a("bvcg", "d", 395, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("DutyCycler: Should be in warmup state.");
        }
        bvcg.run();
    }
}
