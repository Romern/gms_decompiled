package p000;

/* renamed from: bkkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkkm extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bkkm f124584a;

    /* renamed from: e */
    private static volatile bxxk f124585e;

    /* renamed from: b */
    private int f124586b;

    /* renamed from: c */
    private String f124587c = "";

    /* renamed from: d */
    private byte f124588d = 2;

    static {
        bkkm bkkm = new bkkm();
        f124584a = bkkm;
        GeneratedMessageLite.m124024a(bkkm.class, bkkm);
    }

    private bkkm() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f124588d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f124588d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f124584a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔈ\u0000", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new bkkm();
        } else {
            if (i2 == 4) {
                return new bxvd(f124584a);
            }
            if (i2 == 5) {
                return f124584a;
            }
            bxxk bxxk = f124585e;
            if (bxxk == null) {
                synchronized (bkkm.class) {
                    bxxk = f124585e;
                    if (bxxk == null) {
                        bxxk = new bxve(f124584a);
                        f124585e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
