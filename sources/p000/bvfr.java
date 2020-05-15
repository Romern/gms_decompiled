package p000;

/* renamed from: bvfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvfr extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvfr f155906c;

    /* renamed from: d */
    private static volatile bxxk f155907d;

    /* renamed from: a */
    public int f155908a;

    /* renamed from: b */
    public long f155909b;

    static {
        bvfr bvfr = new bvfr();
        f155906c = bvfr;
        bxvk.m124024a(bvfr.class, bvfr);
    }

    private bvfr() {
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
            return bxvk.m124022a(f155906c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvfr();
        } else {
            if (i2 == 4) {
                return new bxvd(f155906c);
            }
            if (i2 == 5) {
                return f155906c;
            }
            bxxk bxxk = f155907d;
            if (bxxk == null) {
                synchronized (bvfr.class) {
                    bxxk = f155907d;
                    if (bxxk == null) {
                        bxxk = new bxve(f155906c);
                        f155907d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
