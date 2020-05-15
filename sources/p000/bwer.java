package p000;

/* renamed from: bwer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwer extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwer f159019c;

    /* renamed from: e */
    private static volatile bxxk f159020e;

    /* renamed from: a */
    public int f159021a;

    /* renamed from: b */
    public String f159022b = "";

    /* renamed from: d */
    private int f159023d;

    static {
        bwer bwer = new bwer();
        f159019c = bwer;
        bxvk.m124024a(bwer.class, bwer);
    }

    private bwer() {
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
            return bxvk.m124022a(f159019c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", bwep.f159018a, "b"});
        } else if (i2 == 3) {
            return new bwer();
        } else {
            if (i2 == 4) {
                return new bxvd(f159019c);
            }
            if (i2 == 5) {
                return f159019c;
            }
            bxxk bxxk = f159020e;
            if (bxxk == null) {
                synchronized (bwer.class) {
                    bxxk = f159020e;
                    if (bxxk == null) {
                        bxxk = new bxve(f159019c);
                        f159020e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
