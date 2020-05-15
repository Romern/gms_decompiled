package p000;

/* renamed from: bzty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzty extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzty f171383c;

    /* renamed from: d */
    private static volatile bxxk f171384d;

    /* renamed from: a */
    public bztq f171385a;

    /* renamed from: b */
    public bxtx f171386b = bxtx.f164797b;

    static {
        bzty bzty = new bzty();
        f171383c = bzty;
        bxvk.m124024a(bzty.class, bzty);
    }

    private bzty() {
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
            return bxvk.m124022a(f171383c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\n", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzty();
        } else {
            if (i2 == 4) {
                return new bxvd(f171383c);
            }
            if (i2 == 5) {
                return f171383c;
            }
            bxxk bxxk = f171384d;
            if (bxxk == null) {
                synchronized (bzty.class) {
                    bxxk = f171384d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171383c);
                        f171384d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
