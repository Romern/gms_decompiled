package p000;

/* renamed from: bdsi */
final /* synthetic */ class bdsi implements bqeh {

    /* renamed from: a */
    private final bdti f106358a;

    /* renamed from: b */
    private final long f106359b;

    public bdsi(bdti bdti, long j) {
        this.f106358a = bdti;
        this.f106359b = j;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bdti bdti = this.f106358a;
        long j = this.f106359b;
        if (((Boolean) obj).booleanValue()) {
            return bqga.m112775a(Boolean.TRUE);
        }
        bdrv d = bdrx.m91364d();
        d.mo58341a(bdrw.INITIALIZATION);
        d.mo58340a(j);
        d.mo58342a(false);
        bdrx a = d.mo58339a();
        bdte bdte = new bdte();
        return bqdx.m112673a(bdti.mo58336a(a, bdte, bqfb.INSTANCE), new bdsm(bdte), bqfb.INSTANCE);
    }
}
