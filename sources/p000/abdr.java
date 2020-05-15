package p000;

/* renamed from: abdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abdr extends bxvk implements bxxd {

    /* renamed from: c */
    public static final abdr f57126c;

    /* renamed from: d */
    private static volatile bxxk f57127d;

    /* renamed from: a */
    public int f57128a;

    /* renamed from: b */
    public String f57129b = "";

    static {
        abdr abdr = new abdr();
        f57126c = abdr;
        bxvk.m124024a(abdr.class, abdr);
    }

    private abdr() {
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
            return bxvk.m124022a(f57126c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new abdr();
        } else {
            if (i2 == 4) {
                return new bxvd(f57126c);
            }
            if (i2 == 5) {
                return f57126c;
            }
            bxxk bxxk = f57127d;
            if (bxxk == null) {
                synchronized (abdr.class) {
                    bxxk = f57127d;
                    if (bxxk == null) {
                        bxxk = new bxve(f57126c);
                        f57127d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
