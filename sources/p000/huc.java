package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import java.util.Collection;

/* renamed from: huc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class huc {

    /* renamed from: a */
    private static final sbw f20435a = new sbw("AuthEarlyUpdate", "[ModuleHelper]");

    /* renamed from: a */
    public static int m14857a(Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(ccdm.m129311e(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            f20435a.mo25372b("AuthEarlyUpdate", "No package with G.sidecarPackageName was found!");
            packageInfo = null;
        }
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        f20435a.mo25372b("AuthEarlyUpdate", "G.sidecarPackageName is not found on device! Sidecar Aps is not updated!");
        return -1;
    }

    /* renamed from: a */
    public static ModuleManager.ModuleInfo m14858a(ModuleManager moduleManager) {
        Collection<ModuleManager.ModuleInfo> collection;
        String c = ccdm.m129309c();
        try {
            collection = moduleManager.getAllModules();
        } catch (InvalidConfigException e) {
            f20435a.mo25371b("InvalidConfigException while trying to get all modules from module manager!");
            collection = null;
        }
        if (collection == null) {
            f20435a.mo25372b("AuthEarlyUpdate", "Was not able to fetch list of modules or list is emptry!");
            return null;
        }
        for (ModuleManager.ModuleInfo moduleInfo : collection) {
            if (c.equals(moduleInfo.moduleId)) {
                return moduleInfo;
            }
        }
        sbw sbw = f20435a;
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 47);
        sb.append("ModuleId: ");
        sb.append(c);
        sb.append(" is not found in the list of modules.");
        sbw.mo25372b("AuthEarlyUpdate", sb.toString());
        return null;
    }

    /* renamed from: a */
    public static String m14859a(Context context, int i) {
        return context.getPackageManager().getNameForUid(i);
    }
}
