package p000;

/* renamed from: btea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btea extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final btea f148482d;

    /* renamed from: e */
    private static volatile bxxk f148483e;

    /* renamed from: a */
    public btcb f148484a;

    /* renamed from: b */
    public btdz f148485b;

    /* renamed from: c */
    public bzka f148486c;

    static {
        btea btea = new btea();
        f148482d = btea;
        GeneratedMessageLite.m124024a(btea.class, btea);
    }

    private btea() {
        bxvm bxvm = bxvm.f164965b;
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
            return GeneratedMessageLite.m124022a(f148482d, "\u0000\u0003\u0000\u0000\u0004\t\u0003\u0000\u0000\u0000\u0004\t\u0005\t\t\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btea();
        } else {
            if (i2 == 4) {
                return new bxvd(f148482d);
            }
            if (i2 == 5) {
                return f148482d;
            }
            bxxk bxxk = f148483e;
            if (bxxk == null) {
                synchronized (btea.class) {
                    bxxk = f148483e;
                    if (bxxk == null) {
                        bxxk = new bxve(f148482d);
                        f148483e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
