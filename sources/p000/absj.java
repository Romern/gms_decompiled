package p000;

/* renamed from: absj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class absj {
    /* renamed from: a */
    public static /* synthetic */ String m48218a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "TYPE_NOT_SET" : "ZERO_PARTY" : "GOOGLE_SIGNED_APP_LIST" : "ALL_GOOGLE_SIGNED_APPS" : "ALL_APPS";
    }

    /* renamed from: b */
    public static int m48219b(int i) {
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }
}
