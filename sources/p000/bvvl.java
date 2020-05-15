package p000;

/* renamed from: bvvl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvvl extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bvvl f157808e;

    /* renamed from: f */
    private static volatile bxxk f157809f;

    /* renamed from: a */
    public int f157810a;

    /* renamed from: b */
    public bxvt f157811b = bxvm.f164965b;

    /* renamed from: c */
    public bxvt f157812c = bxvm.f164965b;

    /* renamed from: d */
    public int f157813d;

    static {
        bvvl bvvl = new bvvl();
        f157808e = bvvl;
        GeneratedMessageLite.m124024a(bvvl.class, bvvl);
    }

    private bvvl() {
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
            return GeneratedMessageLite.m124022a(f157808e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001e\u0002\u001e\u0003ဌ\u0000", new Object[]{"a", "b", bvvk.m121506b(), "c", bvvk.m121506b(), "d", bvvh.f157792a});
        } else if (i2 == 3) {
            return new bvvl();
        } else {
            if (i2 == 4) {
                return new bvvg();
            }
            if (i2 == 5) {
                return f157808e;
            }
            bxxk bxxk = f157809f;
            if (bxxk == null) {
                synchronized (bvvl.class) {
                    bxxk = f157809f;
                    if (bxxk == null) {
                        bxxk = new bxve(f157808e);
                        f157809f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
