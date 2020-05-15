package p000;

/* renamed from: bbse */
final /* synthetic */ class bbse implements bmxj {

    /* renamed from: a */
    private final bbsh f103284a;

    /* renamed from: b */
    private final bcoh f103285b;

    /* renamed from: c */
    private final bmxz f103286c;

    /* renamed from: d */
    private final int f103287d;

    public bbse(bbsh bbsh, bcoh bcoh, bmxz bmxz, int i) {
        this.f103284a = bbsh;
        this.f103285b = bcoh;
        this.f103286c = bmxz;
        this.f103287d = i;
    }

    public final Object apply(Object obj) {
        bbsh bbsh = this.f103284a;
        bcoh bcoh = this.f103285b;
        bmxz bmxz = this.f103286c;
        int i = this.f103287d;
        if (!((Boolean) obj).booleanValue()) {
            return bdak.m90446a(bbsh.f103292b.mo56308a(bcoh, 0, -1), new bbsf(bmxz));
        }
        return bdak.m90446a(bbsh.f103291a.mo56561a(bcoh).mo56607a(i, bmxz), new bbsg(bbsh, bcoh));
    }
}
