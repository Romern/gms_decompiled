package p000;

/* renamed from: bwdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwdr extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwdr f158919d;

    /* renamed from: e */
    private static volatile bxxk f158920e;

    /* renamed from: a */
    public int f158921a;

    /* renamed from: b */
    public btwp f158922b;

    /* renamed from: c */
    public String f158923c = "";

    static {
        bwdr bwdr = new bwdr();
        f158919d = bwdr;
        bxvk.m124024a(bwdr.class, bwdr);
    }

    private bwdr() {
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
            return bxvk.m124022a(f158919d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwdr();
        } else {
            if (i2 == 4) {
                return new bxvd(f158919d);
            }
            if (i2 == 5) {
                return f158919d;
            }
            bxxk bxxk = f158920e;
            if (bxxk == null) {
                synchronized (bwdr.class) {
                    bxxk = f158920e;
                    if (bxxk == null) {
                        bxxk = new bxve(f158919d);
                        f158920e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
