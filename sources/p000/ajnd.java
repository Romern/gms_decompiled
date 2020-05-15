package p000;

/* renamed from: ajnd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajnd {
    /* renamed from: a */
    public static /* synthetic */ String m58877a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNSUPPORTED_ATTACHMENT_TYPE" : "NOT_ENOUGH_SPACE" : "REJECT" : "ACCEPT" : "UNKNOWN";
    }

    /* renamed from: b */
    public static int m58878b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }
}
