package p000;

/* renamed from: ikm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ikm {
    /* renamed from: a */
    public static /* synthetic */ String m15618a(int i) {
        return i != -1 ? i != 40 ? i != 46 ? i != 70 ? "null" : "REPLIED" : "TRIGGERED" : "RECEIVED" : "UNKNOWN";
    }

    /* renamed from: b */
    public static int m15620b(int i) {
        int i2 = 40;
        if (i != 40) {
            i2 = 46;
            if (i != 46) {
                i2 = 70;
                if (i != 70) {
                    return -1;
                }
            }
        }
        return i2;
    }

    /* renamed from: c */
    public static void m15621c(int i) {
        if (i == 0) {
            throw null;
        }
    }

    /* renamed from: a */
    public static boolean m15619a(int i, int i2) {
        if (i == 0) {
            throw null;
        } else if (i == -1) {
            return false;
        } else {
            m15621c(i);
            m15621c(i2);
            return i < i2;
        }
    }
}
