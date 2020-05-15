package p000;

/* renamed from: bvgp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvgp extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bvgp f156028b;

    /* renamed from: c */
    private static volatile bxxk f156029c;

    /* renamed from: a */
    public bxwc f156030a = bxxn.f165040b;

    static {
        bvgp bvgp = new bvgp();
        f156028b = bvgp;
        GeneratedMessageLite.m124024a(bvgp.class, bvgp);
    }

    private bvgp() {
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
            return GeneratedMessageLite.m124022a(f156028b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bvgo.class});
        } else if (i2 == 3) {
            return new bvgp();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (boolean[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f156028b;
            }
            bxxk bxxk = f156029c;
            if (bxxk == null) {
                synchronized (bvgp.class) {
                    bxxk = f156029c;
                    if (bxxk == null) {
                        bxxk = new bxve(f156028b);
                        f156029c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
