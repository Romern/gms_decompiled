package p000;

/* renamed from: bivf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bivf extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bivf f121970c;

    /* renamed from: e */
    private static volatile bxxk f121971e;

    /* renamed from: a */
    public int f121972a;

    /* renamed from: b */
    public int f121973b = 1;

    /* renamed from: d */
    private byte f121974d = 2;

    static {
        bivf bivf = new bivf();
        f121970c = bivf;
        bxvk.m124024a(bivf.class, bivf);
    }

    private bivf() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121974d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121974d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121970c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔌ\u0000", new Object[]{"a", "b", birv.m102769b()});
        } else if (i2 == 3) {
            return new bivf();
        } else {
            if (i2 == 4) {
                return new bxvd(f121970c);
            }
            if (i2 == 5) {
                return f121970c;
            }
            bxxk bxxk = f121971e;
            if (bxxk == null) {
                synchronized (bivf.class) {
                    bxxk = f121971e;
                    if (bxxk == null) {
                        bxxk = new bxve(f121970c);
                        f121971e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
