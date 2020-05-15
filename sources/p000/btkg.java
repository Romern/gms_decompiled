package p000;

/* renamed from: btkg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btkg extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btkg f149250c;

    /* renamed from: d */
    private static volatile bxxk f149251d;

    /* renamed from: a */
    public bxtx f149252a = bxtx.f164797b;

    /* renamed from: b */
    public btki f149253b;

    static {
        btkg btkg = new btkg();
        f149250c = btkg;
        bxvk.m124024a(btkg.class, btkg);
    }

    private btkg() {
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
            return bxvk.m124022a(f149250c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btkg();
        } else {
            if (i2 == 4) {
                return new bxvd(f149250c);
            }
            if (i2 == 5) {
                return f149250c;
            }
            bxxk bxxk = f149251d;
            if (bxxk == null) {
                synchronized (btkg.class) {
                    bxxk = f149251d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149250c);
                        f149251d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
