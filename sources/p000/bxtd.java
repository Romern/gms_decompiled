package p000;

/* renamed from: bxtd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxtd {

    /* renamed from: a */
    public static final Class f164761a = m123130a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f164762b = (m123130a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    private static Class m123130a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: a */
    static boolean m123131a() {
        return f164761a != null && !f164762b;
    }
}
