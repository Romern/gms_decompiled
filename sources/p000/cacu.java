package p000;

/* renamed from: cacu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cacu extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cacu f172623d;

    /* renamed from: e */
    private static volatile bxxk f172624e;

    /* renamed from: a */
    public int f172625a;

    /* renamed from: b */
    public bxyk f172626b;

    /* renamed from: c */
    public bxyk f172627c;

    static {
        cacu cacu = new cacu();
        f172623d = cacu;
        bxvk.m124024a(cacu.class, cacu);
    }

    private cacu() {
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
            return bxvk.m124022a(f172623d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cacu();
        } else {
            if (i2 == 4) {
                return new bxvd(f172623d);
            }
            if (i2 == 5) {
                return f172623d;
            }
            bxxk bxxk = f172624e;
            if (bxxk == null) {
                synchronized (cacu.class) {
                    bxxk = f172624e;
                    if (bxxk == null) {
                        bxxk = new bxve(f172623d);
                        f172624e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
