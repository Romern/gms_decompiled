package p000;

import android.content.Context;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import java.io.PrintWriter;
import java.util.Iterator;

/* renamed from: nyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nyx {

    /* renamed from: a */
    private static final bnsn f36992a = odk.m28481a(nyx.class.getSimpleName());

    private nyx() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: a */
    public static int m28210a(Context context, String str) {
        int i = Integer.MAX_VALUE;
        try {
            Iterator it = ModuleManager.get(context).getAllModules().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ModuleManager.ModuleInfo moduleInfo = (ModuleManager.ModuleInfo) it.next();
                if (str.equals(moduleInfo.moduleId)) {
                    i = moduleInfo.moduleVersion;
                    bnsi d = f36992a.mo68390d();
                    d.mo68432a("nyx", "a", 46, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    ModuleManager.ModuleApkInfo moduleApkInfo = moduleInfo.moduleApk;
                    d.mo68422a("Module APK info: %s %d", (Object) moduleApkInfo.apkPackageName, moduleApkInfo.apkVersionCode);
                    break;
                }
            }
        } catch (InvalidConfigException e) {
        }
        bnsi d2 = f36992a.mo68390d();
        d2.mo68432a("nyx", "a", 56, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d2.mo68409a("Current module version %d", i);
        return i;
    }

    /* renamed from: a */
    public static String m28211a(Context context) {
        return ModuleManager.get(context).getCurrentModuleApk().apkPackageName;
    }

    /* renamed from: a */
    public static void m28212a(Context context, PrintWriter printWriter) {
        int i;
        ModuleManager moduleManager = ModuleManager.get(context);
        ModuleManager.ModuleInfo currentModule = moduleManager.getCurrentModule();
        if (currentModule != null) {
            i = currentModule.moduleVersion;
        } else {
            i = -1;
        }
        StringBuilder sb = new StringBuilder(27);
        sb.append("Module Version: ");
        sb.append(i);
        printWriter.println(sb.toString());
        ModuleManager.ModuleApkInfo currentModuleApk = moduleManager.getCurrentModuleApk();
        if (currentModuleApk != null) {
            String valueOf = String.valueOf(currentModuleApk.apkPackageName);
            printWriter.println(valueOf.length() == 0 ? new String("Module APK package: ") : "Module APK package: ".concat(valueOf));
            String valueOf2 = String.valueOf(currentModuleApk.apkVersionName);
            printWriter.println(valueOf2.length() == 0 ? new String("Module APK version name: ") : "Module APK version name: ".concat(valueOf2));
            int i2 = currentModuleApk.apkVersionCode;
            StringBuilder sb2 = new StringBuilder(36);
            sb2.append("Module APK version code: ");
            sb2.append(i2);
            printWriter.println(sb2.toString());
            boolean z = currentModuleApk.apkRequired;
            StringBuilder sb3 = new StringBuilder(26);
            sb3.append("Module APK required: ");
            sb3.append(z);
            printWriter.println(sb3.toString());
        }
    }
}
