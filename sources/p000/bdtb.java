package p000;

/* renamed from: bdtb */
final /* synthetic */ class bdtb implements bqeh {

    /* renamed from: a */
    private final bdtd f106392a;

    /* renamed from: b */
    private final bmxv f106393b;

    /* renamed from: c */
    private final bxpj f106394c;

    /* renamed from: d */
    private final bdtm f106395d;

    public bdtb(bdtd bdtd, bdtm bdtm, bmxv bmxv, bxpj bxpj) {
        this.f106392a = bdtd;
        this.f106395d = bdtm;
        this.f106393b = bmxv;
        this.f106394c = bxpj;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bdtd bdtd = this.f106392a;
        bdtm bdtm = this.f106395d;
        bmxv bmxv = this.f106393b;
        bxpj bxpj = this.f106394c;
        Void voidR = (Void) obj;
        try {
            bdtm.mo58353a(bmxv);
            if (bxpj.f164278c) {
                return bdtd.mo58346b();
            }
            return bqga.m112775a((Object) null);
        } catch (bdvx e) {
            return bqga.m112777a((Throwable) new bdrc(e));
        }
    }
}
