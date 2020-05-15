package p000;

/* renamed from: bazi */
final /* synthetic */ class bazi implements bqeh {

    /* renamed from: a */
    private final bbav f102152a;

    /* renamed from: b */
    private final bavr f102153b;

    public bazi(bbav bbav, bavr bavr) {
        this.f102152a = bbav;
        this.f102153b = bavr;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbav bbav = this.f102152a;
        bavr bavr = this.f102153b;
        if (!((Boolean) obj).booleanValue()) {
            bbev.m87905a("%s: Unable to remove GroupKeys with downloaded field not set.", "FileGroupManager");
            return bqga.m112775a((Object) null);
        }
        String str = bavr.f101919b;
        Object[] objArr = {"FileGroupManager", str, bavr.f101920c};
        bbav.f102245b.mo34980a(1061, str, -1);
        return bqga.m112775a((Object) null);
    }
}
