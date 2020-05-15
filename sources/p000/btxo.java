package p000;

/* renamed from: btxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btxo extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btxo f152833d;

    /* renamed from: e */
    private static volatile bxxk f152834e;

    /* renamed from: a */
    public int f152835a;

    /* renamed from: b */
    public int f152836b;

    /* renamed from: c */
    public long f152837c;

    static {
        btxo btxo = new btxo();
        f152833d = btxo;
        bxvk.m124024a(btxo.class, btxo);
    }

    private btxo() {
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
            return bxvk.m124022a(f152833d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", btxn.f152832a, "c"});
        } else if (i2 == 3) {
            return new btxo();
        } else {
            if (i2 == 4) {
                return new bxvd(f152833d);
            }
            if (i2 == 5) {
                return f152833d;
            }
            bxxk bxxk = f152834e;
            if (bxxk == null) {
                synchronized (btxo.class) {
                    bxxk = f152834e;
                    if (bxxk == null) {
                        bxxk = new bxve(f152833d);
                        f152834e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
