package p000;

/* renamed from: bywr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bywr extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bywr f168649d;

    /* renamed from: e */
    private static volatile bxxk f168650e;

    /* renamed from: a */
    public int f168651a;

    /* renamed from: b */
    public long f168652b;

    /* renamed from: c */
    public byws f168653c;

    static {
        bywr bywr = new bywr();
        f168649d = bywr;
        bxvk.m124024a(bywr.class, bywr);
    }

    private bywr() {
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
            return bxvk.m124022a(f168649d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bywr();
        } else {
            if (i2 == 4) {
                return new bxvd(f168649d);
            }
            if (i2 == 5) {
                return f168649d;
            }
            bxxk bxxk = f168650e;
            if (bxxk == null) {
                synchronized (bywr.class) {
                    bxxk = f168650e;
                    if (bxxk == null) {
                        bxxk = new bxve(f168649d);
                        f168650e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
