package p000;

/* renamed from: cahj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cahj extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cahj f174548b;

    /* renamed from: c */
    private static volatile bxxk f174549c;

    /* renamed from: a */
    public bxvt f174550a = bxvm.f164965b;

    static {
        cahj cahj = new cahj();
        f174548b = cahj;
        GeneratedMessageLite.m124024a(cahj.class, cahj);
    }

    private cahj() {
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
            return GeneratedMessageLite.m124022a(f174548b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cahj();
        } else {
            if (i2 == 4) {
                return new cahi();
            }
            if (i2 == 5) {
                return f174548b;
            }
            bxxk bxxk = f174549c;
            if (bxxk == null) {
                synchronized (cahj.class) {
                    bxxk = f174549c;
                    if (bxxk == null) {
                        bxxk = new bxve(f174548b);
                        f174549c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
