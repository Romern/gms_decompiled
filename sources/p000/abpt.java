package p000;

/* renamed from: abpt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abpt extends bxvk implements bxxd {

    /* renamed from: c */
    public static final abpt f57900c;

    /* renamed from: d */
    private static volatile bxxk f57901d;

    /* renamed from: a */
    public int f57902a;

    /* renamed from: b */
    public String f57903b = "";

    static {
        abpt abpt = new abpt();
        f57900c = abpt;
        bxvk.m124024a(abpt.class, abpt);
    }

    private abpt() {
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
            return bxvk.m124022a(f57900c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new abpt();
        } else {
            if (i2 == 4) {
                return new bxvd(f57900c);
            }
            if (i2 == 5) {
                return f57900c;
            }
            bxxk bxxk = f57901d;
            if (bxxk == null) {
                synchronized (abpt.class) {
                    bxxk = f57901d;
                    if (bxxk == null) {
                        bxxk = new bxve(f57900c);
                        f57901d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
