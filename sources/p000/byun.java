package p000;

/* renamed from: byun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byun extends bxvk implements bxxd {

    /* renamed from: d */
    public static final byun f168313d;

    /* renamed from: e */
    private static volatile bxxk f168314e;

    /* renamed from: a */
    public int f168315a;

    /* renamed from: b */
    public String f168316b = "";

    /* renamed from: c */
    public int f168317c;

    static {
        byun byun = new byun();
        f168313d = byun;
        bxvk.m124024a(byun.class, byun);
    }

    private byun() {
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
            return bxvk.m124022a(f168313d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", bzbu.m125628b()});
        } else if (i2 == 3) {
            return new byun();
        } else {
            if (i2 == 4) {
                return new bxvd(f168313d);
            }
            if (i2 == 5) {
                return f168313d;
            }
            bxxk bxxk = f168314e;
            if (bxxk == null) {
                synchronized (byun.class) {
                    bxxk = f168314e;
                    if (bxxk == null) {
                        bxxk = new bxve(f168313d);
                        f168314e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
