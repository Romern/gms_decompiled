package p000;

/* renamed from: bxnn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxnn extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bxnn f164061f;

    /* renamed from: g */
    public static final bxvj f164062g;

    /* renamed from: h */
    private static volatile bxxk f164063h;

    /* renamed from: a */
    public int f164064a;

    /* renamed from: b */
    public double f164065b;

    /* renamed from: c */
    public double f164066c;

    /* renamed from: d */
    public double f164067d;

    /* renamed from: e */
    public double f164068e;

    static {
        bxnn bxnn = new bxnn();
        f164061f = bxnn;
        bxvk.m124024a(bxnn.class, bxnn);
        bxcf bxcf = bxcf.f162779a;
        bxnn bxnn2 = f164061f;
        f164062g = bxvk.m124006a(bxcf, bxnn2, bxnn2, 148135292, bxzf.MESSAGE);
    }

    private bxnn() {
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
            return bxvk.m124022a(f164061f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bxnn();
        } else {
            if (i2 == 4) {
                return new bxvd(f164061f);
            }
            if (i2 == 5) {
                return f164061f;
            }
            bxxk bxxk = f164063h;
            if (bxxk == null) {
                synchronized (bxnn.class) {
                    bxxk = f164063h;
                    if (bxxk == null) {
                        bxxk = new bxve(f164061f);
                        f164063h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
