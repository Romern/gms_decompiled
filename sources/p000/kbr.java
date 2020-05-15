package p000;

/* renamed from: kbr */
public final /* synthetic */ class kbr implements bqeh {

    /* renamed from: a */
    private final kcv f23711a;

    public kbr(kcv kcv) {
        this.f23711a = kcv;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        kcv kcv = this.f23711a;
        bmxv bmxv = (bmxv) obj;
        if (!bmxv.mo66813a()) {
            return bqga.m112775a((Object) false);
        }
        kbo kbo = (kbo) bmxv.mo66814b();
        int b = kbn.m17600b(kbo.f23704b);
        if (b == 0) {
            b = 1;
        }
        int i = b - 2;
        if (i == 1) {
            return bqga.m112775a(Boolean.valueOf(kbo.f23705c.contains(kcv.f23841b)));
        }
        if (i != 2) {
            return bqga.m112775a((Object) false);
        }
        return bqga.m112775a((Object) true);
    }
}
