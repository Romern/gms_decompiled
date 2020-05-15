package p000;

/* renamed from: bmks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmks extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmks f129878d;

    /* renamed from: e */
    private static volatile bxxk f129879e;

    /* renamed from: a */
    public int f129880a;

    /* renamed from: b */
    public boolean f129881b;

    /* renamed from: c */
    public bxwc f129882c = bxxn.f165040b;

    static {
        bmks bmks = new bmks();
        f129878d = bmks;
        bxvk.m124024a(bmks.class, bmks);
    }

    private bmks() {
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
            return bxvk.m124022a(f129878d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u001b\u0003ဇ\u0000", new Object[]{"a", "c", bmkr.class, "b"});
        } else if (i2 == 3) {
            return new bmks();
        } else {
            if (i2 == 4) {
                return new bmkn();
            }
            if (i2 == 5) {
                return f129878d;
            }
            bxxk bxxk = f129879e;
            if (bxxk == null) {
                synchronized (bmks.class) {
                    bxxk = f129879e;
                    if (bxxk == null) {
                        bxxk = new bxve(f129878d);
                        f129879e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
