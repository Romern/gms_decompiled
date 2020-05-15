package p000;

/* renamed from: bzwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzwg extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzwg f171617c;

    /* renamed from: d */
    private static volatile bxxk f171618d;

    /* renamed from: a */
    public int f171619a;

    /* renamed from: b */
    public bzvu f171620b;

    static {
        bzwg bzwg = new bzwg();
        f171617c = bzwg;
        bxvk.m124024a(bzwg.class, bzwg);
    }

    private bzwg() {
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
            return bxvk.m124022a(f171617c, "\u0001\u0001\u0000\u0001dd\u0001\u0000\u0000\u0000dဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzwg();
        } else {
            if (i2 == 4) {
                return new bxvd(f171617c);
            }
            if (i2 == 5) {
                return f171617c;
            }
            bxxk bxxk = f171618d;
            if (bxxk == null) {
                synchronized (bzwg.class) {
                    bxxk = f171618d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171617c);
                        f171618d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
