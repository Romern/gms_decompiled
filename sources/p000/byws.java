package p000;

/* renamed from: byws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byws extends bxvk implements bxxd {

    /* renamed from: c */
    public static final byws f168654c;

    /* renamed from: d */
    private static volatile bxxk f168655d;

    /* renamed from: a */
    public int f168656a;

    /* renamed from: b */
    public int f168657b;

    static {
        byws byws = new byws();
        f168654c = byws;
        bxvk.m124024a(byws.class, byws);
    }

    private byws() {
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
            return bxvk.m124022a(f168654c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bzac.f169213a});
        } else if (i2 == 3) {
            return new byws();
        } else {
            if (i2 == 4) {
                return new bxvd(f168654c);
            }
            if (i2 == 5) {
                return f168654c;
            }
            bxxk bxxk = f168655d;
            if (bxxk == null) {
                synchronized (byws.class) {
                    bxxk = f168655d;
                    if (bxxk == null) {
                        bxxk = new bxve(f168654c);
                        f168655d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
