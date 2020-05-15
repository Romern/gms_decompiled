package p000;

/* renamed from: bmuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmuy extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bmuy f131000e;

    /* renamed from: f */
    private static volatile bxxk f131001f;

    /* renamed from: a */
    public int f131002a;

    /* renamed from: b */
    public int f131003b;

    /* renamed from: c */
    public String f131004c = "";

    /* renamed from: d */
    public String f131005d = "";

    static {
        bmuy bmuy = new bmuy();
        f131000e = bmuy;
        bxvk.m124024a(bmuy.class, bmuy);
    }

    private bmuy() {
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
            return bxvk.m124022a(f131000e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", bmuz.f131006a, "c", "d"});
        } else if (i2 == 3) {
            return new bmuy();
        } else {
            if (i2 == 4) {
                return new bxvd(f131000e);
            }
            if (i2 == 5) {
                return f131000e;
            }
            bxxk bxxk = f131001f;
            if (bxxk == null) {
                synchronized (bmuy.class) {
                    bxxk = f131001f;
                    if (bxxk == null) {
                        bxxk = new bxve(f131000e);
                        f131001f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
