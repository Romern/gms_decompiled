package p000;

/* renamed from: bvcf */
final /* synthetic */ class bvcf implements Runnable {

    /* renamed from: a */
    private final bvcg f155578a;

    public bvcf(bvcg bvcg) {
        this.f155578a = bvcg;
    }

    public final void run() {
        bvcg bvcg = this.f155578a;
        if (!bvcg.mo73302a(3)) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
            bnsl.mo68404a(bnsk.MEDIUM);
            bnsl.mo68432a("bvcg", "c", 408, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("DutyCycler: Should be in cooldown state");
        }
        bvcg.run();
    }
}
