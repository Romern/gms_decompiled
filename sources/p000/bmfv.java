package p000;

/* renamed from: bmfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmfv extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmfv f129179c;

    /* renamed from: d */
    private static volatile bxxk f129180d;

    /* renamed from: a */
    public int f129181a = 0;

    /* renamed from: b */
    public Object f129182b;

    static {
        bmfv bmfv = new bmfv();
        f129179c = bmfv;
        GeneratedMessageLite.m124024a(bmfv.class, bmfv);
    }

    private bmfv() {
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
            return GeneratedMessageLite.m124022a(f129179c, "\u0001\b\u0001\u0000\u0001\u000e\b\u0000\u0000\u0000\u0001ြ\u0000\u0004ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\u000bြ\u0000\fြ\u0000\rြ\u0000\u000eြ\u0000", new Object[]{"b", "a", bmia.class, bmim.class, bmjc.class, bmgq.class, bmed.class, bmhj.class, bmkj.class, bmis.class});
        } else if (i2 == 3) {
            return new bmfv();
        } else {
            if (i2 == 4) {
                return new bxvd(f129179c);
            }
            if (i2 == 5) {
                return f129179c;
            }
            bxxk bxxk = f129180d;
            if (bxxk == null) {
                synchronized (bmfv.class) {
                    bxxk = f129180d;
                    if (bxxk == null) {
                        bxxk = new bxve(f129179c);
                        f129180d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
