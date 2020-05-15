package p000;

/* renamed from: brac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brac extends bxvk implements bxxd {

    /* renamed from: d */
    public static final brac f142121d;

    /* renamed from: e */
    private static volatile bxxk f142122e;

    /* renamed from: a */
    public int f142123a;

    /* renamed from: b */
    public int f142124b;

    /* renamed from: c */
    public bxwc f142125c = bxxn.f165040b;

    static {
        brac brac = new brac();
        f142121d = brac;
        bxvk.m124024a(brac.class, brac);
    }

    private brac() {
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
            return bxvk.m124022a(f142121d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"a", "b", brab.f142120a, "c", brad.class});
        } else if (i2 == 3) {
            return new brac();
        } else {
            if (i2 == 4) {
                return new braa();
            }
            if (i2 == 5) {
                return f142121d;
            }
            bxxk bxxk = f142122e;
            if (bxxk == null) {
                synchronized (brac.class) {
                    bxxk = f142122e;
                    if (bxxk == null) {
                        bxxk = new bxve(f142121d);
                        f142122e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
