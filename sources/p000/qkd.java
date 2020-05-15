package p000;

import com.google.android.chimera.config.ModuleManager;

/* renamed from: qkd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qkd {

    /* renamed from: a */
    public static final int f41591a = m32277a("com.google.android.chimera.container.ModuleApi");

    static {
        m32278b("com.google.android.gms.chimera.container.CronetDynamiteModuleApi");
        m32278b("com.google.android.gms.chimera.container.LevelDbModuleApi");
        m32277a("com.google.android.gms.chimera.container.GmsModuleApi");
    }

    /* renamed from: a */
    private static int m32277a(String str) {
        try {
            ModuleManager.class.getMethod("getApiVersion", String.class);
            return ModuleManager.get(rpr.m34216b()).getApiVersion(str);
        } catch (NoSuchMethodException e) {
            return 0;
        }
    }

    /* renamed from: b */
    private static void m32278b(String str) {
        if (f41591a >= 100) {
            ModuleManager.get(rpr.m34216b()).getApiVersion(str);
        }
    }
}
