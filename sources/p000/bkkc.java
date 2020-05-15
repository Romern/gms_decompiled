package p000;

/* renamed from: bkkc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkkc extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bkkc f124505c;

    /* renamed from: d */
    private static volatile bxxk f124506d;

    /* renamed from: a */
    public int f124507a;

    /* renamed from: b */
    public String f124508b = "";

    static {
        bkkc bkkc = new bkkc();
        f124505c = bkkc;
        GeneratedMessageLite.m124024a(bkkc.class, bkkc);
    }

    private bkkc() {
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
            return GeneratedMessageLite.m124022a(f124505c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0002", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bkkc();
        } else {
            if (i2 == 4) {
                return new bxvd(f124505c);
            }
            if (i2 == 5) {
                return f124505c;
            }
            bxxk bxxk = f124506d;
            if (bxxk == null) {
                synchronized (bkkc.class) {
                    bxxk = f124506d;
                    if (bxxk == null) {
                        bxxk = new bxve(f124505c);
                        f124506d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
