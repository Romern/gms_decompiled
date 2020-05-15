package p000;

/* renamed from: bbig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbig extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bbig f102710d;

    /* renamed from: e */
    private static volatile bxxk f102711e;

    /* renamed from: a */
    public int f102712a;

    /* renamed from: b */
    public int f102713b;

    /* renamed from: c */
    public long f102714c;

    static {
        bbig bbig = new bbig();
        f102710d = bbig;
        GeneratedMessageLite.m124024a(bbig.class, bbig);
    }

    private bbig() {
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
            return GeneratedMessageLite.m124022a(f102710d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bbig();
        } else {
            if (i2 == 4) {
                return new bxvd(f102710d);
            }
            if (i2 == 5) {
                return f102710d;
            }
            bxxk bxxk = f102711e;
            if (bxxk == null) {
                synchronized (bbig.class) {
                    bxxk = f102711e;
                    if (bxxk == null) {
                        bxxk = new bxve(f102710d);
                        f102711e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
