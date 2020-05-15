package p000;

/* renamed from: bmvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmvd extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmvd f131020d;

    /* renamed from: e */
    private static volatile bxxk f131021e;

    /* renamed from: a */
    public int f131022a;

    /* renamed from: b */
    public String f131023b = "";

    /* renamed from: c */
    public String f131024c = "";

    static {
        bmvd bmvd = new bmvd();
        f131020d = bmvd;
        bxvk.m124024a(bmvd.class, bmvd);
    }

    private bmvd() {
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
            return bxvk.m124022a(f131020d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmvd();
        } else {
            if (i2 == 4) {
                return new bxvd(f131020d);
            }
            if (i2 == 5) {
                return f131020d;
            }
            bxxk bxxk = f131021e;
            if (bxxk == null) {
                synchronized (bmvd.class) {
                    bxxk = f131021e;
                    if (bxxk == null) {
                        bxxk = new bxve(f131020d);
                        f131021e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
