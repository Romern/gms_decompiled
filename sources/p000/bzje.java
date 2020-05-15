package p000;

/* renamed from: bzje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzje extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzje f170279c;

    /* renamed from: d */
    private static volatile bxxk f170280d;

    /* renamed from: a */
    public int f170281a;

    /* renamed from: b */
    public int f170282b;

    static {
        bzje bzje = new bzje();
        f170279c = bzje;
        bxvk.m124024a(bzje.class, bzje);
    }

    private bzje() {
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
            return bxvk.m124022a(f170279c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzje();
        } else {
            if (i2 == 4) {
                return new bxvd(f170279c);
            }
            if (i2 == 5) {
                return f170279c;
            }
            bxxk bxxk = f170280d;
            if (bxxk == null) {
                synchronized (bzje.class) {
                    bxxk = f170280d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170279c);
                        f170280d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
