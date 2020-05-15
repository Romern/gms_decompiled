package p000;

/* renamed from: mpb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mpb extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final mpb f34099d;

    /* renamed from: e */
    private static volatile bxxk f34100e;

    /* renamed from: a */
    public int f34101a;

    /* renamed from: b */
    public moz f34102b;

    /* renamed from: c */
    public bxwc f34103c = bxxn.f165040b;

    static {
        mpb mpb = new mpb();
        f34099d = mpb;
        GeneratedMessageLite.m124024a(mpb.class, mpb);
    }

    private mpb() {
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
            return GeneratedMessageLite.m124022a(f34099d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0004\u001b", new Object[]{"a", "b", "c", mph.class});
        } else if (i2 == 3) {
            return new mpb();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (float[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f34099d;
            }
            bxxk bxxk = f34100e;
            if (bxxk == null) {
                synchronized (mpb.class) {
                    bxxk = f34100e;
                    if (bxxk == null) {
                        bxxk = new bxve(f34099d);
                        f34100e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
