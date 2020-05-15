package p000;

/* renamed from: upk */
final /* synthetic */ class upk implements uox {

    /* renamed from: a */
    private final upl f48478a;

    /* renamed from: b */
    private final ujx f48479b;

    public upk(upl upl, ujx ujx) {
        this.f48478a = upl;
        this.f48479b = ujx;
    }

    /* renamed from: a */
    public final boolean mo27802a(uqi uqi) {
        upl upl = this.f48478a;
        ujx ujx = this.f48479b;
        upq upq = (upq) uqi;
        if (!upq.mo27834a(ujx)) {
            return true;
        }
        upl.f48480a.mo25371b("Raised changes available event to listener");
        upl.mo27826a(47, ujx);
        return upq.mo27833a();
    }
}
