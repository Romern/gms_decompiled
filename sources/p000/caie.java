package p000;

/* renamed from: caie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caie extends bxvk implements bxxd {

    /* renamed from: d */
    public static final caie f174634d;

    /* renamed from: e */
    private static volatile bxxk f174635e;

    /* renamed from: a */
    public int f174636a;

    /* renamed from: b */
    public String f174637b = "";

    /* renamed from: c */
    public int f174638c;

    static {
        caie caie = new caie();
        f174634d = caie;
        bxvk.m124024a(caie.class, caie);
    }

    private caie() {
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
            return bxvk.m124022a(f174634d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new caie();
        } else {
            if (i2 == 4) {
                return new bxvd(f174634d);
            }
            if (i2 == 5) {
                return f174634d;
            }
            bxxk bxxk = f174635e;
            if (bxxk == null) {
                synchronized (caie.class) {
                    bxxk = f174635e;
                    if (bxxk == null) {
                        bxxk = new bxve(f174634d);
                        f174635e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
