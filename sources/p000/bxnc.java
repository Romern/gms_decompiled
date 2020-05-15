package p000;

/* renamed from: bxnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxnc extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxnc f164010c;

    /* renamed from: e */
    private static volatile bxxk f164011e;

    /* renamed from: a */
    public int f164012a;

    /* renamed from: b */
    public int f164013b;

    /* renamed from: d */
    private int f164014d;

    static {
        bxnc bxnc = new bxnc();
        f164010c = bxnc;
        GeneratedMessageLite.m124024a(bxnc.class, bxnc);
    }

    private bxnc() {
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
            return GeneratedMessageLite.m124022a(f164010c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဆ\u0000\u0002ဆ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bxnc();
        } else {
            if (i2 == 4) {
                return new bxvd(f164010c);
            }
            if (i2 == 5) {
                return f164010c;
            }
            bxxk bxxk = f164011e;
            if (bxxk == null) {
                synchronized (bxnc.class) {
                    bxxk = f164011e;
                    if (bxxk == null) {
                        bxxk = new bxve(f164010c);
                        f164011e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
