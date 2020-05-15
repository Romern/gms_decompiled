package p000;

/* renamed from: esm */
final /* synthetic */ class esm implements aubt {

    /* renamed from: a */
    private final esp f15616a;

    /* renamed from: b */
    private final bsxn f15617b;

    /* renamed from: c */
    private final long f15618c;

    public esm(esp esp, bsxn bsxn, long j) {
        this.f15616a = esp;
        this.f15617b = bsxn;
        this.f15618c = j;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        esp esp = this.f15616a;
        bsxn bsxn = this.f15617b;
        long j = this.f15618c;
        int i = bsxn.f147589b;
        if (i == 1 || i == 415 || i == 10006 || i == 10100 || i == 10104 || i == 10200 || i == 10202 || i == 10312) {
            esp.mo10479a();
            eqh eqh = esp.f15628g;
            eqy d = esp.mo10488d(bsxn);
            eso eso = new eso(esp, j);
            int i2 = d.f15548b.f147589b;
            if (i2 == 1) {
                ((eqj) eqh).mo10414a(d.f15547a, eso, eqj.m10982a(eqj.m10992e(), bngx.m109358a(eqj.m10983a(), eqj.m10990c(), eqj.m10993f())));
            } else if (i2 == 415) {
                eso.mo10478a(eqj.m10982a(eqj.m10993f(), bngx.m109376e()));
            } else if (i2 == 10006) {
                ((eqj) eqh).mo10414a(d.f15547a, eso, eqj.m10982a(eqj.m10994g(), bngx.m109359a(eqj.m10988b(), eqj.m10990c(), eqj.m10993f(), eqj.m10991d())));
            } else if (i2 == 10100) {
                eso.mo10478a(eqj.m10982a(eqj.m10983a(), bngx.m109357a(eqj.m10990c(), eqj.m10993f())));
            } else if (i2 == 10104) {
                eso.mo10478a(eqj.m10982a(eqj.m10988b(), bngx.m109357a(eqj.m10990c(), eqj.m10993f())));
            } else if (i2 == 10200) {
                ((eqj) eqh).mo10414a(d.f15547a, eso, eqj.m10982a(eqj.m10991d(), bngx.m109361a(eqj.m10994g(), eqj.m10988b(), eqj.m10992e(), eqj.m10983a(), eqj.m10990c(), eqj.m10993f())));
            } else if (i2 == 10202) {
                ((eqj) eqh).mo10414a(d.f15547a, eso, (bswb) null);
            } else if (i2 != 10312) {
                eso.mo10478a(bswb.f147369d);
            } else {
                eso.mo10478a(eqj.m10982a(eqj.m10990c(), bngx.m109356a(eqj.m10993f())));
            }
        }
        if (esp.f15631j == null) {
            esp.f15631j = exc;
            esp.mo10486c();
        }
    }
}
