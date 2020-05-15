package p000;

/* renamed from: bldr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bldr extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bldr f126116d;

    /* renamed from: e */
    private static volatile bxxk f126117e;

    /* renamed from: a */
    public int f126118a;

    /* renamed from: b */
    public String f126119b = "";

    /* renamed from: c */
    public long f126120c;

    static {
        bldr bldr = new bldr();
        f126116d = bldr;
        bxvk.m124024a(bldr.class, bldr);
    }

    private bldr() {
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
            return bxvk.m124022a(f126116d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bldr();
        } else {
            if (i2 == 4) {
                return new bxvd(f126116d);
            }
            if (i2 == 5) {
                return f126116d;
            }
            bxxk bxxk = f126117e;
            if (bxxk == null) {
                synchronized (bldr.class) {
                    bxxk = f126117e;
                    if (bxxk == null) {
                        bxxk = new bxve(f126116d);
                        f126117e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
