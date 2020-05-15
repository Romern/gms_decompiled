package p000;

/* renamed from: ifb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ifb extends bxvk implements bxxd {

    /* renamed from: b */
    public static final ifb f20840b;

    /* renamed from: d */
    private static volatile bxxk f20841d;

    /* renamed from: a */
    public bxww f20842a = bxww.f165013b;

    /* renamed from: c */
    private bxww f20843c = bxww.f165013b;

    static {
        ifb ifb = new ifb();
        f20840b = ifb;
        bxvk.m124024a(ifb.class, ifb);
    }

    private ifb() {
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
            return bxvk.m124022a(f20840b, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"a", iez.f20838a, "c", ifa.f20839a});
        } else if (i2 == 3) {
            return new ifb();
        } else {
            if (i2 == 4) {
                return new bxvd(f20840b);
            }
            if (i2 == 5) {
                return f20840b;
            }
            bxxk bxxk = f20841d;
            if (bxxk == null) {
                synchronized (ifb.class) {
                    bxxk = f20841d;
                    if (bxxk == null) {
                        bxxk = new bxve(f20840b);
                        f20841d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
