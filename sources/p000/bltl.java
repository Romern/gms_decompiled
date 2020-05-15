package p000;

/* renamed from: bltl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bltl extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bltl f127716d;

    /* renamed from: e */
    private static volatile bxxk f127717e;

    /* renamed from: a */
    public int f127718a;

    /* renamed from: b */
    public long f127719b;

    /* renamed from: c */
    public String f127720c = "";

    static {
        bltl bltl = new bltl();
        f127716d = bltl;
        bxvk.m124024a(bltl.class, bltl);
    }

    private bltl() {
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
            return bxvk.m124022a(f127716d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bltl();
        } else {
            if (i2 == 4) {
                return new bxvd(f127716d);
            }
            if (i2 == 5) {
                return f127716d;
            }
            bxxk bxxk = f127717e;
            if (bxxk == null) {
                synchronized (bltl.class) {
                    bxxk = f127717e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127716d);
                        f127717e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
