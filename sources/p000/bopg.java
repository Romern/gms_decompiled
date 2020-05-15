package p000;

/* renamed from: bopg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bopg extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bopg f134117b;

    /* renamed from: c */
    private static volatile bxxk f134118c;

    /* renamed from: a */
    public int f134119a;

    static {
        bopg bopg = new bopg();
        f134117b = bopg;
        GeneratedMessageLite.m124024a(bopg.class, bopg);
    }

    private bopg() {
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
            return GeneratedMessageLite.m124022a(f134117b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bopg();
        } else {
            if (i2 == 4) {
                return new bxvd(f134117b);
            }
            if (i2 == 5) {
                return f134117b;
            }
            bxxk bxxk = f134118c;
            if (bxxk == null) {
                synchronized (bopg.class) {
                    bxxk = f134118c;
                    if (bxxk == null) {
                        bxxk = new bxve(f134117b);
                        f134118c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
