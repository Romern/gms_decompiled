package p000;

/* renamed from: awjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awjv extends awpc {

    /* renamed from: a */
    final /* synthetic */ awjw f94566a;

    public awjv(awjw awjw) {
        this.f94566a = awjw;
    }

    /* renamed from: a */
    public final void mo51894a() {
        awjw awjw = this.f94566a;
        int i = awjw.f94567d;
        awjw.mo52898h(21);
        this.f94566a.mo52874ag();
    }

    /* renamed from: b */
    public final void mo51897b() {
        awjw awjw = this.f94566a;
        int i = awjw.f94567d;
        awjw.mo52898h(20);
        this.f94566a.mo52897g(-1);
    }

    /* renamed from: c */
    public final void mo51898c() {
        awjw awjw = this.f94566a;
        int i = awjw.f94567d;
        awjw.mo52898h(22);
        this.f94566a.mo52897g(-1);
    }

    /* renamed from: a */
    public final void mo52183a(bwjf bwjf) {
        bmar bmar;
        bwjg bwjg;
        bmav bmav;
        awjw awjw = this.f94566a;
        bmaq bmaq = bwjf.f159757c;
        if (bmaq == null) {
            bmaq = bmaq.f128479l;
        }
        bwgz a = bwgz.m121952a(bwjf.f159760f);
        if (a == null) {
            a = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        }
        if ((bwjf.f159755a & 4) != 0) {
            bmar = bwjf.f159758d;
            if (bmar == null) {
                bmar = bmar.f128490c;
            }
        } else {
            bmar = null;
        }
        if ((bwjf.f159755a & 8) != 0) {
            bwjg = bwjf.f159759e;
            if (bwjg == null) {
                bwjg = bwjg.f159762k;
            }
        } else {
            bwjg = null;
        }
        if ((bwjf.f159755a & 1) != 0) {
            bmav = bwjf.f159756b;
            if (bmav == null) {
                bmav = bmav.f128500h;
            }
        } else {
            bmav = null;
        }
        int i = awjw.f94567d;
        awjw.mo52185a(bmaq, a, bmar, bwjg, bmav, true, "onInitializeResponse");
    }

    /* renamed from: a */
    public final void mo52184a(bwjj bwjj) {
        bwjg bwjg;
        awjw awjw = this.f94566a;
        bmaq bmaq = bwjj.f159791c;
        if (bmaq == null) {
            bmaq = bmaq.f128479l;
        }
        bwgz a = bwgz.m121952a(bwjj.f159794f);
        if (a == null) {
            a = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        }
        bmar bmar = bwjj.f159792d;
        if (bmar == null) {
            bmar = bmar.f128490c;
        }
        bmav bmav = null;
        if ((bwjj.f159789a & 8) != 0) {
            bwjg = bwjj.f159793e;
            if (bwjg == null) {
                bwjg = bwjg.f159762k;
            }
        } else {
            bwjg = null;
        }
        if ((bwjj.f159789a & 1) != 0) {
            bmav bmav2 = bwjj.f159790b;
            bmav = bmav2 == null ? bmav.f128500h : bmav2;
        }
        int i = awjw.f94567d;
        awjw.mo52185a(bmaq, a, bmar, bwjg, bmav, false, "onSubmitResponse");
    }
}
