package p000;

/* renamed from: brib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brib {
    /* renamed from: a */
    public static boolean m114025a(int i) {
        return i > 0 && i <= 3;
    }

    /* renamed from: b */
    public static boolean m114026b(int i) {
        return m114025a(i) && i != 1;
    }

    /* renamed from: c */
    public static String m114027c(int i) {
        if (i == 1) {
            return "IN_APP";
        }
        if (i == 2) {
            return "ON_DEVICE";
        }
        if (i == 3) {
            return "CROSS_DEVICE";
        }
        StringBuilder sb = new StringBuilder(21);
        sb.append("UNKNOWN - ");
        sb.append(i);
        return sb.toString();
    }
}
