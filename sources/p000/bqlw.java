package p000;

/* renamed from: bqlw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqlw extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bqlw f141178b;

    /* renamed from: c */
    private static volatile bxxk f141179c;

    /* renamed from: a */
    public bxwc f141180a = bxxn.f165040b;

    static {
        bqlw bqlw = new bqlw();
        f141178b = bqlw;
        GeneratedMessageLite.m124024a(bqlw.class, bqlw);
    }

    private bqlw() {
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
            return GeneratedMessageLite.m124022a(f141178b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bqlv.class});
        } else if (i2 == 3) {
            return new bqlw();
        } else {
            if (i2 == 4) {
                return new bxvd(f141178b);
            }
            if (i2 == 5) {
                return f141178b;
            }
            bxxk bxxk = f141179c;
            if (bxxk == null) {
                synchronized (bqlw.class) {
                    bxxk = f141179c;
                    if (bxxk == null) {
                        bxxk = new bxve(f141178b);
                        f141179c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
