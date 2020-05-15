package p000;

/* renamed from: bzna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzna extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzna f170689b;

    /* renamed from: d */
    private static volatile bxxk f170690d;

    /* renamed from: a */
    public bzmb f170691a;

    /* renamed from: c */
    private int f170692c;

    static {
        bzna bzna = new bzna();
        f170689b = bzna;
        GeneratedMessageLite.m124024a(bzna.class, bzna);
    }

    private bzna() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f170689b, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0001", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bzna();
        } else {
            if (i2 == 4) {
                return new bxvd(f170689b);
            }
            if (i2 == 5) {
                return f170689b;
            }
            bxxk bxxk = f170690d;
            if (bxxk == null) {
                synchronized (bzna.class) {
                    bxxk = f170690d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170689b);
                        f170690d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
