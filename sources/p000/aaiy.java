package p000;

/* renamed from: aaiy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaiy extends bxvk implements bxxd {

    /* renamed from: c */
    public static final aaiy f28242c;

    /* renamed from: d */
    private static volatile bxxk f28243d;

    /* renamed from: a */
    public int f28244a = 0;

    /* renamed from: b */
    public Object f28245b;

    static {
        aaiy aaiy = new aaiy();
        f28242c = aaiy;
        bxvk.m124024a(aaiy.class, aaiy);
    }

    private aaiy() {
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
            return bxvk.m124022a(f28242c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", aaix.class});
        } else if (i2 == 3) {
            return new aaiy();
        } else {
            if (i2 == 4) {
                return new bxvd(f28242c);
            }
            if (i2 == 5) {
                return f28242c;
            }
            bxxk bxxk = f28243d;
            if (bxxk == null) {
                synchronized (aaiy.class) {
                    bxxk = f28243d;
                    if (bxxk == null) {
                        bxxk = new bxve(f28242c);
                        f28243d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
