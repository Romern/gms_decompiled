package p000;

/* renamed from: buyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buyn extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final buyn f155316e;

    /* renamed from: f */
    private static volatile bxxk f155317f;

    /* renamed from: a */
    public int f155318a;

    /* renamed from: b */
    public bvaa f155319b;

    /* renamed from: c */
    public buzt f155320c;

    /* renamed from: d */
    public buzw f155321d;

    static {
        buyn buyn = new buyn();
        f155316e = buyn;
        GeneratedMessageLite.m124024a(buyn.class, buyn);
    }

    private buyn() {
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
            return GeneratedMessageLite.m124022a(f155316e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new buyn();
        } else {
            if (i2 == 4) {
                return new bxvd(f155316e);
            }
            if (i2 == 5) {
                return f155316e;
            }
            bxxk bxxk = f155317f;
            if (bxxk == null) {
                synchronized (buyn.class) {
                    bxxk = f155317f;
                    if (bxxk == null) {
                        bxxk = new bxve(f155316e);
                        f155317f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
