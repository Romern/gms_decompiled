package p000;

/* renamed from: aqdb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqdb extends bxvk implements bxxd {

    /* renamed from: e */
    public static final aqdb f85741e;

    /* renamed from: f */
    private static volatile bxxk f85742f;

    /* renamed from: a */
    public bxvt f85743a = bxvm.f164965b;

    /* renamed from: b */
    public bxvt f85744b = bxvm.f164965b;

    /* renamed from: c */
    public bxvt f85745c = bxvm.f164965b;

    /* renamed from: d */
    public bxwc f85746d = bxxn.f165040b;

    static {
        aqdb aqdb = new aqdb();
        f85741e = aqdb;
        bxvk.m124024a(aqdb.class, aqdb);
    }

    private aqdb() {
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
            return bxvk.m124022a(f85741e, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0016\u0002\u0016\u0003\u001b\u0004\u001e", new Object[]{"a", "b", "d", aqcv.class, "c", aqda.m71370b()});
        } else if (i2 == 3) {
            return new aqdb();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (byte[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f85741e;
            }
            bxxk bxxk = f85742f;
            if (bxxk == null) {
                synchronized (aqdb.class) {
                    bxxk = f85742f;
                    if (bxxk == null) {
                        bxxk = new bxve(f85741e);
                        f85742f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
