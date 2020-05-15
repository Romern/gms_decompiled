package p000;

/* renamed from: awoe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awoe extends awpc {

    /* renamed from: a */
    final /* synthetic */ awog f94704a;

    public awoe(awog awog) {
        this.f94704a = awog;
    }

    /* renamed from: a */
    public final void mo51894a() {
        awog awog = this.f94704a;
        int i = awog.f94705o;
        awog.mo52898h(21);
        this.f94704a.mo52874ag();
    }

    /* renamed from: b */
    public final void mo51897b() {
        awog awog = this.f94704a;
        int i = awog.f94705o;
        awog.mo52898h(20);
        this.f94704a.mo52897g(-1);
    }

    /* renamed from: c */
    public final void mo51898c() {
        awog awog = this.f94704a;
        int i = awog.f94705o;
        awog.mo52898h(22);
        this.f94704a.mo52897g(-1);
    }

    /* renamed from: a */
    public final void mo52358a(bmsj bmsj) {
        bmav bmav;
        bmar bmar;
        bmsl bmsl;
        awog awog = this.f94704a;
        bmaq bmaq = bmsj.f130690c;
        if (bmaq == null) {
            bmaq = bmaq.f128479l;
        }
        if ((bmsj.f130688a & 1) != 0) {
            bmav = bmsj.f130689b;
            if (bmav == null) {
                bmav = bmav.f128500h;
            }
        } else {
            bmav = null;
        }
        bwgz bwgz = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        if ((bmsj.f130688a & 4) != 0) {
            bmar = bmsj.f130691d;
            if (bmar == null) {
                bmar = bmar.f128490c;
            }
        } else {
            bmar = null;
        }
        if ((bmsj.f130688a & 8) != 0) {
            bmsl = bmsj.f130692e;
            if (bmsl == null) {
                bmsl = bmsl.f130698i;
            }
        } else {
            bmsl = null;
        }
        int i = awog.f94705o;
        awog.mo52362a(bmaq, bmav, bwgz, bmar, bmsl, true, "onInitializePaymentMethodsResponse");
    }

    /* renamed from: a */
    public final void mo52359a(bmso bmso) {
        bmaq bmaq;
        bmav bmav;
        bmar bmar;
        bmsl bmsl;
        awog awog = this.f94704a;
        int i = awog.f94705o;
        awog.f94711f = bmso;
        if ((bmso.f130721a & 2) != 0) {
            bmaq = bmso.f130723c;
            if (bmaq == null) {
                bmaq = bmaq.f128479l;
            }
        } else {
            bmaq = null;
        }
        if ((bmso.f130721a & 1) != 0) {
            bmav = bmso.f130722b;
            if (bmav == null) {
                bmav = bmav.f128500h;
            }
        } else {
            bmav = null;
        }
        bwgz a = bwgz.m121952a(bmso.f130726f);
        if (a == null) {
            a = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        }
        if ((bmso.f130721a & 4) != 0) {
            bmar = bmso.f130724d;
            if (bmar == null) {
                bmar = bmar.f128490c;
            }
        } else {
            bmar = null;
        }
        if ((bmso.f130721a & 8) != 0) {
            bmsl = bmso.f130725e;
            if (bmsl == null) {
                bmsl = bmsl.f130698i;
            }
        } else {
            bmsl = null;
        }
        awog.mo52362a(bmaq, bmav, a, bmar, bmsl, false, "onSubmitPaymentMethodsResponse");
    }
}
