package p000;

/* renamed from: bycf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bycf extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bycf f165637b;

    /* renamed from: d */
    private static volatile bxxk f165638d;

    /* renamed from: a */
    public String f165639a = "";

    /* renamed from: c */
    private int f165640c;

    static {
        bycf bycf = new bycf();
        f165637b = bycf;
        GeneratedMessageLite.m124024a(bycf.class, bycf);
    }

    private bycf() {
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
            return GeneratedMessageLite.m124022a(f165637b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bycf();
        } else {
            if (i2 == 4) {
                return new bxvd(f165637b);
            }
            if (i2 == 5) {
                return f165637b;
            }
            bxxk bxxk = f165638d;
            if (bxxk == null) {
                synchronized (bycf.class) {
                    bxxk = f165638d;
                    if (bxxk == null) {
                        bxxk = new bxve(f165637b);
                        f165638d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
