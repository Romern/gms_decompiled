package p000;

/* renamed from: buer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buer extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final buer f153626d;

    /* renamed from: e */
    private static volatile bxxk f153627e;

    /* renamed from: a */
    public int f153628a;

    /* renamed from: b */
    public int f153629b;

    /* renamed from: c */
    public int f153630c;

    static {
        buer buer = new buer();
        f153626d = buer;
        GeneratedMessageLite.m124024a(buer.class, buer);
    }

    private buer() {
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
            return GeneratedMessageLite.m124022a(f153626d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", bueq.f153625a, "c"});
        } else if (i2 == 3) {
            return new buer();
        } else {
            if (i2 == 4) {
                return new bxvd(f153626d);
            }
            if (i2 == 5) {
                return f153626d;
            }
            bxxk bxxk = f153627e;
            if (bxxk == null) {
                synchronized (buer.class) {
                    bxxk = f153627e;
                    if (bxxk == null) {
                        bxxk = new bxve(f153626d);
                        f153627e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
