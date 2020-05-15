package p000;

/* renamed from: aqgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqgl extends bxvk implements bxxd {

    /* renamed from: c */
    public static final aqgl f86059c;

    /* renamed from: d */
    private static volatile bxxk f86060d;

    /* renamed from: a */
    public int f86061a;

    /* renamed from: b */
    public bxtx f86062b = bxtx.f164797b;

    static {
        aqgl aqgl = new aqgl();
        f86059c = aqgl;
        bxvk.m124024a(aqgl.class, aqgl);
    }

    private aqgl() {
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
            return bxvk.m124022a(f86059c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new aqgl();
        } else {
            if (i2 == 4) {
                return new bxvd(f86059c);
            }
            if (i2 == 5) {
                return f86059c;
            }
            bxxk bxxk = f86060d;
            if (bxxk == null) {
                synchronized (aqgl.class) {
                    bxxk = f86060d;
                    if (bxxk == null) {
                        bxxk = new bxve(f86059c);
                        f86060d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
