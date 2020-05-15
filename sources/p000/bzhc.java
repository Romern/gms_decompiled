package p000;

/* renamed from: bzhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzhc extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzhc f170021c;

    /* renamed from: e */
    private static volatile bxxk f170022e;

    /* renamed from: a */
    public String f170023a = "";

    /* renamed from: b */
    public String f170024b = "";

    /* renamed from: d */
    private int f170025d;

    static {
        bzhc bzhc = new bzhc();
        f170021c = bzhc;
        bxvk.m124024a(bzhc.class, bzhc);
    }

    private bzhc() {
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
            return bxvk.m124022a(f170021c, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0004ဈ\u0003", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bzhc();
        } else {
            if (i2 == 4) {
                return new bxvd(f170021c);
            }
            if (i2 == 5) {
                return f170021c;
            }
            bxxk bxxk = f170022e;
            if (bxxk == null) {
                synchronized (bzhc.class) {
                    bxxk = f170022e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170021c);
                        f170022e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
