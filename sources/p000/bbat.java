package p000;

/* renamed from: bbat */
final /* synthetic */ class bbat implements bqeh {

    /* renamed from: a */
    private final bbav f102237a;

    /* renamed from: b */
    private final boolean f102238b;

    /* renamed from: c */
    private final bavr f102239c;

    public bbat(bbav bbav, boolean z, bavr bavr) {
        this.f102237a = bbav;
        this.f102238b = z;
        this.f102239c = bavr;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        boolean z;
        bbav bbav = this.f102237a;
        boolean z2 = this.f102238b;
        bavr bavr = this.f102239c;
        bavd bavd = (bavd) obj;
        if (bavd == null) {
            return bqga.m112775a((Object) null);
        }
        bavn bavn = bavd.f101879i;
        if (bavn == null) {
            bavn = bavn.f101895f;
        }
        int a = bavk.m87603a(bavn.f101899c);
        if (a != 0 && a == 2) {
            z = true;
        } else {
            bavn bavn2 = bavd.f101879i;
            if (bavn2 == null) {
                bavn2 = bavn.f101895f;
            }
            int a2 = bavk.m87603a(bavn2.f101899c);
            if (a2 == 0) {
                z = false;
            } else if (a2 == 3) {
                long a3 = bbav.f102249f.mo54417a();
                bauz bauz = bavd.f101872b;
                if (bauz == null) {
                    bauz = bauz.f101860g;
                }
                long j = (a3 - bauz.f101864c) / 1000;
                bavn bavn3 = bavd.f101879i;
                if (bavn3 == null) {
                    bavn3 = bavn.f101895f;
                }
                if (j > bavn3.f101900d) {
                    bxvd bxvd = (bxvd) bavd.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) bavd);
                    bavc bavc = (bavc) bxvd;
                    bavn bavn4 = bavd.f101879i;
                    if (bavn4 == null) {
                        bavn4 = bavn.f101895f;
                    }
                    bxvd bxvd2 = (bxvd) bavn4.mo74142c(5);
                    bxvd2.mo73625a((GeneratedMessageLite) bavn4);
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    bavn bavn5 = (bavn) bxvd2.f164949b;
                    bavn5.f101899c = 1;
                    bavn5.f101897a |= 2;
                    if (bavc.f164950c) {
                        bavc.mo74035c();
                        bavc.f164950c = false;
                    }
                    bavd bavd2 = (bavd) bavc.f164949b;
                    bavn bavn6 = (bavn) bxvd2.mo74062i();
                    bavn6.getClass();
                    bavd2.f101879i = bavn6;
                    bavd2.f101871a |= 128;
                    bavd = (bavd) bavc.mo74062i();
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        Object[] objArr = {"FileGroupManager", bavd.f101873c, Boolean.valueOf(z)};
        if (!z2 && !z) {
            return bqga.m112775a((Object) null);
        }
        bavn bavn7 = bavd.f101879i;
        if (bavn7 == null) {
            bavn7 = bavn.f101895f;
        }
        return bbav.mo56047a(bavr, bavn7);
    }
}
