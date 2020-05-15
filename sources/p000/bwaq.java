package p000;

/* renamed from: bwaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwaq {
    /* renamed from: a */
    public static String m121662a(String[] strArr, String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (i > 0) {
                sb.append(str);
            }
            sb.append(strArr[i]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m121663a(String str) {
        return str == null || str.isEmpty();
    }
}
