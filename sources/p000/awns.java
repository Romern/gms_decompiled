package p000;

/* renamed from: awns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awns extends awpc {

    /* renamed from: a */
    final /* synthetic */ awnu f94671a;

    public awns(awnu awnu) {
        this.f94671a = awnu;
    }

    /* renamed from: a */
    public final void mo51894a() {
        awnu awnu = this.f94671a;
        int i = awnu.f94672c;
        awnu.mo52898h(21);
        this.f94671a.mo52874ag();
    }

    /* renamed from: b */
    public final void mo51897b() {
        awnu awnu = this.f94671a;
        int i = awnu.f94672c;
        awnu.mo52898h(20);
        this.f94671a.mo52897g(-1);
    }

    /* renamed from: c */
    public final void mo51898c() {
        awnu awnu = this.f94671a;
        int i = awnu.f94672c;
        awnu.mo52898h(22);
        this.f94671a.mo52897g(-1);
    }

    /* renamed from: a */
    public final void mo52343a(bwjr bwjr) {
        bmaq bmaq;
        bmav bmav;
        bmar bmar;
        bwjs bwjs;
        awnu awnu = this.f94671a;
        if ((bwjr.f159859a & 1) != 0) {
            bmaq = bwjr.f159860b;
            if (bmaq == null) {
                bmaq = bmaq.f128479l;
            }
        } else {
            bmaq = null;
        }
        if ((bwjr.f159859a & 2) != 0) {
            bmav = bwjr.f159861c;
            if (bmav == null) {
                bmav = bmav.f128500h;
            }
        } else {
            bmav = null;
        }
        bwgz bwgz = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        if ((bwjr.f159859a & 4) != 0) {
            bmar = bwjr.f159862d;
            if (bmar == null) {
                bmar = bmar.f128490c;
            }
        } else {
            bmar = null;
        }
        if ((bwjr.f159859a & 8) != 0) {
            bwjs = bwjr.f159863e;
            if (bwjs == null) {
                bwjs = bwjs.f159864a;
            }
        } else {
            bwjs = null;
        }
        int i = awnu.f94672c;
        awnu.mo52347a(bmaq, bmav, bwgz, bmar, bwjs, true, "onInitializeInvoiceSummaryResponse");
    }

    /* renamed from: a */
    public final void mo52344a(bwju bwju) {
        bwjs bwjs;
        awnu awnu = this.f94671a;
        bmaq bmaq = bwju.f159872a;
        if (bmaq == null) {
            bmaq = bmaq.f128479l;
        }
        bmav bmav = bwju.f159873b;
        if (bmav == null) {
            bmav = bmav.f128500h;
        }
        bwgz a = bwgz.m121952a(bwju.f159876e);
        if (a == null) {
            a = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        }
        bmar bmar = bwju.f159874c;
        if (bmar == null) {
            bmar = bmar.f128490c;
        }
        bwjs bwjs2 = bwju.f159875d;
        if (bwjs2 == null) {
            bwjs = bwjs.f159864a;
        } else {
            bwjs = bwjs2;
        }
        int i = awnu.f94672c;
        awnu.mo52347a(bmaq, bmav, a, bmar, bwjs, false, "onSubmitInvoiceSummaryResponse");
    }
}
