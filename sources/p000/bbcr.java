package p000;

import java.util.List;

/* renamed from: bbcr */
final /* synthetic */ class bbcr implements bqeh {

    /* renamed from: a */
    private final bbda f102359a;

    /* renamed from: b */
    private final bavt f102360b;

    /* renamed from: c */
    private final bavr f102361c;

    /* renamed from: d */
    private final bauy f102362d;

    /* renamed from: e */
    private final bavn f102363e;

    /* renamed from: f */
    private final int f102364f;

    /* renamed from: g */
    private final List f102365g;

    public bbcr(bbda bbda, bavt bavt, bavr bavr, bauy bauy, bavn bavn, int i, List list) {
        this.f102359a = bbda;
        this.f102360b = bavt;
        this.f102361c = bavr;
        this.f102362d = bauy;
        this.f102363e = bavn;
        this.f102364f = i;
        this.f102365g = list;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bqgg bqgg;
        bbda bbda = this.f102359a;
        bavt bavt = this.f102360b;
        bavr bavr = this.f102361c;
        bauy bauy = this.f102362d;
        bavn bavn = this.f102363e;
        int i = this.f102364f;
        List list = this.f102365g;
        bavu bavu = (bavu) obj;
        if (bavu != null) {
            bavq a = bavq.m87609a(bavu.f101939c);
            if (a == null) {
                a = bavq.NONE;
            }
            if (a != bavq.DOWNLOAD_COMPLETE) {
                int a2 = bavb.m87594a(bavt.f101933e);
                if (a2 == 0) {
                    a2 = 1;
                }
                if (bbbb.m87767a(bbda.f102391a, bbda.f102392b).f102265d < bbba.USE_CHECKSUM_ONLY.f102265d || !bbda.f102396f.mo66813a() || ((baxa) bbda.f102396f.mo66814b()).mo56001b() == 1) {
                    bqgg = bqga.m112775a((Object) null);
                } else {
                    bqgg = bbda.mo56073a(bauy.f101859k, 0, a2);
                }
                return bqdx.m112674a(bqgg, new bbco(bbda, bavu, bauy, bavr, bavt, bavn, i, list), bbda.f102401k);
            }
            if (bbda.f102397g.mo66813a()) {
                ((bbfl) bbda.f102397g.mo66814b()).mo56099a(bavr.f101919b, (long) bauy.f101852d);
            }
            return bqga.m112775a((Object) null);
        }
        bbev.m87906a("%s: Start download called on file that doesn't exists. Key = %s!", "SharedFileManager", bavt);
        throw new bbdb();
    }
}
