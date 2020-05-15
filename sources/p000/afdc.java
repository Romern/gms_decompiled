package p000;

/* renamed from: afdc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afdc {
    /* renamed from: a */
    public static byte m52872a(Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : 1;
        }
        return -1;
    }

    /* renamed from: a */
    public static Boolean m52873a(byte b) {
        if (b == 0) {
            return Boolean.FALSE;
        }
        if (b != 1) {
            return null;
        }
        return Boolean.TRUE;
    }
}
