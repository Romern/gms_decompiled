package p000;

/* renamed from: cafl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cafl extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cafl f172922c;

    /* renamed from: e */
    private static volatile bxxk f172923e;

    /* renamed from: a */
    public int f172924a;

    /* renamed from: b */
    public int f172925b = 32767;

    /* renamed from: d */
    private int f172926d;

    static {
        cafl cafl = new cafl();
        f172922c = cafl;
        GeneratedMessageLite.m124024a(cafl.class, cafl);
    }

    private cafl() {
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
            return GeneratedMessageLite.m124022a(f172922c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new cafl();
        } else {
            if (i2 == 4) {
                return new bxvd(f172922c);
            }
            if (i2 == 5) {
                return f172922c;
            }
            bxxk bxxk = f172923e;
            if (bxxk == null) {
                synchronized (cafl.class) {
                    bxxk = f172923e;
                    if (bxxk == null) {
                        bxxk = new bxve(f172922c);
                        f172923e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
