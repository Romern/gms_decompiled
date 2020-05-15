package p000;

/* renamed from: byvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byvj extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final byvj f168438b;

    /* renamed from: c */
    private static volatile bxxk f168439c;

    /* renamed from: a */
    public bxwc f168440a = bxxn.f165040b;

    static {
        byvj byvj = new byvj();
        f168438b = byvj;
        GeneratedMessageLite.m124024a(byvj.class, byvj);
    }

    private byvj() {
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
            return GeneratedMessageLite.m124022a(f168438b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", byvk.class});
        } else if (i2 == 3) {
            return new byvj();
        } else {
            if (i2 == 4) {
                return new bxvd(f168438b);
            }
            if (i2 == 5) {
                return f168438b;
            }
            bxxk bxxk = f168439c;
            if (bxxk == null) {
                synchronized (byvj.class) {
                    bxxk = f168439c;
                    if (bxxk == null) {
                        bxxk = new bxve(f168438b);
                        f168439c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
