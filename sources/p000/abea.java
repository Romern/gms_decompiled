package p000;

/* renamed from: abea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abea extends bxvk implements bxxd {

    /* renamed from: c */
    public static final abea f57161c;

    /* renamed from: e */
    private static volatile bxxk f57162e;

    /* renamed from: a */
    public String f57163a = "";

    /* renamed from: b */
    public bxwc f57164b = bxxn.f165040b;

    /* renamed from: d */
    private int f57165d;

    static {
        abea abea = new abea();
        f57161c = abea;
        bxvk.m124024a(abea.class, abea);
    }

    private abea() {
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
            return bxvk.m124022a(f57161c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", abeb.class});
        } else if (i2 == 3) {
            return new abea();
        } else {
            if (i2 == 4) {
                return new bxvd(f57161c);
            }
            if (i2 == 5) {
                return f57161c;
            }
            bxxk bxxk = f57162e;
            if (bxxk == null) {
                synchronized (abea.class) {
                    bxxk = f57162e;
                    if (bxxk == null) {
                        bxxk = new bxve(f57161c);
                        f57162e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
