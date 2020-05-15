package p000;

import java.io.IOException;

/* renamed from: kzj */
final /* synthetic */ class kzj implements bmxj {

    /* renamed from: a */
    private final kzm f25456a;

    /* renamed from: b */
    private final String f25457b;

    public kzj(kzm kzm, String str) {
        this.f25456a = kzm;
        this.f25457b = str;
    }

    public final Object apply(Object obj) {
        kzm kzm = this.f25456a;
        String str = this.f25457b;
        bbfw bbfw = (bbfw) obj;
        if (bbfw.mo56107a().isEmpty()) {
            bnsl bnsl = (bnsl) kzm.f25460a.mo68388c();
            bnsl.mo68432a("kzm", "a", 164, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Infinite Data returned no result for %s", str);
            return bmvz.f131120a;
        }
        bmxv a = kzm.m18820a(bbfw, str);
        if (!a.mo66813a()) {
            return bmvz.f131120a;
        }
        bbfz bbfz = (bbfz) a.mo66814b();
        if (((bxtx) bbfz.mo56111a().mo66814b()).mo73744a() < 4096) {
            bbgi bbgi = kzm.f25462c;
            bxtx a2 = bxtx.m123258a(str);
            bmxy.m108581a(a2);
            bmxy.m108581a(bbfz);
            synchronized (bbgi.f102588b) {
                bbgi.f102588b.put(a2, bbgh.m87988a(bbfz, bbgi.f102587a.mo54417a()));
            }
            bqga.m112775a((Object) null);
        }
        try {
            bxtx bxtx = (bxtx) bbfz.mo56111a().mo66814b();
            bxus c = bxus.m123744c();
            kzd kzd = kzd.f25441b;
            try {
                bxuc h = bxtx.mo73764h();
                bxvk bxvk = (bxvk) kzd.mo74142c(4);
                bxxv a3 = bxxm.f165037a.mo74228a(bxvk);
                a3.mo74220a(bxvk, bxud.m123454a(h), c);
                a3.mo74225d(bxvk);
                h.mo73787a(0);
                bxvk.m124027b(bxvk);
                return bmxv.m108566b((kzd) bxvk);
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
            bnsl bnsl2 = (bnsl) kzm.f25460a.mo68388c();
            bnsl2.mo68437a(e5);
            bnsl2.mo68432a("kzm", "a", 182, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Failed to parse proto returned by Infinite Data for %s", str);
            return bmvz.f131120a;
        }
    }
}
