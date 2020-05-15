package p000;

/* renamed from: camt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class camt {
    /* renamed from: a */
    public static boolean m126794a(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: b */
    public static void m126795b(String str) {
        if (str != null) {
            try {
                Integer.parseInt(str);
            } catch (NumberFormatException e) {
            }
        }
    }
}
