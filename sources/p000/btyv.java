package p000;

/* renamed from: btyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btyv extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final btyv f152987d;

    /* renamed from: e */
    private static volatile bxxk f152988e;

    /* renamed from: a */
    public int f152989a;

    /* renamed from: b */
    public int f152990b;

    /* renamed from: c */
    public int f152991c;

    static {
        btyv btyv = new btyv();
        f152987d = btyv;
        GeneratedMessageLite.m124024a(btyv.class, btyv);
    }

    private btyv() {
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
            return GeneratedMessageLite.m124022a(f152987d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", btza.m119030b(), "c", btyy.m119026b()});
        } else if (i2 == 3) {
            return new btyv();
        } else {
            if (i2 == 4) {
                return new bxvd(f152987d);
            }
            if (i2 == 5) {
                return f152987d;
            }
            bxxk bxxk = f152988e;
            if (bxxk == null) {
                synchronized (btyv.class) {
                    bxxk = f152988e;
                    if (bxxk == null) {
                        bxxk = new bxve(f152987d);
                        f152988e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
