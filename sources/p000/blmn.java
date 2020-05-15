package p000;

/* renamed from: blmn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blmn extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final blmn f126862a;

    /* renamed from: b */
    private static volatile bxxk f126863b;

    static {
        blmn blmn = new blmn();
        f126862a = blmn;
        GeneratedMessageLite.m124024a(blmn.class, blmn);
    }

    private blmn() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f126862a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new blmn();
        }
        if (i2 == 4) {
            return new blmm();
        }
        if (i2 == 5) {
            return f126862a;
        }
        bxxk bxxk = f126863b;
        if (bxxk == null) {
            synchronized (blmn.class) {
                bxxk = f126863b;
                if (bxxk == null) {
                    bxxk = new bxve(f126862a);
                    f126863b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
