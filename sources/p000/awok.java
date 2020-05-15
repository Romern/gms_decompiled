package p000;

/* renamed from: awok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awok extends awpc {

    /* renamed from: a */
    final /* synthetic */ awom f94725a;

    public awok(awom awom) {
        this.f94725a = awom;
    }

    /* renamed from: a */
    public final void mo51894a() {
        awom awom = this.f94725a;
        int i = awom.f94726t;
        awom.mo52898h(21);
        this.f94725a.mo52874ag();
    }

    /* renamed from: b */
    public final void mo51897b() {
        awom awom = this.f94725a;
        int i = awom.f94726t;
        awom.mo52898h(20);
        this.f94725a.mo52897g(-1);
    }

    /* renamed from: c */
    public final void mo51898c() {
        awom awom = this.f94725a;
        int i = awom.f94726t;
        awom.mo52898h(22);
        this.f94725a.mo52897g(-1);
    }

    /* renamed from: a */
    public final void mo52372a(bwjx bwjx) {
        bmar bmar;
        String str;
        bwjy bwjy;
        bmav bmav;
        bmag bmag;
        bwiu bwiu;
        awom awom = this.f94725a;
        bmaq bmaq = bwjx.f159892c;
        if (bmaq == null) {
            bmaq = bmaq.f128479l;
        }
        bwgz a = bwgz.m121952a(bwjx.f159894e);
        if (a == null) {
            a = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        }
        if ((bwjx.f159890a & 4) != 0) {
            bmar = bwjx.f159893d;
            if (bmar == null) {
                bmar = bmar.f128490c;
            }
        } else {
            bmar = null;
        }
        int i = bwjx.f159890a;
        if ((i & 64) != 0) {
            str = bwjx.f159897h;
        } else {
            str = null;
        }
        if ((i & 16) != 0) {
            bwjy bwjy2 = bwjx.f159895f;
            bwjy = bwjy2 != null ? bwjy2 : bwjy.f159900r;
        } else {
            bwjy = null;
        }
        if ((bwjx.f159890a & 1) != 0) {
            bmav bmav2 = bwjx.f159891b;
            bmav = bmav2 != null ? bmav2 : bmav.f128500h;
        } else {
            bmav = null;
        }
        if ((bwjx.f159890a & 128) != 0) {
            bmag bmag2 = bwjx.f159898i;
            bmag = bmag2 != null ? bmag2 : bmag.f128442c;
        } else {
            bmag = null;
        }
        if ((bwjx.f159890a & 32) != 0) {
            bwiu bwiu2 = bwjx.f159896g;
            if (bwiu2 == null) {
                bwiu = bwiu.f159689b;
            } else {
                bwiu = bwiu2;
            }
        } else {
            bwiu = null;
        }
        int i2 = awom.f94726t;
        awom.mo52377a(bmaq, a, bmar, str, null, bwjy, bmav, bmag, true, "onInitializeResponse", bwiu);
    }

    /* renamed from: a */
    public final void mo52373a(bwkb bwkb) {
        String str;
        bmaq bmaq;
        bwgz bwgz;
        bmar bmar;
        String str2;
        bwjy bwjy;
        bmav bmav;
        bmag bmag;
        bwjv bwjv = bwkb.f159943h;
        if (bwjv == null) {
            bwjv = bwjv.f159878c;
        }
        if ((bwjv.f159880a & 1) != 0) {
            bwjv bwjv2 = bwkb.f159943h;
            if (bwjv2 == null) {
                bwjv2 = bwjv.f159878c;
            }
            str = bwjv2.f159881b;
        } else {
            str = null;
        }
        awom awom = this.f94725a;
        awom.f94737j = bwkb.f159945j;
        bmaq bmaq2 = bwkb.f159938c;
        if (bmaq2 != null) {
            bmaq = bmaq2;
        } else {
            bmaq = bmaq.f128479l;
        }
        bwgz a = bwgz.m121952a(bwkb.f159940e);
        if (a != null) {
            bwgz = a;
        } else {
            bwgz = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        }
        if ((bwkb.f159936a & 4) != 0) {
            bmar bmar2 = bwkb.f159939d;
            bmar = bmar2 != null ? bmar2 : bmar.f128490c;
        } else {
            bmar = null;
        }
        int i = bwkb.f159936a;
        if ((i & 32) != 0) {
            str2 = bwkb.f159942g;
        } else {
            str2 = null;
        }
        if ((i & 16) != 0) {
            bwjy bwjy2 = bwkb.f159941f;
            bwjy = bwjy2 != null ? bwjy2 : bwjy.f159900r;
        } else {
            bwjy = null;
        }
        if ((bwkb.f159936a & 1) != 0) {
            bmav bmav2 = bwkb.f159937b;
            bmav = bmav2 != null ? bmav2 : bmav.f128500h;
        } else {
            bmav = null;
        }
        if ((bwkb.f159936a & 128) != 0) {
            bmag bmag2 = bwkb.f159944i;
            if (bmag2 == null) {
                bmag = bmag.f128442c;
            } else {
                bmag = bmag2;
            }
        } else {
            bmag = null;
        }
        int i2 = awom.f94726t;
        awom.mo52377a(bmaq, bwgz, bmar, str2, str, bwjy, bmav, bmag, false, "onSubmitResponse", null);
    }
}
