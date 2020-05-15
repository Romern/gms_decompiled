package p000;

/* renamed from: awch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awch extends awpc {

    /* renamed from: a */
    final /* synthetic */ awcj f94175a;

    public awch(awcj awcj) {
        this.f94175a = awcj;
    }

    /* renamed from: a */
    public final void mo51894a() {
        awcj awcj = this.f94175a;
        int i = awcj.f94176k;
        awcj.mo52898h(21);
        this.f94175a.mo52874ag();
    }

    /* renamed from: b */
    public final void mo51897b() {
        awcj awcj = this.f94175a;
        int i = awcj.f94176k;
        awcj.mo52898h(20);
        this.f94175a.mo52897g(-1);
    }

    /* renamed from: c */
    public final void mo51898c() {
        awcj awcj = this.f94175a;
        int i = awcj.f94176k;
        awcj.mo52898h(22);
        this.f94175a.mo52897g(-1);
    }

    /* renamed from: a */
    public final void mo51895a(blxn blxn) {
        bmar bmar;
        blxo blxo;
        bmav bmav;
        awcj awcj = this.f94175a;
        bmaq bmaq = blxn.f128091c;
        if (bmaq == null) {
            bmaq = bmaq.f128479l;
        }
        bwgz bwgz = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        if ((blxn.f128089a & 4) != 0) {
            bmar = blxn.f128092d;
            if (bmar == null) {
                bmar = bmar.f128490c;
            }
        } else {
            bmar = null;
        }
        if ((blxn.f128089a & 8) != 0) {
            blxo = blxn.f128093e;
            if (blxo == null) {
                blxo = blxo.f128095k;
            }
        } else {
            blxo = null;
        }
        if ((blxn.f128089a & 1) != 0) {
            bmav = blxn.f128090b;
            if (bmav == null) {
                bmav = bmav.f128500h;
            }
        } else {
            bmav = null;
        }
        awcj.mo51909a(bmaq, bwgz, bmar, blxo, bmav, true, "onInitialize");
    }

    /* renamed from: a */
    public final void mo51896a(blxr blxr) {
        bmar bmar;
        blxo blxo;
        bmav bmav;
        awcj awcj = this.f94175a;
        bmaq bmaq = blxr.f128125c;
        if (bmaq == null) {
            bmaq = bmaq.f128479l;
        }
        bwgz a = bwgz.m121952a(blxr.f128128f);
        if (a == null) {
            a = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        }
        if ((blxr.f128123a & 4) != 0) {
            bmar = blxr.f128126d;
            if (bmar == null) {
                bmar = bmar.f128490c;
            }
        } else {
            bmar = null;
        }
        if ((blxr.f128123a & 8) != 0) {
            blxo = blxr.f128127e;
            if (blxo == null) {
                blxo = blxo.f128095k;
            }
        } else {
            blxo = null;
        }
        if ((blxr.f128123a & 1) != 0) {
            bmav = blxr.f128124b;
            if (bmav == null) {
                bmav = bmav.f128500h;
            }
        } else {
            bmav = null;
        }
        awcj.mo51909a(bmaq, a, bmar, blxo, bmav, false, "onSubmit");
    }
}
