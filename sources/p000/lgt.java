package p000;

/* renamed from: lgt */
final /* synthetic */ class lgt implements bqeh {

    /* renamed from: a */
    private final kcv f26059a;

    public lgt(kcv kcv) {
        this.f26059a = kcv;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        kcv kcv = this.f26059a;
        bmxv bmxv = (bmxv) obj;
        if (bmxv == null || !bmxv.mo66813a()) {
            return bqga.m112775a(bmvz.f131120a);
        }
        lgs lgs = (lgs) bmxv.mo66814b();
        if (!lgs.f26057b.equals(kcv.f23841b)) {
            return bqga.m112775a(bmvz.f131120a);
        }
        bxyk bxyk = lgs.f26058c;
        if (bxyk == null) {
            bxyk = bxyk.f165095c;
        }
        if (System.currentTimeMillis() <= bxzt.m124578a(bxyk)) {
            return bqga.m112775a(bmxv.m108566b(lgs.f26056a));
        }
        return bqga.m112775a(bmvz.f131120a);
    }
}
