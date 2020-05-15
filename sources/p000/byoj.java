package p000;

/* renamed from: byoj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byoj {
    /* renamed from: a */
    public static int m125028a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 11) {
            return 12;
        }
        if (i != 100) {
            return i != 1000 ? 0 : 1001;
        }
        return 101;
    }

    /* renamed from: b */
    public static String m125029b(int i) {
        return Integer.toString(i - 1);
    }
}
