package p000;

/* renamed from: bqzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqzn extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bqzn f142065e;

    /* renamed from: f */
    private static volatile bxxk f142066f;

    /* renamed from: a */
    public int f142067a;

    /* renamed from: b */
    public String f142068b = "";

    /* renamed from: c */
    public long f142069c;

    /* renamed from: d */
    public bqzb f142070d;

    static {
        bqzn bqzn = new bqzn();
        f142065e = bqzn;
        bxvk.m124024a(bqzn.class, bqzn);
    }

    private bqzn() {
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
            return bxvk.m124022a(f142065e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bqzn();
        } else {
            if (i2 == 4) {
                return new bxvd(f142065e);
            }
            if (i2 == 5) {
                return f142065e;
            }
            bxxk bxxk = f142066f;
            if (bxxk == null) {
                synchronized (bqzn.class) {
                    bxxk = f142066f;
                    if (bxxk == null) {
                        bxxk = new bxve(f142065e);
                        f142066f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
