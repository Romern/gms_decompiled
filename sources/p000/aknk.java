package p000;

/* renamed from: aknk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aknk {
    /* renamed from: a */
    public static String m60086a(String str) {
        if (str == null) {
            return null;
        }
        if (m60089c(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append("\"");
        sb.append(str);
        sb.append("\"");
        return sb.toString();
    }

    /* renamed from: b */
    public static String m60088b(String str) {
        return m60089c(str) ? str.substring(1, str.length() - 1) : str;
    }

    /* renamed from: c */
    public static boolean m60089c(String str) {
        return str != null && str.startsWith("\"") && str.endsWith("\"");
    }

    /* renamed from: a */
    public static String m60087a(String str, String str2) {
        return eoa.m10821a(String.format("%s/%s", str, str2), cfpd.m142365e());
    }
}
