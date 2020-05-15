package p000;

/* renamed from: bnuv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnuv extends RuntimeException {
    public bnuv(String str) {
        super(str);
    }

    /* renamed from: a */
    public static bnuv m110464a(String str, String str2, int i) {
        return new bnuv(m110467b(str, str2, i, i + 1));
    }

    /* renamed from: b */
    public static bnuv m110466b(String str, String str2, int i) {
        return new bnuv(m110467b(str, str2, i, -1));
    }

    public final synchronized Throwable fillInStackTrace() {
        return this;
    }

    /* renamed from: a */
    public static bnuv m110465a(String str, String str2, int i, int i2) {
        return new bnuv(m110467b(str, str2, i, i2));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder}
     arg types: [java.lang.String, int, int]
     candidates:
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(char[], int, int):java.lang.StringBuilder}
      ClspMth{java.lang.Appendable.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder} */
    /* renamed from: b */
    private static String m110467b(String str, String str2, int i, int i2) {
        if (i2 < 0) {
            i2 = str2.length();
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(": ");
        if (i > 8) {
            sb.append("...");
            sb.append((CharSequence) str2, i - 5, i);
        } else {
            sb.append((CharSequence) str2, 0, i);
        }
        sb.append('[');
        sb.append(str2.substring(i, i2));
        sb.append(']');
        if (str2.length() - i2 > 8) {
            sb.append((CharSequence) str2, i2, i2 + 5);
            sb.append("...");
        } else {
            sb.append((CharSequence) str2, i2, str2.length());
        }
        return sb.toString();
    }
}
