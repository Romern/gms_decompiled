package p000;

/* renamed from: bxam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxam extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bxam f161718b;

    /* renamed from: c */
    public static final bxvj f161719c;

    /* renamed from: e */
    private static volatile bxxk f161720e;

    /* renamed from: a */
    public bxwc f161721a = bxxn.f165040b;

    /* renamed from: d */
    private byte f161722d = 2;

    static {
        bxam bxam = new bxam();
        f161718b = bxam;
        bxvk.m124024a(bxam.class, bxam);
        bwxl bwxl = bwxl.f161383i;
        bxam bxam2 = f161718b;
        f161719c = bxvk.m124006a(bwxl, bxam2, bxam2, 251682194, bxzf.MESSAGE);
    }

    private bxam() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f161722d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f161722d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f161718b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", bwxl.class});
        } else if (i2 == 3) {
            return new bxam();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null);
            }
            if (i2 == 5) {
                return f161718b;
            }
            bxxk bxxk = f161720e;
            if (bxxk == null) {
                synchronized (bxam.class) {
                    bxxk = f161720e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161718b);
                        f161720e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
