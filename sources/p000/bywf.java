package p000;

/* renamed from: bywf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bywf extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bywf f168566c;

    /* renamed from: d */
    private static volatile bxxk f168567d;

    /* renamed from: a */
    public int f168568a;

    /* renamed from: b */
    public int f168569b;

    static {
        bywf bywf = new bywf();
        f168566c = bywf;
        GeneratedMessageLite.m124024a(bywf.class, bywf);
    }

    private bywf() {
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
            return GeneratedMessageLite.m124022a(f168566c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bywf();
        } else {
            if (i2 == 4) {
                return new bxvd(f168566c);
            }
            if (i2 == 5) {
                return f168566c;
            }
            bxxk bxxk = f168567d;
            if (bxxk == null) {
                synchronized (bywf.class) {
                    bxxk = f168567d;
                    if (bxxk == null) {
                        bxxk = new bxve(f168566c);
                        f168567d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
