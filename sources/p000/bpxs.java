package p000;

/* renamed from: bpxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpxs extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bpxs f139771e;

    /* renamed from: f */
    private static volatile bxxk f139772f;

    /* renamed from: a */
    public int f139773a;

    /* renamed from: b */
    public bpwz f139774b;

    /* renamed from: c */
    public long f139775c;

    /* renamed from: d */
    public long f139776d;

    static {
        bpxs bpxs = new bpxs();
        f139771e = bpxs;
        bxvk.m124024a(bpxs.class, bpxs);
    }

    private bpxs() {
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
            return bxvk.m124022a(f139771e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဃ\u0001\u0003ဃ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bpxs();
        } else {
            if (i2 == 4) {
                return new bxvd(f139771e);
            }
            if (i2 == 5) {
                return f139771e;
            }
            bxxk bxxk = f139772f;
            if (bxxk == null) {
                synchronized (bpxs.class) {
                    bxxk = f139772f;
                    if (bxxk == null) {
                        bxxk = new bxve(f139771e);
                        f139772f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
