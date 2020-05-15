package p000;

/* renamed from: bkyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkyy extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bkyy f125531d;

    /* renamed from: e */
    private static volatile bxxk f125532e;

    /* renamed from: a */
    public int f125533a;

    /* renamed from: b */
    public int f125534b;

    /* renamed from: c */
    public boolean f125535c;

    static {
        bkyy bkyy = new bkyy();
        f125531d = bkyy;
        bxvk.m124024a(bkyy.class, bkyy);
    }

    private bkyy() {
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
            return bxvk.m124022a(f125531d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", bkyn.f125469a, "c"});
        } else if (i2 == 3) {
            return new bkyy();
        } else {
            if (i2 == 4) {
                return new bxvd(f125531d);
            }
            if (i2 == 5) {
                return f125531d;
            }
            bxxk bxxk = f125532e;
            if (bxxk == null) {
                synchronized (bkyy.class) {
                    bxxk = f125532e;
                    if (bxxk == null) {
                        bxxk = new bxve(f125531d);
                        f125532e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
