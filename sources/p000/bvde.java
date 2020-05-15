package p000;

/* renamed from: bvde */
final /* synthetic */ class bvde implements Runnable {

    /* renamed from: a */
    private final bvdi f155642a;

    /* renamed from: b */
    private final bvbr f155643b;

    public bvde(bvdi bvdi, bvbr bvbr) {
        this.f155642a = bvdi;
        this.f155643b = bvbr;
    }

    public final void run() {
        bvdi bvdi = this.f155642a;
        bvbr bvbr = this.f155643b;
        try {
            srn srn = bvcm.f155598a;
            bvbr.run();
        } catch (Exception e) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("bvdi", "a", 113, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("%s ERROR in background job!", bvdi.f155650b);
            bvdi.f155654f = true;
        }
        bvdi.f155651c.mo72987c(bvdi.f155653e);
    }
}
