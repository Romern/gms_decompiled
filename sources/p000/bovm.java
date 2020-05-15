package p000;

/* renamed from: bovm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bovm extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bovm f135027f;

    /* renamed from: g */
    private static volatile bxxk f135028g;

    /* renamed from: a */
    public int f135029a;

    /* renamed from: b */
    public int f135030b;

    /* renamed from: c */
    public int f135031c;

    /* renamed from: d */
    public boolean f135032d;

    /* renamed from: e */
    public int f135033e;

    static {
        bovm bovm = new bovm();
        f135027f = bovm;
        bxvk.m124024a(bovm.class, bovm);
    }

    private bovm() {
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
            return bxvk.m124022a(f135027f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", bovk.f135026a, "d", "e", bovi.f135025a});
        } else if (i2 == 3) {
            return new bovm();
        } else {
            if (i2 == 4) {
                return new bxvd(f135027f);
            }
            if (i2 == 5) {
                return f135027f;
            }
            bxxk bxxk = f135028g;
            if (bxxk == null) {
                synchronized (bovm.class) {
                    bxxk = f135028g;
                    if (bxxk == null) {
                        bxxk = new bxve(f135027f);
                        f135028g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
