package p000;

/* renamed from: ayej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayej extends bxvk implements bxxd {

    /* renamed from: d */
    public static final ayej f97310d;

    /* renamed from: e */
    private static volatile bxxk f97311e;

    /* renamed from: a */
    public int f97312a;

    /* renamed from: b */
    public ayek f97313b;

    /* renamed from: c */
    public boolean f97314c;

    static {
        ayej ayej = new ayej();
        f97310d = ayej;
        bxvk.m124024a(ayej.class, ayej);
    }

    private ayej() {
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
            return bxvk.m124022a(f97310d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new ayej();
        } else {
            if (i2 == 4) {
                return new bxvd(f97310d);
            }
            if (i2 == 5) {
                return f97310d;
            }
            bxxk bxxk = f97311e;
            if (bxxk == null) {
                synchronized (ayej.class) {
                    bxxk = f97311e;
                    if (bxxk == null) {
                        bxxk = new bxve(f97310d);
                        f97311e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
