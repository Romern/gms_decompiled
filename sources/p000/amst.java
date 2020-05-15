package p000;

/* renamed from: amst */
final /* synthetic */ class amst implements aubg {

    /* renamed from: a */
    private final amsu f75877a;

    /* renamed from: b */
    private final bsqv f75878b;

    /* renamed from: c */
    private final String f75879c;

    public amst(amsu amsu, bsqv bsqv, String str) {
        this.f75877a = amsu;
        this.f75878b = bsqv;
        this.f75879c = str;
    }

    /* renamed from: a */
    public final Object mo7031a(aucb aucb) {
        amsu amsu = this.f75877a;
        bsqv bsqv = this.f75878b;
        String str = this.f75879c;
        String str2 = (String) aucb.mo50386d();
        String a = ryv.m34679a(amsu.f75881b);
        bxvd da = bsra.f146725c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsra bsra = (bsra) da.f164949b;
        a.getClass();
        bsra.f146727a |= 1;
        bsra.f146728b = a;
        bsra bsra2 = (bsra) da.mo74062i();
        bxvd da2 = bsrc.f146733d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bsrc bsrc = (bsrc) da2.f164949b;
        bsra2.getClass();
        bsrc.f146737c = bsra2;
        bsrc.f146735a |= 2;
        if (str2 != null) {
            bxvd da3 = bsrb.f146729c.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bsrb bsrb = (bsrb) da3.f164949b;
            str2.getClass();
            bsrb.f146731a |= 1;
            bsrb.f146732b = str2;
            bsrb bsrb2 = (bsrb) da3.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsrc bsrc2 = (bsrc) da2.f164949b;
            bsrb2.getClass();
            bsrc2.f146736b = bsrb2;
            bsrc2.f146735a |= 1;
        }
        if (bsqv.f164950c) {
            bsqv.mo74035c();
            bsqv.f164950c = false;
        }
        bsqw bsqw = (bsqw) bsqv.f164949b;
        bsrc bsrc3 = (bsrc) da2.mo74062i();
        bsqw bsqw2 = bsqw.f146695g;
        bsrc3.getClass();
        bsqw.f146700d = bsrc3;
        bsqw.f146697a |= 2;
        if (bsqv.f164950c) {
            bsqv.mo74035c();
            bsqv.f164950c = false;
        }
        bsqw bsqw3 = (bsqw) bsqv.f164949b;
        bsrc bsrc4 = (bsrc) da2.mo74062i();
        bsrc4.getClass();
        bsqw3.f146699c = bsrc4;
        bsqw3.f146697a |= 1;
        ggp ggp = new ggp();
        ggp.f18143b = 136;
        ggp.f18142a = 2;
        ggp.mo11800a(((bsqw) bsqv.mo74062i()).serializeToBytes());
        if (str != null) {
            ggp.f18144c = str;
        }
        return amsu.f75880a.mo11796a(ggp.mo11799a());
    }
}
