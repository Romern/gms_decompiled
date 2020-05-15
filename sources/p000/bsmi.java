package p000;

/* renamed from: bsmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsmi extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bsmi f145031c;

    /* renamed from: d */
    private static volatile bxxk f145032d;

    /* renamed from: a */
    public int f145033a;

    /* renamed from: b */
    public bxtx f145034b = bxtx.f164797b;

    static {
        bsmi bsmi = new bsmi();
        f145031c = bsmi;
        bxvk.m124024a(bsmi.class, bsmi);
    }

    private bsmi() {
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
            return bxvk.m124022a(f145031c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bsmi();
        } else {
            if (i2 == 4) {
                return new bxvd(f145031c);
            }
            if (i2 == 5) {
                return f145031c;
            }
            bxxk bxxk = f145032d;
            if (bxxk == null) {
                synchronized (bsmi.class) {
                    bxxk = f145032d;
                    if (bxxk == null) {
                        bxxk = new bxve(f145031c);
                        f145032d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
