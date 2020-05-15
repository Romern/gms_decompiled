package p000;

/* renamed from: adhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adhg extends bxvk implements bxxd {

    /* renamed from: g */
    public static final adhg f61693g;

    /* renamed from: h */
    private static volatile bxxk f61694h;

    /* renamed from: a */
    public boolean f61695a;

    /* renamed from: b */
    public int f61696b;

    /* renamed from: c */
    public int f61697c;

    /* renamed from: d */
    public String f61698d = "";

    /* renamed from: e */
    public String f61699e = "";

    /* renamed from: f */
    public bxwc f61700f = bxxn.f165040b;

    static {
        adhg adhg = new adhg();
        f61693g = adhg;
        bxvk.m124024a(adhg.class, adhg);
    }

    private adhg() {
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
            return bxvk.m124022a(f61693g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0007\u0002\u0004\u0003\u0004\u0004Ȉ\u0005Ȉ\u0006\u001b", new Object[]{"a", "b", "c", "d", "e", "f", adhf.class});
        } else if (i2 == 3) {
            return new adhg();
        } else {
            if (i2 == 4) {
                return new bxvd(f61693g);
            }
            if (i2 == 5) {
                return f61693g;
            }
            bxxk bxxk = f61694h;
            if (bxxk == null) {
                synchronized (adhg.class) {
                    bxxk = f61694h;
                    if (bxxk == null) {
                        bxxk = new bxve(f61693g);
                        f61694h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
