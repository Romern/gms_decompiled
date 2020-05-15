package p000;

/* renamed from: bmmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmmo extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bmmo f130026d;

    /* renamed from: f */
    private static volatile bxxk f130027f;

    /* renamed from: a */
    public bxvw f130028a = bxwq.f165002b;

    /* renamed from: b */
    public int f130029b;

    /* renamed from: c */
    public int f130030c;

    /* renamed from: e */
    private int f130031e;

    static {
        bmmo bmmo = new bmmo();
        f130026d = bmmo;
        GeneratedMessageLite.m124024a(bmmo.class, bmmo);
    }

    private bmmo() {
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
            return GeneratedMessageLite.m124022a(f130026d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001%\u0002ဌ\u0000\u0003ဌ\u0001", new Object[]{"e", "a", "b", bmmm.f130025a, "c", bmmk.f130024a});
        } else if (i2 == 3) {
            return new bmmo();
        } else {
            if (i2 == 4) {
                return new bxvd(f130026d);
            }
            if (i2 == 5) {
                return f130026d;
            }
            bxxk bxxk = f130027f;
            if (bxxk == null) {
                synchronized (bmmo.class) {
                    bxxk = f130027f;
                    if (bxxk == null) {
                        bxxk = new bxve(f130026d);
                        f130027f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
