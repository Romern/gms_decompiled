package p000;

/* renamed from: btxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btxl extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final btxl f152809d;

    /* renamed from: e */
    private static volatile bxxk f152810e;

    /* renamed from: a */
    public int f152811a;

    /* renamed from: b */
    public int f152812b;

    /* renamed from: c */
    public int f152813c;

    static {
        btxl btxl = new btxl();
        f152809d = btxl;
        GeneratedMessageLite.m124024a(btxl.class, btxl);
    }

    private btxl() {
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
            return GeneratedMessageLite.m124022a(f152809d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", btxk.f152808a, "c", btxj.f152807a});
        } else if (i2 == 3) {
            return new btxl();
        } else {
            if (i2 == 4) {
                return new bxvd(f152809d);
            }
            if (i2 == 5) {
                return f152809d;
            }
            bxxk bxxk = f152810e;
            if (bxxk == null) {
                synchronized (btxl.class) {
                    bxxk = f152810e;
                    if (bxxk == null) {
                        bxxk = new bxve(f152809d);
                        f152810e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
