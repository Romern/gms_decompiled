package p000;

/* renamed from: bgrd */
final /* synthetic */ class bgrd implements bgqj {

    /* renamed from: a */
    private final bgri f117323a;

    public bgrd(bgri bgri) {
        this.f117323a = bgri;
    }

    /* renamed from: a */
    public final String mo63100a(String str, bxtx bxtx) {
        bgri bgri = this.f117323a;
        bnhe a = bnhe.m109408a(str, sqd.m35968b(bxtx.mo73780k()));
        if (bgri.f117329c == null) {
            bgri.f117329c = (vvq) bgri.f117327a.mo6606a();
            srn srn = bgrw.f117381a;
        }
        vvq vvq = bgri.f117329c;
        if (vvq == null || !vvq.mo28906a()) {
            return "";
        }
        String a2 = bgri.f117329c.mo28905a(a);
        bgri.f117330d = ((Long) bgri.f117328b.mo6606a()).longValue();
        bgri.mo63114c();
        srn srn2 = bgrw.f117381a;
        int length = a2.getBytes().length;
        return a2;
    }
}
