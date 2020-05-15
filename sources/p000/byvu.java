package p000;

/* renamed from: byvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byvu extends bxvk implements bxxd {

    /* renamed from: d */
    public static final byvu f168513d;

    /* renamed from: e */
    private static volatile bxxk f168514e;

    /* renamed from: a */
    public int f168515a;

    /* renamed from: b */
    public int f168516b;

    /* renamed from: c */
    public String f168517c = "";

    static {
        byvu byvu = new byvu();
        f168513d = byvu;
        bxvk.m124024a(byvu.class, byvu);
    }

    private byvu() {
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
            return bxvk.m124022a(f168513d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byvu();
        } else {
            if (i2 == 4) {
                return new bxvd(f168513d);
            }
            if (i2 == 5) {
                return f168513d;
            }
            bxxk bxxk = f168514e;
            if (bxxk == null) {
                synchronized (byvu.class) {
                    bxxk = f168514e;
                    if (bxxk == null) {
                        bxxk = new bxve(f168513d);
                        f168514e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
