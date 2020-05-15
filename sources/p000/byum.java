package p000;

/* renamed from: byum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byum extends bxvk implements bxxd {

    /* renamed from: d */
    public static final byum f168308d;

    /* renamed from: e */
    private static volatile bxxk f168309e;

    /* renamed from: a */
    public int f168310a;

    /* renamed from: b */
    public double f168311b;

    /* renamed from: c */
    public double f168312c;

    static {
        byum byum = new byum();
        f168308d = byum;
        bxvk.m124024a(byum.class, byum);
    }

    private byum() {
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
            return bxvk.m124022a(f168308d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byum();
        } else {
            if (i2 == 4) {
                return new bxvd(f168308d);
            }
            if (i2 == 5) {
                return f168308d;
            }
            bxxk bxxk = f168309e;
            if (bxxk == null) {
                synchronized (byum.class) {
                    bxxk = f168309e;
                    if (bxxk == null) {
                        bxxk = new bxve(f168308d);
                        f168309e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
