package p000;

import com.google.android.gms.net.PlayServicesCronetProvider;
import java.io.File;
import java.util.List;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;

/* renamed from: ffy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ffy implements bmzi {

    /* renamed from: a */
    private static final sek f16483a = ffw.m11631a("CronetEngineSupplier");

    /* renamed from: c */
    private static final bmzi f16484c = bmzn.m108681a((bmzi) new ffy());

    /* renamed from: b */
    private final CronetProvider f16485b = new PlayServicesCronetProvider(rpr.m34216b());

    private ffy() {
    }

    /* renamed from: b */
    public static bmxv m11632b() {
        return (bmxv) f16484c.mo6606a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: org.chromium.net.CronetEngine.Builder.enableHttpCache(int, long):org.chromium.net.CronetEngine$Builder
     arg types: [int, int]
     candidates:
      org.chromium.net.ExperimentalCronetEngine.Builder.enableHttpCache(int, long):org.chromium.net.ExperimentalCronetEngine$Builder
      org.chromium.net.CronetEngine.Builder.enableHttpCache(int, long):org.chromium.net.CronetEngine$Builder */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: org.chromium.net.ExperimentalCronetEngine.Builder.addQuicHint(java.lang.String, int, int):org.chromium.net.ExperimentalCronetEngine$Builder
     arg types: [java.lang.String, int, int]
     candidates:
      org.chromium.net.ExperimentalCronetEngine.Builder.addQuicHint(java.lang.String, int, int):org.chromium.net.CronetEngine$Builder
      org.chromium.net.CronetEngine.Builder.addQuicHint(java.lang.String, int, int):org.chromium.net.CronetEngine$Builder
      org.chromium.net.ExperimentalCronetEngine.Builder.addQuicHint(java.lang.String, int, int):org.chromium.net.ExperimentalCronetEngine$Builder */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6606a() {
        rpr b = rpr.m34216b();
        if (this.f16485b.isEnabled()) {
            ExperimentalCronetEngine.Builder builder = (ExperimentalCronetEngine.Builder) this.f16485b.createBuilder();
            builder.enableBrotli(true);
            builder.enableQuic(true);
            if (cbrl.f178163a.mo6606a().mo75279b()) {
                builder.setThreadPriority(-2);
            }
            List<String> c = bmyx.m108640a(',').mo66917a().mo66920b().mo66925c((CharSequence) cbrl.f178163a.mo6606a().mo75278a());
            if (!c.isEmpty()) {
                File file = new File(b.getCacheDir(), "id_as_cronet_cache");
                try {
                    if (!file.exists()) {
                        if (!file.exists()) {
                            if (!file.mkdirs()) {
                            }
                        }
                    }
                    builder.setStoragePath(file.getAbsolutePath());
                    builder.enableHttpCache(2, 1000L);
                    for (String str : c) {
                        builder.addQuicHint(str, 443, 443);
                    }
                } catch (SecurityException e) {
                    f16483a.mo25417e("Exception occurred in enabling cronet cache", e, new Object[0]);
                }
            }
            return bmxv.m108566b(builder.build());
        }
        ffv a = ffv.m11622a(b, ffk.f16456b);
        bxvf bxvf = (bxvf) bspp.f146553l.mo74144da();
        bsmt bsmt = bsmt.ACCOUNT_SETTINGS_MOBILE_MENU;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bspp bspp = (bspp) bxvf.f164949b;
        bspp.f146556b = bsmt.f145305dO;
        int i = bspp.f146555a | 1;
        bspp.f146555a = i;
        bspp.f146557c = 2024;
        int i2 = 2 | i;
        bspp.f146555a = i2;
        bspp.f146555a = i2 | 16;
        bspp.f146560f = true;
        bsof a2 = a.mo10784a();
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bspp bspp2 = (bspp) bxvf.f164949b;
        a2.getClass();
        bspp2.f146562h = a2;
        bspp2.f146555a |= 64;
        if (!stm.m36302d("DISABLED")) {
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bspp bspp3 = (bspp) bxvf.f164949b;
            "DISABLED".getClass();
            bspp3.f146555a |= 4;
            bspp3.f146558d = "DISABLED";
        }
        bxvd da = bspq.f146567d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bspq bspq = (bspq) da.f164949b;
        bspp bspp4 = (bspp) bxvf.mo74062i();
        bspp4.getClass();
        bspq.f146570b = bspp4;
        bspq.f146569a |= 1;
        a.mo10788a((bspq) da.mo74062i());
        return bmvz.f131120a;
    }
}
