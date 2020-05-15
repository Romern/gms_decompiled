package p000;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: bawn */
final /* synthetic */ class bawn implements bqeg {

    /* renamed from: a */
    private final bawq f101982a;

    /* renamed from: b */
    private final baus f101983b;

    /* renamed from: c */
    private final String f101984c;

    /* renamed from: d */
    private final bavr f101985d;

    public bawn(bawq bawq, baus baus, String str, bavr bavr) {
        this.f101982a = bawq;
        this.f101983b = baus;
        this.f101984c = str;
        this.f101985d = bavr;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        bmxv bmxv;
        bawq bawq = this.f101982a;
        baus baus = this.f101983b;
        String str = this.f101984c;
        bavr bavr = this.f101985d;
        bauc bauc = (bauc) baus;
        if (bauc.f101752d.mo66813a()) {
            if (bawq.f101997f.mo66813a()) {
                bbfl bbfl = (bbfl) bawq.f101997f.mo66814b();
                bbke bbke = (bbke) bauc.f101752d.mo66814b();
                synchronized (bbfl.class) {
                    if (!bbfl.f102547d.containsKey(str)) {
                        HashMap hashMap = bbfl.f102547d;
                        bbfk bbfk = new bbfk(bbfl, str, bbke);
                        ayte ayte = bbfl.f102544a;
                        hashMap.put(str, new behl(bbfk, 1000, TimeUnit.MILLISECONDS));
                    }
                }
            } else {
                bauo a = bauq.m87573a();
                a.f101791a = baup.DOWNLOAD_MONITOR_NOT_PROVIDED_ERROR;
                a.f101792b = "downloadFileGroup: DownloadListener is present but Download Monitor is not provided!";
                return bqga.m112777a((Throwable) a.mo55987a());
            }
        }
        if (bauc.f101751c.mo66813a()) {
            bmxv = bmxv.m108566b((bavn) bxvk.m124016a(bavn.f101895f, ((baul) bauc.f101751c.mo66814b()).mo73642k(), bxus.m123743b()));
        } else {
            bmxv = bmvz.f131120a;
        }
        bbch bbch = bawq.f101994c;
        Object[] objArr = {"MDDManager", bavr.f101919b, bavr.f101920c};
        return bqdx.m112674a(bqdx.m112674a(bbch.mo56063a(), new bbcg(bbch, bavr, bmxv), bbch.f102327n), new bawa(bawq, baus), bawq.f101996e);
    }
}
