package p000;

/* renamed from: byvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byvi extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bxvu f168434b = new byvh();

    /* renamed from: c */
    public static final byvi f168435c;

    /* renamed from: d */
    private static volatile bxxk f168436d;

    /* renamed from: a */
    public bxvt f168437a = bxvm.f164965b;

    static {
        byvi byvi = new byvi();
        f168435c = byvi;
        bxvk.m124024a(byvi.class, byvi);
    }

    private byvi() {
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
            return bxvk.m124022a(f168435c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", bzbu.m125628b()});
        } else if (i2 == 3) {
            return new byvi();
        } else {
            if (i2 == 4) {
                return new bxvd(f168435c);
            }
            if (i2 == 5) {
                return f168435c;
            }
            bxxk bxxk = f168436d;
            if (bxxk == null) {
                synchronized (byvi.class) {
                    bxxk = f168436d;
                    if (bxxk == null) {
                        bxxk = new bxve(f168435c);
                        f168436d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
