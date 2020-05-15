package p000;

/* renamed from: bzvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzvm extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bzvm f171524g;

    /* renamed from: h */
    private static volatile bxxk f171525h;

    /* renamed from: a */
    public int f171526a;

    /* renamed from: b */
    public bzvx f171527b;

    /* renamed from: c */
    public bzvy f171528c;

    /* renamed from: d */
    public bzvj f171529d;

    /* renamed from: e */
    public String f171530e = "";

    /* renamed from: f */
    public int f171531f;

    static {
        bzvm bzvm = new bzvm();
        f171524g = bzvm;
        bxvk.m124024a(bzvm.class, bzvm);
    }

    private bzvm() {
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
            return bxvk.m124022a(f171524g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0006ဈ\u0003\u0007ဌ\u0004", new Object[]{"a", "b", "c", "d", "e", "f", bzvh.f171517a});
        } else if (i2 == 3) {
            return new bzvm();
        } else {
            if (i2 == 4) {
                return new bxvd(f171524g);
            }
            if (i2 == 5) {
                return f171524g;
            }
            bxxk bxxk = f171525h;
            if (bxxk == null) {
                synchronized (bzvm.class) {
                    bxxk = f171525h;
                    if (bxxk == null) {
                        bxxk = new bxve(f171524g);
                        f171525h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
