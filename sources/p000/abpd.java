package p000;

/* renamed from: abpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abpd extends bxvk implements bxxd {

    /* renamed from: d */
    public static final abpd f57831d;

    /* renamed from: e */
    private static volatile bxxk f57832e;

    /* renamed from: a */
    public int f57833a;

    /* renamed from: b */
    public String f57834b = "";

    /* renamed from: c */
    public String f57835c = "";

    static {
        abpd abpd = new abpd();
        f57831d = abpd;
        bxvk.m124024a(abpd.class, abpd);
    }

    private abpd() {
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
            return bxvk.m124022a(f57831d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new abpd();
        } else {
            if (i2 == 4) {
                return new bxvd(f57831d);
            }
            if (i2 == 5) {
                return f57831d;
            }
            bxxk bxxk = f57832e;
            if (bxxk == null) {
                synchronized (abpd.class) {
                    bxxk = f57832e;
                    if (bxxk == null) {
                        bxxk = new bxve(f57831d);
                        f57832e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
