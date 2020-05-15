package p000;

/* renamed from: byxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byxn extends bxvk implements bxxd {

    /* renamed from: d */
    public static final byxn f168764d;

    /* renamed from: e */
    private static volatile bxxk f168765e;

    /* renamed from: a */
    public int f168766a;

    /* renamed from: b */
    public String f168767b = "";

    /* renamed from: c */
    public int f168768c;

    static {
        byxn byxn = new byxn();
        f168764d = byxn;
        bxvk.m124024a(byxn.class, byxn);
    }

    private byxn() {
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
            return bxvk.m124022a(f168764d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", bzbv.f169276a});
        } else if (i2 == 3) {
            return new byxn();
        } else {
            if (i2 == 4) {
                return new bxvd(f168764d);
            }
            if (i2 == 5) {
                return f168764d;
            }
            bxxk bxxk = f168765e;
            if (bxxk == null) {
                synchronized (byxn.class) {
                    bxxk = f168765e;
                    if (bxxk == null) {
                        bxxk = new bxve(f168764d);
                        f168765e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
