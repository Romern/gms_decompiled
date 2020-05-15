package p000;

/* renamed from: bqhz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqhz extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bqhz f140751h;

    /* renamed from: i */
    private static volatile bxxk f140752i;

    /* renamed from: a */
    public String f140753a = "";

    /* renamed from: b */
    public String f140754b = "";

    /* renamed from: c */
    public long f140755c;

    /* renamed from: d */
    public long f140756d;

    /* renamed from: e */
    public long f140757e;

    /* renamed from: f */
    public bxwc f140758f = bxxn.f165040b;

    /* renamed from: g */
    public int f140759g;

    static {
        bqhz bqhz = new bqhz();
        f140751h = bqhz;
        bxvk.m124024a(bqhz.class, bqhz);
    }

    private bqhz() {
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
            return bxvk.m124022a(f140751h, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0003\u0004\u0003\u0005\u0003\u0006Ț\b\f", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bqhz();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (char[][]) null);
            }
            if (i2 == 5) {
                return f140751h;
            }
            bxxk bxxk = f140752i;
            if (bxxk == null) {
                synchronized (bqhz.class) {
                    bxxk = f140752i;
                    if (bxxk == null) {
                        bxxk = new bxve(f140751h);
                        f140752i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
