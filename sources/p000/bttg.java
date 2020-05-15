package p000;

/* renamed from: bttg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bttg extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bttg f150341b;

    /* renamed from: d */
    private static volatile bxxk f150342d;

    /* renamed from: a */
    public String f150343a = "";

    /* renamed from: c */
    private int f150344c;

    static {
        bttg bttg = new bttg();
        f150341b = bttg;
        bxvk.m124024a(bttg.class, bttg);
    }

    private bttg() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f150341b, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007ဈ\u0004", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bttg();
        } else {
            if (i2 == 4) {
                return new bxvd(f150341b);
            }
            if (i2 == 5) {
                return f150341b;
            }
            bxxk bxxk = f150342d;
            if (bxxk == null) {
                synchronized (bttg.class) {
                    bxxk = f150342d;
                    if (bxxk == null) {
                        bxxk = new bxve(f150341b);
                        f150342d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
