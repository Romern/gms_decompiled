package p000;

/* renamed from: yge */
final /* synthetic */ class yge implements bmxz {

    /* renamed from: a */
    private final bnic f53753a;

    public yge(bnic bnic) {
        this.f53753a = bnic;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        bnic bnic = this.f53753a;
        yfr yfr = (yfr) obj;
        ygd ygd = ygv.f53771a;
        if (!yfr.mo30422b().mo30410b()) {
            return false;
        }
        bnrd a = bnic.iterator();
        while (a.hasNext()) {
            if (yfr.mo30427f().startsWith((String) a.next())) {
                return true;
            }
        }
        return false;
    }
}
