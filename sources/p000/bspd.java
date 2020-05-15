package p000;

/* renamed from: bspd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bspd extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bspd f146469c;

    /* renamed from: d */
    private static volatile bxxk f146470d;

    /* renamed from: a */
    public int f146471a;

    /* renamed from: b */
    public int f146472b;

    static {
        bspd bspd = new bspd();
        f146469c = bspd;
        bxvk.m124024a(bspd.class, bspd);
    }

    private bspd() {
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
            return bxvk.m124022a(f146469c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bspd();
        } else {
            if (i2 == 4) {
                return new bxvd(f146469c);
            }
            if (i2 == 5) {
                return f146469c;
            }
            bxxk bxxk = f146470d;
            if (bxxk == null) {
                synchronized (bspd.class) {
                    bxxk = f146470d;
                    if (bxxk == null) {
                        bxxk = new bxve(f146469c);
                        f146470d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
