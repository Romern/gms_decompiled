package p000;

import android.content.Context;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: abkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abkv {

    /* renamed from: a */
    private static final srn f57649a = srn.m36127a(sgj.GROWTH);

    /* renamed from: a */
    public static int m47827a(Context context) {
        try {
            for (ModuleManager.ModuleInfo moduleInfo : ModuleManager.get(context).getAllModules()) {
                if ("com.google.android.gms.growth".equals(moduleInfo.moduleId)) {
                    return moduleInfo.moduleVersion;
                }
            }
            return -1;
        } catch (Exception e) {
            bnsl bnsl = (bnsl) f57649a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("abkv", "a", 29, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to get growth module version");
            return -1;
        }
    }

    /* renamed from: a */
    public static String m47828a(Class cls) {
        return cls.getName().replace("Chimera", "");
    }
}
