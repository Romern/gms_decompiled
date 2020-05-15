package p000;

/* renamed from: bkki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkki extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bkki f124551e;

    /* renamed from: g */
    private static volatile bxxk f124552g;

    /* renamed from: a */
    public int f124553a = 0;

    /* renamed from: b */
    public Object f124554b;

    /* renamed from: c */
    public String f124555c = "";

    /* renamed from: d */
    public String f124556d = "";

    /* renamed from: f */
    private int f124557f;

    static {
        bkki bkki = new bkki();
        f124551e = bkki;
        GeneratedMessageLite.m124024a(bkki.class, bkki);
    }

    private bkki() {
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
            return GeneratedMessageLite.m124022a(f124551e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ြ\u0000", new Object[]{"b", "a", "f", "c", "d", bybt.class});
        } else if (i2 == 3) {
            return new bkki();
        } else {
            if (i2 == 4) {
                return new bxvd(f124551e);
            }
            if (i2 == 5) {
                return f124551e;
            }
            bxxk bxxk = f124552g;
            if (bxxk == null) {
                synchronized (bkki.class) {
                    bxxk = f124552g;
                    if (bxxk == null) {
                        bxxk = new bxve(f124551e);
                        f124552g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
