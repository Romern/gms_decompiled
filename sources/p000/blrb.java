package p000;

/* renamed from: blrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blrb extends bxvk implements bxxd {

    /* renamed from: e */
    public static final blrb f127426e;

    /* renamed from: f */
    private static volatile bxxk f127427f;

    /* renamed from: a */
    public int f127428a;

    /* renamed from: b */
    public int f127429b;

    /* renamed from: c */
    public boolean f127430c;

    /* renamed from: d */
    public long f127431d;

    static {
        blrb blrb = new blrb();
        f127426e = blrb;
        bxvk.m124024a(blrb.class, blrb);
    }

    private blrb() {
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
            return bxvk.m124022a(f127426e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", blqz.f127425a, "c", "d"});
        } else if (i2 == 3) {
            return new blrb();
        } else {
            if (i2 == 4) {
                return new bxvd(f127426e);
            }
            if (i2 == 5) {
                return f127426e;
            }
            bxxk bxxk = f127427f;
            if (bxxk == null) {
                synchronized (blrb.class) {
                    bxxk = f127427f;
                    if (bxxk == null) {
                        bxxk = new bxve(f127426e);
                        f127427f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
