package p000;

import android.content.Context;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: armg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class armg {

    /* renamed from: a */
    private arme f87893a;

    /* renamed from: b */
    private armf f87894b;

    /* renamed from: a */
    public static void m73111a(Context context, bxvd bxvd) {
        String str;
        for (ModuleManager.ModuleInfo moduleInfo : ModuleManager.get(context).getAllModules()) {
            if ("com.google.android.gms.smartdevice".equals(moduleInfo.moduleId)) {
                ModuleManager.ModuleApkInfo moduleApkInfo = moduleInfo.moduleApk;
                if (moduleApkInfo != null) {
                    str = moduleApkInfo.apkPackageName;
                } else {
                    str = null;
                }
                if (!"com.google.android.gms".equals(str)) {
                    String str2 = moduleInfo.moduleApk.apkPackageName;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bovc bovc = (bovc) bxvd.f164949b;
                    bovc bovc2 = bovc.f134986j;
                    str2.getClass();
                    bovc.f134988a |= 16;
                    bovc.f134993f = str2;
                }
                int i = moduleInfo.moduleVersion;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bovc bovc3 = (bovc) bxvd.f164949b;
                bovc bovc4 = bovc.f134986j;
                bovc3.f134988a |= 32;
                bovc3.f134994g = i;
                return;
            }
        }
    }

    /* renamed from: b */
    public final armf mo48640b() {
        boolean z;
        if (this.f87893a == null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "Don't use getTargetHelper() and getSourceHelper() at the same time!");
        if (this.f87894b == null) {
            this.f87894b = new armf();
        }
        return this.f87894b;
    }

    /* renamed from: a */
    public final arme mo48639a() {
        boolean z;
        if (this.f87894b == null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "Don't use getTargetHelper() and getSourceHelper() at the same time!");
        if (this.f87893a == null) {
            this.f87893a = new arme();
        }
        return this.f87893a;
    }
}
