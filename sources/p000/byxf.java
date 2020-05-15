package p000;

/* renamed from: byxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byxf extends bxvk implements bxxd {

    /* renamed from: d */
    public static final byxf f168722d;

    /* renamed from: e */
    private static volatile bxxk f168723e;

    /* renamed from: a */
    public int f168724a;

    /* renamed from: b */
    public byxg f168725b;

    /* renamed from: c */
    public byxd f168726c;

    static {
        byxf byxf = new byxf();
        f168722d = byxf;
        bxvk.m124024a(byxf.class, byxf);
    }

    private byxf() {
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
            return bxvk.m124022a(f168722d, "\u0001\u0002\u0000\u0001\u0001f\u0002\u0000\u0000\u0000\u0001ဉ\u0000fဉ\u0003", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byxf();
        } else {
            if (i2 == 4) {
                return new bxvd(f168722d);
            }
            if (i2 == 5) {
                return f168722d;
            }
            bxxk bxxk = f168723e;
            if (bxxk == null) {
                synchronized (byxf.class) {
                    bxxk = f168723e;
                    if (bxxk == null) {
                        bxxk = new bxve(f168722d);
                        f168723e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
