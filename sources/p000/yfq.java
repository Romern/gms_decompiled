package p000;

/* renamed from: yfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yfq {

    /* renamed from: a */
    public final caab f53732a = ((caab) caae.f172323i.mo74144da());

    /* renamed from: b */
    private yfr f53733b = null;

    /* renamed from: b */
    private final void m43978b() {
        bmxy.m108601b(this.f53733b == null, "ProtoRawDataPoint already built");
    }

    /* renamed from: a */
    public final yfr mo30415a() {
        boolean z;
        boolean z2;
        yfr yfr = this.f53733b;
        if (yfr != null) {
            return yfr;
        }
        if ((((caae) this.f53732a.f164949b).f172325a & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "data source type not set");
        if ((((caae) this.f53732a.f164949b).f172325a & 16) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        bmxy.m108589a(z2, "data source data type not set");
        String yyf = yyd.m44988a(this.f53732a).toString();
        caab caab = this.f53732a;
        if (caab.f164950c) {
            caab.mo74035c();
            caab.f164950c = false;
        }
        caae caae = (caae) caab.f164949b;
        caae caae2 = caae.f172323i;
        yyf.getClass();
        caae.f172325a = 1 | caae.f172325a;
        caae.f172326b = yyf;
        yfr yfr2 = new yfr(this);
        this.f53733b = yfr2;
        return yfr2;
    }

    /* renamed from: b */
    public final void mo30421b(String str) {
        mo30417a(bzzn.m126359a(str));
    }

    /* renamed from: a */
    public final void mo30416a(int i) {
        m43978b();
        caad caad = caad.RAW;
        if (i - 1 != 0) {
            caab caab = this.f53732a;
            caad caad2 = caad.RAW;
            if (caab.f164950c) {
                caab.mo74035c();
                caab.f164950c = false;
            }
            caae caae = (caae) caab.f164949b;
            caae caae2 = caae.f172323i;
            caae.f172329e = caad2.f172322e;
            caae.f172325a |= 8;
            return;
        }
        caab caab2 = this.f53732a;
        caad caad3 = caad.DERIVED;
        if (caab2.f164950c) {
            caab2.mo74035c();
            caab2.f164950c = false;
        }
        caae caae3 = (caae) caab2.f164949b;
        caae caae4 = caae.f172323i;
        caae3.f172329e = caad3.f172322e;
        caae3.f172325a |= 8;
    }

    /* renamed from: a */
    public final void mo30417a(caah caah) {
        m43978b();
        caab caab = this.f53732a;
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
    public final void mo30418a(caaq caaq) {
        m43978b();
        caab caab = this.f53732a;
        if (caab.f164950c) {
            caab.mo74035c();
            caab.f164950c = false;
        }
        caae caae = (caae) caab.f164949b;
        caae caae2 = caae.f172323i;
        caaq.getClass();
        caae.f172331g = caaq;
        caae.f172325a |= 32;
    }

    /* renamed from: a */
    public final void mo30419a(String str) {
        m43978b();
        caab caab = this.f53732a;
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

    /* renamed from: a */
    public final void mo30420a(yfl yfl) {
        m43978b();
        caab caab = this.f53732a;
        bzzz bzzz = yfl.f53727b;
        if (caab.f164950c) {
            caab.mo74035c();
            caab.f164950c = false;
        }
        caae caae = (caae) caab.f164949b;
        caae caae2 = caae.f172323i;
        bzzz.getClass();
        caae.f172332h = bzzz;
        caae.f172325a |= 64;
    }
}
