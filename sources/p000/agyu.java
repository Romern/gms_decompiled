package p000;

import android.content.Context;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: agyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agyu {

    /* renamed from: a */
    private static final srn f66883a = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: a */
    public static int m55308a(Context context) {
        if (context == null) {
            return m55311d(rpr.m34216b());
        }
        try {
            return ModuleManager.get(context).getCurrentModule().moduleVersion;
        } catch (IllegalStateException e) {
            return m55311d(context);
        }
    }

    /* renamed from: b */
    public static String m55309b(Context context) {
        if (context == null) {
            return "-1";
        }
        try {
            return ModuleManager.get(context).getCurrentModule().moduleApk.apkVersionName;
        } catch (IllegalStateException e) {
            f66883a.mo26019b(agyt.m55307c()).mo68405a("Unable to get chimera module info.");
            return "-1";
        }
    }

    /* renamed from: c */
    public static int m55310c(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return ModuleManager.get(context).getCurrentModule().moduleApk.apkVersionCode;
        } catch (IllegalStateException e) {
            f66883a.mo26019b(agyt.m55307c()).mo68405a("Unable to get chimera module info.");
            return -1;
        }
    }

    /* renamed from: d */
    private static int m55311d(Context context) {
        try {
            for (ModuleManager.ModuleInfo moduleInfo : ModuleManager.get(context).getAllModules()) {
                if ("com.google.android.gms.mobiledataplan".equals(moduleInfo.moduleId)) {
                    return moduleInfo.moduleVersion;
                }
            }
            return -1;
        } catch (InvalidConfigException | NullPointerException e) {
            bnsl bnsl = (bnsl) f66883a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("getAllModules call failed");
            return -1;
        }
    }
}
