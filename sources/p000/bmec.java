package p000;

/* renamed from: bmec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmec extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bmec f128911c;

    /* renamed from: d */
    private static volatile bxxk f128912d;

    /* renamed from: a */
    public int f128913a = 0;

    /* renamed from: b */
    public Object f128914b;

    static {
        bmec bmec = new bmec();
        f128911c = bmec;
        bxvk.m124024a(bmec.class, bmec);
    }

    private bmec() {
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
            return bxvk.m124022a(f128911c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", bmeg.class, bmdy.class});
        } else if (i2 == 3) {
            return new bmec();
        } else {
            if (i2 == 4) {
                return new bxvd(f128911c);
            }
            if (i2 == 5) {
                return f128911c;
            }
            bxxk bxxk = f128912d;
            if (bxxk == null) {
                synchronized (bmec.class) {
                    bxxk = f128912d;
                    if (bxxk == null) {
                        bxxk = new bxve(f128911c);
                        f128912d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
