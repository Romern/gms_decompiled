package p000;

/* renamed from: aeym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeym {
    /* renamed from: a */
    public static String m52688a(String str, int i) {
        String num = Integer.toString(i);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 15 + String.valueOf(num).length());
        sb.append("opt-in-status-");
        sb.append(str);
        sb.append("-");
        sb.append(num);
        return sb.toString();
    }
}
