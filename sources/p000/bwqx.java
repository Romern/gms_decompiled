package p000;

/* renamed from: bwqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwqx extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwqx f160732c;

    /* renamed from: d */
    public static final bxvj f160733d;

    /* renamed from: e */
    private static volatile bxxk f160734e;

    /* renamed from: a */
    public int f160735a;

    /* renamed from: b */
    public bxtx f160736b = bxtx.f164797b;

    static {
        bwqx bwqx = new bwqx();
        f160732c = bwqx;
        bxvk.m124024a(bwqx.class, bwqx);
        bwog bwog = bwog.f160437f;
        bwqx bwqx2 = f160732c;
        f160733d = bxvk.m124006a(bwog, bwqx2, bwqx2, 239872231, bxzf.MESSAGE);
    }

    private bwqx() {
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
            return bxvk.m124022a(f160732c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwqx();
        } else {
            if (i2 == 4) {
                return new bxvd(f160732c);
            }
            if (i2 == 5) {
                return f160732c;
            }
            bxxk bxxk = f160734e;
            if (bxxk == null) {
                synchronized (bwqx.class) {
                    bxxk = f160734e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160732c);
                        f160734e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
