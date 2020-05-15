package p000;

/* renamed from: bqiz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqiz extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bqiz f140917c;

    /* renamed from: d */
    private static volatile bxxk f140918d;

    /* renamed from: a */
    public int f140919a;

    /* renamed from: b */
    public int f140920b;

    static {
        bqiz bqiz = new bqiz();
        f140917c = bqiz;
        bxvk.m124024a(bqiz.class, bqiz);
    }

    private bqiz() {
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
            return bxvk.m124022a(f140917c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bqix.f140916a});
        } else if (i2 == 3) {
            return new bqiz();
        } else {
            if (i2 == 4) {
                return new bxvd(f140917c);
            }
            if (i2 == 5) {
                return f140917c;
            }
            bxxk bxxk = f140918d;
            if (bxxk == null) {
                synchronized (bqiz.class) {
                    bxxk = f140918d;
                    if (bxxk == null) {
                        bxxk = new bxve(f140917c);
                        f140918d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
