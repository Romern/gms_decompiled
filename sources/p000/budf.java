package p000;

/* renamed from: budf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class budf extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final budf f153455c;

    /* renamed from: d */
    private static volatile bxxk f153456d;

    /* renamed from: a */
    public int f153457a = 0;

    /* renamed from: b */
    public Object f153458b;

    static {
        budf budf = new budf();
        f153455c = budf;
        GeneratedMessageLite.m124024a(budf.class, budf);
    }

    private budf() {
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
            return GeneratedMessageLite.m124022a(f153455c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"b", "a", budb.class, bude.class, buda.class, budc.class});
        } else if (i2 == 3) {
            return new budf();
        } else {
            if (i2 == 4) {
                return new bxvd(f153455c);
            }
            if (i2 == 5) {
                return f153455c;
            }
            bxxk bxxk = f153456d;
            if (bxxk == null) {
                synchronized (budf.class) {
                    bxxk = f153456d;
                    if (bxxk == null) {
                        bxxk = new bxve(f153455c);
                        f153456d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
