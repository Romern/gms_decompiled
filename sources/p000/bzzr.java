package p000;

/* renamed from: bzzr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzzr {
    /* renamed from: a */
    public static String m126368a(String str) {
        return String.valueOf(str).concat("_local");
    }

    /* renamed from: a */
    public static String m126369a(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + str2.length());
        sb.append(str);
        sb.append("<-");
        sb.append(str2);
        return sb.toString();
    }
}
