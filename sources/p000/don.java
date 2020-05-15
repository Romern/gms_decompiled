package p000;

/* renamed from: don */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class don {
    /* renamed from: a */
    public static boolean m8955a(int i, bxfw bxfw) {
        if (i != 0) {
            if (i == 1) {
                bxfw bxfw2 = bxfw.UNKNOWN_ACCESS_TYPE;
                int ordinal = bxfw.ordinal();
                if (ordinal == 5 || ordinal == 7 || ordinal == 8) {
                    return true;
                }
                return m8957b(bxfw);
            } else if (i == 2) {
                return m8957b(bxfw);
            } else {
                if (i == 3) {
                    return m8956a(bxfw);
                }
                if (i != 4) {
                    bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                    bnsl.mo68432a("don", "a", 38, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68409a("[AclPredicates] Unknown permission type: %s", i);
                    return false;
                }
            }
        }
        bxfw bxfw3 = bxfw.UNKNOWN_ACCESS_TYPE;
        int ordinal2 = bxfw.ordinal();
        if (ordinal2 == 4 || ordinal2 == 6 || ordinal2 == 7) {
            return true;
        }
        return m8956a(bxfw);
    }

    /* renamed from: b */
    private static boolean m8957b(bxfw bxfw) {
        bxfw bxfw2 = bxfw.UNKNOWN_ACCESS_TYPE;
        int ordinal = bxfw.ordinal();
        return ordinal == 2 || ordinal == 3 || ordinal == 6;
    }

    /* renamed from: a */
    private static boolean m8956a(bxfw bxfw) {
        bxfw bxfw2 = bxfw.UNKNOWN_ACCESS_TYPE;
        int ordinal = bxfw.ordinal();
        return ordinal == 1 || ordinal == 3 || ordinal == 8;
    }
}
