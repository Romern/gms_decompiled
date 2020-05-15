package p000;

/* renamed from: blfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blfl extends bxvk implements bxxd {

    /* renamed from: b */
    public static final blfl f126383b;

    /* renamed from: e */
    private static volatile bxxk f126384e;

    /* renamed from: a */
    public blfr f126385a;

    /* renamed from: c */
    private int f126386c;

    /* renamed from: d */
    private byte f126387d = 2;

    static {
        blfl blfl = new blfl();
        f126383b = blfl;
        bxvk.m124024a(blfl.class, blfl);
    }

    private blfl() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f126387d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f126387d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f126383b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new blfl();
        } else {
            if (i2 == 4) {
                return new bxvd(f126383b);
            }
            if (i2 == 5) {
                return f126383b;
            }
            bxxk bxxk = f126384e;
            if (bxxk == null) {
                synchronized (blfl.class) {
                    bxxk = f126384e;
                    if (bxxk == null) {
                        bxxk = new bxve(f126383b);
                        f126384e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
