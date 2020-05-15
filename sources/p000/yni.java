package p000;

/* renamed from: yni */
final /* synthetic */ class yni implements bmxz {

    /* renamed from: a */
    private final bnic f54129a;

    /* renamed from: b */
    private final float f54130b;

    public yni(bnic bnic, float f) {
        this.f54129a = bnic;
        this.f54130b = f;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        bnic bnic = this.f54129a;
        float f = this.f54130b;
        yhu yhu = (yhu) obj;
        int i = ynk.f54132a;
        int j = yhu.mo30517j();
        if (!bnic.contains(yhu.mo30511d().mo30422b().mo30409a()) && ynk.m44409a(j)) {
            return false;
        }
        Float f2 = (Float) bzzq.f172146a.get(Integer.valueOf(j));
        return (f2 != null && f2.floatValue() > f) || j == 108;
    }
}
