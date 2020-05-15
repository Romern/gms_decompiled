package p000;

/* renamed from: bvjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvjy extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bvjy f156367b;

    /* renamed from: c */
    private static volatile bxxk f156368c;

    /* renamed from: a */
    public bxwc f156369a = bxxn.f165040b;

    static {
        bvjy bvjy = new bvjy();
        f156367b = bvjy;
        GeneratedMessageLite.m124024a(bvjy.class, bvjy);
    }

    private bvjy() {
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
            return GeneratedMessageLite.m124022a(f156367b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bvjx.class});
        } else if (i2 == 3) {
            return new bvjy();
        } else {
            if (i2 == 4) {
                return new bxvd(f156367b);
            }
            if (i2 == 5) {
                return f156367b;
            }
            bxxk bxxk = f156368c;
            if (bxxk == null) {
                synchronized (bvjy.class) {
                    bxxk = f156368c;
                    if (bxxk == null) {
                        bxxk = new bxve(f156367b);
                        f156368c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
