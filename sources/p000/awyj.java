package p000;

/* renamed from: awyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awyj extends awpc {

    /* renamed from: a */
    final /* synthetic */ awyl f95274a;

    public awyj(awyl awyl) {
        this.f95274a = awyl;
    }

    /* renamed from: a */
    public final void mo51894a() {
        awyl awyl = this.f95274a;
        int i = awyl.f95275h;
        awyl.mo52898h(21);
        this.f95274a.mo52874ag();
    }

    /* renamed from: b */
    public final void mo51897b() {
        awyl awyl = this.f95274a;
        int i = awyl.f95275h;
        awyl.mo52898h(20);
        this.f95274a.mo52897g(-1);
    }

    /* renamed from: c */
    public final void mo51898c() {
        awyl awyl = this.f95274a;
        int i = awyl.f95275h;
        awyl.mo52898h(22);
        this.f95274a.mo52897g(-1);
    }

    /* renamed from: a */
    public final void mo52438a(bwkq bwkq) {
        bmaq bmaq;
        bmar bmar;
        bwkr bwkr;
        bmav bmav;
        awyl awyl = this.f95274a;
        if ((bwkq.f160002a & 2) != 0) {
            bmaq = bwkq.f160004c;
            if (bmaq == null) {
                bmaq = bmaq.f128479l;
            }
        } else {
            bmaq = null;
        }
        bwgz bwgz = bwgz.CONTINUE_FLOW_WITH_NEW_PAGE;
        if ((bwkq.f160002a & 4) != 0) {
            bmar = bwkq.f160005d;
            if (bmar == null) {
                bmar = bmar.f128490c;
            }
        } else {
            bmar = null;
        }
        if ((bwkq.f160002a & 8) != 0) {
            bwkr = bwkq.f160006e;
            if (bwkr == null) {
                bwkr = bwkr.f160009r;
            }
        } else {
            bwkr = null;
        }
        bxwc bxwc = bwkq.f160007f;
        if ((bwkq.f160002a & 1) != 0) {
            bmav = bwkq.f160003b;
            if (bmav == null) {
                bmav = bmav.f128500h;
            }
        } else {
            bmav = null;
        }
        int i = awyl.f95275h;
        awyl.mo52764a(bmaq, bwgz, bmar, bwkr, bxwc, bmav, true, "onInitializeResponse");
    }

    /* renamed from: a */
    public final void mo52439a(bwku bwku) {
        bmar bmar;
        bwkr bwkr;
        bmav bmav;
        awyl awyl = this.f95274a;
        bmaq bmaq = bwku.f160043b;
        if (bmaq == null) {
            bmaq = bmaq.f128479l;
        }
        bwgz a = bwgz.m121952a(bwku.f160048g);
        if (a == null) {
            a = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        }
        if ((bwku.f160042a & 4) != 0) {
            bmar = bwku.f160045d;
            if (bmar == null) {
                bmar = bmar.f128490c;
            }
        } else {
            bmar = null;
        }
        if ((bwku.f160042a & 8) != 0) {
            bwkr = bwku.f160046e;
            if (bwkr == null) {
                bwkr = bwkr.f160009r;
            }
        } else {
            bwkr = null;
        }
        bxwc bxwc = bwku.f160047f;
        if ((bwku.f160042a & 2) != 0) {
            bmav = bwku.f160044c;
            if (bmav == null) {
                bmav = bmav.f128500h;
            }
        } else {
            bmav = null;
        }
        int i = awyl.f95275h;
        awyl.mo52764a(bmaq, a, bmar, bwkr, bxwc, bmav, false, "onSubmitResponse");
    }
}
