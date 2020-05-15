package p000;

/* renamed from: cejn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cejn extends bxvk implements bxxd {

    /* renamed from: g */
    public static final cejn f182791g;

    /* renamed from: h */
    private static volatile bxxk f182792h;

    /* renamed from: a */
    public int f182793a;

    /* renamed from: b */
    public String f182794b = "";

    /* renamed from: c */
    public String f182795c = "";

    /* renamed from: d */
    public String f182796d = "";

    /* renamed from: e */
    public int f182797e;

    /* renamed from: f */
    public cejm f182798f;

    static {
        cejn cejn = new cejn();
        f182791g = cejn;
        bxvk.m124024a(cejn.class, cejn);
    }

    private cejn() {
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
            return bxvk.m124022a(f182791g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new cejn();
        } else {
            if (i2 == 4) {
                return new bxvd(f182791g);
            }
            if (i2 == 5) {
                return f182791g;
            }
            bxxk bxxk = f182792h;
            if (bxxk == null) {
                synchronized (cejn.class) {
                    bxxk = f182792h;
                    if (bxxk == null) {
                        bxxk = new bxve(f182791g);
                        f182792h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
