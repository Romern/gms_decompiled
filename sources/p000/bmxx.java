package p000;

import java.util.Locale;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* renamed from: bmxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmxx {
    static {
        Logger.getLogger(bmxx.class.getName());
    }

    private bmxx() {
    }

    /* renamed from: a */
    static long m108575a() {
        return System.nanoTime();
    }

    /* renamed from: b */
    public static String m108578b(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: c */
    public static String m108579c(String str) {
        if (m108577a(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: d */
    static bmxa m108580d(String str) {
        bmxy.m108581a(str);
        return new bmxn(Pattern.compile(str));
    }

    /* renamed from: a */
    static String m108576a(double d) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d));
    }

    /* renamed from: a */
    public static boolean m108577a(String str) {
        return str == null || str.isEmpty();
    }
}
