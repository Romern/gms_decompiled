package p000;

/* renamed from: aqdc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqdc extends bxvk implements bxxd {

    /* renamed from: f */
    public static final aqdc f85747f;

    /* renamed from: g */
    private static volatile bxxk f85748g;

    /* renamed from: a */
    public int f85749a;

    /* renamed from: b */
    public int f85750b;

    /* renamed from: c */
    public aqcv f85751c;

    /* renamed from: d */
    public aqcx f85752d;

    /* renamed from: e */
    public aqcg f85753e;

    static {
        aqdc aqdc = new aqdc();
        f85747f = aqdc;
        bxvk.m124024a(aqdc.class, aqdc);
    }

    private aqdc() {
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
            return bxvk.m124022a(f85747f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0005", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new aqdc();
        } else {
            if (i2 == 4) {
                return new bxvd(f85747f);
            }
            if (i2 == 5) {
                return f85747f;
            }
            bxxk bxxk = f85748g;
            if (bxxk == null) {
                synchronized (aqdc.class) {
                    bxxk = f85748g;
                    if (bxxk == null) {
                        bxxk = new bxve(f85747f);
                        f85748g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
