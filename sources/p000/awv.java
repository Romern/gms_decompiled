package p000;

/* renamed from: awv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awv {
    /* renamed from: a */
    public static void m2288a(Object obj) {
        if ((obj instanceof String) && ((String) obj).length() == 0) {
            throw new awn("Parameter must not be null or empty", 4);
        }
    }

    /* renamed from: b */
    public static void m2290b(String str) {
        if (str == null || str.length() == 0) {
            throw new awn("Empty schema namespace URI", 4);
        }
    }

    /* renamed from: a */
    public static void m2289a(String str) {
        if (str.length() == 0) {
            throw new awn("Empty property name", 4);
        }
    }
}
