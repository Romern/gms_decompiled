package p000;

/* renamed from: bmjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmjv extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmjv f129752c;

    /* renamed from: e */
    private static volatile bxxk f129753e;

    /* renamed from: a */
    public long f129754a;

    /* renamed from: b */
    public bxwc f129755b = bxxn.f165040b;

    /* renamed from: d */
    private int f129756d;

    static {
        bmjv bmjv = new bmjv();
        f129752c = bmjv;
        GeneratedMessageLite.m124024a(bmjv.class, bmjv);
    }

    private bmjv() {
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
            return GeneratedMessageLite.m124022a(f129752c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0003\u001b", new Object[]{"d", "a", "b", bmju.class});
        } else if (i2 == 3) {
            return new bmjv();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (short[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f129752c;
            }
            bxxk bxxk = f129753e;
            if (bxxk == null) {
                synchronized (bmjv.class) {
                    bxxk = f129753e;
                    if (bxxk == null) {
                        bxxk = new bxve(f129752c);
                        f129753e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
