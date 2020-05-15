package p000;

import java.util.List;

/* renamed from: bbco */
final /* synthetic */ class bbco implements bqeh {

    /* renamed from: a */
    private final bbda f102340a;

    /* renamed from: b */
    private final bavu f102341b;

    /* renamed from: c */
    private final bauy f102342c;

    /* renamed from: d */
    private final bavr f102343d;

    /* renamed from: e */
    private final bavt f102344e;

    /* renamed from: f */
    private final bavn f102345f;

    /* renamed from: g */
    private final int f102346g;

    /* renamed from: h */
    private final List f102347h;

    public bbco(bbda bbda, bavu bavu, bauy bauy, bavr bavr, bavt bavt, bavn bavn, int i, List list) {
        this.f102340a = bbda;
        this.f102341b = bavu;
        this.f102342c = bauy;
        this.f102343d = bavr;
        this.f102344e = bavt;
        this.f102345f = bavn;
        this.f102346g = i;
        this.f102347h = list;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        String str;
        bbda bbda = this.f102340a;
        bavu bavu = this.f102341b;
        bauy bauy = this.f102342c;
        bavr bavr = this.f102343d;
        bavt bavt = this.f102344e;
        bavn bavn = this.f102345f;
        int i = this.f102346g;
        List list = this.f102347h;
        bavg bavg = (bavg) obj;
        bxvd bxvd = (bxvd) bavu.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bavu);
        String str2 = bavu.f101938b;
        if (bavg != null) {
            str = bbeg.m87878a(str2, bavg.f101889d);
        } else if ((bauy.f101849a & 32) != 0) {
            str = bbeg.m87878a(str2, bauy.f101856h);
        } else {
            str = str2;
        }
        return bqdx.m112674a(bqdx.m112674a(bbda.f102399i.mo56051a(bavr), bbct.f102376a, bbda.f102401k), new bbcp(bbda, bxvd, bavt, str, bavr, bauy, bavg, bavn, i, list), bbda.f102401k);
    }
}
