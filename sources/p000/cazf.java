package p000;

/* renamed from: cazf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cazf {
    /* renamed from: a */
    public static Object m127593a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static void m127594a(Object obj) {
        if (obj == null) {
            throw null;
        }
    }

    /* renamed from: a */
    public static void m127595a(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
