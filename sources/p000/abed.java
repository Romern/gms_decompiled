package p000;

/* renamed from: abed */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abed extends bxvk implements bxxd {

    /* renamed from: c */
    public static final abed f57175c;

    /* renamed from: e */
    private static volatile bxxk f57176e;

    /* renamed from: a */
    public abee f57177a;

    /* renamed from: b */
    public abef f57178b;

    /* renamed from: d */
    private int f57179d;

    static {
        abed abed = new abed();
        f57175c = abed;
        bxvk.m124024a(abed.class, abed);
    }

    private abed() {
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
            return bxvk.m124022a(f57175c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new abed();
        } else {
            if (i2 == 4) {
                return new bxvd(f57175c);
            }
            if (i2 == 5) {
                return f57175c;
            }
            bxxk bxxk = f57176e;
            if (bxxk == null) {
                synchronized (abed.class) {
                    bxxk = f57176e;
                    if (bxxk == null) {
                        bxxk = new bxve(f57175c);
                        f57176e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
