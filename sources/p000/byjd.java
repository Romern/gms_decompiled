package p000;

/* renamed from: byjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byjd extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final byjd f166638c;

    /* renamed from: d */
    private static volatile bxxk f166639d;

    /* renamed from: a */
    public int f166640a = 0;

    /* renamed from: b */
    public Object f166641b;

    static {
        byjd byjd = new byjd();
        f166638c = byjd;
        GeneratedMessageLite.m124024a(byjd.class, byjd);
    }

    private byjd() {
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
            return GeneratedMessageLite.m124022a(f166638c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001်\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new byjd();
        } else {
            if (i2 == 4) {
                return new bxvd(f166638c);
            }
            if (i2 == 5) {
                return f166638c;
            }
            bxxk bxxk = f166639d;
            if (bxxk == null) {
                synchronized (byjd.class) {
                    bxxk = f166639d;
                    if (bxxk == null) {
                        bxxk = new bxve(f166638c);
                        f166639d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
