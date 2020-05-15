package p000;

/* renamed from: bzqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzqy extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzqy f171088c;

    /* renamed from: e */
    private static volatile bxxk f171089e;

    /* renamed from: a */
    public bzre f171090a;

    /* renamed from: b */
    public bzrm f171091b;

    /* renamed from: d */
    private int f171092d;

    static {
        bzqy bzqy = new bzqy();
        f171088c = bzqy;
        bxvk.m124024a(bzqy.class, bzqy);
    }

    private bzqy() {
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
            return bxvk.m124022a(f171088c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bzqy();
        } else {
            if (i2 == 4) {
                return new bxvd(f171088c);
            }
            if (i2 == 5) {
                return f171088c;
            }
            bxxk bxxk = f171089e;
            if (bxxk == null) {
                synchronized (bzqy.class) {
                    bxxk = f171089e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171088c);
                        f171089e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
