package p000;

/* renamed from: boix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boix extends bxvk implements bxxd {

    /* renamed from: f */
    public static final boix f133240f;

    /* renamed from: g */
    private static volatile bxxk f133241g;

    /* renamed from: a */
    public int f133242a;

    /* renamed from: b */
    public int f133243b;

    /* renamed from: c */
    public boit f133244c;

    /* renamed from: d */
    public int f133245d;

    /* renamed from: e */
    public boolean f133246e;

    static {
        boix boix = new boix();
        f133240f = boix;
        bxvk.m124024a(boix.class, boix);
    }

    private boix() {
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
            return bxvk.m124022a(f133240f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဋ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", boiv.f133239a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new boix();
        } else {
            if (i2 == 4) {
                return new bxvd(f133240f);
            }
            if (i2 == 5) {
                return f133240f;
            }
            bxxk bxxk = f133241g;
            if (bxxk == null) {
                synchronized (boix.class) {
                    bxxk = f133241g;
                    if (bxxk == null) {
                        bxxk = new bxve(f133240f);
                        f133241g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
