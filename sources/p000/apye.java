package p000;

/* renamed from: apye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apye extends bxvk implements bxxd {

    /* renamed from: d */
    public static final apye f85121d;

    /* renamed from: e */
    private static volatile bxxk f85122e;

    /* renamed from: a */
    public int f85123a;

    /* renamed from: b */
    public boolean f85124b;

    /* renamed from: c */
    public boolean f85125c;

    static {
        apye apye = new apye();
        f85121d = apye;
        bxvk.m124024a(apye.class, apye);
    }

    private apye() {
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
            return bxvk.m124022a(f85121d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new apye();
        } else {
            if (i2 == 4) {
                return new bxvd(f85121d);
            }
            if (i2 == 5) {
                return f85121d;
            }
            bxxk bxxk = f85122e;
            if (bxxk == null) {
                synchronized (apye.class) {
                    bxxk = f85122e;
                    if (bxxk == null) {
                        bxxk = new bxve(f85121d);
                        f85122e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
