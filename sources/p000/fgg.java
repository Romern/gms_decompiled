package p000;

import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: fgg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fgg implements bmzi {

    /* renamed from: a */
    private static final bnic f16498a = bnic.m109490a("accountsettings", "octarine");

    /* renamed from: b */
    private final ModuleManager f16499b;

    public fgg(ModuleManager moduleManager) {
        bmxy.m108581a(moduleManager);
        this.f16499b = moduleManager;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6606a() {
        String str;
        bnha h = bnhe.m109414h();
        try {
            for (ModuleManager.ModuleInfo moduleInfo : this.f16499b.getAllModules()) {
                if (!(moduleInfo == null || (str = moduleInfo.moduleId) == null)) {
                    String replace = str.replace("com.google.android.gms.", "");
                    if (f16498a.contains(replace)) {
                        h.mo67695b(replace, moduleInfo);
                    }
                }
            }
        } catch (InvalidConfigException e) {
            fgh.f16501b.mo25411b("Can't retrieve module versions", e, new Object[0]);
        }
        return h.mo67618b();
    }
}
