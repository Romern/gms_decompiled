package p000;

/* renamed from: mqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mqo extends bxvk implements bxxd {

    /* renamed from: d */
    public static final mqo f34328d;

    /* renamed from: e */
    private static volatile bxxk f34329e;

    /* renamed from: a */
    public int f34330a;

    /* renamed from: b */
    public bxwc f34331b = bxxn.f165040b;

    /* renamed from: c */
    public int f34332c;

    static {
        mqo mqo = new mqo();
        f34328d = mqo;
        bxvk.m124024a(mqo.class, mqo);
    }

    private mqo() {
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
            return bxvk.m124022a(f34328d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003င\u0000", new Object[]{"a", "b", mql.class, "c"});
        } else if (i2 == 3) {
            return new mqo();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (boolean[][][]) null);
            }
            if (i2 == 5) {
                return f34328d;
            }
            bxxk bxxk = f34329e;
            if (bxxk == null) {
                synchronized (mqo.class) {
                    bxxk = f34329e;
                    if (bxxk == null) {
                        bxxk = new bxve(f34328d);
                        f34329e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
