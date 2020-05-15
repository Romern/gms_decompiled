package p000;

/* renamed from: btki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btki extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btki f149257c;

    /* renamed from: d */
    private static volatile bxxk f149258d;

    /* renamed from: a */
    public int f149259a = 0;

    /* renamed from: b */
    public Object f149260b;

    static {
        btki btki = new btki();
        f149257c = btki;
        GeneratedMessageLite.m124024a(btki.class, btki);
    }

    private btki() {
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
            return GeneratedMessageLite.m124022a(f149257c, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"b", "a", btkh.class});
        } else if (i2 == 3) {
            return new btki();
        } else {
            if (i2 == 4) {
                return new bxvd(f149257c);
            }
            if (i2 == 5) {
                return f149257c;
            }
            bxxk bxxk = f149258d;
            if (bxxk == null) {
                synchronized (btki.class) {
                    bxxk = f149258d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149257c);
                        f149258d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
