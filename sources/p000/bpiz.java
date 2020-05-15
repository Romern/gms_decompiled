package p000;

/* renamed from: bpiz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpiz extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bpiz f137826e;

    /* renamed from: f */
    private static volatile bxxk f137827f;

    /* renamed from: a */
    public int f137828a;

    /* renamed from: b */
    public int f137829b;

    /* renamed from: c */
    public int f137830c;

    /* renamed from: d */
    public int f137831d = -1;

    static {
        bpiz bpiz = new bpiz();
        f137826e = bpiz;
        GeneratedMessageLite.m124024a(bpiz.class, bpiz);
    }

    private bpiz() {
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
            return GeneratedMessageLite.m124022a(f137826e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", bpix.f137825a, "d"});
        } else if (i2 == 3) {
            return new bpiz();
        } else {
            if (i2 == 4) {
                return new bxvd(f137826e);
            }
            if (i2 == 5) {
                return f137826e;
            }
            bxxk bxxk = f137827f;
            if (bxxk == null) {
                synchronized (bpiz.class) {
                    bxxk = f137827f;
                    if (bxxk == null) {
                        bxxk = new bxve(f137826e);
                        f137827f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
