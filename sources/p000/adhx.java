package p000;

/* renamed from: adhx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adhx extends bxvk implements bxxd {

    /* renamed from: d */
    public static final adhx f61745d;

    /* renamed from: e */
    private static volatile bxxk f61746e;

    /* renamed from: a */
    public adhy f61747a;

    /* renamed from: b */
    public adhw f61748b;

    /* renamed from: c */
    public boolean f61749c;

    static {
        adhx adhx = new adhx();
        f61745d = adhx;
        bxvk.m124024a(adhx.class, adhx);
    }

    private adhx() {
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
            return bxvk.m124022a(f61745d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\u0007", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new adhx();
        } else {
            if (i2 == 4) {
                return new bxvd(f61745d);
            }
            if (i2 == 5) {
                return f61745d;
            }
            bxxk bxxk = f61746e;
            if (bxxk == null) {
                synchronized (adhx.class) {
                    bxxk = f61746e;
                    if (bxxk == null) {
                        bxxk = new bxve(f61745d);
                        f61746e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
