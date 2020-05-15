package p000;

import java.util.ArrayList;

/* renamed from: bbaa */
final /* synthetic */ class bbaa implements bqeh {

    /* renamed from: a */
    private final bbav f102191a;

    /* renamed from: b */
    private final boolean f102192b;

    /* renamed from: c */
    private final bavr f102193c;

    public bbaa(bbav bbav, boolean z, bavr bavr) {
        this.f102191a = bbav;
        this.f102192b = z;
        this.f102193c = bavr;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbav bbav = this.f102191a;
        boolean z = this.f102192b;
        bavr bavr = this.f102193c;
        bavs bavs = (bavs) obj;
        if (bavs == null) {
            bavs = bavs.f101923c;
        }
        bxvd bxvd = (bxvd) bavs.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bavs);
        ArrayList arrayList = new ArrayList();
        if (!z) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bavs bavs2 = (bavs) bxvd.f164949b;
            bavs2.f101925a |= 1;
            bavs2.f101926b = false;
            bxvd bxvd2 = (bxvd) bavr.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) bavr);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bavr bavr2 = (bavr) bxvd2.f164949b;
            bavr bavr3 = bavr.f101916f;
            bavr2.f101918a |= 8;
            bavr2.f101922e = false;
            arrayList.add(bbav.mo56044a((bavr) bxvd2.mo74062i()));
            bxvd bxvd3 = (bxvd) bavr.mo74142c(5);
            bxvd3.mo73625a((GeneratedMessageLite) bavr);
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            bavr bavr4 = (bavr) bxvd3.f164949b;
            bavr4.f101918a |= 8;
            bavr4.f101922e = true;
            arrayList.add(bbav.mo56044a((bavr) bxvd3.mo74062i()));
        } else {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bavs bavs3 = (bavs) bxvd.f164949b;
            bavs3.f101925a |= 1;
            bavs3.f101926b = true;
        }
        return bqga.m112782b(arrayList).mo69214a(new bbae(bbav, bavr, bxvd), bbav.f102251h);
    }
}
