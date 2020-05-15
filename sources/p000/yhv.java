package p000;

/* renamed from: yhv */
final /* synthetic */ class yhv implements bmxj {

    /* renamed from: a */
    private final yhz f53840a;

    public yhv(yhz yhz) {
        this.f53840a = yhz;
    }

    public final Object apply(Object obj) {
        yfr yfr;
        cadn cadn = (cadn) obj;
        yfr yfr2 = this.f53840a.f53844a;
        if ((cadn.f172701a & 8) != 0) {
            caae caae = cadn.f172706f;
            if (caae == null) {
                caae = caae.f172323i;
            }
            yfr = new yfr(caae);
        } else {
            yfr = null;
        }
        return new yhu(cadn, yfr2, yfr);
    }
}
