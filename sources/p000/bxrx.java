package p000;

/* renamed from: bxrx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxrx extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bxrx f164633e;

    /* renamed from: f */
    private static volatile bxxk f164634f;

    /* renamed from: a */
    public int f164635a;

    /* renamed from: b */
    public bxrf f164636b;

    /* renamed from: c */
    public bxsk f164637c;

    /* renamed from: d */
    public bxwc f164638d = bxxn.f165040b;

    static {
        bxrx bxrx = new bxrx();
        f164633e = bxrx;
        bxvk.m124024a(bxrx.class, bxrx);
    }

    private bxrx() {
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
            return bxvk.m124022a(f164633e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0001\u0000\u0002\u001b\u0003ဉ\u0000\u0005ဉ\u0003", new Object[]{"a", "d", bxsf.class, "b", "c"});
        } else if (i2 == 3) {
            return new bxrx();
        } else {
            if (i2 == 4) {
                return new bxvd(f164633e);
            }
            if (i2 == 5) {
                return f164633e;
            }
            bxxk bxxk = f164634f;
            if (bxxk == null) {
                synchronized (bxrx.class) {
                    bxxk = f164634f;
                    if (bxxk == null) {
                        bxxk = new bxve(f164633e);
                        f164634f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
