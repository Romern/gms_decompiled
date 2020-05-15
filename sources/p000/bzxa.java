package p000;

/* renamed from: bzxa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzxa extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzxa f171710d;

    /* renamed from: f */
    private static volatile bxxk f171711f;

    /* renamed from: a */
    public String f171712a = "";

    /* renamed from: b */
    public String f171713b = "";

    /* renamed from: c */
    public String f171714c = "";

    /* renamed from: e */
    private int f171715e;

    static {
        bzxa bzxa = new bzxa();
        f171710d = bzxa;
        bxvk.m124024a(bzxa.class, bzxa);
    }

    private bzxa() {
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
            return bxvk.m124022a(f171710d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new bzxa();
        } else {
            if (i2 == 4) {
                return new bxvd(f171710d);
            }
            if (i2 == 5) {
                return f171710d;
            }
            bxxk bxxk = f171711f;
            if (bxxk == null) {
                synchronized (bzxa.class) {
                    bxxk = f171711f;
                    if (bxxk == null) {
                        bxxk = new bxve(f171710d);
                        f171711f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
