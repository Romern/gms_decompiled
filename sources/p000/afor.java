package p000;

import android.content.Context;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: afor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afor {
    /* renamed from: a */
    public static int m53373a(Context context) {
        try {
            for (ModuleManager.ModuleInfo moduleInfo : ModuleManager.get(context).getAllModules()) {
                if (moduleInfo.moduleId.equals("com.google.android.gms.mdi_download")) {
                    return moduleInfo.moduleVersion;
                }
            }
            return -1;
        } catch (Exception e) {
            bbev.m87905a("Failed to set mdi download module version: %s", e);
            return -1;
        }
    }
}
