package p000;

/* renamed from: bmcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmcc extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bmcc f128656e;

    /* renamed from: f */
    private static volatile bxxk f128657f;

    /* renamed from: a */
    public int f128658a;

    /* renamed from: b */
    public int f128659b = 0;

    /* renamed from: c */
    public Object f128660c;

    /* renamed from: d */
    public bmcv f128661d;

    static {
        bmcc bmcc = new bmcc();
        f128656e = bmcc;
        GeneratedMessageLite.m124024a(bmcc.class, bmcc);
    }

    private bmcc() {
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
            return GeneratedMessageLite.m124022a(f128656e, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003်\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ဉ\u0007\u0007ြ\u0000\bြ\u0000", new Object[]{"c", "b", "a", bmcn.class, bmcl.class, bmjc.class, bmcs.class, "d", bmcg.class, bmcj.class});
        } else if (i2 == 3) {
            return new bmcc();
        } else {
            if (i2 == 4) {
                return new bxvd(f128656e);
            }
            if (i2 == 5) {
                return f128656e;
            }
            bxxk bxxk = f128657f;
            if (bxxk == null) {
                synchronized (bmcc.class) {
                    bxxk = f128657f;
                    if (bxxk == null) {
                        bxxk = new bxve(f128656e);
                        f128657f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
