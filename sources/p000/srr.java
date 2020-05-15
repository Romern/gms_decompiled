package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: srr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class srr {

    /* renamed from: a */
    private static Pattern f45049a = null;

    /* renamed from: a */
    public static int m36143a(int i) {
        if (i != -1) {
            return i / 1000;
        }
        return -1;
    }

    /* renamed from: b */
    public static int m36146b(String str) {
        long a = m36144a(str);
        if (a != -1) {
            return (int) (a / 10000);
        }
        return -1;
    }

    /* renamed from: c */
    public static int m36147c(String str) {
        long a = m36144a(str);
        if (a != -1) {
            return (int) ((a / 100) % 100);
        }
        return -1;
    }

    /* renamed from: d */
    public static int m36148d(String str) {
        long a = m36144a(str);
        if (a != -1) {
            return (int) (a % 100);
        }
        return -1;
    }

    /* renamed from: a */
    public static long m36144a(String str) {
        if (str != null) {
            Matcher matcher = m36145a().matcher(str);
            if (matcher.find()) {
                try {
                    return Long.parseLong(matcher.group(1));
                } catch (NumberFormatException e) {
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static Pattern m36145a() {
        if (f45049a == null) {
            f45049a = Pattern.compile("\\((?:eng-)?(\\d+)-(.+?)[-)$]");
        }
        return f45049a;
    }
}
