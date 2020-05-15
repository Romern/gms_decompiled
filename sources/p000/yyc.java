package p000;

/* renamed from: yyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yyc {

    /* renamed from: a */
    private final caab f54810a;

    public yyc() {
        caab caab = (caab) caae.f172323i.mo74144da();
        if (caab.f164950c) {
            caab.mo74035c();
            caab.f164950c = false;
        }
        caae caae = (caae) caab.f164949b;
        "".getClass();
        caae.f172325a |= 4;
        caae.f172328d = "";
        this.f54810a = caab;
    }

    /* renamed from: a */
    public final caae mo30854a() {
        boolean z;
        boolean z2;
        if ((((caae) this.f54810a.f164949b).f172325a & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "Must set data type");
        if ((((caae) this.f54810a.f164949b).f172325a & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        bmxy.m108601b(z2, "Must set data source type");
        caab caab = this.f54810a;
        String yyf = yyd.m44988a(caab).toString();
        if (caab.f164950c) {
            caab.mo74035c();
            caab.f164950c = false;
        }
        caae caae = (caae) caab.f164949b;
        caae caae2 = caae.f172323i;
        yyf.getClass();
        caae.f172325a = 1 | caae.f172325a;
        caae.f172326b = yyf;
        return (caae) caab.mo74062i();
    }

    @Deprecated
    /* renamed from: b */
    public final void mo30860b(String str) {
        if (str != null) {
            caab caab = this.f54810a;
            if (caab.f164950c) {
                caab.mo74035c();
                caab.f164950c = false;
            }
            caae caae = (caae) caab.f164949b;
            caae caae2 = caae.f172323i;
            str.getClass();
            caae.f172325a |= 2;
            caae.f172327c = str;
            return;
        }
        caab caab2 = this.f54810a;
        if (caab2.f164950c) {
            caab2.mo74035c();
            caab2.f164950c = false;
        }
        caae caae3 = (caae) caab2.f164949b;
        caae caae4 = caae.f172323i;
        caae3.f172325a &= -3;
        caae3.f172327c = caae.f172323i.f172327c;
    }

    public yyc(caae caae) {
        bxvd bxvd = (bxvd) caae.mo74142c(5);
        bxvd.mo73625a((bxvk) caae);
        this.f54810a = (caab) bxvd;
    }

    /* renamed from: a */
    public final void mo30855a(bzzz bzzz) {
        if (bzzz != null) {
            caab caab = this.f54810a;
            if (caab.f164950c) {
                caab.mo74035c();
                caab.f164950c = false;
            }
            caae caae = (caae) caab.f164949b;
            caae caae2 = caae.f172323i;
            bzzz.getClass();
            caae.f172332h = bzzz;
            caae.f172325a |= 64;
            return;
        }
        caab caab2 = this.f54810a;
        if (caab2.f164950c) {
            caab2.mo74035c();
            caab2.f164950c = false;
        }
        caae caae3 = (caae) caab2.f164949b;
        caae caae4 = caae.f172323i;
        caae3.f172332h = null;
        caae3.f172325a &= -65;
    }

    /* renamed from: a */
    public final void mo30856a(caad caad) {
        caab caab = this.f54810a;
        if (caab.f164950c) {
            caab.mo74035c();
            caab.f164950c = false;
        }
        caae caae = (caae) caab.f164949b;
        caae caae2 = caae.f172323i;
        caae.f172329e = caad.f172322e;
        caae.f172325a |= 8;
    }

    /* renamed from: a */
    public final void mo30857a(caah caah) {
        caab caab = this.f54810a;
        if (caab.f164950c) {
            caab.mo74035c();
            caab.f164950c = false;
        }
        caae caae = (caae) caab.f164949b;
        caae caae2 = caae.f172323i;
        caah.getClass();
        caae.f172330f = caah;
        caae.f172325a |= 16;
    }

    /* renamed from: a */
    public final void mo30858a(caaq caaq) {
        if (caaq != null) {
            caab caab = this.f54810a;
            if (caab.f164950c) {
                caab.mo74035c();
                caab.f164950c = false;
            }
            caae caae = (caae) caab.f164949b;
            caae caae2 = caae.f172323i;
            caaq.getClass();
            caae.f172331g = caaq;
            caae.f172325a |= 32;
            return;
        }
        caab caab2 = this.f54810a;
        if (caab2.f164950c) {
            caab2.mo74035c();
            caab2.f164950c = false;
        }
        caae caae3 = (caae) caab2.f164949b;
        caae caae4 = caae.f172323i;
        caae3.f172331g = null;
        caae3.f172325a &= -33;
    }

    /* renamed from: a */
    public final void mo30859a(String str) {
        bmxy.m108582a(str, "Must specify a valid stream name");
        caab caab = this.f54810a;
        if (caab.f164950c) {
            caab.mo74035c();
            caab.f164950c = false;
        }
        caae caae = (caae) caab.f164949b;
        caae caae2 = caae.f172323i;
        str.getClass();
        caae.f172325a |= 4;
        caae.f172328d = str;
    }
}
