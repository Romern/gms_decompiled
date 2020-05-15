package p000;

/* renamed from: brcd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brcd extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final brcd f142351c;

    /* renamed from: d */
    private static volatile bxxk f142352d;

    /* renamed from: a */
    public int f142353a;

    /* renamed from: b */
    public String f142354b = "";

    static {
        brcd brcd = new brcd();
        f142351c = brcd;
        GeneratedMessageLite.m124024a(brcd.class, brcd);
    }

    private brcd() {
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
            return GeneratedMessageLite.m124022a(f142351c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new brcd();
        } else {
            if (i2 == 4) {
                return new bxvd(f142351c);
            }
            if (i2 == 5) {
                return f142351c;
            }
            bxxk bxxk = f142352d;
            if (bxxk == null) {
                synchronized (brcd.class) {
                    bxxk = f142352d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142351c);
                        f142352d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
