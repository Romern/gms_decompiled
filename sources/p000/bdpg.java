package p000;

/* renamed from: bdpg */
final /* synthetic */ class bdpg implements Runnable {

    /* renamed from: a */
    private final bdph f106204a;

    /* renamed from: b */
    private final bdij f106205b;

    /* renamed from: c */
    private final String f106206c;

    public bdpg(bdph bdph, bdij bdij, String str) {
        this.f106204a = bdph;
        this.f106205b = bdij;
        this.f106206c = str;
    }

    public final void run() {
        bdph bdph = this.f106204a;
        bdij bdij = this.f106205b;
        String str = this.f106206c;
        if (bdij.m90860a(bdij)) {
            return;
        }
        if (bdik.m90867c(bdij)) {
            bdph.f106207a.mo58279a(str, str);
        } else {
            bdph.f106207a.mo58278a(str, bdik.m90863a(bdij), bdik.m90866b(bdij));
        }
    }
}
