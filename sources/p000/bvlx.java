package p000;

/* renamed from: bvlx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvlx extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bvlx f156613f;

    /* renamed from: g */
    private static volatile bxxk f156614g;

    /* renamed from: a */
    public int f156615a;

    /* renamed from: b */
    public bvov f156616b;

    /* renamed from: c */
    public bzrv f156617c;

    /* renamed from: d */
    public int f156618d;

    /* renamed from: e */
    public bxwc f156619e = bxxn.f165040b;

    static {
        bvlx bvlx = new bvlx();
        f156613f = bvlx;
        GeneratedMessageLite.m124024a(bvlx.class, bvlx);
    }

    private bvlx() {
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
            return GeneratedMessageLite.m124022a(f156613f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004\u001b", new Object[]{"a", "b", "c", "d", "e", bvlw.class});
        } else if (i2 == 3) {
            return new bvlx();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (boolean[][]) null);
            }
            if (i2 == 5) {
                return f156613f;
            }
            bxxk bxxk = f156614g;
            if (bxxk == null) {
                synchronized (bvlx.class) {
                    bxxk = f156614g;
                    if (bxxk == null) {
                        bxxk = new bxve(f156613f);
                        f156614g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
