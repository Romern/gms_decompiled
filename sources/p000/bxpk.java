package p000;

/* renamed from: bxpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxpk extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxpk f164280d;

    /* renamed from: f */
    private static volatile bxxk f164281f;

    /* renamed from: a */
    public int f164282a;

    /* renamed from: b */
    public String f164283b = "";

    /* renamed from: c */
    public bxoe f164284c;

    /* renamed from: e */
    private int f164285e;

    static {
        bxpk bxpk = new bxpk();
        f164280d = bxpk;
        GeneratedMessageLite.m124024a(bxpk.class, bxpk);
    }

    private bxpk() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m122956a(bxpk bxpk) {
        bxpk.f164282a |= 1;
        bxpk.f164285e = 10;
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
            return GeneratedMessageLite.m124022a(f164280d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001င\u0000\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"a", "e", "b", "c"});
        } else if (i2 == 3) {
            return new bxpk();
        } else {
            if (i2 == 4) {
                return new bxvd(f164280d);
            }
            if (i2 == 5) {
                return f164280d;
            }
            bxxk bxxk = f164281f;
            if (bxxk == null) {
                synchronized (bxpk.class) {
                    bxxk = f164281f;
                    if (bxxk == null) {
                        bxxk = new bxve(f164280d);
                        f164281f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
