package p000;

/* renamed from: awjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awjr extends awpc {

    /* renamed from: a */
    final /* synthetic */ awjt f94556a;

    public awjr(awjt awjt) {
        this.f94556a = awjt;
    }

    /* renamed from: a */
    public final void mo51894a() {
        awjt awjt = this.f94556a;
        int i = awjt.f94557f;
        awjt.mo52898h(21);
        this.f94556a.mo52874ag();
    }

    /* renamed from: b */
    public final void mo51897b() {
        awjt awjt = this.f94556a;
        int i = awjt.f94557f;
        awjt.mo52898h(20);
        this.f94556a.mo52897g(-1);
    }

    /* renamed from: c */
    public final void mo51898c() {
        awjt awjt = this.f94556a;
        int i = awjt.f94557f;
        awjt.mo52898h(22);
        this.f94556a.mo52897g(-1);
    }

    /* renamed from: a */
    public final void mo52175a(bwiz bwiz) {
        bmav bmav;
        bmar bmar;
        bwja bwja;
        awjt awjt = this.f94556a;
        bmaq bmaq = bwiz.f159709c;
        if (bmaq == null) {
            bmaq = bmaq.f128479l;
        }
        if ((bwiz.f159707a & 1) != 0) {
            bmav = bwiz.f159708b;
            if (bmav == null) {
                bmav = bmav.f128500h;
            }
        } else {
            bmav = null;
        }
        bwgz a = bwgz.m121952a(bwiz.f159712f);
        if (a == null) {
            a = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        }
        if ((bwiz.f159707a & 4) != 0) {
            bmar = bwiz.f159710d;
            if (bmar == null) {
                bmar = bmar.f128490c;
            }
        } else {
            bmar = null;
        }
        if ((bwiz.f159707a & 8) != 0) {
            bwja = bwiz.f159711e;
            if (bwja == null) {
                bwja = bwja.f159714m;
            }
        } else {
            bwja = null;
        }
        int i = awjt.f94557f;
        awjt.mo52179a(bmaq, bmav, a, bmar, bwja, true, "onInitializeEmbeddedLandingPageResponse");
    }

    /* renamed from: a */
    public final void mo52176a(bwjd bwjd) {
        bmav bmav;
        bmar bmar;
        bwja bwja;
        awjt awjt = this.f94556a;
        bmaq bmaq = bwjd.f159743c;
        if (bmaq == null) {
            bmaq = bmaq.f128479l;
        }
        if ((bwjd.f159741a & 1) != 0) {
            bmav = bwjd.f159742b;
            if (bmav == null) {
                bmav = bmav.f128500h;
            }
        } else {
            bmav = null;
        }
        bwgz a = bwgz.m121952a(bwjd.f159746f);
        if (a == null) {
            a = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        }
        if ((bwjd.f159741a & 4) != 0) {
            bmar = bwjd.f159744d;
            if (bmar == null) {
                bmar = bmar.f128490c;
            }
        } else {
            bmar = null;
        }
        if ((bwjd.f159741a & 8) != 0) {
            bwja = bwjd.f159745e;
            if (bwja == null) {
                bwja = bwja.f159714m;
            }
        } else {
            bwja = null;
        }
        int i = awjt.f94557f;
        awjt.mo52179a(bmaq, bmav, a, bmar, bwja, false, "onSubmitEmbeddedLandingPageResponse");
    }
}
