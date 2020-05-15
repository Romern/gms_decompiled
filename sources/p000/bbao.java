package p000;

import java.io.IOException;

/* renamed from: bbao */
final /* synthetic */ class bbao implements bqeh {

    /* renamed from: a */
    private final bbav f102226a;

    /* renamed from: b */
    private final bavr f102227b;

    /* renamed from: c */
    private final bavd f102228c;

    public bbao(bbav bbav, bavr bavr, bavd bavd) {
        this.f102226a = bbav;
        this.f102227b = bavr;
        this.f102228c = bavd;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbav bbav = this.f102226a;
        bavr bavr = this.f102227b;
        bavd bavd = this.f102228c;
        if (((Boolean) obj).booleanValue()) {
            bxvd bxvd = (bxvd) bavr.mo74142c(5);
            bxvd.mo73625a((bxvk) bavr);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bavr bavr2 = (bavr) bxvd.f164949b;
            bavr bavr3 = bavr.f101916f;
            bavr2.f101918a |= 8;
            bavr2.f101922e = false;
            return bqdx.m112674a(bbav.f102247d.mo56052a((bavr) bxvd.mo74062i(), bavd), new bbap(bbav), bbav.f102251h);
        }
        throw new IOException("Subscribing to group failed");
    }
}
