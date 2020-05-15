package p000;

/* renamed from: upe */
final /* synthetic */ class upe implements uox {

    /* renamed from: a */
    private final upf f48455a;

    /* renamed from: b */
    private final ujx f48456b;

    public upe(upf upf, ujx ujx) {
        this.f48455a = upf;
        this.f48456b = ujx;
    }

    /* renamed from: a */
    public final boolean mo27802a(uqi uqi) {
        upf upf = this.f48455a;
        ujx ujx = this.f48456b;
        upq upq = (upq) uqi;
        if (!upq.mo27834a(ujx)) {
            return true;
        }
        upf.f48457a.mo25371b("Raised changes available event to listener");
        upf.mo27824a(47, ujx);
        return upq.mo27833a();
    }
}
