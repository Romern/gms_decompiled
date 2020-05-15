package p000;

/* renamed from: blxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blxg extends bxvk implements bxxd {

    /* renamed from: d */
    public static final blxg f128052d;

    /* renamed from: f */
    private static volatile bxxk f128053f;

    /* renamed from: a */
    public blwj f128054a;

    /* renamed from: b */
    public String f128055b = "";

    /* renamed from: c */
    public String f128056c = "";

    /* renamed from: e */
    private int f128057e;

    static {
        blxg blxg = new blxg();
        f128052d = blxg;
        bxvk.m124024a(blxg.class, blxg);
    }

    private blxg() {
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
            return bxvk.m124022a(f128052d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0006\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"e", "c", "a", "b"});
        } else if (i2 == 3) {
            return new blxg();
        } else {
            if (i2 == 4) {
                return new bxvd(f128052d);
            }
            if (i2 == 5) {
                return f128052d;
            }
            bxxk bxxk = f128053f;
            if (bxxk == null) {
                synchronized (blxg.class) {
                    bxxk = f128053f;
                    if (bxxk == null) {
                        bxxk = new bxve(f128052d);
                        f128053f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
