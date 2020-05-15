package p000;

import java.io.IOException;

/* renamed from: bbaq */
final /* synthetic */ class bbaq implements bqeh {

    /* renamed from: a */
    private final bbav f102230a;

    /* renamed from: b */
    private final bavr f102231b;

    /* renamed from: c */
    private final bavn f102232c;

    public bbaq(bbav bbav, bavr bavr, bavn bavn) {
        this.f102230a = bbav;
        this.f102231b = bavr;
        this.f102232c = bavn;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bbav.a(bavr, boolean):bqgg
     arg types: [bavr, int]
     candidates:
      bbav.a(bavd, bavd):boolean
      bbav.a(bavr, bauq):bqgg
      bbav.a(bavr, bavd):bqgg
      bbav.a(bavr, bavn):bqgg
      bbav.a(bavr, boolean):bqgg */
    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbav bbav = this.f102230a;
        bavr bavr = this.f102231b;
        bavn bavn = this.f102232c;
        bavd bavd = (bavd) obj;
        if (bavd == null) {
            return bqdx.m112674a(bbav.mo56048a(bavr, true), new bazx(bavr), bbav.f102251h);
        }
        bauz bauz = bavd.f101872b;
        if (bauz == null) {
            bauz = bauz.f101860g;
        }
        int i = bauz.f101867f;
        bxvd bxvd = (bxvd) bavd.mo74142c(5);
        bxvd.mo73625a((bxvk) bavd);
        bavc bavc = (bavc) bxvd;
        bxvd bxvd2 = (bxvd) bauz.mo74142c(5);
        bxvd2.mo73625a((bxvk) bauz);
        int i2 = i + 1;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bauz bauz2 = (bauz) bxvd2.f164949b;
        bauz2.f101862a |= 16;
        bauz2.f101867f = i2;
        if (bavc.f164950c) {
            bavc.mo74035c();
            bavc.f164950c = false;
        }
        bavd bavd2 = (bavd) bavc.f164949b;
        bauz bauz3 = (bauz) bxvd2.mo74062i();
        bauz3.getClass();
        bavd2.f101872b = bauz3;
        bavd2.f101871a |= 1;
        bavd bavd3 = (bavd) bavc.mo74062i();
        boolean z = !((bauz.f101862a & 8) != 0);
        if (z) {
            long a = bbav.f102249f.mo54417a();
            bauz bauz4 = bavd3.f101872b;
            if (bauz4 == null) {
                bauz4 = bauz.f101860g;
            }
            bxvd bxvd3 = (bxvd) bauz4.mo74142c(5);
            bxvd3.mo73625a((bxvk) bauz4);
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            bauz bauz5 = (bauz) bxvd3.f164949b;
            bauz5.f101862a |= 8;
            bauz5.f101866e = a;
            bauz bauz6 = (bauz) bxvd3.mo74062i();
            bxvd bxvd4 = (bxvd) bavd3.mo74142c(5);
            bxvd4.mo73625a((bxvk) bavd3);
            bavc bavc2 = (bavc) bxvd4;
            if (bavc2.f164950c) {
                bavc2.mo74035c();
                bavc2.f164950c = false;
            }
            bavd bavd4 = (bavd) bavc2.f164949b;
            bauz6.getClass();
            bavd4.f101872b = bauz6;
            bavd4.f101871a = 1 | bavd4.f101871a;
            bavd3 = (bavd) bavc2.mo74062i();
        }
        bxvd bxvd5 = (bxvd) bavr.mo74142c(5);
        bxvd5.mo73625a((bxvk) bavr);
        if (bxvd5.f164950c) {
            bxvd5.mo74035c();
            bxvd5.f164950c = false;
        }
        bavr bavr2 = (bavr) bxvd5.f164949b;
        bavr bavr3 = bavr.f101916f;
        bavr2.f101918a |= 8;
        bavr2.f101922e = false;
        return bqdx.m112674a(bqdf.m112620a(bqfl.m112747c(bqdx.m112674a(bbav.f102247d.mo56052a((bavr) bxvd5.mo74062i(), bavd3), new bayr(bbav, z, bavd3), bbav.f102251h)), IOException.class, bazy.f102186a, bbav.f102251h), new bazz(bbav, bavn, bavd, bavr), bbav.f102251h);
    }
}
