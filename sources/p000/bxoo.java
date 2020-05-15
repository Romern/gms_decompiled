package p000;

/* renamed from: bxoo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxoo extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxoo f164182d;

    /* renamed from: e */
    private static volatile bxxk f164183e;

    /* renamed from: a */
    public int f164184a;

    /* renamed from: b */
    public String f164185b = "";

    /* renamed from: c */
    public long f164186c;

    static {
        bxoo bxoo = new bxoo();
        f164182d = bxoo;
        bxvk.m124024a(bxoo.class, bxoo);
    }

    private bxoo() {
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
            return bxvk.m124022a(f164182d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bxoo();
        } else {
            if (i2 == 4) {
                return new bxvd(f164182d);
            }
            if (i2 == 5) {
                return f164182d;
            }
            bxxk bxxk = f164183e;
            if (bxxk == null) {
                synchronized (bxoo.class) {
                    bxxk = f164183e;
                    if (bxxk == null) {
                        bxxk = new bxve(f164182d);
                        f164183e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
