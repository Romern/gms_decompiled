package p000;

/* renamed from: bwwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwwp extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwwp f161275d;

    /* renamed from: e */
    public static final bxvj f161276e;

    /* renamed from: f */
    private static volatile bxxk f161277f;

    /* renamed from: a */
    public int f161278a;

    /* renamed from: b */
    public String f161279b = "";

    /* renamed from: c */
    public bxvt f161280c = bxvm.f164965b;

    static {
        bwwp bwwp = new bwwp();
        f161275d = bwwp;
        bxvk.m124024a(bwwp.class, bwwp);
        bwog bwog = bwog.f160437f;
        bwwp bwwp2 = f161275d;
        f161276e = bxvk.m124006a(bwog, bwwp2, bwwp2, 277984632, bxzf.MESSAGE);
    }

    private bwwp() {
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
            return bxvk.m124022a(f161275d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0003\u0016", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwwp();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (float[][][]) null);
            }
            if (i2 == 5) {
                return f161275d;
            }
            bxxk bxxk = f161277f;
            if (bxxk == null) {
                synchronized (bwwp.class) {
                    bxxk = f161277f;
                    if (bxxk == null) {
                        bxxk = new bxve(f161275d);
                        f161277f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
