package p000;

/* renamed from: bayk */
final /* synthetic */ class bayk implements bqeh {

    /* renamed from: a */
    private final bbav f102100a;

    /* renamed from: b */
    private final bavd f102101b;

    /* renamed from: c */
    private final bavr f102102c;

    public bayk(bbav bbav, bavd bavd, bavr bavr) {
        this.f102100a = bbav;
        this.f102101b = bavd;
        this.f102102c = bavr;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        boolean z;
        bbav bbav = this.f102100a;
        bavd bavd = this.f102101b;
        bavr bavr = this.f102102c;
        bbau bbau = (bbau) obj;
        if (bbau == bbau.FAILED) {
            bbav.f102245b.mo34980a(1008, bavd.f101873c, bavd.f101875e);
            return bqga.m112775a(bbau.FAILED);
        } else if (bbau == bbau.PENDING) {
            bbav.f102245b.mo34980a(1007, bavd.f101873c, bavd.f101875e);
            return bqga.m112775a(bbau.PENDING);
        } else {
            if (bbau == bbau.DOWNLOADED) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108588a(z);
            long a = bbav.f102249f.mo54417a();
            bauz bauz = bavd.f101872b;
            if (bauz == null) {
                bauz = bauz.f101860g;
            }
            bxvd bxvd = (bxvd) bauz.mo74142c(5);
            bxvd.mo73625a((bxvk) bauz);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bauz bauz2 = (bauz) bxvd.f164949b;
            bauz2.f101862a |= 4;
            bauz2.f101865d = a;
            bauz bauz3 = (bauz) bxvd.mo74062i();
            bxvd bxvd2 = (bxvd) bavd.mo74142c(5);
            bxvd2.mo73625a((bxvk) bavd);
            bavc bavc = (bavc) bxvd2;
            if (bavc.f164950c) {
                bavc.mo74035c();
                bavc.f164950c = false;
            }
            bavd bavd2 = (bavd) bavc.f164949b;
            bavd bavd3 = bavd.f101869m;
            bauz3.getClass();
            bavd2.f101872b = bauz3;
            bavd2.f101871a |= 1;
            bavd bavd4 = (bavd) bavc.mo74062i();
            bxvd bxvd3 = (bxvd) bavr.mo74142c(5);
            bxvd3.mo73625a((bxvk) bavr);
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            bavr bavr2 = (bavr) bxvd3.f164949b;
            bavr bavr3 = bavr.f101916f;
            bavr2.f101918a |= 8;
            bavr2.f101922e = true;
            bavr bavr4 = (bavr) bxvd3.mo74062i();
            return bqdx.m112674a(bbav.f102247d.mo56051a(bavr4), new bazr(bbav, bavr4, bavd4, bavr), bbav.f102251h);
        }
    }
}
