package p000;

/* renamed from: ygk */
final /* synthetic */ class ygk implements bmxz {

    /* renamed from: a */
    private final bnic f53759a;

    public ygk(bnic bnic) {
        this.f53759a = bnic;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        bnic bnic = this.f53759a;
        yfr yfr = (yfr) obj;
        ygd ygd = ygv.f53771a;
        bnrd a = bnic.iterator();
        while (a.hasNext()) {
            if (yfr.mo30427f().startsWith((String) a.next())) {
                return true;
            }
        }
        return false;
    }
}
