package p000;

/* renamed from: boxa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boxa extends bxvk implements bxxd {

    /* renamed from: g */
    public static final boxa f135212g;

    /* renamed from: h */
    private static volatile bxxk f135213h;

    /* renamed from: a */
    public int f135214a;

    /* renamed from: b */
    public String f135215b = "";

    /* renamed from: c */
    public int f135216c;

    /* renamed from: d */
    public int f135217d;

    /* renamed from: e */
    public boolean f135218e;

    /* renamed from: f */
    public int f135219f;

    static {
        boxa boxa = new boxa();
        f135212g = boxa;
        bxvk.m124024a(boxa.class, boxa);
    }

    private boxa() {
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
            return bxvk.m124022a(f135212g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"a", "b", "c", bpbh.f135598a, "d", bowz.f135211a, "e", "f"});
        } else if (i2 == 3) {
            return new boxa();
        } else {
            if (i2 == 4) {
                return new bxvd(f135212g);
            }
            if (i2 == 5) {
                return f135212g;
            }
            bxxk bxxk = f135213h;
            if (bxxk == null) {
                synchronized (boxa.class) {
                    bxxk = f135213h;
                    if (bxxk == null) {
                        bxxk = new bxve(f135212g);
                        f135213h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
