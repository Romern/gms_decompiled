package p000;

/* renamed from: axdc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axdc extends awpc {

    /* renamed from: a */
    final /* synthetic */ axdd f95824a;

    public axdc(axdd axdd) {
        this.f95824a = axdd;
    }

    /* renamed from: a */
    public final void mo51894a() {
        axdd axdd = this.f95824a;
        int i = axdd.f95825d;
        axdd.mo52874ag();
    }

    /* renamed from: b */
    public final void mo51897b() {
        axdd axdd = this.f95824a;
        int i = axdd.f95825d;
        axdd.mo52897g(-1);
    }

    /* renamed from: c */
    public final void mo51898c() {
        axdd axdd = this.f95824a;
        int i = axdd.f95825d;
        axdd.mo52897g(-1);
    }

    /* renamed from: a */
    public final void mo52440a(bwle bwle) {
        bmar bmar;
        bwlf bwlf;
        bmav bmav;
        axdd axdd = this.f95824a;
        bmaq bmaq = bwle.f160101c;
        if (bmaq == null) {
            bmaq = bmaq.f128479l;
        }
        bwgz a = bwgz.m121952a(bwle.f160103e);
        if (a == null) {
            a = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        }
        if ((bwle.f160099a & 16) != 0) {
            bmar = bwle.f160104f;
            if (bmar == null) {
                bmar = bmar.f128490c;
            }
        } else {
            bmar = null;
        }
        if ((bwle.f160099a & 4) != 0) {
            bwlf = bwle.f160102d;
            if (bwlf == null) {
                bwlf = bwlf.f160106i;
            }
        } else {
            bwlf = null;
        }
        if ((bwle.f160099a & 1) != 0) {
            bmav = bwle.f160100b;
            if (bmav == null) {
                bmav = bmav.f128500h;
            }
        } else {
            bmav = null;
        }
        int i = axdd.f95825d;
        axdd.mo53034a(bmaq, a, bmar, bwlf, bmav, true, "onInitializeResponse");
    }

    /* renamed from: a */
    public final void mo52441a(bwli bwli) {
        bmar bmar;
        bwlf bwlf;
        bmav bmav;
        axdd axdd = this.f95824a;
        bmaq bmaq = bwli.f160132c;
        if (bmaq == null) {
            bmaq = bmaq.f128479l;
        }
        bwgz a = bwgz.m121952a(bwli.f160134e);
        if (a == null) {
            a = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        }
        if ((bwli.f160130a & 16) != 0) {
            bmar = bwli.f160135f;
            if (bmar == null) {
                bmar = bmar.f128490c;
            }
        } else {
            bmar = null;
        }
        if ((bwli.f160130a & 4) != 0) {
            bwlf = bwli.f160133d;
            if (bwlf == null) {
                bwlf = bwlf.f160106i;
            }
        } else {
            bwlf = null;
        }
        if ((bwli.f160130a & 1) != 0) {
            bmav = bwli.f160131b;
            if (bmav == null) {
                bmav = bmav.f128500h;
            }
        } else {
            bmav = null;
        }
        int i = axdd.f95825d;
        axdd.mo53034a(bmaq, a, bmar, bwlf, bmav, false, "onSubmitResponse");
    }
}
