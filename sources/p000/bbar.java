package p000;

/* renamed from: bbar */
final /* synthetic */ class bbar implements bqeh {

    /* renamed from: a */
    private final bbav f102233a;

    /* renamed from: b */
    private final bavr f102234b;

    public bbar(bbav bbav, bavr bavr) {
        this.f102233a = bbav;
        this.f102234b = bavr;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbav bbav = this.f102233a;
        bavr bavr = this.f102234b;
        Exception exc = (Exception) obj;
        bqgg a = bqga.m112775a((Object) null);
        if (exc instanceof bauq) {
            a = bqdx.m112674a(a, new bazu(bbav, bavr, (bauq) exc), bbav.f102251h);
        } else if (exc instanceof baua) {
            bnre i = ((baua) exc).f101746a.listIterator();
            while (i.hasNext()) {
                Throwable th = (Throwable) i.next();
                if (th instanceof bauq) {
                    a = bqdx.m112674a(a, new bazv(bbav, bavr, (bauq) th), bbav.f102251h);
                } else {
                    bbev.m87905a("%s: Expecting DownloadException's in AggregateException", "FileGroupManager");
                }
            }
        }
        return bqdx.m112674a(a, new bazw(exc), bbav.f102251h);
    }
}
