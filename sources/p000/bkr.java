package p000;

/* renamed from: bkr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkr extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bkr f5024b;

    /* renamed from: c */
    private static volatile bxxk f5025c;

    /* renamed from: a */
    public bxvw f5026a = bxwq.f165002b;

    static {
        bkr bkr = new bkr();
        f5024b = bkr;
        bxvk.m124024a(bkr.class, bkr);
    }

    private bkr() {
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
            return bxvk.m124022a(f5024b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u0014", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bkr();
        } else {
            if (i2 == 4) {
                return new bxvd(f5024b);
            }
            if (i2 == 5) {
                return f5024b;
            }
            bxxk bxxk = f5025c;
            if (bxxk == null) {
                synchronized (bkr.class) {
                    bxxk = f5025c;
                    if (bxxk == null) {
                        bxxk = new bxve(f5024b);
                        f5025c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
