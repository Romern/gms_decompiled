package p000;

/* renamed from: bnuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnuy {
    /* renamed from: a */
    public static Object m110474a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str.concat(" must not be null"));
    }

    /* renamed from: a */
    public static boolean m110475a(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        }
        return c >= 'A' && c <= 'Z';
    }
}
