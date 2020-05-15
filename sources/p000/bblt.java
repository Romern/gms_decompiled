package p000;

/* renamed from: bblt */
final /* synthetic */ class bblt implements bmxj {

    /* renamed from: a */
    private final bbmm f102882a;

    public bblt(bbmm bbmm) {
        this.f102882a = bbmm;
    }

    public final Object apply(Object obj) {
        bbmm bbmm = this.f102882a;
        Exception exc = (Exception) obj;
        int b = afsp.m53514b();
        if (b != 0) {
            bnsi c = ((bnsn) bbmm.f102917c.mo6606a()).mo68388c();
            c.mo68402a(b);
            c.mo68437a(exc);
            c.mo68432a("bbmm", "a", 283, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Photo download failed!");
        }
        return bbjs.f102776g;
    }
}
