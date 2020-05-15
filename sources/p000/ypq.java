package p000;

import java.util.Set;
import java.util.logging.Level;

/* renamed from: ypq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ypq {

    /* renamed from: a */
    private static final zvu f54340a = new zvy();

    /* renamed from: a */
    public static void m44537a() {
        ((Set) zvy.f56038a.get()).clear();
    }

    /* renamed from: a */
    public static void m44538a(String str, Level level, String str2, Object... objArr) {
        try {
            zvu zvu = f54340a;
            int b = zvy.m46588b(level);
            if (((zvy) zvu).mo31540a(level) && ((Set) zvy.f56038a.get()).add(str)) {
                zvy.m46586a(b, str2, objArr);
            }
        } catch (NoClassDefFoundError e) {
            bqye.m113758a(e);
            System.err.printf(str2, objArr);
        }
    }

    @Deprecated
    /* renamed from: a */
    public static void m44539a(String str, Object... objArr) {
        m44538a(str, Level.WARNING, str, objArr);
    }

    /* renamed from: a */
    public static void m44540a(Level level, String str, Object... objArr) {
        try {
            int b = zvy.m46588b(level);
            if (zvy.m46587a(b)) {
                zvy.m46586a(b, str, objArr);
            }
        } catch (NoClassDefFoundError e) {
            bqye.m113758a(e);
            System.err.printf(str, objArr);
        }
    }

    /* renamed from: a */
    public static boolean m44541a(Level level) {
        try {
            return f54340a.mo31540a(level);
        } catch (NoClassDefFoundError e) {
            bqye.m113758a(e);
            return true;
        }
    }
}
