package p000;

/* renamed from: ppo */
final /* synthetic */ class ppo implements aubt {

    /* renamed from: a */
    private final ppp f40027a;

    /* renamed from: b */
    private final String f40028b;

    public ppo(ppp ppp, String str) {
        this.f40027a = ppp;
        this.f40028b = str;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        ppp ppp = this.f40027a;
        String str = this.f40028b;
        ppp.f40029a.mo23674b(exc, "failed to fetch linked device.", new Object[0]);
        if (ppz.f40045d.mo23546a(str)) {
            pqd pqd = new pqd((pqd) ppz.f40045d.mo23548c().get(str));
            pes pes = pes.f38974a;
            pqd.f40056b = System.currentTimeMillis();
            ppz.f40045d.mo23545a(pqd);
        }
    }
}
