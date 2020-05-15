package p000;

/* renamed from: byvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byvo extends bxvk implements bxxd {

    /* renamed from: c */
    public static final byvo f168469c;

    /* renamed from: d */
    private static volatile bxxk f168470d;

    /* renamed from: a */
    public int f168471a;

    /* renamed from: b */
    public int f168472b;

    static {
        byvo byvo = new byvo();
        f168469c = byvo;
        bxvk.m124024a(byvo.class, byvo);
    }

    private byvo() {
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
            return bxvk.m124022a(f168469c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bzbu.m125628b()});
        } else if (i2 == 3) {
            return new byvo();
        } else {
            if (i2 == 4) {
                return new bxvd(f168469c);
            }
            if (i2 == 5) {
                return f168469c;
            }
            bxxk bxxk = f168470d;
            if (bxxk == null) {
                synchronized (byvo.class) {
                    bxxk = f168470d;
                    if (bxxk == null) {
                        bxxk = new bxve(f168469c);
                        f168470d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
