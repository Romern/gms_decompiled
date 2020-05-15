package p000;

/* renamed from: bwbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwbv extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bwbv f158777g;

    /* renamed from: h */
    private static volatile bxxk f158778h;

    /* renamed from: a */
    public int f158779a = 0;

    /* renamed from: b */
    public Object f158780b;

    /* renamed from: c */
    public long f158781c;

    /* renamed from: d */
    public int f158782d;

    /* renamed from: e */
    public long f158783e;

    /* renamed from: f */
    public bxwc f158784f = bxxn.f165040b;

    static {
        bwbv bwbv = new bwbv();
        f158777g = bwbv;
        GeneratedMessageLite.m124024a(bwbv.class, bwbv);
    }

    private bwbv() {
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
            return GeneratedMessageLite.m124022a(f158777g, "\u0000\b\u0001\u0000\u0001\u0016\b\u0000\u0001\u0000\u0001\u0002\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0014\f\u0015\u0002\u0016\u001b", new Object[]{"b", "a", "c", bwby.class, bwbz.class, bwbw.class, bwbx.class, "d", "e", "f", bwca.class});
        } else if (i2 == 3) {
            return new bwbv();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (char[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f158777g;
            }
            bxxk bxxk = f158778h;
            if (bxxk == null) {
                synchronized (bwbv.class) {
                    bxxk = f158778h;
                    if (bxxk == null) {
                        bxxk = new bxve(f158777g);
                        f158778h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
