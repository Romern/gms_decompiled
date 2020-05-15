package p000;

/* renamed from: kzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kzx extends bxvk implements bxxd {

    /* renamed from: d */
    public static final kzx f25494d;

    /* renamed from: e */
    private static volatile bxxk f25495e;

    /* renamed from: a */
    public String f25496a = "";

    /* renamed from: b */
    public int f25497b;

    /* renamed from: c */
    public int f25498c;

    static {
        kzx kzx = new kzx();
        f25494d = kzx;
        bxvk.m124024a(kzx.class, kzx);
    }

    private kzx() {
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
            return bxvk.m124022a(f25494d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0006", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new kzx();
        } else {
            if (i2 == 4) {
                return new bxvd(f25494d);
            }
            if (i2 == 5) {
                return f25494d;
            }
            bxxk bxxk = f25495e;
            if (bxxk == null) {
                synchronized (kzx.class) {
                    bxxk = f25495e;
                    if (bxxk == null) {
                        bxxk = new bxve(f25494d);
                        f25495e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
