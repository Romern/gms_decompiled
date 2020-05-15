package p000;

/* renamed from: bzjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzjy extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzjy f170360c;

    /* renamed from: d */
    private static volatile bxxk f170361d;

    /* renamed from: a */
    public int f170362a;

    /* renamed from: b */
    public String f170363b = "";

    static {
        bzjy bzjy = new bzjy();
        f170360c = bzjy;
        bxvk.m124024a(bzjy.class, bzjy);
    }

    private bzjy() {
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
            return bxvk.m124022a(f170360c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzjy();
        } else {
            if (i2 == 4) {
                return new bxvd(f170360c);
            }
            if (i2 == 5) {
                return f170360c;
            }
            bxxk bxxk = f170361d;
            if (bxxk == null) {
                synchronized (bzjy.class) {
                    bxxk = f170361d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170360c);
                        f170361d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
