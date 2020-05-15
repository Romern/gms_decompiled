package p000;

/* renamed from: bddq */
final /* synthetic */ class bddq implements rkl {

    /* renamed from: a */
    private final bddr f105378a;

    /* renamed from: b */
    private final bdep f105379b;

    public bddq(bddr bddr, bdep bdep) {
        this.f105378a = bddr;
        this.f105379b = bdep;
    }

    /* renamed from: a */
    public final void mo9454a(rkk rkk) {
        bddr bddr = this.f105378a;
        bdep bdep = this.f105379b;
        allh allh = (allh) rkk;
        if (!allh.mo7183bo().mo17710c() || allh.mo40486b() == null) {
            bdep.mo57931a(null);
        } else {
            new bddm(allh.mo40486b(), bdep).executeOnExecutor(bddr.f105380a, new Void[0]);
        }
    }
}
