package p000;

/* renamed from: bxgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxgo extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxgo f163275c;

    /* renamed from: d */
    private static volatile bxxk f163276d;

    /* renamed from: a */
    public int f163277a;

    /* renamed from: b */
    public int f163278b;

    static {
        bxgo bxgo = new bxgo();
        f163275c = bxgo;
        bxvk.m124024a(bxgo.class, bxgo);
    }

    private bxgo() {
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
            return bxvk.m124022a(f163275c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bxgn.m122691b()});
        } else if (i2 == 3) {
            return new bxgo();
        } else {
            if (i2 == 4) {
                return new bxvd(f163275c);
            }
            if (i2 == 5) {
                return f163275c;
            }
            bxxk bxxk = f163276d;
            if (bxxk == null) {
                synchronized (bxgo.class) {
                    bxxk = f163276d;
                    if (bxxk == null) {
                        bxxk = new bxve(f163275c);
                        f163276d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
