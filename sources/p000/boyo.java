package p000;

/* renamed from: boyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boyo extends bxvk implements bxxd {

    /* renamed from: d */
    public static final boyo f135332d;

    /* renamed from: e */
    private static volatile bxxk f135333e;

    /* renamed from: a */
    public int f135334a;

    /* renamed from: b */
    public int f135335b;

    /* renamed from: c */
    public int f135336c;

    static {
        boyo boyo = new boyo();
        f135332d = boyo;
        bxvk.m124024a(boyo.class, boyo);
    }

    private boyo() {
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
            return bxvk.m124022a(f135332d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", boyn.f135331a, "c", boym.f135330a});
        } else if (i2 == 3) {
            return new boyo();
        } else {
            if (i2 == 4) {
                return new bxvd(f135332d);
            }
            if (i2 == 5) {
                return f135332d;
            }
            bxxk bxxk = f135333e;
            if (bxxk == null) {
                synchronized (boyo.class) {
                    bxxk = f135333e;
                    if (bxxk == null) {
                        bxxk = new bxve(f135332d);
                        f135333e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
