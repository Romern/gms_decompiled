package p000;

/* renamed from: bzyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzyx extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzyx f171936d;

    /* renamed from: e */
    private static volatile bxxk f171937e;

    /* renamed from: a */
    public int f171938a;

    /* renamed from: b */
    public String f171939b = "";

    /* renamed from: c */
    public bzyv f171940c;

    static {
        bzyx bzyx = new bzyx();
        f171936d = bzyx;
        bxvk.m124024a(bzyx.class, bzyx);
    }

    private bzyx() {
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
            return bxvk.m124022a(f171936d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzyx();
        } else {
            if (i2 == 4) {
                return new bxvd(f171936d);
            }
            if (i2 == 5) {
                return f171936d;
            }
            bxxk bxxk = f171937e;
            if (bxxk == null) {
                synchronized (bzyx.class) {
                    bxxk = f171937e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171936d);
                        f171937e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
