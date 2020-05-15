package p000;

/* renamed from: blb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blb extends bxvk implements bxxd {

    /* renamed from: d */
    public static final blb f5077d;

    /* renamed from: f */
    private static volatile bxxk f5078f;

    /* renamed from: a */
    public long f5079a;

    /* renamed from: b */
    public int f5080b;

    /* renamed from: c */
    public long f5081c;

    /* renamed from: e */
    private int f5082e;

    static {
        blb blb = new blb();
        f5077d = blb;
        bxvk.m124024a(blb.class, blb);
    }

    private blb() {
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
            return bxvk.m124022a(f5077d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002", new Object[]{"e", "a", "b", bkz.f5074a, "c"});
        } else if (i2 == 3) {
            return new blb();
        } else {
            if (i2 == 4) {
                return new bxvd(f5077d);
            }
            if (i2 == 5) {
                return f5077d;
            }
            bxxk bxxk = f5078f;
            if (bxxk == null) {
                synchronized (blb.class) {
                    bxxk = f5078f;
                    if (bxxk == null) {
                        bxxk = new bxve(f5077d);
                        f5078f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
