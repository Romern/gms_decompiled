package p000;

/* renamed from: bzky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzky extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzky f170485c;

    /* renamed from: d */
    private static volatile bxxk f170486d;

    /* renamed from: a */
    public int f170487a;

    /* renamed from: b */
    public int f170488b;

    static {
        bzky bzky = new bzky();
        f170485c = bzky;
        GeneratedMessageLite.m124024a(bzky.class, bzky);
    }

    private bzky() {
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
            return GeneratedMessageLite.m124022a(f170485c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bzkw.f170484a});
        } else if (i2 == 3) {
            return new bzky();
        } else {
            if (i2 == 4) {
                return new bxvd(f170485c);
            }
            if (i2 == 5) {
                return f170485c;
            }
            bxxk bxxk = f170486d;
            if (bxxk == null) {
                synchronized (bzky.class) {
                    bxxk = f170486d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170485c);
                        f170486d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
