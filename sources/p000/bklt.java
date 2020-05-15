package p000;

/* renamed from: bklt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bklt extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bklt f124847b;

    /* renamed from: d */
    private static volatile bxxk f124848d;

    /* renamed from: a */
    public bklu f124849a;

    /* renamed from: c */
    private int f124850c;

    static {
        bklt bklt = new bklt();
        f124847b = bklt;
        GeneratedMessageLite.m124024a(bklt.class, bklt);
    }

    private bklt() {
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
            return GeneratedMessageLite.m124022a(f124847b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bklt();
        } else {
            if (i2 == 4) {
                return new bxvd(f124847b);
            }
            if (i2 == 5) {
                return f124847b;
            }
            bxxk bxxk = f124848d;
            if (bxxk == null) {
                synchronized (bklt.class) {
                    bxxk = f124848d;
                    if (bxxk == null) {
                        bxxk = new bxve(f124847b);
                        f124848d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
