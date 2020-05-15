package p000;

/* renamed from: bzge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzge extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzge f169919d;

    /* renamed from: e */
    private static volatile bxxk f169920e;

    /* renamed from: a */
    public int f169921a;

    /* renamed from: b */
    public String f169922b = "";

    /* renamed from: c */
    public String f169923c = "";

    static {
        bzge bzge = new bzge();
        f169919d = bzge;
        bxvk.m124024a(bzge.class, bzge);
    }

    private bzge() {
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
            return bxvk.m124022a(f169919d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzge();
        } else {
            if (i2 == 4) {
                return new bxvd(f169919d);
            }
            if (i2 == 5) {
                return f169919d;
            }
            bxxk bxxk = f169920e;
            if (bxxk == null) {
                synchronized (bzge.class) {
                    bxxk = f169920e;
                    if (bxxk == null) {
                        bxxk = new bxve(f169919d);
                        f169920e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
