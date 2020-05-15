package p000;

import android.os.Build;
import android.webkit.JavascriptInterface;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: akwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akwh implements akww {

    /* renamed from: a */
    private final ModuleManager f73000a;

    public akwh(ModuleManager moduleManager) {
        this.f73000a = moduleManager;
    }

    /* renamed from: a */
    public final akwv mo39896a() {
        return new akwv("ocClientInfo", null, true);
    }

    /* renamed from: a */
    public final void mo39897a(String str) {
    }

    /* renamed from: b */
    public final void mo39898b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final ModuleManager.ModuleInfo mo39921c() {
        try {
            for (ModuleManager.ModuleInfo moduleInfo : this.f73000a.getAllModules()) {
                if (moduleInfo != null && moduleInfo.moduleId.equals("com.google.android.gms.accountsettings")) {
                    return moduleInfo;
                }
            }
            return null;
        } catch (InvalidConfigException e) {
            return null;
        }
    }

    @JavascriptInterface
    public String getGmsCoreModuleApkVersionName() {
        ModuleManager.ModuleApkInfo moduleApkInfo;
        ModuleManager.ModuleInfo c = mo39921c();
        if (c == null || (moduleApkInfo = c.moduleApk) == null) {
            return null;
        }
        return moduleApkInfo.apkVersionName;
    }

    @JavascriptInterface
    public int getGmsCoreModuleVersion() {
        ModuleManager.ModuleInfo c = mo39921c();
        if (c != null) {
            return c.moduleVersion;
        }
        return 0;
    }

    @JavascriptInterface
    public int getGmsCoreVersion() {
        return 201515033;
    }

    @JavascriptInterface
    public String getOsVersion() {
        return Build.VERSION.RELEASE;
    }

    @JavascriptInterface
    public int getSdkVersion() {
        return Build.VERSION.SDK_INT;
    }
}
