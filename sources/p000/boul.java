package p000;

/* renamed from: boul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boul extends bxvk implements bxxd {

    /* renamed from: e */
    public static final boul f134940e;

    /* renamed from: f */
    private static volatile bxxk f134941f;

    /* renamed from: a */
    public int f134942a;

    /* renamed from: b */
    public boolean f134943b;

    /* renamed from: c */
    public int f134944c;

    /* renamed from: d */
    public bxvt f134945d = bxvm.f164965b;

    static {
        boul boul = new boul();
        f134940e = boul;
        bxvk.m124024a(boul.class, boul);
    }

    private boul() {
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
            return bxvk.m124022a(f134940e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002င\u0001\u0004\u0016", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new boul();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (byte[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f134940e;
            }
            bxxk bxxk = f134941f;
            if (bxxk == null) {
                synchronized (boul.class) {
                    bxxk = f134941f;
                    if (bxxk == null) {
                        bxxk = new bxve(f134940e);
                        f134941f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
