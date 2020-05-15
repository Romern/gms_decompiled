package p000;

/* renamed from: kla */
final /* synthetic */ class kla implements bmxj {

    /* renamed from: a */
    private final klf f24399a;

    public kla(klf klf) {
        this.f24399a = klf;
    }

    public final Object apply(Object obj) {
        klf klf = this.f24399a;
        klp klp = (klp) obj;
        bnha a = bnhe.m109406a(klf.f24414a.size());
        bnre i = klf.f24414a.listIterator();
        while (i.hasNext()) {
            kkc kkc = (kkc) i.next();
            a.mo67695b(Integer.valueOf(kkc.mo14567a()), kkc.mo14568a(klp.f24431b, klp.f24432c));
        }
        return a.mo67618b();
    }
}
