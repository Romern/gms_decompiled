package p000;

/* renamed from: bgvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgvs extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bgvs f117736c;

    /* renamed from: d */
    private static volatile bxxk f117737d;

    /* renamed from: a */
    public int f117738a;

    /* renamed from: b */
    public boolean f117739b;

    static {
        bgvs bgvs = new bgvs();
        f117736c = bgvs;
        bxvk.m124024a(bgvs.class, bgvs);
    }

    private bgvs() {
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
            return bxvk.m124022a(f117736c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bgvs();
        } else {
            if (i2 == 4) {
                return new bxvd(f117736c);
            }
            if (i2 == 5) {
                return f117736c;
            }
            bxxk bxxk = f117737d;
            if (bxxk == null) {
                synchronized (bgvs.class) {
                    bxxk = f117737d;
                    if (bxxk == null) {
                        bxxk = new bxve(f117736c);
                        f117737d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
