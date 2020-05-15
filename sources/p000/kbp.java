package p000;

/* renamed from: kbp */
public final /* synthetic */ class kbp implements bqeh {

    /* renamed from: a */
    private final kbs f23706a;

    /* renamed from: b */
    private final kck f23707b;

    /* renamed from: c */
    private final kcv f23708c;

    public kbp(kbs kbs, kck kck, kcv kcv) {
        this.f23706a = kbs;
        this.f23707b = kck;
        this.f23708c = kcv;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        kbs kbs = this.f23706a;
        kck kck = this.f23707b;
        kcv kcv = this.f23708c;
        bmxv bmxv = (bmxv) obj;
        bxvd da = kbo.f23701d.mo74144da();
        if (bmxv.mo66813a()) {
            kbo kbo = (kbo) bmxv.mo66814b();
            int b = kbn.m17600b(kbo.f23704b);
            if (b != 0 && b == 4) {
                return bqga.m112775a((Object) null);
            }
            bxwc bxwc = kbo.f23705c;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            kbo kbo2 = (kbo) da.f164949b;
            kbo2.mo14349a();
            bxsy.m123078a(bxwc, kbo2.f23705c);
            int b2 = kbn.m17600b(kbo.f23704b);
            if (b2 == 0) {
                b2 = 1;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((kbo) da.f164949b).f23704b = kbn.m17599a(b2);
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((kbo) da.f164949b).f23704b = kbn.m17599a(3);
        }
        String str = kck.f23841b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        kbo kbo3 = (kbo) da.f164949b;
        str.getClass();
        kbo3.f23703a = str;
        String str2 = kcv.f23841b;
        str2.getClass();
        kbo3.mo14349a();
        kbo3.f23705c.add(str2);
        return kbs.f23713b.mo15163a(kck.f23817a, kbs.f23712a, (kbo) da.mo74062i());
    }
}
