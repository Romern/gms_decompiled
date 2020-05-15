package p000;

/* renamed from: boph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boph extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final boph f134120d;

    /* renamed from: e */
    private static volatile bxxk f134121e;

    /* renamed from: a */
    public bope f134122a;

    /* renamed from: b */
    public bopf f134123b;

    /* renamed from: c */
    public bopg f134124c;

    static {
        boph boph = new boph();
        f134120d = boph;
        GeneratedMessageLite.m124024a(boph.class, boph);
    }

    private boph() {
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
            return GeneratedMessageLite.m124022a(f134120d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new boph();
        } else {
            if (i2 == 4) {
                return new bxvd(f134120d);
            }
            if (i2 == 5) {
                return f134120d;
            }
            bxxk bxxk = f134121e;
            if (bxxk == null) {
                synchronized (boph.class) {
                    bxxk = f134121e;
                    if (bxxk == null) {
                        bxxk = new bxve(f134120d);
                        f134121e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
