package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import java.io.IOException;

/* renamed from: kzi */
final /* synthetic */ class kzi implements bqeh {

    /* renamed from: a */
    private final kzm f25454a;

    /* renamed from: b */
    private final String f25455b;

    public kzi(kzm kzm, String str) {
        this.f25454a = kzm;
        this.f25455b = str;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbfu bbfu;
        Object obj2;
        kzm kzm = this.f25454a;
        String str = this.f25455b;
        bmxv a = kzm.m18820a((bbfw) obj, str);
        if (a.mo66813a()) {
            try {
                ByteString bxtx = (ByteString) ((bbfz) a.mo66814b()).mo56111a().mo66814b();
                bxus c = bxus.m123744c();
                kzd kzd = kzd.f25441b;
                try {
                    bxuc h = bxtx.mo73764h();
                    GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) kzd.mo74142c(4);
                    bxxv a2 = bxxm.f165037a.mo74228a(GeneratedMessageLite);
                    a2.mo74220a(GeneratedMessageLite, bxud.m123454a(h), c);
                    a2.mo74225d(GeneratedMessageLite);
                    h.mo73787a(0);
                    GeneratedMessageLite.m124027b(GeneratedMessageLite);
                    obj2 = bmxv.m108566b((kzd) GeneratedMessageLite);
                    return bqga.m112775a(obj2);
                } catch (IOException e) {
                    if (!(e.getCause() instanceof bxwf)) {
                        throw new bxwf(e.getMessage());
                    }
                    throw ((bxwf) e.getCause());
                } catch (RuntimeException e2) {
                    if (e2.getCause() instanceof bxwf) {
                        throw ((bxwf) e2.getCause());
                    }
                    throw e2;
                } catch (bxwf e3) {
                    throw e3;
                } catch (bxwf e4) {
                    throw e4;
                }
            } catch (bxwf e5) {
                bnsl bnsl = (bnsl) kzm.f25460a.mo68388c();
                bnsl.mo68437a(e5);
                bnsl.mo68432a("kzm", "a", (int) MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Failed to parse proto returned by Infinite Data for %s", str);
                obj2 = bmvz.f131120a;
            }
        } else {
            if (ccip.m129868h()) {
                bbft c2 = bbfu.m87963c();
                c2.f102567a = 1;
                bbfu = c2.mo56117a();
            } else {
                bbfu = bbfu.f102569c;
            }
            return bqdx.m112673a(kzm.f25461b.mo56101a(bngx.m109356a((Object) ByteString.m123258a(str)), bbfu), new kzj(kzm, str), bqfb.INSTANCE);
        }
    }
}
