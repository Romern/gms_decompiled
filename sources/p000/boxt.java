package p000;

/* renamed from: boxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boxt extends bxvk implements bxxd {

    /* renamed from: d */
    public static final boxt f135287d;

    /* renamed from: e */
    private static volatile bxxk f135288e;

    /* renamed from: a */
    public int f135289a;

    /* renamed from: b */
    public String f135290b = "";

    /* renamed from: c */
    public String f135291c = "";

    static {
        boxt boxt = new boxt();
        f135287d = boxt;
        bxvk.m124024a(boxt.class, boxt);
    }

    private boxt() {
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
            return bxvk.m124022a(f135287d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new boxt();
        } else {
            if (i2 == 4) {
                return new bxvd(f135287d);
            }
            if (i2 == 5) {
                return f135287d;
            }
            bxxk bxxk = f135288e;
            if (bxxk == null) {
                synchronized (boxt.class) {
                    bxxk = f135288e;
                    if (bxxk == null) {
                        bxxk = new bxve(f135287d);
                        f135288e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
