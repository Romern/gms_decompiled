package p000;

/* renamed from: bayx */
final /* synthetic */ class bayx implements bqeh {

    /* renamed from: a */
    private final bbav f102134a;

    /* renamed from: b */
    private final bavd f102135b;

    public bayx(bbav bbav, bavd bavd) {
        this.f102134a = bbav;
        this.f102135b = bavd;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        long j;
        bbav bbav = this.f102134a;
        bavd bavd = this.f102135b;
        bavd bavd2 = (bavd) obj;
        if (bavd2 != null && bbav.m87740b(bavd, bavd2)) {
            bauz bauz = bavd2.f101872b;
            if (bauz == null) {
                bauz = bauz.f101860g;
            }
            j = bauz.f101864c;
        } else {
            j = bbav.f102249f.mo54417a();
        }
        bauz bauz2 = bavd.f101872b;
        if (bauz2 == null) {
            bauz2 = bauz.f101860g;
        }
        bxvd bxvd = (bxvd) bauz2.mo74142c(5);
        bxvd.mo73625a((bxvk) bauz2);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bauz bauz3 = (bauz) bxvd.f164949b;
        bauz3.f101862a |= 2;
        bauz3.f101864c = j;
        bauz bauz4 = (bauz) bxvd.mo74062i();
        bxvd bxvd2 = (bxvd) bavd.mo74142c(5);
        bxvd2.mo73625a((bxvk) bavd);
        bavc bavc = (bavc) bxvd2;
        if (bavc.f164950c) {
            bavc.mo74035c();
            bavc.f164950c = false;
        }
        bavd bavd3 = (bavd) bavc.f164949b;
        bavd bavd4 = bavd.f101869m;
        bauz4.getClass();
        bavd3.f101872b = bauz4;
        bavd3.f101871a |= 1;
        return bqga.m112775a((bavd) bavc.mo74062i());
    }
}
