package p000;

/* renamed from: bbkw */
final /* synthetic */ class bbkw implements bmxj {

    /* renamed from: a */
    private final bblp f102833a;

    public bbkw(bblp bblp) {
        this.f102833a = bblp;
    }

    public final Object apply(Object obj) {
        bblp bblp = this.f102833a;
        Exception exc = (Exception) obj;
        int b = afsp.m53514b();
        if (b != 0) {
            bnsi c = ((bnsn) bblp.f102868c.mo6606a()).mo68388c();
            c.mo68402a(b);
            c.mo68437a(exc);
            c.mo68432a("bblp", "a", 268, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Photo download failed!");
        }
        return bbjs.f102776g;
    }
}
