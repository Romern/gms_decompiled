package p000;

/* renamed from: bklv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bklv extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bklv f124854b;

    /* renamed from: d */
    private static volatile bxxk f124855d;

    /* renamed from: a */
    public String f124856a = "";

    /* renamed from: c */
    private int f124857c;

    static {
        bklv bklv = new bklv();
        f124854b = bklv;
        GeneratedMessageLite.m124024a(bklv.class, bklv);
    }

    private bklv() {
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
            return GeneratedMessageLite.m124022a(f124854b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0002", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bklv();
        } else {
            if (i2 == 4) {
                return new bxvd(f124854b);
            }
            if (i2 == 5) {
                return f124854b;
            }
            bxxk bxxk = f124855d;
            if (bxxk == null) {
                synchronized (bklv.class) {
                    bxxk = f124855d;
                    if (bxxk == null) {
                        bxxk = new bxve(f124854b);
                        f124855d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
