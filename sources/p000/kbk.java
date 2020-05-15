package p000;

/* renamed from: kbk */
final /* synthetic */ class kbk implements bmxj {

    /* renamed from: a */
    private final kbm f23695a;

    /* renamed from: b */
    private final kcv f23696b;

    public kbk(kbm kbm, kcv kcv) {
        this.f23695a = kbm;
        this.f23696b = kcv;
    }

    public final Object apply(Object obj) {
        kbm kbm = this.f23695a;
        kcv kcv = this.f23696b;
        bnia j = bnic.m109500j();
        j.mo67629b(kcv);
        bnre i = ((bngx) obj).listIterator();
        while (i.hasNext()) {
            bxwc bxwc = ((byts) i.next()).f167715a;
            int size = bxwc.size();
            for (int i2 = 0; i2 < size; i2++) {
                try {
                    j.mo67629b(kbm.f23699b.mo14763a(((bytw) bxwc.get(i2)).f167728b));
                } catch (kpi e) {
                    bnsl bnsl = (bnsl) kbm.f23698a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("kbm", "a", 51, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68448m();
                }
            }
        }
        return j.mo67751a();
    }
}
