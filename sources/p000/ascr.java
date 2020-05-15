package p000;

/* renamed from: ascr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ascr {
    /* renamed from: a */
    public static String m73790a(String str) {
        sdo.m34959a((Object) str);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2);
        sb.append("\"");
        sb.append(str);
        sb.append("\"");
        return sb.toString();
    }

    /* renamed from: b */
    public static String m73791b(String str) {
        return (bmxx.m108578b(str).length() < 2 || str == null || !str.startsWith("\"") || !str.endsWith("\"")) ? str : str.substring(1, str.length() - 1);
    }
}
