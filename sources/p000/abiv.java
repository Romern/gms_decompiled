package p000;

/* renamed from: abiv */
final /* synthetic */ class abiv implements bmxj {

    /* renamed from: a */
    private final String f57556a;

    public abiv(String str) {
        this.f57556a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f57556a;
        abjc abjc = (abjc) obj;
        if (!abjc.mo32132a()) {
            return abjc.m47783c();
        }
        bngs j = bngx.m109377j();
        j.mo67666b((Iterable) abjc.mo32133b());
        return abjc.m47782a(str, j);
    }
}
