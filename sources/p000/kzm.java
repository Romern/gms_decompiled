package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/* renamed from: kzm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kzm implements kzn {

    /* renamed from: a */
    public static final srn f25460a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: b */
    public final bbhd f25461b;

    /* renamed from: c */
    public final bbgi f25462c;

    public kzm(ayte ayte, bbhp bbhp, bbgj bbgj) {
        bbgi bbgi = new bbgi(ayte);
        this.f25461b = new bbhd(bbhp, bbgj, f25460a);
        this.f25462c = bbgi;
    }

    /* renamed from: a */
    public static bmxv m18820a(bbfw bbfw, String str) {
        if (bbfw.mo56107a().isEmpty()) {
            return bmvz.f131120a;
        }
        bbfz bbfz = (bbfz) bbfw.mo56107a().get(0);
        if (bbfz != null && bbfz.mo56111a().mo66813a() && bbfz.mo56113c() == 2) {
            return bmxv.m108566b(bbfz);
        }
        bnsl bnsl = (bnsl) f25460a.mo68388c();
        bnsl.mo68432a("kzm", "a", 142, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Infinite Data has no result for %s", str);
        return bmvz.f131120a;
    }

    /* renamed from: a */
    private static bmxv m18821a(bbfz bbfz, String str) {
        try {
            bxtx bxtx = (bxtx) bbfz.mo56111a().mo66814b();
            bxus c = bxus.m123744c();
            kzd kzd = kzd.f25441b;
            try {
                bxuc h = bxtx.mo73764h();
                bxvk bxvk = (bxvk) kzd.mo74142c(4);
                bxxv a = bxxm.f165037a.mo74228a(bxvk);
                a.mo74220a(bxvk, bxud.m123454a(h), c);
                a.mo74225d(bxvk);
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
            bnsl bnsl = (bnsl) f25460a.mo68388c();
            bnsl.mo68437a(e5);
            bnsl.mo68432a("kzm", "a", (int) MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to parse proto returned by Infinite Data for %s", str);
            return bmvz.f131120a;
        }
    }

    /* renamed from: a */
    private final bmxv m18822a(String str, bbfw bbfw, boolean z) {
        if (bbfw.mo56107a().isEmpty()) {
            bnsl bnsl = (bnsl) f25460a.mo68388c();
            bnsl.mo68432a("kzm", "a", 164, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Infinite Data returned no result for %s", str);
            return bmvz.f131120a;
        }
        bmxv a = m18820a(bbfw, str);
        if (!a.mo66813a()) {
            return bmvz.f131120a;
        }
        bbfz bbfz = (bbfz) a.mo66814b();
        if (z && ((bxtx) bbfz.mo56111a().mo66814b()).mo73744a() < 4096) {
            bbgi bbgi = this.f25462c;
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
            bnsl bnsl2 = (bnsl) f25460a.mo68388c();
            bnsl2.mo68437a(e5);
            bnsl2.mo68432a("kzm", "a", 182, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Failed to parse proto returned by Infinite Data for %s", str);
            return bmvz.f131120a;
        }
    }

    /* renamed from: a */
    public final bqgg mo14950a(Iterable iterable, boolean z) {
        bbft c = bbfu.m87963c();
        c.mo56118a(z);
        bbfu a = c.mo56117a();
        return bqdx.m112673a(this.f25461b.mo56101a((List) bngx.m109355a(iterable).stream().map(kzk.f25458a).collect(Collectors.toList()), a), kzl.f25459a, bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo14951a(String str) {
        return bqdx.m112674a(bqga.m112775a(bmvz.f131120a), new kzh(this, str), bqfb.INSTANCE);
    }
}
