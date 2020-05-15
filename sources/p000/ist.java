package p000;

import android.content.Context;
import android.os.Binder;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import java.util.Collection;

/* renamed from: ist */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ist {

    /* renamed from: a */
    private static ModuleManager f21631a;

    /* renamed from: a */
    public static final int m16059a(Context context) {
        if (f21631a == null) {
            f21631a = ModuleManager.get(context);
        }
        try {
            Collection<ModuleManager.ModuleInfo> allModules = f21631a.getAllModules();
            if (allModules == null || allModules.isEmpty()) {
                return 0;
            }
            for (ModuleManager.ModuleInfo moduleInfo : allModules) {
                if (moduleInfo != null && moduleInfo.moduleId.equals("com.google.android.gms.auth_cryptauth")) {
                    return moduleInfo.moduleVersion;
                }
            }
            return 0;
        } catch (InvalidConfigException e) {
            return 0;
        }
    }

    /* renamed from: a */
    public static final void m16060a(Context context, boct boct) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            new qws(context, "ANDROID_AUTH", null).mo24333a(boct).mo24327b();
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }
}
