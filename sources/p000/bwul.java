package p000;

/* renamed from: bwul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwul extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwul f161040c;

    /* renamed from: e */
    private static volatile bxxk f161041e;

    /* renamed from: a */
    public String f161042a = "";

    /* renamed from: b */
    public String f161043b = "";

    /* renamed from: d */
    private int f161044d;

    static {
        bwul bwul = new bwul();
        f161040c = bwul;
        bxvk.m124024a(bwul.class, bwul);
    }

    private bwul() {
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
            return bxvk.m124022a(f161040c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bwul();
        } else {
            if (i2 == 4) {
                return new bxvd(f161040c);
            }
            if (i2 == 5) {
                return f161040c;
            }
            bxxk bxxk = f161041e;
            if (bxxk == null) {
                synchronized (bwul.class) {
                    bxxk = f161041e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161040c);
                        f161041e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
