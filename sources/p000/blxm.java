package p000;

/* renamed from: blxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blxm extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final blxm f128081e;

    /* renamed from: f */
    private static volatile bxxk f128082f;

    /* renamed from: a */
    public int f128083a;

    /* renamed from: b */
    public int f128084b = 0;

    /* renamed from: c */
    public Object f128085c;

    /* renamed from: d */
    public bmaj f128086d;

    static {
        blxm blxm = new blxm();
        f128081e = blxm;
        GeneratedMessageLite.m124024a(blxm.class, blxm);
    }

    private blxm() {
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
            return GeneratedMessageLite.m124022a(f128081e, "\u0001\u0002\u0001\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ွ\u0000", new Object[]{"c", "b", "a", "d"});
        } else if (i2 == 3) {
            return new blxm();
        } else {
            if (i2 == 4) {
                return new bxvd(f128081e);
            }
            if (i2 == 5) {
                return f128081e;
            }
            bxxk bxxk = f128082f;
            if (bxxk == null) {
                synchronized (blxm.class) {
                    bxxk = f128082f;
                    if (bxxk == null) {
                        bxxk = new bxve(f128081e);
                        f128082f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
