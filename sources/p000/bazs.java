package p000;

/* renamed from: bazs */
final /* synthetic */ class bazs implements bqeh {

    /* renamed from: a */
    private final bbav f102171a;

    /* renamed from: b */
    private final bavr f102172b;

    /* renamed from: c */
    private final bavd f102173c;

    /* renamed from: d */
    private final bavd f102174d;

    public bazs(bbav bbav, bavr bavr, bavd bavd, bavd bavd2) {
        this.f102171a = bbav;
        this.f102172b = bavr;
        this.f102173c = bavd;
        this.f102174d = bavd2;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbav bbav = this.f102171a;
        bavr bavr = this.f102172b;
        bavd bavd = this.f102173c;
        bavd bavd2 = this.f102174d;
        if (!((Boolean) obj).booleanValue()) {
            bbav.f102245b.mo34988b(1036);
            return bqga.m112775a(bbau.FAILED);
        }
        bxvd bxvd = (bxvd) bavr.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bavr);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bavr bavr2 = (bavr) bxvd.f164949b;
        bavr bavr3 = bavr.f101916f;
        bavr2.f101918a |= 8;
        bavr2.f101922e = false;
        return bqdx.m112674a(bbav.f102247d.mo56056b((bavr) bxvd.mo74062i()), new bazt(bbav, bavd, bavd2), bbav.f102251h);
    }
}
