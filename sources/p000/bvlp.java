package p000;

/* renamed from: bvlp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvlp extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bvlp f156580c;

    /* renamed from: e */
    private static volatile bxxk f156581e;

    /* renamed from: a */
    public bvow f156582a;

    /* renamed from: b */
    public bxwc f156583b = bxxn.f165040b;

    /* renamed from: d */
    private int f156584d;

    static {
        bvlp bvlp = new bvlp();
        f156580c = bvlp;
        GeneratedMessageLite.m124024a(bvlp.class, bvlp);
    }

    private bvlp() {
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
            return GeneratedMessageLite.m124022a(f156580c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", bvlo.class});
        } else if (i2 == 3) {
            return new bvlp();
        } else {
            if (i2 == 4) {
                return new bxvd(f156580c);
            }
            if (i2 == 5) {
                return f156580c;
            }
            bxxk bxxk = f156581e;
            if (bxxk == null) {
                synchronized (bvlp.class) {
                    bxxk = f156581e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156580c);
                        f156581e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
