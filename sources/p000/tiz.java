package p000;

/* renamed from: tiz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tiz extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final tiz f46168e;

    /* renamed from: f */
    private static volatile bxxk f46169f;

    /* renamed from: a */
    public int f46170a;

    /* renamed from: b */
    public int f46171b;

    /* renamed from: c */
    public int f46172c;

    /* renamed from: d */
    public bxvt f46173d = bxvm.f164965b;

    static {
        tiz tiz = new tiz();
        f46168e = tiz;
        GeneratedMessageLite.m124024a(tiz.class, tiz);
    }

    private tiz() {
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
            return GeneratedMessageLite.m124022a(f46168e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003\u0016", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new tiz();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (int[][]) null);
            }
            if (i2 == 5) {
                return f46168e;
            }
            bxxk bxxk = f46169f;
            if (bxxk == null) {
                synchronized (tiz.class) {
                    bxxk = f46169f;
                    if (bxxk == null) {
                        bxxk = new bxve(f46168e);
                        f46169f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
