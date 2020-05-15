package p000;

/* renamed from: byhe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byhe extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final byhe f166435c;

    /* renamed from: d */
    private static volatile bxxk f166436d;

    /* renamed from: a */
    public int f166437a = 0;

    /* renamed from: b */
    public Object f166438b;

    static {
        byhe byhe = new byhe();
        f166435c = byhe;
        GeneratedMessageLite.m124024a(byhe.class, byhe);
    }

    private byhe() {
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
            return GeneratedMessageLite.m124022a(f166435c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"b", "a", byjs.class, byjp.class, byig.class, byhb.class});
        } else if (i2 == 3) {
            return new byhe();
        } else {
            if (i2 == 4) {
                return new bxvd(f166435c);
            }
            if (i2 == 5) {
                return f166435c;
            }
            bxxk bxxk = f166436d;
            if (bxxk == null) {
                synchronized (byhe.class) {
                    bxxk = f166436d;
                    if (bxxk == null) {
                        bxxk = new bxve(f166435c);
                        f166436d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
