package p000;

/* renamed from: bxyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxyg extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bxyg f165091a;

    /* renamed from: c */
    private static volatile bxxk f165092c;

    /* renamed from: b */
    private bxww f165093b = bxww.f165013b;

    static {
        bxyg bxyg = new bxyg();
        f165091a = bxyg;
        GeneratedMessageLite.m124024a(bxyg.class, bxyg);
    }

    private bxyg() {
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
            return GeneratedMessageLite.m124022a(f165091a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", bxyf.f165090a});
        } else if (i2 == 3) {
            return new bxyg();
        } else {
            if (i2 == 4) {
                return new bxvd(f165091a);
            }
            if (i2 == 5) {
                return f165091a;
            }
            bxxk bxxk = f165092c;
            if (bxxk == null) {
                synchronized (bxyg.class) {
                    bxxk = f165092c;
                    if (bxxk == null) {
                        bxxk = new bxve(f165091a);
                        f165092c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
